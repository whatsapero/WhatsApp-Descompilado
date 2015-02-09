package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.DataReferenceBox;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox.Entry;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Path;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaultMp4Builder implements Mp4Builder {
    static final /* synthetic */ boolean $assertionsDisabled;
    private static Logger LOG;
    Set<StaticChunkOffsetBox> chunkOffsetBoxes;
    private FragmentIntersectionFinder intersectionFinder;
    HashMap<Track, List<Sample>> track2Sample;
    HashMap<Track, long[]> track2SampleSizes;

    private class InterleaveChunkMdat implements Box {
        List<List<Sample>> chunkList;
        long contentSize;
        Container parent;
        List<Track> tracks;

        public Container getParent() {
            return this.parent;
        }

        public long getOffset() {
            throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
        }

        public void setParent(Container parent) {
            this.parent = parent;
        }

        public void parse(FileChannel fileChannel, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {
        }

        private InterleaveChunkMdat(Movie movie, Map<Track, int[]> chunks, long contentSize) {
            this.chunkList = new ArrayList();
            this.contentSize = contentSize;
            this.tracks = movie.getTracks();
            for (int i = 0; i < ((int[]) chunks.values().iterator().next()).length; i++) {
                for (Track track : this.tracks) {
                    int[] chunkSizes = (int[]) chunks.get(track);
                    long firstSampleOfChunk = 0;
                    for (int j = 0; j < i; j++) {
                        firstSampleOfChunk += (long) chunkSizes[j];
                    }
                    this.chunkList.add(((List) DefaultMp4Builder.this.track2Sample.get(track)).subList(CastUtils.l2i(firstSampleOfChunk), CastUtils.l2i(((long) chunkSizes[i]) + firstSampleOfChunk)));
                }
            }
        }

        public long getDataOffset() {
            long offset = 16;
            for (InterleaveChunkMdat b = this; b instanceof Box; b = b.getParent()) {
                for (Object box : b.getParent().getBoxes()) {
                    if (b == box) {
                        break;
                    }
                    offset += box.getSize();
                }
            }
            return offset;
        }

        public String getType() {
            return MediaDataBox.TYPE;
        }

        public long getSize() {
            return 16 + this.contentSize;
        }

        private boolean isSmallBox(long contentSize) {
            return 8 + contentSize < 4294967296L;
        }

        public void getBox(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer bb = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                IsoTypeWriter.writeUInt32(bb, size);
            } else {
                IsoTypeWriter.writeUInt32(bb, 1);
            }
            bb.put(IsoFile.fourCCtoBytes(MediaDataBox.TYPE));
            if (isSmallBox(size)) {
                bb.put(new byte[8]);
            } else {
                IsoTypeWriter.writeUInt64(bb, size);
            }
            bb.rewind();
            writableByteChannel.write(bb);
            for (List<Sample> samples : this.chunkList) {
                for (Sample sample : samples) {
                    sample.writeTo(writableByteChannel);
                }
            }
        }
    }

    static {
        $assertionsDisabled = !DefaultMp4Builder.class.desiredAssertionStatus();
        LOG = Logger.getLogger(DefaultMp4Builder.class.getName());
    }

    public DefaultMp4Builder() {
        this.chunkOffsetBoxes = new HashSet();
        this.track2Sample = new HashMap();
        this.track2SampleSizes = new HashMap();
        this.intersectionFinder = new TwoSecondIntersectionFinder();
    }

    public void setIntersectionFinder(FragmentIntersectionFinder intersectionFinder) {
        this.intersectionFinder = intersectionFinder;
    }

    public Container build(Movie movie) {
        LOG.fine("Creating movie " + movie);
        for (Track track : movie.getTracks()) {
            int i;
            List<Sample> samples = track.getSamples();
            putSamples(track, samples);
            Object sizes = new Object[samples.size()];
            for (i = 0; i < sizes.length; i++) {
                sizes[i] = ((Sample) samples.get(i)).remaining();
            }
            this.track2SampleSizes.put(track, sizes);
        }
        BasicContainer isoFile = new BasicContainer();
        isoFile.addBox(createFileTypeBox(movie));
        Map<Track, int[]> chunks = new HashMap();
        for (Track track2 : movie.getTracks()) {
            chunks.put(track2, getChunkSizes(track2, movie));
        }
        Box moov = createMovieBox(movie, chunks);
        isoFile.addBox(moov);
        long contentSize = 0;
        for (Box stsz : Path.getPaths(moov, "trak/mdia/minf/stbl/stsz")) {
            contentSize += sum(((SampleSizeBox) stsz).getSampleSizes());
        }
        InterleaveChunkMdat mdat = new InterleaveChunkMdat(movie, chunks, contentSize, null);
        isoFile.addBox(mdat);
        long dataOffset = mdat.getDataOffset();
        for (StaticChunkOffsetBox chunkOffsetBox : this.chunkOffsetBoxes) {
            long[] offsets = chunkOffsetBox.getChunkOffsets();
            for (i = 0; i < offsets.length; i++) {
                offsets[i] = offsets[i] + dataOffset;
            }
        }
        return isoFile;
    }

    protected List<Sample> putSamples(Track track, List<Sample> samples) {
        return (List) this.track2Sample.put(track, samples);
    }

    protected FileTypeBox createFileTypeBox(Movie movie) {
        List<String> minorBrands = new LinkedList();
        minorBrands.add("isom");
        minorBrands.add("iso2");
        minorBrands.add(VisualSampleEntry.TYPE3);
        return new FileTypeBox("isom", 0, minorBrands);
    }

    protected MovieBox createMovieBox(Movie movie, Map<Track, int[]> chunks) {
        MovieBox movieBox = new MovieBox();
        MovieHeaderBox mvhd = new MovieHeaderBox();
        mvhd.setCreationTime(new Date());
        mvhd.setModificationTime(new Date());
        mvhd.setMatrix(movie.getMatrix());
        long movieTimeScale = getTimescale(movie);
        long duration = 0;
        for (Track track : movie.getTracks()) {
            long tracksDuration = (getDuration(track) * movieTimeScale) / track.getTrackMetaData().getTimescale();
            if (tracksDuration > duration) {
                duration = tracksDuration;
            }
        }
        mvhd.setDuration(duration);
        mvhd.setTimescale(movieTimeScale);
        long nextTrackId = 0;
        for (Track track2 : movie.getTracks()) {
            if (nextTrackId < track2.getTrackMetaData().getTrackId()) {
                nextTrackId = track2.getTrackMetaData().getTrackId();
            }
        }
        mvhd.setNextTrackId(nextTrackId + 1);
        movieBox.addBox(mvhd);
        for (Track track22 : movie.getTracks()) {
            movieBox.addBox(createTrackBox(track22, movie, chunks));
        }
        Box udta = createUdta(movie);
        if (udta != null) {
            movieBox.addBox(udta);
        }
        return movieBox;
    }

    protected Box createUdta(Movie movie) {
        return null;
    }

    protected TrackBox createTrackBox(Track track, Movie movie, Map<Track, int[]> chunks) {
        int i;
        TrackBox trackBox = new TrackBox();
        TrackHeaderBox tkhd = new TrackHeaderBox();
        tkhd.setEnabled(track.isEnabled());
        tkhd.setInMovie(track.isInMovie());
        tkhd.setInPreview(track.isInPreview());
        tkhd.setInPoster(track.isInPoster());
        tkhd.setMatrix(track.getTrackMetaData().getMatrix());
        tkhd.setAlternateGroup(track.getTrackMetaData().getGroup());
        tkhd.setCreationTime(track.getTrackMetaData().getCreationTime());
        tkhd.setDuration((getDuration(track) * getTimescale(movie)) / track.getTrackMetaData().getTimescale());
        tkhd.setHeight(track.getTrackMetaData().getHeight());
        tkhd.setWidth(track.getTrackMetaData().getWidth());
        tkhd.setLayer(track.getTrackMetaData().getLayer());
        tkhd.setModificationTime(new Date());
        tkhd.setTrackId(track.getTrackMetaData().getTrackId());
        tkhd.setVolume(track.getTrackMetaData().getVolume());
        trackBox.addBox(tkhd);
        MediaBox mdia = new MediaBox();
        trackBox.addBox(mdia);
        MediaHeaderBox mdhd = new MediaHeaderBox();
        mdhd.setCreationTime(track.getTrackMetaData().getCreationTime());
        mdhd.setDuration(getDuration(track));
        mdhd.setTimescale(track.getTrackMetaData().getTimescale());
        mdhd.setLanguage(track.getTrackMetaData().getLanguage());
        mdia.addBox(mdhd);
        HandlerBox hdlr = new HandlerBox();
        mdia.addBox(hdlr);
        hdlr.setHandlerType(track.getHandler());
        MediaInformationBox minf = new MediaInformationBox();
        minf.addBox(track.getMediaHeaderBox());
        DataInformationBox dinf = new DataInformationBox();
        DataReferenceBox dref = new DataReferenceBox();
        dinf.addBox(dref);
        DataEntryUrlBox url = new DataEntryUrlBox();
        url.setFlags(1);
        dref.addBox(url);
        minf.addBox(dinf);
        SampleTableBox stbl = new SampleTableBox();
        stbl.addBox(track.getSampleDescriptionBox());
        List<Entry> decodingTimeToSampleEntries = track.getDecodingTimeEntries();
        if (!(decodingTimeToSampleEntries == null || decodingTimeToSampleEntries.isEmpty())) {
            TimeToSampleBox stts = new TimeToSampleBox();
            stts.setEntries(decodingTimeToSampleEntries);
            stbl.addBox(stts);
        }
        List<CompositionTimeToSample.Entry> compositionTimeToSampleEntries = track.getCompositionTimeEntries();
        if (!(compositionTimeToSampleEntries == null || compositionTimeToSampleEntries.isEmpty())) {
            CompositionTimeToSample ctts = new CompositionTimeToSample();
            ctts.setEntries(compositionTimeToSampleEntries);
            stbl.addBox(ctts);
        }
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples != null && syncSamples.length > 0) {
            SyncSampleBox stss = new SyncSampleBox();
            stss.setSampleNumber(syncSamples);
            stbl.addBox(stss);
        }
        if (!(track.getSampleDependencies() == null || track.getSampleDependencies().isEmpty())) {
            SampleDependencyTypeBox sdtp = new SampleDependencyTypeBox();
            sdtp.setEntries(track.getSampleDependencies());
            stbl.addBox(sdtp);
        }
        int[] tracksChunkSizes = (int[]) chunks.get(track);
        SampleToChunkBox stsc = new SampleToChunkBox();
        stsc.setEntries(new LinkedList());
        long lastChunkSize = -2147483648L;
        for (i = 0; i < tracksChunkSizes.length; i++) {
            if (lastChunkSize != ((long) tracksChunkSizes[i])) {
                List entries = stsc.getEntries();
                r41.add(new SampleToChunkBox.Entry((long) (i + 1), (long) tracksChunkSizes[i], 1));
                lastChunkSize = (long) tracksChunkSizes[i];
            }
        }
        stbl.addBox(stsc);
        SampleSizeBox stsz = new SampleSizeBox();
        stsz.setSampleSizes((long[]) this.track2SampleSizes.get(track));
        stbl.addBox(stsz);
        StaticChunkOffsetBox stco = new StaticChunkOffsetBox();
        this.chunkOffsetBoxes.add(stco);
        long offset = 0;
        long[] chunkOffset = new long[tracksChunkSizes.length];
        if (LOG.isLoggable(Level.FINE)) {
            LOG.fine("Calculating chunk offsets for track_" + track.getTrackMetaData().getTrackId());
        }
        for (i = 0; i < tracksChunkSizes.length; i++) {
            if (LOG.isLoggable(Level.FINER)) {
                LOG.finer("Calculating chunk offsets for track_" + track.getTrackMetaData().getTrackId() + " chunk " + i);
            }
            for (Track current : movie.getTracks()) {
                int j;
                if (LOG.isLoggable(Level.FINEST)) {
                    LOG.finest("Adding offsets of track_" + current.getTrackMetaData().getTrackId());
                }
                int[] chunkSizes = (int[]) chunks.get(current);
                long firstSampleOfChunk = 0;
                for (j = 0; j < i; j++) {
                    firstSampleOfChunk += (long) chunkSizes[j];
                }
                if (current == track) {
                    chunkOffset[i] = offset;
                }
                for (j = CastUtils.l2i(firstSampleOfChunk); ((long) j) < ((long) chunkSizes[i]) + firstSampleOfChunk; j++) {
                    offset += ((long[]) this.track2SampleSizes.get(current))[j];
                }
            }
        }
        stco.setChunkOffsets(chunkOffset);
        stbl.addBox(stco);
        minf.addBox(stbl);
        mdia.addBox(minf);
        return trackBox;
    }

    int[] getChunkSizes(Track track, Movie movie) {
        long[] referenceChunkStarts = this.intersectionFinder.sampleNumbers(track, movie);
        int[] chunkSizes = new int[referenceChunkStarts.length];
        for (int i = 0; i < referenceChunkStarts.length; i++) {
            long end;
            long start = referenceChunkStarts[i] - 1;
            if (referenceChunkStarts.length == i + 1) {
                end = (long) track.getSamples().size();
            } else {
                end = referenceChunkStarts[i + 1] - 1;
            }
            chunkSizes[i] = CastUtils.l2i(end - start);
        }
        if ($assertionsDisabled || ((long) ((List) this.track2Sample.get(track)).size()) == sum(chunkSizes)) {
            return chunkSizes;
        }
        throw new AssertionError("The number of samples and the sum of all chunk lengths must be equal");
    }

    private static long sum(int[] ls) {
        long rc = 0;
        for (int i : ls) {
            rc += (long) i;
        }
        return rc;
    }

    private static long sum(long[] ls) {
        long rc = 0;
        for (long l : ls) {
            rc += l;
        }
        return rc;
    }

    protected static long getDuration(Track track) {
        long duration = 0;
        for (Entry entry : track.getDecodingTimeEntries()) {
            duration += entry.getCount() * entry.getDelta();
        }
        return duration;
    }

    public long getTimescale(Movie movie) {
        long timescale = ((Track) movie.getTracks().iterator().next()).getTrackMetaData().getTimescale();
        for (Track track : movie.getTracks()) {
            timescale = gcd(track.getTrackMetaData().getTimescale(), timescale);
        }
        return timescale;
    }

    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
