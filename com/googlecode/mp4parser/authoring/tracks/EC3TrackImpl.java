package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox.Entry;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class EC3TrackImpl extends AbstractTrack {
    static final /* synthetic */ boolean $assertionsDisabled;
    int bitrate;
    List<BitStreamInfo> entries;
    int frameSize;
    private BufferedInputStream inputStream;
    private String lang;
    SampleDescriptionBox sampleDescriptionBox;
    int samplerate;
    private List<Sample> samples;
    List<Entry> stts;
    TrackMetaData trackMetaData;

    public static class BitStreamInfo extends EC3SpecificBox.Entry {
        public int bitrate;
        public int chanmap;
        public int frameSize;
        public int samplerate;
        public int strmtyp;
        public int substreamid;

        public String toString() {
            return "BitStreamInfo{frameSize=" + this.frameSize + ", substreamid=" + this.substreamid + ", bitrate=" + this.bitrate + ", samplerate=" + this.samplerate + ", strmtyp=" + this.strmtyp + ", chanmap=" + this.chanmap + '}';
        }
    }

    static {
        $assertionsDisabled = !EC3TrackImpl.class.desiredAssertionStatus();
    }

    public EC3TrackImpl(InputStream fin, String lang) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.entries = new LinkedList();
        this.stts = new LinkedList();
        this.lang = "und";
        this.lang = lang;
        parse(fin);
    }

    public EC3TrackImpl(InputStream fin) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.entries = new LinkedList();
        this.stts = new LinkedList();
        this.lang = "und";
        parse(fin);
    }

    private void parse(InputStream fin) throws IOException {
        this.inputStream = new BufferedInputStream(fin);
        boolean done = false;
        this.inputStream.mark(10000);
        while (!done) {
            BitStreamInfo bsi = readVariables();
            if (bsi == null) {
                throw new IOException();
            }
            for (BitStreamInfo entry : this.entries) {
                if (bsi.strmtyp != 1 && entry.substreamid == bsi.substreamid) {
                    done = true;
                }
            }
            if (!done) {
                this.entries.add(bsi);
                long skipped = this.inputStream.skip((long) bsi.frameSize);
                if (!($assertionsDisabled || skipped == ((long) bsi.frameSize))) {
                    throw new AssertionError();
                }
            }
        }
        this.inputStream.reset();
        if (this.entries.size() == 0) {
            throw new IOException();
        }
        this.samplerate = ((BitStreamInfo) this.entries.get(0)).samplerate;
        this.sampleDescriptionBox = new SampleDescriptionBox();
        AudioSampleEntry audioSampleEntry = new AudioSampleEntry(AudioSampleEntry.TYPE9);
        audioSampleEntry.setChannelCount(2);
        audioSampleEntry.setSampleRate((long) this.samplerate);
        audioSampleEntry.setDataReferenceIndex(1);
        audioSampleEntry.setSampleSize(16);
        EC3SpecificBox ec3 = new EC3SpecificBox();
        int[] deps = new int[this.entries.size()];
        int[] chan_locs = new int[this.entries.size()];
        for (BitStreamInfo bsi2 : this.entries) {
            if (bsi2.strmtyp == 1) {
                int i = bsi2.substreamid;
                deps[i] = deps[i] + 1;
                chan_locs[bsi2.substreamid] = ((bsi2.chanmap >> 6) & 256) | ((bsi2.chanmap >> 5) & 255);
            }
        }
        for (BitStreamInfo bsi22 : this.entries) {
            if (bsi22.strmtyp != 1) {
                EC3SpecificBox.Entry e = new EC3SpecificBox.Entry();
                e.fscod = bsi22.fscod;
                e.bsid = bsi22.bsid;
                e.bsmod = bsi22.bsmod;
                e.acmod = bsi22.acmod;
                e.lfeon = bsi22.lfeon;
                e.reserved = 0;
                e.num_dep_sub = deps[bsi22.substreamid];
                e.chan_loc = chan_locs[bsi22.substreamid];
                e.reserved2 = 0;
                ec3.addEntry(e);
            }
            this.bitrate += bsi22.bitrate;
            this.frameSize += bsi22.frameSize;
        }
        ec3.setDataRate(this.bitrate / 1000);
        audioSampleEntry.addBox(ec3);
        this.sampleDescriptionBox.addBox(audioSampleEntry);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setLanguage(this.lang);
        this.trackMetaData.setTimescale((long) this.samplerate);
        this.trackMetaData.setVolume(1.0f);
        this.samples = new LinkedList();
        if (!readSamples()) {
            throw new IOException();
        }
    }

    public List<Sample> getSamples() {
        return this.samples;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public List<Entry> getDecodingTimeEntries() {
        return this.stts;
    }

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return null;
    }

    public long[] getSyncSamples() {
        return null;
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return null;
    }

    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }

    public String getHandler() {
        return "soun";
    }

    public AbstractMediaHeaderBox getMediaHeaderBox() {
        return new SoundMediaHeaderBox();
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return null;
    }

    private BitStreamInfo readVariables() throws IOException {
        byte[] data = new byte[200];
        this.inputStream.mark(200);
        if (200 != this.inputStream.read(data, 0, 200)) {
            return null;
        }
        this.inputStream.reset();
        BitReaderBuffer brb = new BitReaderBuffer(ByteBuffer.wrap(data));
        if (brb.readBits(16) != 2935) {
            return null;
        }
        int numblkscod;
        BitStreamInfo entry = new BitStreamInfo();
        entry.strmtyp = brb.readBits(2);
        entry.substreamid = brb.readBits(3);
        entry.frameSize = (brb.readBits(11) + 1) * 2;
        entry.fscod = brb.readBits(2);
        int fscod2 = -1;
        if (entry.fscod == 3) {
            fscod2 = brb.readBits(2);
            numblkscod = 3;
        } else {
            numblkscod = brb.readBits(2);
        }
        int numberOfBlocksPerSyncFrame = 0;
        switch (numblkscod) {
            case PBE.MD5 /*0*/:
                numberOfBlocksPerSyncFrame = 1;
                break;
            case ay.f /*1*/:
                numberOfBlocksPerSyncFrame = 2;
                break;
            case ay.n /*2*/:
                numberOfBlocksPerSyncFrame = 3;
                break;
            case ay.p /*3*/:
                numberOfBlocksPerSyncFrame = 6;
                break;
        }
        entry.frameSize *= 6 / numberOfBlocksPerSyncFrame;
        entry.acmod = brb.readBits(3);
        entry.lfeon = brb.readBits(1);
        entry.bsid = brb.readBits(5);
        brb.readBits(5);
        if (1 == brb.readBits(1)) {
            brb.readBits(8);
        }
        if (entry.acmod == 0) {
            brb.readBits(5);
            if (1 == brb.readBits(1)) {
                brb.readBits(8);
            }
        }
        if (1 == entry.strmtyp && 1 == brb.readBits(1)) {
            entry.chanmap = brb.readBits(16);
        }
        if (1 == brb.readBits(1)) {
            if (entry.acmod > 2) {
                brb.readBits(2);
            }
            if (1 == (entry.acmod & 1) && entry.acmod > 2) {
                brb.readBits(3);
                brb.readBits(3);
            }
            if ((entry.acmod & 4) > 0) {
                brb.readBits(3);
                brb.readBits(3);
            }
            if (1 == entry.lfeon && 1 == brb.readBits(1)) {
                brb.readBits(5);
            }
            if (entry.strmtyp == 0) {
                int i;
                if (1 == brb.readBits(1)) {
                    brb.readBits(6);
                }
                if (entry.acmod == 0 && 1 == brb.readBits(1)) {
                    brb.readBits(6);
                }
                if (1 == brb.readBits(1)) {
                    brb.readBits(6);
                }
                int mixdef = brb.readBits(2);
                if (1 == mixdef) {
                    brb.readBits(5);
                } else if (2 == mixdef) {
                    brb.readBits(12);
                } else if (3 == mixdef) {
                    int mixdeflen = brb.readBits(5);
                    if (1 == brb.readBits(1)) {
                        brb.readBits(5);
                        if (1 == brb.readBits(1)) {
                            brb.readBits(4);
                        }
                        if (1 == brb.readBits(1)) {
                            brb.readBits(4);
                        }
                        if (1 == brb.readBits(1)) {
                            brb.readBits(4);
                        }
                        if (1 == brb.readBits(1)) {
                            brb.readBits(4);
                        }
                        if (1 == brb.readBits(1)) {
                            brb.readBits(4);
                        }
                        if (1 == brb.readBits(1)) {
                            brb.readBits(4);
                        }
                        if (1 == brb.readBits(1)) {
                            brb.readBits(4);
                        }
                        if (1 == brb.readBits(1)) {
                            if (1 == brb.readBits(1)) {
                                brb.readBits(4);
                            }
                            if (1 == brb.readBits(1)) {
                                brb.readBits(4);
                            }
                        }
                    }
                    if (1 == brb.readBits(1)) {
                        brb.readBits(5);
                        if (1 == brb.readBits(1)) {
                            brb.readBits(7);
                            if (1 == brb.readBits(1)) {
                                brb.readBits(8);
                            }
                        }
                    }
                    for (i = 0; i < mixdeflen + 2; i++) {
                        brb.readBits(8);
                    }
                    brb.byteSync();
                }
                if (entry.acmod < 2) {
                    if (1 == brb.readBits(1)) {
                        brb.readBits(14);
                    }
                    if (entry.acmod == 0 && 1 == brb.readBits(1)) {
                        brb.readBits(14);
                    }
                    if (1 == brb.readBits(1)) {
                        if (numblkscod == 0) {
                            brb.readBits(5);
                        } else {
                            for (i = 0; i < numberOfBlocksPerSyncFrame; i++) {
                                if (1 == brb.readBits(1)) {
                                    brb.readBits(5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (1 == brb.readBits(1)) {
            entry.bsmod = brb.readBits(3);
        }
        switch (entry.fscod) {
            case PBE.MD5 /*0*/:
                entry.samplerate = 48000;
                break;
            case ay.f /*1*/:
                entry.samplerate = 44100;
                break;
            case ay.n /*2*/:
                entry.samplerate = 32000;
                break;
            case ay.p /*3*/:
                switch (fscod2) {
                    case PBE.MD5 /*0*/:
                        entry.samplerate = 24000;
                        break;
                    case ay.f /*1*/:
                        entry.samplerate = 22050;
                        break;
                    case ay.n /*2*/:
                        entry.samplerate = 16000;
                        break;
                    case ay.p /*3*/:
                        entry.samplerate = 0;
                        break;
                    default:
                        break;
                }
        }
        if (entry.samplerate == 0) {
            return null;
        }
        entry.bitrate = (int) (((((double) entry.samplerate) / 1536.0d) * ((double) entry.frameSize)) * 8.0d);
        return entry;
    }

    private boolean readSamples() throws IOException {
        int read = this.frameSize;
        boolean ret = false;
        while (this.frameSize == read) {
            ret = true;
            byte[] data = new byte[this.frameSize];
            read = this.inputStream.read(data);
            if (read == this.frameSize) {
                this.samples.add(new SampleImpl(ByteBuffer.wrap(data)));
                this.stts.add(new Entry(1, 1536));
            }
        }
        return ret;
    }

    public String toString() {
        return "EC3TrackImpl{bitrate=" + this.bitrate + ", samplerate=" + this.samplerate + ", entries=" + this.entries + '}';
    }
}
