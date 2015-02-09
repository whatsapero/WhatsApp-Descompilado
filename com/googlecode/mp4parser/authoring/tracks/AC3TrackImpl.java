package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
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
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class AC3TrackImpl extends AbstractTrack {
    int acmod;
    int[][][][] bitRateAndFrameSizeTable;
    int bitrate;
    int bsid;
    int bsmod;
    int channelCount;
    int frameSize;
    int frmsizecod;
    int fscod;
    private InputStream inputStream;
    private String lang;
    int lfeon;
    boolean readSamples;
    SampleDescriptionBox sampleDescriptionBox;
    int samplerate;
    private List<Sample> samples;
    List<Entry> stts;
    TrackMetaData trackMetaData;

    public AC3TrackImpl(InputStream fin, String lang) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.readSamples = false;
        this.lang = "und";
        this.lang = lang;
        parse(fin);
    }

    public AC3TrackImpl(InputStream fin) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.readSamples = false;
        this.lang = "und";
        parse(fin);
    }

    private void parse(InputStream fin) throws IOException {
        this.inputStream = fin;
        this.bitRateAndFrameSizeTable = (int[][][][]) Array.newInstance(Integer.TYPE, new int[]{19, 2, 3, 2});
        this.stts = new LinkedList();
        initBitRateAndFrameSizeTable();
        if (readVariables()) {
            this.sampleDescriptionBox = new SampleDescriptionBox();
            AudioSampleEntry audioSampleEntry = new AudioSampleEntry(AudioSampleEntry.TYPE8);
            audioSampleEntry.setChannelCount(2);
            audioSampleEntry.setSampleRate((long) this.samplerate);
            audioSampleEntry.setDataReferenceIndex(1);
            audioSampleEntry.setSampleSize(16);
            AC3SpecificBox ac3 = new AC3SpecificBox();
            ac3.setAcmod(this.acmod);
            ac3.setBitRateCode(this.frmsizecod >> 1);
            ac3.setBsid(this.bsid);
            ac3.setBsmod(this.bsmod);
            ac3.setFscod(this.fscod);
            ac3.setLfeon(this.lfeon);
            ac3.setReserved(0);
            audioSampleEntry.addBox(ac3);
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
            return;
        }
        throw new IOException();
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

    public Box getMediaHeaderBox() {
        return new SoundMediaHeaderBox();
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return null;
    }

    private boolean readVariables() throws IOException {
        byte[] data = new byte[100];
        this.inputStream.mark(100);
        if (100 != this.inputStream.read(data, 0, 100)) {
            return false;
        }
        this.inputStream.reset();
        BitReaderBuffer brb = new BitReaderBuffer(ByteBuffer.wrap(data));
        if (brb.readBits(16) != 2935) {
            return false;
        }
        brb.readBits(16);
        this.fscod = brb.readBits(2);
        switch (this.fscod) {
            case PBE.MD5 /*0*/:
                this.samplerate = 48000;
                break;
            case ay.f /*1*/:
                this.samplerate = 44100;
                break;
            case ay.n /*2*/:
                this.samplerate = 32000;
                break;
            case ay.p /*3*/:
                this.samplerate = 0;
                break;
        }
        if (this.samplerate == 0) {
            return false;
        }
        this.frmsizecod = brb.readBits(6);
        if (!calcBitrateAndFrameSize(this.frmsizecod) || this.frameSize == 0) {
            return false;
        }
        this.bsid = brb.readBits(5);
        this.bsmod = brb.readBits(3);
        this.acmod = brb.readBits(3);
        if (this.bsid == 9) {
            this.samplerate /= 2;
        } else if (!(this.bsid == 8 || this.bsid == 6)) {
            return false;
        }
        if (this.acmod != 1 && (this.acmod & 1) == 1) {
            brb.readBits(2);
        }
        if ((this.acmod & 4) != 0) {
            brb.readBits(2);
        }
        if (this.acmod == 2) {
            brb.readBits(2);
        }
        switch (this.acmod) {
            case PBE.MD5 /*0*/:
                this.channelCount = 2;
                break;
            case ay.f /*1*/:
                this.channelCount = 1;
                break;
            case ay.n /*2*/:
                this.channelCount = 2;
                break;
            case ay.p /*3*/:
                this.channelCount = 3;
                break;
            case aj.i /*4*/:
                this.channelCount = 3;
                break;
            case aV.r /*5*/:
                this.channelCount = 4;
                break;
            case aV.i /*6*/:
                this.channelCount = 4;
                break;
            case a8.s /*7*/:
                this.channelCount = 5;
                break;
        }
        this.lfeon = brb.readBits(1);
        if (this.lfeon == 1) {
            this.channelCount++;
        }
        return true;
    }

    private boolean calcBitrateAndFrameSize(int code) {
        int frmsizecode = code >>> 1;
        int flag = code & 1;
        if (frmsizecode > 18 || flag > 1 || this.fscod > 2) {
            return false;
        }
        this.bitrate = this.bitRateAndFrameSizeTable[frmsizecode][flag][this.fscod][0];
        this.frameSize = this.bitRateAndFrameSizeTable[frmsizecode][flag][this.fscod][1] * 2;
        return true;
    }

    private boolean readSamples() throws IOException {
        boolean z = true;
        if (!this.readSamples) {
            this.readSamples = true;
            byte[] header = new byte[5];
            z = false;
            this.inputStream.mark(5);
            while (-1 != this.inputStream.read(header)) {
                z = true;
                calcBitrateAndFrameSize(header[4] & 63);
                this.inputStream.reset();
                byte[] data = new byte[this.frameSize];
                this.inputStream.read(data);
                this.samples.add(new SampleImpl(ByteBuffer.wrap(data)));
                this.stts.add(new Entry(1, 1536));
                this.inputStream.mark(5);
            }
        }
        return z;
    }

    private void initBitRateAndFrameSizeTable() {
        this.bitRateAndFrameSizeTable[0][0][0][0] = 32;
        this.bitRateAndFrameSizeTable[0][1][0][0] = 32;
        this.bitRateAndFrameSizeTable[0][0][0][1] = 64;
        this.bitRateAndFrameSizeTable[0][1][0][1] = 64;
        this.bitRateAndFrameSizeTable[1][0][0][0] = 40;
        this.bitRateAndFrameSizeTable[1][1][0][0] = 40;
        this.bitRateAndFrameSizeTable[1][0][0][1] = 80;
        this.bitRateAndFrameSizeTable[1][1][0][1] = 80;
        this.bitRateAndFrameSizeTable[2][0][0][0] = 48;
        this.bitRateAndFrameSizeTable[2][1][0][0] = 48;
        this.bitRateAndFrameSizeTable[2][0][0][1] = 96;
        this.bitRateAndFrameSizeTable[2][1][0][1] = 96;
        this.bitRateAndFrameSizeTable[3][0][0][0] = 56;
        this.bitRateAndFrameSizeTable[3][1][0][0] = 56;
        this.bitRateAndFrameSizeTable[3][0][0][1] = 112;
        this.bitRateAndFrameSizeTable[3][1][0][1] = 112;
        this.bitRateAndFrameSizeTable[4][0][0][0] = 64;
        this.bitRateAndFrameSizeTable[4][1][0][0] = 64;
        this.bitRateAndFrameSizeTable[4][0][0][1] = 128;
        this.bitRateAndFrameSizeTable[4][1][0][1] = 128;
        this.bitRateAndFrameSizeTable[5][0][0][0] = 80;
        this.bitRateAndFrameSizeTable[5][1][0][0] = 80;
        this.bitRateAndFrameSizeTable[5][0][0][1] = 160;
        this.bitRateAndFrameSizeTable[5][1][0][1] = 160;
        this.bitRateAndFrameSizeTable[6][0][0][0] = 96;
        this.bitRateAndFrameSizeTable[6][1][0][0] = 96;
        this.bitRateAndFrameSizeTable[6][0][0][1] = 192;
        this.bitRateAndFrameSizeTable[6][1][0][1] = 192;
        this.bitRateAndFrameSizeTable[7][0][0][0] = 112;
        this.bitRateAndFrameSizeTable[7][1][0][0] = 112;
        this.bitRateAndFrameSizeTable[7][0][0][1] = 224;
        this.bitRateAndFrameSizeTable[7][1][0][1] = 224;
        this.bitRateAndFrameSizeTable[8][0][0][0] = 128;
        this.bitRateAndFrameSizeTable[8][1][0][0] = 128;
        this.bitRateAndFrameSizeTable[8][0][0][1] = 256;
        this.bitRateAndFrameSizeTable[8][1][0][1] = 256;
        this.bitRateAndFrameSizeTable[9][0][0][0] = 160;
        this.bitRateAndFrameSizeTable[9][1][0][0] = 160;
        this.bitRateAndFrameSizeTable[9][0][0][1] = 320;
        this.bitRateAndFrameSizeTable[9][1][0][1] = 320;
        this.bitRateAndFrameSizeTable[10][0][0][0] = 192;
        this.bitRateAndFrameSizeTable[10][1][0][0] = 192;
        this.bitRateAndFrameSizeTable[10][0][0][1] = 384;
        this.bitRateAndFrameSizeTable[10][1][0][1] = 384;
        this.bitRateAndFrameSizeTable[11][0][0][0] = 224;
        this.bitRateAndFrameSizeTable[11][1][0][0] = 224;
        this.bitRateAndFrameSizeTable[11][0][0][1] = 448;
        this.bitRateAndFrameSizeTable[11][1][0][1] = 448;
        this.bitRateAndFrameSizeTable[12][0][0][0] = 256;
        this.bitRateAndFrameSizeTable[12][1][0][0] = 256;
        this.bitRateAndFrameSizeTable[12][0][0][1] = 512;
        this.bitRateAndFrameSizeTable[12][1][0][1] = 512;
        this.bitRateAndFrameSizeTable[13][0][0][0] = 320;
        this.bitRateAndFrameSizeTable[13][1][0][0] = 320;
        this.bitRateAndFrameSizeTable[13][0][0][1] = 640;
        this.bitRateAndFrameSizeTable[13][1][0][1] = 640;
        this.bitRateAndFrameSizeTable[14][0][0][0] = 384;
        this.bitRateAndFrameSizeTable[14][1][0][0] = 384;
        this.bitRateAndFrameSizeTable[14][0][0][1] = 768;
        this.bitRateAndFrameSizeTable[14][1][0][1] = 768;
        this.bitRateAndFrameSizeTable[15][0][0][0] = 448;
        this.bitRateAndFrameSizeTable[15][1][0][0] = 448;
        this.bitRateAndFrameSizeTable[15][0][0][1] = 896;
        this.bitRateAndFrameSizeTable[15][1][0][1] = 896;
        this.bitRateAndFrameSizeTable[16][0][0][0] = 512;
        this.bitRateAndFrameSizeTable[16][1][0][0] = 512;
        this.bitRateAndFrameSizeTable[16][0][0][1] = 1024;
        this.bitRateAndFrameSizeTable[16][1][0][1] = 1024;
        this.bitRateAndFrameSizeTable[17][0][0][0] = 576;
        this.bitRateAndFrameSizeTable[17][1][0][0] = 576;
        this.bitRateAndFrameSizeTable[17][0][0][1] = 1152;
        this.bitRateAndFrameSizeTable[17][1][0][1] = 1152;
        this.bitRateAndFrameSizeTable[18][0][0][0] = 640;
        this.bitRateAndFrameSizeTable[18][1][0][0] = 640;
        this.bitRateAndFrameSizeTable[18][0][0][1] = 1280;
        this.bitRateAndFrameSizeTable[18][1][0][1] = 1280;
        this.bitRateAndFrameSizeTable[0][0][1][0] = 32;
        this.bitRateAndFrameSizeTable[0][1][1][0] = 32;
        this.bitRateAndFrameSizeTable[0][0][1][1] = 69;
        this.bitRateAndFrameSizeTable[0][1][1][1] = 70;
        this.bitRateAndFrameSizeTable[1][0][1][0] = 40;
        this.bitRateAndFrameSizeTable[1][1][1][0] = 40;
        this.bitRateAndFrameSizeTable[1][0][1][1] = 87;
        this.bitRateAndFrameSizeTable[1][1][1][1] = 88;
        this.bitRateAndFrameSizeTable[2][0][1][0] = 48;
        this.bitRateAndFrameSizeTable[2][1][1][0] = 48;
        this.bitRateAndFrameSizeTable[2][0][1][1] = 104;
        this.bitRateAndFrameSizeTable[2][1][1][1] = 105;
        this.bitRateAndFrameSizeTable[3][0][1][0] = 56;
        this.bitRateAndFrameSizeTable[3][1][1][0] = 56;
        this.bitRateAndFrameSizeTable[3][0][1][1] = 121;
        this.bitRateAndFrameSizeTable[3][1][1][1] = 122;
        this.bitRateAndFrameSizeTable[4][0][1][0] = 64;
        this.bitRateAndFrameSizeTable[4][1][1][0] = 64;
        this.bitRateAndFrameSizeTable[4][0][1][1] = 139;
        this.bitRateAndFrameSizeTable[4][1][1][1] = 140;
        this.bitRateAndFrameSizeTable[5][0][1][0] = 80;
        this.bitRateAndFrameSizeTable[5][1][1][0] = 80;
        this.bitRateAndFrameSizeTable[5][0][1][1] = 174;
        this.bitRateAndFrameSizeTable[5][1][1][1] = 175;
        this.bitRateAndFrameSizeTable[6][0][1][0] = 96;
        this.bitRateAndFrameSizeTable[6][1][1][0] = 96;
        this.bitRateAndFrameSizeTable[6][0][1][1] = 208;
        this.bitRateAndFrameSizeTable[6][1][1][1] = 209;
        this.bitRateAndFrameSizeTable[7][0][1][0] = 112;
        this.bitRateAndFrameSizeTable[7][1][1][0] = 112;
        this.bitRateAndFrameSizeTable[7][0][1][1] = 243;
        this.bitRateAndFrameSizeTable[7][1][1][1] = 244;
        this.bitRateAndFrameSizeTable[8][0][1][0] = 128;
        this.bitRateAndFrameSizeTable[8][1][1][0] = 128;
        this.bitRateAndFrameSizeTable[8][0][1][1] = 278;
        this.bitRateAndFrameSizeTable[8][1][1][1] = 279;
        this.bitRateAndFrameSizeTable[9][0][1][0] = 160;
        this.bitRateAndFrameSizeTable[9][1][1][0] = 160;
        this.bitRateAndFrameSizeTable[9][0][1][1] = 348;
        this.bitRateAndFrameSizeTable[9][1][1][1] = 349;
        this.bitRateAndFrameSizeTable[10][0][1][0] = 192;
        this.bitRateAndFrameSizeTable[10][1][1][0] = 192;
        this.bitRateAndFrameSizeTable[10][0][1][1] = 417;
        this.bitRateAndFrameSizeTable[10][1][1][1] = 418;
        this.bitRateAndFrameSizeTable[11][0][1][0] = 224;
        this.bitRateAndFrameSizeTable[11][1][1][0] = 224;
        this.bitRateAndFrameSizeTable[11][0][1][1] = 487;
        this.bitRateAndFrameSizeTable[11][1][1][1] = 488;
        this.bitRateAndFrameSizeTable[12][0][1][0] = 256;
        this.bitRateAndFrameSizeTable[12][1][1][0] = 256;
        this.bitRateAndFrameSizeTable[12][0][1][1] = 557;
        this.bitRateAndFrameSizeTable[12][1][1][1] = 558;
        this.bitRateAndFrameSizeTable[13][0][1][0] = 320;
        this.bitRateAndFrameSizeTable[13][1][1][0] = 320;
        this.bitRateAndFrameSizeTable[13][0][1][1] = 696;
        this.bitRateAndFrameSizeTable[13][1][1][1] = 697;
        this.bitRateAndFrameSizeTable[14][0][1][0] = 384;
        this.bitRateAndFrameSizeTable[14][1][1][0] = 384;
        this.bitRateAndFrameSizeTable[14][0][1][1] = 835;
        this.bitRateAndFrameSizeTable[14][1][1][1] = 836;
        this.bitRateAndFrameSizeTable[15][0][1][0] = 448;
        this.bitRateAndFrameSizeTable[15][1][1][0] = 448;
        this.bitRateAndFrameSizeTable[15][0][1][1] = 975;
        this.bitRateAndFrameSizeTable[15][1][1][1] = 975;
        this.bitRateAndFrameSizeTable[16][0][1][0] = 512;
        this.bitRateAndFrameSizeTable[16][1][1][0] = 512;
        this.bitRateAndFrameSizeTable[16][0][1][1] = 1114;
        this.bitRateAndFrameSizeTable[16][1][1][1] = 1115;
        this.bitRateAndFrameSizeTable[17][0][1][0] = 576;
        this.bitRateAndFrameSizeTable[17][1][1][0] = 576;
        this.bitRateAndFrameSizeTable[17][0][1][1] = 1253;
        this.bitRateAndFrameSizeTable[17][1][1][1] = 1254;
        this.bitRateAndFrameSizeTable[18][0][1][0] = 640;
        this.bitRateAndFrameSizeTable[18][1][1][0] = 640;
        this.bitRateAndFrameSizeTable[18][0][1][1] = 1393;
        this.bitRateAndFrameSizeTable[18][1][1][1] = 1394;
        this.bitRateAndFrameSizeTable[0][0][2][0] = 32;
        this.bitRateAndFrameSizeTable[0][1][2][0] = 32;
        this.bitRateAndFrameSizeTable[0][0][2][1] = 96;
        this.bitRateAndFrameSizeTable[0][1][2][1] = 96;
        this.bitRateAndFrameSizeTable[1][0][2][0] = 40;
        this.bitRateAndFrameSizeTable[1][1][2][0] = 40;
        this.bitRateAndFrameSizeTable[1][0][2][1] = 120;
        this.bitRateAndFrameSizeTable[1][1][2][1] = 120;
        this.bitRateAndFrameSizeTable[2][0][2][0] = 48;
        this.bitRateAndFrameSizeTable[2][1][2][0] = 48;
        this.bitRateAndFrameSizeTable[2][0][2][1] = 144;
        this.bitRateAndFrameSizeTable[2][1][2][1] = 144;
        this.bitRateAndFrameSizeTable[3][0][2][0] = 56;
        this.bitRateAndFrameSizeTable[3][1][2][0] = 56;
        this.bitRateAndFrameSizeTable[3][0][2][1] = 168;
        this.bitRateAndFrameSizeTable[3][1][2][1] = 168;
        this.bitRateAndFrameSizeTable[4][0][2][0] = 64;
        this.bitRateAndFrameSizeTable[4][1][2][0] = 64;
        this.bitRateAndFrameSizeTable[4][0][2][1] = 192;
        this.bitRateAndFrameSizeTable[4][1][2][1] = 192;
        this.bitRateAndFrameSizeTable[5][0][2][0] = 80;
        this.bitRateAndFrameSizeTable[5][1][2][0] = 80;
        this.bitRateAndFrameSizeTable[5][0][2][1] = 240;
        this.bitRateAndFrameSizeTable[5][1][2][1] = 240;
        this.bitRateAndFrameSizeTable[6][0][2][0] = 96;
        this.bitRateAndFrameSizeTable[6][1][2][0] = 96;
        this.bitRateAndFrameSizeTable[6][0][2][1] = 288;
        this.bitRateAndFrameSizeTable[6][1][2][1] = 288;
        this.bitRateAndFrameSizeTable[7][0][2][0] = 112;
        this.bitRateAndFrameSizeTable[7][1][2][0] = 112;
        this.bitRateAndFrameSizeTable[7][0][2][1] = 336;
        this.bitRateAndFrameSizeTable[7][1][2][1] = 336;
        this.bitRateAndFrameSizeTable[8][0][2][0] = 128;
        this.bitRateAndFrameSizeTable[8][1][2][0] = 128;
        this.bitRateAndFrameSizeTable[8][0][2][1] = 384;
        this.bitRateAndFrameSizeTable[8][1][2][1] = 384;
        this.bitRateAndFrameSizeTable[9][0][2][0] = 160;
        this.bitRateAndFrameSizeTable[9][1][2][0] = 160;
        this.bitRateAndFrameSizeTable[9][0][2][1] = 480;
        this.bitRateAndFrameSizeTable[9][1][2][1] = 480;
        this.bitRateAndFrameSizeTable[10][0][2][0] = 192;
        this.bitRateAndFrameSizeTable[10][1][2][0] = 192;
        this.bitRateAndFrameSizeTable[10][0][2][1] = 576;
        this.bitRateAndFrameSizeTable[10][1][2][1] = 576;
        this.bitRateAndFrameSizeTable[11][0][2][0] = 224;
        this.bitRateAndFrameSizeTable[11][1][2][0] = 224;
        this.bitRateAndFrameSizeTable[11][0][2][1] = 672;
        this.bitRateAndFrameSizeTable[11][1][2][1] = 672;
        this.bitRateAndFrameSizeTable[12][0][2][0] = 256;
        this.bitRateAndFrameSizeTable[12][1][2][0] = 256;
        this.bitRateAndFrameSizeTable[12][0][2][1] = 768;
        this.bitRateAndFrameSizeTable[12][1][2][1] = 768;
        this.bitRateAndFrameSizeTable[13][0][2][0] = 320;
        this.bitRateAndFrameSizeTable[13][1][2][0] = 320;
        this.bitRateAndFrameSizeTable[13][0][2][1] = 960;
        this.bitRateAndFrameSizeTable[13][1][2][1] = 960;
        this.bitRateAndFrameSizeTable[14][0][2][0] = 384;
        this.bitRateAndFrameSizeTable[14][1][2][0] = 384;
        this.bitRateAndFrameSizeTable[14][0][2][1] = 1152;
        this.bitRateAndFrameSizeTable[14][1][2][1] = 1152;
        this.bitRateAndFrameSizeTable[15][0][2][0] = 448;
        this.bitRateAndFrameSizeTable[15][1][2][0] = 448;
        this.bitRateAndFrameSizeTable[15][0][2][1] = 1344;
        this.bitRateAndFrameSizeTable[15][1][2][1] = 1344;
        this.bitRateAndFrameSizeTable[16][0][2][0] = 512;
        this.bitRateAndFrameSizeTable[16][1][2][0] = 512;
        this.bitRateAndFrameSizeTable[16][0][2][1] = 1536;
        this.bitRateAndFrameSizeTable[16][1][2][1] = 1536;
        this.bitRateAndFrameSizeTable[17][0][2][0] = 576;
        this.bitRateAndFrameSizeTable[17][1][2][0] = 576;
        this.bitRateAndFrameSizeTable[17][0][2][1] = 1728;
        this.bitRateAndFrameSizeTable[17][1][2][1] = 1728;
        this.bitRateAndFrameSizeTable[18][0][2][0] = 640;
        this.bitRateAndFrameSizeTable[18][1][2][0] = 640;
        this.bitRateAndFrameSizeTable[18][0][2][1] = 1920;
        this.bitRateAndFrameSizeTable[18][1][2][1] = 1920;
    }
}
