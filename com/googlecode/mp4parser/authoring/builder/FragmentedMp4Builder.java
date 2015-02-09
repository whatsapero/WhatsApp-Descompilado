package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
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
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox;
import com.coremedia.iso.boxes.fragment.SampleFlags;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class FragmentedMp4Builder implements Mp4Builder {
    private static final Logger LOG;
    protected FragmentIntersectionFinder intersectionFinder;

    class AnonymousClass_1 implements Comparator<Track> {
        private final /* synthetic */ int val$cycle;
        private final /* synthetic */ Map val$intersectionMap;

        AnonymousClass_1(Map map, int i) {
            this.val$intersectionMap = map;
            this.val$cycle = i;
        }

        public int compare(Track o1, Track o2) {
            int i;
            long startSample1 = ((long[]) this.val$intersectionMap.get(o1))[this.val$cycle];
            long startSample2 = ((long[]) this.val$intersectionMap.get(o2))[this.val$cycle];
            long[] decTimes1 = TimeToSampleBox.blowupTimeToSamples(o1.getDecodingTimeEntries());
            long[] decTimes2 = TimeToSampleBox.blowupTimeToSamples(o2.getDecodingTimeEntries());
            long startTime1 = 0;
            long startTime2 = 0;
            for (i = 1; ((long) i) < startSample1; i++) {
                startTime1 += decTimes1[i - 1];
            }
            for (i = 1; ((long) i) < startSample2; i++) {
                startTime2 += decTimes2[i - 1];
            }
            return (int) (((((double) startTime1) / ((double) o1.getTrackMetaData().getTimescale())) - (((double) startTime2) / ((double) o2.getTrackMetaData().getTimescale()))) * 100.0d);
        }
    }

    class AnonymousClass_1Mdat implements Box {
        Container parent;
        private final /* synthetic */ long val$endSample;
        private final /* synthetic */ int val$i;
        private final /* synthetic */ long val$startSample;
        private final /* synthetic */ Track val$track;

        AnonymousClass_1Mdat(long j, long j2, Track track, int i) {
            this.val$startSample = j;
            this.val$endSample = j2;
            this.val$track = track;
            this.val$i = i;
        }

        public Container getParent() {
            return this.parent;
        }

        public long getOffset() {
            throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
        }

        public void setParent(Container parent) {
            this.parent = parent;
        }

        public long getSize() {
            long size = 8;
            for (Sample sample : FragmentedMp4Builder.this.getSamples(this.val$startSample, this.val$endSample, this.val$track, this.val$i)) {
                size += sample.remaining();
            }
            return size;
        }

        public String getType() {
            return MediaDataBox.TYPE;
        }

        public void getBox(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer header = ByteBuffer.allocate(8);
            IsoTypeWriter.writeUInt32(header, (long) CastUtils.l2i(getSize()));
            header.put(IsoFile.fourCCtoBytes(getType()));
            header.rewind();
            writableByteChannel.write(header);
            for (Sample sample : FragmentedMp4Builder.this.getSamples(this.val$startSample, this.val$endSample, this.val$track, this.val$i)) {
                sample.writeTo(writableByteChannel);
            }
        }

        public void parse(FileChannel fileChannel, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {
        }
    }

    static {
        LOG = Logger.getLogger(FragmentedMp4Builder.class.getName());
    }

    public FragmentedMp4Builder() {
        this.intersectionFinder = new SyncSampleIntersectFinderImpl();
    }

    public List<String> getAllowedHandlers() {
        return Arrays.asList(new String[]{"soun", "vide"});
    }

    public Box createFtyp(Movie movie) {
        List<String> minorBrands = new LinkedList();
        minorBrands.add("isom");
        minorBrands.add("iso2");
        minorBrands.add(VisualSampleEntry.TYPE3);
        return new FileTypeBox("isom", 0, minorBrands);
    }

    protected List<Track> sortTracksInSequence(List<Track> tracks, int cycle, Map<Track, long[]> intersectionMap) {
        List<Track> tracks2 = new LinkedList(tracks);
        Collections.sort(tracks2, new AnonymousClass_1(intersectionMap, cycle));
        return tracks2;
    }

    protected List<Box> createMoofMdat(Movie movie) {
        List<Box> boxes = new LinkedList();
        HashMap<Track, long[]> intersectionMap = new HashMap();
        int maxNumberOfFragments = 0;
        for (Track track : movie.getTracks()) {
            long[] intersects = this.intersectionFinder.sampleNumbers(track, movie);
            intersectionMap.put(track, intersects);
            maxNumberOfFragments = Math.max(maxNumberOfFragments, intersects.length);
        }
        int sequence = 1;
        for (int cycle = 0; cycle < maxNumberOfFragments; cycle++) {
            for (Track track2 : sortTracksInSequence(movie.getTracks(), cycle, intersectionMap)) {
                if (!getAllowedHandlers().isEmpty()) {
                    if (!getAllowedHandlers().contains(track2.getHandler())) {
                    }
                }
                long[] startSamples = (long[]) intersectionMap.get(track2);
                if (cycle < startSamples.length) {
                    long startSample = startSamples[cycle];
                    int i = cycle + 1;
                    int length = startSamples.length;
                    long endSample = i < r0 ? startSamples[cycle + 1] : (long) (track2.getSamples().size() + 1);
                    if (startSample != endSample) {
                        boxes.add(createMoof(startSample, endSample, track2, sequence));
                        int sequence2 = sequence + 1;
                        boxes.add(createMdat(startSample, endSample, track2, sequence));
                        sequence = sequence2;
                    }
                }
            }
        }
        return boxes;
    }

    public Container build(Movie movie) {
        LOG.fine("Creating movie " + movie);
        BasicContainer isoFile = new BasicContainer();
        isoFile.addBox(createFtyp(movie));
        isoFile.addBox(createMoov(movie));
        for (Box box : createMoofMdat(movie)) {
            isoFile.addBox(box);
        }
        isoFile.addBox(createMfra(movie, isoFile));
        return isoFile;
    }

    protected Box createMdat(long startSample, long endSample, Track track, int i) {
        return new AnonymousClass_1Mdat(startSample, endSample, track, i);
    }

    protected Box createTfhd(long startSample, long endSample, Track track, int sequenceNumber) {
        TrackFragmentHeaderBox tfhd = new TrackFragmentHeaderBox();
        tfhd.setDefaultSampleFlags(new SampleFlags());
        tfhd.setBaseDataOffset(-1);
        tfhd.setTrackId(track.getTrackMetaData().getTrackId());
        return tfhd;
    }

    protected Box createMfhd(long startSample, long endSample, Track track, int sequenceNumber) {
        MovieFragmentHeaderBox mfhd = new MovieFragmentHeaderBox();
        mfhd.setSequenceNumber((long) sequenceNumber);
        return mfhd;
    }

    protected Box createTraf(long startSample, long endSample, Track track, int sequenceNumber) {
        TrackFragmentBox traf = new TrackFragmentBox();
        traf.addBox(createTfhd(startSample, endSample, track, sequenceNumber));
        for (Box trun : createTruns(startSample, endSample, track, sequenceNumber)) {
            traf.addBox(trun);
        }
        return traf;
    }

    protected List<Sample> getSamples(long startSample, long endSample, Track track, int sequenceNumber) {
        return track.getSamples().subList(CastUtils.l2i(startSample) - 1, CastUtils.l2i(endSample) - 1);
    }

    protected long[] getSampleSizes(long startSample, long endSample, Track track, int sequenceNumber) {
        List<Sample> samples = getSamples(startSample, endSample, track, sequenceNumber);
        long[] sampleSizes = new long[samples.size()];
        for (int i = 0; i < sampleSizes.length; i++) {
            sampleSizes[i] = ((Sample) samples.get(i)).remaining();
        }
        return sampleSizes;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.util.List<? extends com.coremedia.iso.boxes.Box> createTruns(long r24_startSample, long r26_endSample, com.googlecode.mp4parser.authoring.Track r28_track, int r29_sequenceNumber) {
        /*
        r23_this = this;
        r18 = new com.coremedia.iso.boxes.fragment.TrackRunBox;
        r18.<init>();
        r15 = r23.getSampleSizes(r24, r26, r28, r29);
        r19 = 1;
        r18.setSampleDurationPresent(r19);
        r19 = 1;
        r18.setSampleSizePresent(r19);
        r8 = new java.util.ArrayList;
        r20 = r26 - r24;
        r19 = com.googlecode.mp4parser.util.CastUtils.l2i(r20);
        r0 = r19;
        r8.<init>(r0);
        r17 = new java.util.LinkedList;
        r19 = r28.getDecodingTimeEntries();
        r0 = r17;
        r1 = r19;
        r0.<init>(r1);
        r20 = 1;
        r12 = r24 - r20;
        r19 = r17.peek();
        r19 = (com.coremedia.iso.boxes.TimeToSampleBox.Entry) r19;
        r6 = r19.getCount();
    L_0x003b:
        r19 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1));
        if (r19 > 0) goto L_0x00b4;
    L_0x003f:
        r6 = r6 - r12;
        r19 = r28.getCompositionTimeEntries();
        if (r19 == 0) goto L_0x00c4;
    L_0x0046:
        r19 = r28.getCompositionTimeEntries();
        r19 = r19.size();
        if (r19 <= 0) goto L_0x00c4;
    L_0x0050:
        r4 = new java.util.LinkedList;
        r19 = r28.getCompositionTimeEntries();
        r0 = r19;
        r4.<init>(r0);
    L_0x005b:
        if (r4 == 0) goto L_0x00c6;
    L_0x005d:
        r19 = r4.peek();
        r19 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r19;
        r19 = r19.getCount();
    L_0x0067:
        r0 = r19;
        r2 = (long) r0;
        r20 = 0;
        r19 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1));
        if (r19 <= 0) goto L_0x00c9;
    L_0x0070:
        r19 = 1;
    L_0x0072:
        r18.setSampleCompositionTimeOffsetPresent(r19);
        r10 = 1;
    L_0x0077:
        r19 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1));
        if (r19 < 0) goto L_0x00cc;
    L_0x007b:
        r19 = r28.getSampleDependencies();
        if (r19 == 0) goto L_0x008b;
    L_0x0081:
        r19 = r28.getSampleDependencies();
        r19 = r19.isEmpty();
        if (r19 == 0) goto L_0x00fa;
    L_0x008b:
        r19 = r28.getSyncSamples();
        if (r19 == 0) goto L_0x009c;
    L_0x0091:
        r19 = r28.getSyncSamples();
        r0 = r19;
        r0 = r0.length;
        r19 = r0;
        if (r19 != 0) goto L_0x00fa;
    L_0x009c:
        r14 = 0;
    L_0x009d:
        r0 = r18;
        r0.setSampleFlagsPresent(r14);
        r10 = 0;
    L_0x00a3:
        r0 = r15.length;
        r19 = r0;
        r0 = r19;
        if (r10 < r0) goto L_0x00fc;
    L_0x00aa:
        r0 = r18;
        r0.setEntries(r8);
        r19 = java.util.Collections.singletonList(r18);
        return r19;
    L_0x00b4:
        r12 = r12 - r6;
        r17.remove();
        r19 = r17.peek();
        r19 = (com.coremedia.iso.boxes.TimeToSampleBox.Entry) r19;
        r6 = r19.getCount();
        goto L_0x003b;
    L_0x00c4:
        r4 = 0;
        goto L_0x005b;
    L_0x00c6:
        r19 = -1;
        goto L_0x0067;
    L_0x00c9:
        r19 = 0;
        goto L_0x0072;
    L_0x00cc:
        if (r4 == 0) goto L_0x00f4;
    L_0x00ce:
        r20 = 1;
        r2 = r2 - r20;
        r20 = 0;
        r19 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1));
        if (r19 != 0) goto L_0x00f4;
    L_0x00d8:
        r19 = r4.size();
        r20 = 1;
        r0 = r19;
        r1 = r20;
        if (r0 <= r1) goto L_0x00f4;
    L_0x00e4:
        r4.remove();
        r19 = r4.element();
        r19 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r19;
        r19 = r19.getCount();
        r0 = r19;
        r2 = (long) r0;
    L_0x00f4:
        r20 = 1;
        r10 = r10 + r20;
        goto L_0x0077;
    L_0x00fa:
        r14 = 1;
        goto L_0x009d;
    L_0x00fc:
        r9 = new com.coremedia.iso.boxes.fragment.TrackRunBox$Entry;
        r9.<init>();
        r20 = r15[r10];
        r0 = r20;
        r9.setSampleSize(r0);
        if (r14 == 0) goto L_0x0183;
    L_0x010a:
        r16 = new com.coremedia.iso.boxes.fragment.SampleFlags;
        r16.<init>();
        r19 = r28.getSampleDependencies();
        if (r19 == 0) goto L_0x014c;
    L_0x0115:
        r19 = r28.getSampleDependencies();
        r19 = r19.isEmpty();
        if (r19 != 0) goto L_0x014c;
    L_0x011f:
        r19 = r28.getSampleDependencies();
        r0 = r19;
        r5 = r0.get(r10);
        r5 = (com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry) r5;
        r19 = r5.getSampleDependsOn();
        r0 = r16;
        r1 = r19;
        r0.setSampleDependsOn(r1);
        r19 = r5.getSampleIsDependentOn();
        r0 = r16;
        r1 = r19;
        r0.setSampleIsDependedOn(r1);
        r19 = r5.getSampleHasRedundancy();
        r0 = r16;
        r1 = r19;
        r0.setSampleHasRedundancy(r1);
    L_0x014c:
        r19 = r28.getSyncSamples();
        if (r19 == 0) goto L_0x017e;
    L_0x0152:
        r19 = r28.getSyncSamples();
        r0 = r19;
        r0 = r0.length;
        r19 = r0;
        if (r19 <= 0) goto L_0x017e;
    L_0x015d:
        r19 = r28.getSyncSamples();
        r0 = (long) r10;
        r20 = r0;
        r20 = r20 + r24;
        r19 = java.util.Arrays.binarySearch(r19, r20);
        if (r19 < 0) goto L_0x01f3;
    L_0x016c:
        r19 = 0;
        r0 = r16;
        r1 = r19;
        r0.setSampleIsDifferenceSample(r1);
        r19 = 2;
        r0 = r16;
        r1 = r19;
        r0.setSampleDependsOn(r1);
    L_0x017e:
        r0 = r16;
        r9.setSampleFlags(r0);
    L_0x0183:
        r19 = r17.peek();
        r19 = (com.coremedia.iso.boxes.TimeToSampleBox.Entry) r19;
        r20 = r19.getDelta();
        r0 = r20;
        r9.setSampleDuration(r0);
        r20 = 1;
        r6 = r6 - r20;
        r20 = 0;
        r19 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1));
        if (r19 != 0) goto L_0x01b5;
    L_0x019c:
        r19 = r17.size();
        r20 = 1;
        r0 = r19;
        r1 = r20;
        if (r0 <= r1) goto L_0x01b5;
    L_0x01a8:
        r17.remove();
        r19 = r17.peek();
        r19 = (com.coremedia.iso.boxes.TimeToSampleBox.Entry) r19;
        r6 = r19.getCount();
    L_0x01b5:
        if (r4 == 0) goto L_0x01ec;
    L_0x01b7:
        r19 = r4.peek();
        r19 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r19;
        r19 = r19.getOffset();
        r0 = r19;
        r9.setSampleCompositionTimeOffset(r0);
        r20 = 1;
        r2 = r2 - r20;
        r20 = 0;
        r19 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1));
        if (r19 != 0) goto L_0x01ec;
    L_0x01d0:
        r19 = r4.size();
        r20 = 1;
        r0 = r19;
        r1 = r20;
        if (r0 <= r1) goto L_0x01ec;
    L_0x01dc:
        r4.remove();
        r19 = r4.element();
        r19 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r19;
        r19 = r19.getCount();
        r0 = r19;
        r2 = (long) r0;
    L_0x01ec:
        r8.add(r9);
        r10 = r10 + 1;
        goto L_0x00a3;
    L_0x01f3:
        r19 = 1;
        r0 = r16;
        r1 = r19;
        r0.setSampleIsDifferenceSample(r1);
        r19 = 1;
        r0 = r16;
        r1 = r19;
        r0.setSampleDependsOn(r1);
        goto L_0x017e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder.createTruns(long, long, com.googlecode.mp4parser.authoring.Track, int):java.util.List<? extends com.coremedia.iso.boxes.Box>");
    }

    protected Box createMoof(long startSample, long endSample, Track track, int sequenceNumber) {
        MovieFragmentBox moof = new MovieFragmentBox();
        moof.addBox(createMfhd(startSample, endSample, track, sequenceNumber));
        moof.addBox(createTraf(startSample, endSample, track, sequenceNumber));
        TrackRunBox firstTrun = (TrackRunBox) moof.getTrackRunBoxes().get(0);
        firstTrun.setDataOffset(1);
        firstTrun.setDataOffset((int) (8 + moof.getSize()));
        return moof;
    }

    protected Box createMvhd(Movie movie) {
        MovieHeaderBox mvhd = new MovieHeaderBox();
        mvhd.setVersion(1);
        mvhd.setCreationTime(new Date());
        mvhd.setModificationTime(new Date());
        long movieTimeScale = movie.getTimescale();
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
        return mvhd;
    }

    protected Box createMoov(Movie movie) {
        MovieBox movieBox = new MovieBox();
        movieBox.addBox(createMvhd(movie));
        movieBox.addBox(createMvex(movie));
        for (Track track : movie.getTracks()) {
            movieBox.addBox(createTrak(track, movie));
        }
        return movieBox;
    }

    protected Box createTfra(Track track, Container isoFile) {
        TrackFragmentRandomAccessBox tfra = new TrackFragmentRandomAccessBox();
        tfra.setVersion(1);
        List<Entry> offset2timeEntries = new LinkedList();
        long offset = 0;
        long duration = 0;
        for (Box box : isoFile.getBoxes()) {
            if (box instanceof MovieFragmentBox) {
                List<TrackFragmentBox> trafs = ((MovieFragmentBox) box).getBoxes(TrackFragmentBox.class);
                for (int i = 0; i < trafs.size(); i++) {
                    TrackFragmentBox traf = (TrackFragmentBox) trafs.get(i);
                    if (traf.getTrackFragmentHeaderBox().getTrackId() == track.getTrackMetaData().getTrackId()) {
                        List<TrackRunBox> truns = traf.getBoxes(TrackRunBox.class);
                        for (int j = 0; j < truns.size(); j++) {
                            List<Entry> offset2timeEntriesThisTrun = new LinkedList();
                            TrackRunBox trun = (TrackRunBox) truns.get(j);
                            for (int k = 0; k < trun.getEntries().size(); k++) {
                                TrackRunBox.Entry trunEntry = (TrackRunBox.Entry) trun.getEntries().get(k);
                                SampleFlags sf = null;
                                if (k == 0 && trun.isFirstSampleFlagsPresent()) {
                                    sf = trun.getFirstSampleFlags();
                                } else if (trun.isSampleFlagsPresent()) {
                                    sf = trunEntry.getSampleFlags();
                                } else {
                                    MovieBox moov = null;
                                    for (Box box1 : isoFile.getBoxes()) {
                                        if (box1 instanceof MovieBox) {
                                            moov = (MovieBox) box1;
                                        }
                                    }
                                    for (MovieExtendsBox movieExtendsBox : moov.getBoxes(MovieExtendsBox.class)) {
                                        for (TrackExtendsBox trex : movieExtendsBox.getBoxes(TrackExtendsBox.class)) {
                                            if (trex.getTrackId() == track.getTrackMetaData().getTrackId()) {
                                                sf = trex.getDefaultSampleFlags();
                                            }
                                        }
                                    }
                                }
                                if (sf == null) {
                                    throw new RuntimeException("Could not find any SampleFlags to indicate random access or not");
                                }
                                if (sf.getSampleDependsOn() == 2) {
                                    offset2timeEntriesThisTrun.add(new Entry(duration, offset, (long) (i + 1), (long) (j + 1), (long) (k + 1)));
                                }
                                duration += trunEntry.getSampleDuration();
                            }
                            if (offset2timeEntriesThisTrun.size() != trun.getEntries().size() || trun.getEntries().size() <= 0) {
                                offset2timeEntries.addAll(offset2timeEntriesThisTrun);
                            } else {
                                offset2timeEntries.add((Entry) offset2timeEntriesThisTrun.get(0));
                            }
                        }
                        continue;
                    }
                }
                continue;
            }
            offset += box.getSize();
        }
        tfra.setEntries(offset2timeEntries);
        tfra.setTrackId(track.getTrackMetaData().getTrackId());
        return tfra;
    }

    protected Box createMfra(Movie movie, Container isoFile) {
        MovieFragmentRandomAccessBox mfra = new MovieFragmentRandomAccessBox();
        for (Track track : movie.getTracks()) {
            mfra.addBox(createTfra(track, isoFile));
        }
        MovieFragmentRandomAccessOffsetBox mfro = new MovieFragmentRandomAccessOffsetBox();
        mfra.addBox(mfro);
        mfro.setMfraSize(mfra.getSize());
        return mfra;
    }

    protected Box createTrex(Movie movie, Track track) {
        TrackExtendsBox trex = new TrackExtendsBox();
        trex.setTrackId(track.getTrackMetaData().getTrackId());
        trex.setDefaultSampleDescriptionIndex(1);
        trex.setDefaultSampleDuration(0);
        trex.setDefaultSampleSize(0);
        SampleFlags sf = new SampleFlags();
        if ("soun".equals(track.getHandler()) || "subt".equals(track.getHandler())) {
            sf.setSampleDependsOn(2);
            sf.setSampleIsDependedOn(2);
        }
        trex.setDefaultSampleFlags(sf);
        return trex;
    }

    protected Box createMvex(Movie movie) {
        MovieExtendsBox mvex = new MovieExtendsBox();
        MovieExtendsHeaderBox mved = new MovieExtendsHeaderBox();
        for (Track track : movie.getTracks()) {
            long trackDuration = getTrackDuration(movie, track);
            if (mved.getFragmentDuration() < trackDuration) {
                mved.setFragmentDuration(trackDuration);
            }
        }
        mvex.addBox(mved);
        for (Track track2 : movie.getTracks()) {
            mvex.addBox(createTrex(movie, track2));
        }
        return mvex;
    }

    protected Box createTkhd(Movie movie, Track track) {
        TrackHeaderBox tkhd = new TrackHeaderBox();
        tkhd.setVersion(1);
        int flags = 0;
        if (track.isEnabled()) {
            flags = 0 + 1;
        }
        if (track.isInMovie()) {
            flags += 2;
        }
        if (track.isInPreview()) {
            flags += 4;
        }
        if (track.isInPoster()) {
            flags += 8;
        }
        tkhd.setFlags(flags);
        tkhd.setAlternateGroup(track.getTrackMetaData().getGroup());
        tkhd.setCreationTime(track.getTrackMetaData().getCreationTime());
        tkhd.setDuration(getTrackDuration(movie, track));
        tkhd.setHeight(track.getTrackMetaData().getHeight());
        tkhd.setWidth(track.getTrackMetaData().getWidth());
        tkhd.setLayer(track.getTrackMetaData().getLayer());
        tkhd.setModificationTime(new Date());
        tkhd.setTrackId(track.getTrackMetaData().getTrackId());
        tkhd.setVolume(track.getTrackMetaData().getVolume());
        return tkhd;
    }

    private long getTrackDuration(Movie movie, Track track) {
        return (getDuration(track) * movie.getTimescale()) / track.getTrackMetaData().getTimescale();
    }

    protected Box createMdhd(Movie movie, Track track) {
        MediaHeaderBox mdhd = new MediaHeaderBox();
        mdhd.setCreationTime(track.getTrackMetaData().getCreationTime());
        mdhd.setDuration(getDuration(track));
        mdhd.setTimescale(track.getTrackMetaData().getTimescale());
        mdhd.setLanguage(track.getTrackMetaData().getLanguage());
        return mdhd;
    }

    protected Box createStbl(Movie movie, Track track) {
        SampleTableBox stbl = new SampleTableBox();
        stbl.addBox(track.getSampleDescriptionBox());
        stbl.addBox(new TimeToSampleBox());
        stbl.addBox(new StaticChunkOffsetBox());
        return stbl;
    }

    protected Box createMinf(Track track, Movie movie) {
        MediaInformationBox minf = new MediaInformationBox();
        minf.addBox(track.getMediaHeaderBox());
        minf.addBox(createDinf(movie, track));
        minf.addBox(createStbl(movie, track));
        return minf;
    }

    protected Box createMdiaHdlr(Track track, Movie movie) {
        HandlerBox hdlr = new HandlerBox();
        hdlr.setHandlerType(track.getHandler());
        return hdlr;
    }

    protected Box createMdia(Track track, Movie movie) {
        MediaBox mdia = new MediaBox();
        mdia.addBox(createMdhd(movie, track));
        mdia.addBox(createMdiaHdlr(track, movie));
        mdia.addBox(createMinf(track, movie));
        return mdia;
    }

    protected Box createTrak(Track track, Movie movie) {
        LOG.fine("Creating Track " + track);
        TrackBox trackBox = new TrackBox();
        trackBox.addBox(createTkhd(movie, track));
        trackBox.addBox(createMdia(track, movie));
        return trackBox;
    }

    protected DataInformationBox createDinf(Movie movie, Track track) {
        DataInformationBox dinf = new DataInformationBox();
        DataReferenceBox dref = new DataReferenceBox();
        dinf.addBox(dref);
        DataEntryUrlBox url = new DataEntryUrlBox();
        url.setFlags(1);
        dref.addBox(url);
        return dinf;
    }

    public FragmentIntersectionFinder getFragmentIntersectionFinder() {
        return this.intersectionFinder;
    }

    public void setIntersectionFinder(FragmentIntersectionFinder intersectionFinder) {
        this.intersectionFinder = intersectionFinder;
    }

    protected long getDuration(Track track) {
        long duration = 0;
        for (TimeToSampleBox.Entry entry : track.getDecodingTimeEntries()) {
            duration += entry.getCount() * entry.getDelta();
        }
        return duration;
    }
}
