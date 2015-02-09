package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import com.coremedia.iso.boxes.CompositionTimeToSample.Entry;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.h264.AvcConfigurationBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class H264TrackImpl extends AbstractTrack {
    private static /* synthetic */ int[] $SWITCH_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions;
    private static final Logger LOG;
    List<Entry> ctts;
    private int currentScSize;
    private boolean determineFrameRate;
    int frameNrInGop;
    private int frametick;
    private int height;
    private String lang;
    PictureParameterSet pictureParameterSet;
    LinkedList<byte[]> pictureParameterSetList;
    private int prevScSize;
    boolean readSamples;
    private ReaderWrapper reader;
    SampleDescriptionBox sampleDescriptionBox;
    private List<Sample> samples;
    List<SampleDependencyTypeBox.Entry> sdtp;
    private SEIMessage seiMessage;
    SeqParameterSet seqParameterSet;
    LinkedList<byte[]> seqParameterSetList;
    List<Integer> stss;
    List<TimeToSampleBox.Entry> stts;
    private long timescale;
    TrackMetaData trackMetaData;
    private int width;

    static /* synthetic */ class AnonymousClass_1 {
        static final /* synthetic */ int[] $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions;

        static {
            $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions = new int[NALActions.values().length];
            try {
                $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[NALActions.IGNORE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[NALActions.BUFFER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[NALActions.STORE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions[NALActions.END.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public class ByteBufferBackedInputStream extends InputStream {
        private final ByteBuffer buf;

        public ByteBufferBackedInputStream(ByteBuffer buf) {
            this.buf = buf.duplicate();
        }

        public int read() throws IOException {
            return !this.buf.hasRemaining() ? -1 : this.buf.get() & 255;
        }

        public int read(byte[] bytes, int off, int len) throws IOException {
            if (!this.buf.hasRemaining()) {
                return -1;
            }
            len = Math.min(len, this.buf.remaining());
            this.buf.get(bytes, off, len);
            return len;
        }
    }

    protected class CleanInputStream extends FilterInputStream {
        int prev;
        int prevprev;

        CleanInputStream(InputStream in) {
            super(in);
            this.prevprev = -1;
            this.prev = -1;
        }

        public boolean markSupported() {
            return false;
        }

        public int read() throws IOException {
            int c = super.read();
            if (c == 3 && this.prevprev == 0 && this.prev == 0) {
                this.prevprev = -1;
                this.prev = -1;
                c = super.read();
            }
            this.prevprev = this.prev;
            this.prev = c;
            return c;
        }

        public int read(byte[] b, int off, int len) throws IOException {
            if (b == null) {
                throw new NullPointerException();
            } else if (off < 0 || len < 0 || len > b.length - off) {
                throw new IndexOutOfBoundsException();
            } else if (len == 0) {
                return 0;
            } else {
                int c = read();
                if (c == -1) {
                    return -1;
                }
                b[off] = (byte) c;
                int i = 1;
                while (i < len) {
                    try {
                        c = read();
                        if (c == -1) {
                            return i;
                        }
                        b[off + i] = (byte) c;
                        i++;
                    } catch (IOException e) {
                        return i;
                    }
                }
                return i;
            }
        }
    }

    private enum NALActions {
        IGNORE,
        BUFFER,
        STORE,
        END
    }

    private class ReaderWrapper {
        final MappedByteBuffer buffer;

        private ReaderWrapper(FileChannel fc) throws IOException {
            this.buffer = fc.map(MapMode.READ_ONLY, fc.position(), fc.size() - fc.position());
        }

        boolean hasRemaining() {
            return this.buffer.hasRemaining();
        }

        int get() throws IOException {
            return this.buffer.get();
        }

        ByteBuffer map(int size) throws IOException {
            ByteBuffer buf = this.buffer.duplicate();
            buf.position(this.buffer.position());
            buf.limit(buf.position() + size);
            this.buffer.position(this.buffer.position() + size);
            return buf;
        }

        void seek(int dist) throws IOException {
            this.buffer.position(this.buffer.position() + dist);
        }

        public long getPos() throws IOException {
            return (long) this.buffer.position();
        }

        public void mark() throws IOException {
            this.buffer.mark();
        }

        public void reset() throws IOException {
            this.buffer.reset();
        }
    }

    public class SEIMessage {
        boolean clock_timestamp_flag;
        int cnt_dropped_flag;
        int counting_type;
        int cpb_removal_delay;
        int ct_type;
        int discontinuity_flag;
        int dpb_removal_delay;
        int full_timestamp_flag;
        int hours_value;
        int minutes_value;
        int n_frames;
        int nuit_field_based_flag;
        int payloadSize;
        int payloadType;
        int pic_struct;
        boolean removal_delay_flag;
        int seconds_value;
        SeqParameterSet sps;
        int time_offset;
        int time_offset_length;

        public SEIMessage(InputStream is, SeqParameterSet sps) throws IOException {
            this.payloadType = 0;
            this.payloadSize = 0;
            this.sps = sps;
            is.read();
            int datasize = is.available();
            int read = 0;
            while (read < datasize) {
                this.payloadType = 0;
                this.payloadSize = 0;
                int last_payload_type_bytes = is.read();
                read++;
                while (last_payload_type_bytes == 255) {
                    this.payloadType += last_payload_type_bytes;
                    last_payload_type_bytes = is.read();
                    read++;
                }
                this.payloadType += last_payload_type_bytes;
                int last_payload_size_bytes = is.read();
                read++;
                while (last_payload_size_bytes == 255) {
                    this.payloadSize += last_payload_size_bytes;
                    last_payload_size_bytes = is.read();
                    read++;
                }
                this.payloadSize += last_payload_size_bytes;
                if (datasize - read < this.payloadSize) {
                    read = datasize;
                } else if (this.payloadType != 1) {
                    for (i = 0; i < this.payloadSize; i++) {
                        is.read();
                        read++;
                    }
                } else if (sps.vuiParams == null || (sps.vuiParams.nalHRDParams == null && sps.vuiParams.vclHRDParams == null && !sps.vuiParams.pic_struct_present_flag)) {
                    for (i = 0; i < this.payloadSize; i++) {
                        is.read();
                        read++;
                    }
                } else {
                    byte[] data = new byte[this.payloadSize];
                    is.read(data);
                    read += this.payloadSize;
                    CAVLCReader reader = new CAVLCReader(new ByteArrayInputStream(data));
                    if (sps.vuiParams.nalHRDParams == null && sps.vuiParams.vclHRDParams == null) {
                        this.removal_delay_flag = false;
                    } else {
                        this.removal_delay_flag = true;
                        this.cpb_removal_delay = reader.readU(sps.vuiParams.nalHRDParams.cpb_removal_delay_length_minus1 + 1, "SEI: cpb_removal_delay");
                        this.dpb_removal_delay = reader.readU(sps.vuiParams.nalHRDParams.dpb_output_delay_length_minus1 + 1, "SEI: dpb_removal_delay");
                    }
                    if (sps.vuiParams.pic_struct_present_flag) {
                        int numClockTS;
                        this.pic_struct = reader.readU(4, "SEI: pic_struct");
                        switch (this.pic_struct) {
                            case ay.p /*3*/:
                            case aj.i /*4*/:
                            case a8.s /*7*/:
                                numClockTS = 2;
                                break;
                            case aV.r /*5*/:
                            case aV.i /*6*/:
                            case a8.n /*8*/:
                                numClockTS = 3;
                                break;
                            default:
                                numClockTS = 1;
                                break;
                        }
                        for (i = 0; i < numClockTS; i++) {
                            this.clock_timestamp_flag = reader.readBool("pic_timing SEI: clock_timestamp_flag[" + i + "]");
                            if (this.clock_timestamp_flag) {
                                this.ct_type = reader.readU(2, "pic_timing SEI: ct_type");
                                this.nuit_field_based_flag = reader.readU(1, "pic_timing SEI: nuit_field_based_flag");
                                this.counting_type = reader.readU(5, "pic_timing SEI: counting_type");
                                this.full_timestamp_flag = reader.readU(1, "pic_timing SEI: full_timestamp_flag");
                                this.discontinuity_flag = reader.readU(1, "pic_timing SEI: discontinuity_flag");
                                this.cnt_dropped_flag = reader.readU(1, "pic_timing SEI: cnt_dropped_flag");
                                this.n_frames = reader.readU(8, "pic_timing SEI: n_frames");
                                if (this.full_timestamp_flag == 1) {
                                    this.seconds_value = reader.readU(6, "pic_timing SEI: seconds_value");
                                    this.minutes_value = reader.readU(6, "pic_timing SEI: minutes_value");
                                    this.hours_value = reader.readU(5, "pic_timing SEI: hours_value");
                                } else if (reader.readBool("pic_timing SEI: seconds_flag")) {
                                    this.seconds_value = reader.readU(6, "pic_timing SEI: seconds_value");
                                    if (reader.readBool("pic_timing SEI: minutes_flag")) {
                                        this.minutes_value = reader.readU(6, "pic_timing SEI: minutes_value");
                                        if (reader.readBool("pic_timing SEI: hours_flag")) {
                                            this.hours_value = reader.readU(5, "pic_timing SEI: hours_value");
                                        }
                                    }
                                }
                                if (sps.vuiParams.nalHRDParams != null) {
                                    this.time_offset_length = sps.vuiParams.nalHRDParams.time_offset_length;
                                } else if (sps.vuiParams.vclHRDParams != null) {
                                    this.time_offset_length = sps.vuiParams.vclHRDParams.time_offset_length;
                                } else {
                                    this.time_offset_length = 24;
                                }
                                this.time_offset = reader.readU(24, "pic_timing SEI: time_offset");
                            }
                        }
                    }
                }
                LOG.fine(toString());
            }
        }

        public String toString() {
            String out = "SEIMessage{payloadType=" + this.payloadType + ", payloadSize=" + this.payloadSize;
            if (this.payloadType == 1) {
                if (!(this.sps.vuiParams.nalHRDParams == null && this.sps.vuiParams.vclHRDParams == null)) {
                    out = new StringBuilder(String.valueOf(out)).append(", cpb_removal_delay=").append(this.cpb_removal_delay).append(", dpb_removal_delay=").append(this.dpb_removal_delay).toString();
                }
                if (this.sps.vuiParams.pic_struct_present_flag) {
                    out = new StringBuilder(String.valueOf(out)).append(", pic_struct=").append(this.pic_struct).toString();
                    if (this.clock_timestamp_flag) {
                        out = new StringBuilder(String.valueOf(out)).append(", ct_type=").append(this.ct_type).append(", nuit_field_based_flag=").append(this.nuit_field_based_flag).append(", counting_type=").append(this.counting_type).append(", full_timestamp_flag=").append(this.full_timestamp_flag).append(", discontinuity_flag=").append(this.discontinuity_flag).append(", cnt_dropped_flag=").append(this.cnt_dropped_flag).append(", n_frames=").append(this.n_frames).append(", seconds_value=").append(this.seconds_value).append(", minutes_value=").append(this.minutes_value).append(", hours_value=").append(this.hours_value).append(", time_offset_length=").append(this.time_offset_length).append(", time_offset=").append(this.time_offset).toString();
                    }
                }
            }
            return new StringBuilder(String.valueOf(out)).append('}').toString();
        }
    }

    public static class SliceHeader {
        public boolean bottom_field_flag;
        public int colour_plane_id;
        public int delta_pic_order_cnt_bottom;
        public boolean field_pic_flag;
        public int first_mb_in_slice;
        public int frame_num;
        public int idr_pic_id;
        public int pic_order_cnt_lsb;
        public int pic_parameter_set_id;
        public SliceType slice_type;

        public enum SliceType {
            P,
            B,
            I,
            SP,
            SI
        }

        public SliceHeader(InputStream is, SeqParameterSet sps, PictureParameterSet pps, boolean IdrPicFlag) throws IOException {
            this.field_pic_flag = false;
            this.bottom_field_flag = false;
            is.read();
            CAVLCReader reader = new CAVLCReader(is);
            this.first_mb_in_slice = reader.readUE("SliceHeader: first_mb_in_slice");
            switch (reader.readUE("SliceHeader: slice_type")) {
                case PBE.MD5 /*0*/:
                case aV.r /*5*/:
                    this.slice_type = SliceType.P;
                    break;
                case ay.f /*1*/:
                case aV.i /*6*/:
                    this.slice_type = SliceType.B;
                    break;
                case ay.n /*2*/:
                case a8.s /*7*/:
                    this.slice_type = SliceType.I;
                    break;
                case ay.p /*3*/:
                case a8.n /*8*/:
                    this.slice_type = SliceType.SP;
                    break;
                case aj.i /*4*/:
                case a6.D /*9*/:
                    this.slice_type = SliceType.SI;
                    break;
            }
            this.pic_parameter_set_id = reader.readUE("SliceHeader: pic_parameter_set_id");
            if (sps.residual_color_transform_flag) {
                this.colour_plane_id = reader.readU(2, "SliceHeader: colour_plane_id");
            }
            this.frame_num = reader.readU(sps.log2_max_frame_num_minus4 + 4, "SliceHeader: frame_num");
            if (!sps.frame_mbs_only_flag) {
                this.field_pic_flag = reader.readBool("SliceHeader: field_pic_flag");
                if (this.field_pic_flag) {
                    this.bottom_field_flag = reader.readBool("SliceHeader: bottom_field_flag");
                }
            }
            if (IdrPicFlag) {
                this.idr_pic_id = reader.readUE("SliceHeader: idr_pic_id");
                if (sps.pic_order_cnt_type == 0) {
                    this.pic_order_cnt_lsb = reader.readU(sps.log2_max_pic_order_cnt_lsb_minus4 + 4, "SliceHeader: pic_order_cnt_lsb");
                    if (pps.pic_order_present_flag && !this.field_pic_flag) {
                        this.delta_pic_order_cnt_bottom = reader.readSE("SliceHeader: delta_pic_order_cnt_bottom");
                    }
                }
            }
        }

        public String toString() {
            return "SliceHeader{first_mb_in_slice=" + this.first_mb_in_slice + ", slice_type=" + this.slice_type + ", pic_parameter_set_id=" + this.pic_parameter_set_id + ", colour_plane_id=" + this.colour_plane_id + ", frame_num=" + this.frame_num + ", field_pic_flag=" + this.field_pic_flag + ", bottom_field_flag=" + this.bottom_field_flag + ", idr_pic_id=" + this.idr_pic_id + ", pic_order_cnt_lsb=" + this.pic_order_cnt_lsb + ", delta_pic_order_cnt_bottom=" + this.delta_pic_order_cnt_bottom + '}';
        }
    }

    static /* synthetic */ int[] $SWITCH_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions() {
        int[] iArr = $SWITCH_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions;
        if (iArr == null) {
            iArr = new int[NALActions.values().length];
            try {
                iArr[NALActions.BUFFER.ordinal()] = 2;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[NALActions.END.ordinal()] = 4;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[NALActions.IGNORE.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[NALActions.STORE.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            $SWITCH_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions = iArr;
        }
        return iArr;
    }

    static {
        LOG = Logger.getLogger(H264TrackImpl.class.getName());
    }

    public H264TrackImpl(FileChannel fc, String lang, long timescale, int frametick) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.readSamples = false;
        this.seqParameterSet = null;
        this.pictureParameterSet = null;
        this.seqParameterSetList = new LinkedList();
        this.pictureParameterSetList = new LinkedList();
        this.frameNrInGop = 0;
        this.determineFrameRate = true;
        this.lang = "eng";
        this.lang = lang;
        this.timescale = timescale;
        this.frametick = frametick;
        if (timescale > 0 && frametick > 0) {
            this.determineFrameRate = false;
        }
        parse(fc);
    }

    public H264TrackImpl(FileChannel fc, String lang) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.readSamples = false;
        this.seqParameterSet = null;
        this.pictureParameterSet = null;
        this.seqParameterSetList = new LinkedList();
        this.pictureParameterSetList = new LinkedList();
        this.frameNrInGop = 0;
        this.determineFrameRate = true;
        this.lang = "eng";
        this.lang = lang;
        parse(fc);
    }

    public H264TrackImpl(FileChannel fc) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.readSamples = false;
        this.seqParameterSet = null;
        this.pictureParameterSet = null;
        this.seqParameterSetList = new LinkedList();
        this.pictureParameterSetList = new LinkedList();
        this.frameNrInGop = 0;
        this.determineFrameRate = true;
        this.lang = "eng";
        parse(fc);
    }

    private void parse(FileChannel inputChannel) throws IOException {
        this.reader = new ReaderWrapper(inputChannel, null);
        this.stts = new LinkedList();
        this.ctts = new LinkedList();
        this.sdtp = new LinkedList();
        this.stss = new LinkedList();
        this.samples = new LinkedList();
        if (!readSamples()) {
            throw new IOException();
        } else if (readVariables()) {
            this.sampleDescriptionBox = new SampleDescriptionBox();
            VisualSampleEntry visualSampleEntry = new VisualSampleEntry(VisualSampleEntry.TYPE3);
            visualSampleEntry.setDataReferenceIndex(1);
            visualSampleEntry.setDepth(24);
            visualSampleEntry.setFrameCount(1);
            visualSampleEntry.setHorizresolution(72.0d);
            visualSampleEntry.setVertresolution(72.0d);
            visualSampleEntry.setWidth(this.width);
            visualSampleEntry.setHeight(this.height);
            visualSampleEntry.setCompressorname("AVC Coding");
            AvcConfigurationBox avcConfigurationBox = new AvcConfigurationBox();
            avcConfigurationBox.setSequenceParameterSets(this.seqParameterSetList);
            avcConfigurationBox.setPictureParameterSets(this.pictureParameterSetList);
            avcConfigurationBox.setAvcLevelIndication(this.seqParameterSet.level_idc);
            avcConfigurationBox.setAvcProfileIndication(this.seqParameterSet.profile_idc);
            avcConfigurationBox.setBitDepthLumaMinus8(this.seqParameterSet.bit_depth_luma_minus8);
            avcConfigurationBox.setBitDepthChromaMinus8(this.seqParameterSet.bit_depth_chroma_minus8);
            avcConfigurationBox.setChromaFormat(this.seqParameterSet.chroma_format_idc.getId());
            avcConfigurationBox.setConfigurationVersion(1);
            avcConfigurationBox.setLengthSizeMinusOne(3);
            avcConfigurationBox.setProfileCompatibility(((byte[]) this.seqParameterSetList.get(0))[1]);
            visualSampleEntry.addBox(avcConfigurationBox);
            this.sampleDescriptionBox.addBox(visualSampleEntry);
            this.trackMetaData.setCreationTime(new Date());
            this.trackMetaData.setModificationTime(new Date());
            this.trackMetaData.setLanguage(this.lang);
            this.trackMetaData.setTimescale(this.timescale);
            this.trackMetaData.setWidth((double) this.width);
            this.trackMetaData.setHeight((double) this.height);
        } else {
            throw new IOException();
        }
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        return this.stts;
    }

    public List<Entry> getCompositionTimeEntries() {
        return this.ctts;
    }

    public long[] getSyncSamples() {
        long[] returns = new long[this.stss.size()];
        for (int i = 0; i < this.stss.size(); i++) {
            returns[i] = (long) ((Integer) this.stss.get(i)).intValue();
        }
        return returns;
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.sdtp;
    }

    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }

    public String getHandler() {
        return "vide";
    }

    public List<Sample> getSamples() {
        return this.samples;
    }

    public AbstractMediaHeaderBox getMediaHeaderBox() {
        return new VideoMediaHeaderBox();
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return null;
    }

    private boolean readVariables() {
        this.width = (this.seqParameterSet.pic_width_in_mbs_minus1 + 1) * 16;
        int mult = 2;
        if (this.seqParameterSet.frame_mbs_only_flag) {
            mult = 1;
        }
        this.height = ((this.seqParameterSet.pic_height_in_map_units_minus1 + 1) * 16) * mult;
        if (this.seqParameterSet.frame_cropping_flag) {
            int chromaArrayType = 0;
            if (!this.seqParameterSet.residual_color_transform_flag) {
                chromaArrayType = this.seqParameterSet.chroma_format_idc.getId();
            }
            int cropUnitX = 1;
            int cropUnitY = mult;
            if (chromaArrayType != 0) {
                cropUnitX = this.seqParameterSet.chroma_format_idc.getSubWidth();
                cropUnitY = this.seqParameterSet.chroma_format_idc.getSubHeight() * mult;
            }
            this.width -= (this.seqParameterSet.frame_crop_left_offset + this.seqParameterSet.frame_crop_right_offset) * cropUnitX;
            this.height -= (this.seqParameterSet.frame_crop_top_offset + this.seqParameterSet.frame_crop_bottom_offset) * cropUnitY;
        }
        return true;
    }

    private boolean findNextStartcode() throws IOException {
        byte[] test = new byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1};
        while (this.reader.hasRemaining()) {
            test[0] = test[1];
            test[1] = test[2];
            test[2] = test[3];
            test[3] = (byte) this.reader.get();
            if (test[0] == null && test[1] == null && test[2] == null && test[3] == (byte) 1) {
                this.prevScSize = this.currentScSize;
                this.currentScSize = 4;
                return true;
            } else if (test[0] == null && test[1] == null && test[2] == (byte) 1) {
                this.prevScSize = this.currentScSize;
                this.currentScSize = 3;
                return true;
            }
        }
        return false;
    }

    protected Sample createSample(List<? extends ByteBuffer> buffers) {
        byte[] sizeInfo = new byte[(buffers.size() * 4)];
        ByteBuffer sizeBuf = ByteBuffer.wrap(sizeInfo);
        Iterator it = buffers.iterator();
        while (it.hasNext()) {
            sizeBuf.putInt(b.remaining());
        }
        ByteBuffer[] data = new ByteBuffer[(buffers.size() * 2)];
        for (int i = 0; i < buffers.size(); i++) {
            data[i * 2] = ByteBuffer.wrap(sizeInfo, i * 4, 4);
            data[(i * 2) + 1] = (ByteBuffer) buffers.get(i);
        }
        return new SampleImpl(data);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean readSamples() throws java.io.IOException {
        /*
        r28_this = this;
        r0 = r28;
        r0 = r0.readSamples;
        r22 = r0;
        if (r22 == 0) goto L_0x000b;
    L_0x0008:
        r22 = 1;
    L_0x000a:
        return r22;
    L_0x000b:
        r22 = 1;
        r0 = r22;
        r1 = r28;
        r1.readSamples = r0;
        r28.findNextStartcode();
        r0 = r28;
        r0 = r0.reader;
        r22 = r0;
        r22.mark();
        r0 = r28;
        r0 = r0.reader;
        r22 = r0;
        r16 = r22.getPos();
        r8 = new java.util.ArrayList;
        r8.<init>();
        r10 = 0;
    L_0x002f:
        r22 = r28.findNextStartcode();
        if (r22 != 0) goto L_0x0038;
    L_0x0035:
        r22 = 1;
        goto L_0x000a;
    L_0x0038:
        r0 = r28;
        r0 = r0.reader;
        r22 = r0;
        r14 = r22.getPos();
        r22 = r14 - r16;
        r0 = r28;
        r0 = r0.prevScSize;
        r24 = r0;
        r0 = r24;
        r0 = (long) r0;
        r24 = r0;
        r22 = r22 - r24;
        r0 = r22;
        r0 = (int) r0;
        r19 = r0;
        r0 = r28;
        r0 = r0.reader;
        r22 = r0;
        r22.reset();
        r0 = r28;
        r0 = r0.reader;
        r22 = r0;
        r0 = r22;
        r1 = r19;
        r9 = r0.map(r1);
        r22 = r9.position();
        r0 = r22;
        r21 = r9.get(r0);
        r22 = r21 >> 5;
        r11 = r22 & 3;
        r12 = r21 & 31;
        r0 = r28;
        r5 = r0.handleNALUnit(r11, r12, r9);
        r22 = $SWITCH_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions();
        r23 = r5.ordinal();
        r22 = r22[r23];
        switch(r22) {
            case 1: goto L_0x0090;
            case 2: goto L_0x00ab;
            case 3: goto L_0x00af;
            case 4: goto L_0x01f4;
            default: goto L_0x0090;
        };
    L_0x0090:
        r16 = r14;
        r0 = r28;
        r0 = r0.reader;
        r22 = r0;
        r0 = r28;
        r0 = r0.currentScSize;
        r23 = r0;
        r22.seek(r23);
        r0 = r28;
        r0 = r0.reader;
        r22 = r0;
        r22.mark();
        goto L_0x002f;
    L_0x00ab:
        r8.add(r9);
        goto L_0x0090;
    L_0x00af:
        r20 = 22;
        r10 = r10 + 1;
        r8.add(r9);
        r4 = 0;
        r22 = 5;
        r0 = r22;
        if (r12 != r0) goto L_0x00c0;
    L_0x00bd:
        r20 = r20 + 16;
        r4 = 1;
    L_0x00c0:
        r23 = new com.googlecode.mp4parser.authoring.tracks.H264TrackImpl$ByteBufferBackedInputStream;
        r22 = r8.size();
        r22 = r22 + -1;
        r0 = r22;
        r22 = r8.get(r0);
        r22 = (java.nio.ByteBuffer) r22;
        r0 = r23;
        r1 = r28;
        r2 = r22;
        r0.<init>(r2);
        r0 = r28;
        r1 = r23;
        r7 = r0.cleanBuffer(r1);
        r18 = new com.googlecode.mp4parser.authoring.tracks.H264TrackImpl$SliceHeader;
        r0 = r28;
        r0 = r0.seqParameterSet;
        r22 = r0;
        r0 = r28;
        r0 = r0.pictureParameterSet;
        r23 = r0;
        r0 = r18;
        r1 = r22;
        r2 = r23;
        r0.<init>(r7, r1, r2, r4);
        r0 = r18;
        r0 = r0.slice_type;
        r22 = r0;
        r23 = com.googlecode.mp4parser.authoring.tracks.H264TrackImpl.SliceHeader.SliceType.B;
        r0 = r22;
        r1 = r23;
        if (r0 != r1) goto L_0x0108;
    L_0x0106:
        r20 = r20 + 4;
    L_0x0108:
        r0 = r28;
        r6 = r0.createSample(r8);
        r8 = new java.util.ArrayList;
        r8.<init>();
        r0 = r28;
        r0 = r0.samples;
        r22 = r0;
        r0 = r22;
        r0.add(r6);
        r0 = r28;
        r0 = r0.stts;
        r22 = r0;
        r23 = new com.coremedia.iso.boxes.TimeToSampleBox$Entry;
        r24 = 1;
        r0 = r28;
        r0 = r0.frametick;
        r26 = r0;
        r0 = r26;
        r0 = (long) r0;
        r26 = r0;
        r23.<init>(r24, r26);
        r22.add(r23);
        r22 = 5;
        r0 = r22;
        if (r12 != r0) goto L_0x014c;
    L_0x013f:
        r0 = r28;
        r0 = r0.stss;
        r22 = r0;
        r23 = java.lang.Integer.valueOf(r10);
        r22.add(r23);
    L_0x014c:
        r0 = r28;
        r0 = r0.seiMessage;
        r22 = r0;
        if (r22 == 0) goto L_0x0162;
    L_0x0154:
        r0 = r28;
        r0 = r0.seiMessage;
        r22 = r0;
        r0 = r22;
        r0 = r0.n_frames;
        r22 = r0;
        if (r22 != 0) goto L_0x016a;
    L_0x0162:
        r22 = 0;
        r0 = r22;
        r1 = r28;
        r1.frameNrInGop = r0;
    L_0x016a:
        r13 = 0;
        r0 = r28;
        r0 = r0.seiMessage;
        r22 = r0;
        if (r22 == 0) goto L_0x01cf;
    L_0x0173:
        r0 = r28;
        r0 = r0.seiMessage;
        r22 = r0;
        r0 = r22;
        r0 = r0.clock_timestamp_flag;
        r22 = r0;
        if (r22 == 0) goto L_0x01cf;
    L_0x0181:
        r0 = r28;
        r0 = r0.seiMessage;
        r22 = r0;
        r0 = r22;
        r0 = r0.n_frames;
        r22 = r0;
        r0 = r28;
        r0 = r0.frameNrInGop;
        r23 = r0;
        r13 = r22 - r23;
    L_0x0195:
        r0 = r28;
        r0 = r0.ctts;
        r22 = r0;
        r23 = new com.coremedia.iso.boxes.CompositionTimeToSample$Entry;
        r24 = 1;
        r0 = r28;
        r0 = r0.frametick;
        r25 = r0;
        r25 = r25 * r13;
        r23.<init>(r24, r25);
        r22.add(r23);
        r0 = r28;
        r0 = r0.sdtp;
        r22 = r0;
        r23 = new com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry;
        r0 = r23;
        r1 = r20;
        r0.<init>(r1);
        r22.add(r23);
        r0 = r28;
        r0 = r0.frameNrInGop;
        r22 = r0;
        r22 = r22 + 1;
        r0 = r22;
        r1 = r28;
        r1.frameNrInGop = r0;
        goto L_0x0090;
    L_0x01cf:
        r0 = r28;
        r0 = r0.seiMessage;
        r22 = r0;
        if (r22 == 0) goto L_0x0195;
    L_0x01d7:
        r0 = r28;
        r0 = r0.seiMessage;
        r22 = r0;
        r0 = r22;
        r0 = r0.removal_delay_flag;
        r22 = r0;
        if (r22 == 0) goto L_0x0195;
    L_0x01e5:
        r0 = r28;
        r0 = r0.seiMessage;
        r22 = r0;
        r0 = r22;
        r0 = r0.dpb_removal_delay;
        r22 = r0;
        r13 = r22 / 2;
        goto L_0x0195;
    L_0x01f4:
        r22 = 1;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.tracks.H264TrackImpl.readSamples():boolean");
    }

    protected InputStream cleanBuffer(byte[] data) {
        return cleanBuffer(new ByteArrayInputStream(data));
    }

    protected InputStream cleanBuffer(InputStream is) {
        return new CleanInputStream(is);
    }

    static byte[] toArray(ByteBuffer buf) {
        buf = buf.duplicate();
        byte[] b = new byte[buf.remaining()];
        buf.get(b, 0, b.length);
        return b;
    }

    private NALActions handleNALUnit(int nal_ref_idc, int nal_unit_type, ByteBuffer data) throws IOException {
        InputStream is;
        switch (nal_unit_type) {
            case ay.f /*1*/:
            case ay.n /*2*/:
            case ay.p /*3*/:
            case aj.i /*4*/:
            case aV.r /*5*/:
                return NALActions.STORE;
            case aV.i /*6*/:
                this.seiMessage = new SEIMessage(cleanBuffer(new ByteBufferBackedInputStream(data)), this.seqParameterSet);
                return NALActions.BUFFER;
            case a8.s /*7*/:
                if (this.seqParameterSet == null) {
                    is = cleanBuffer(new ByteBufferBackedInputStream(data));
                    is.read();
                    this.seqParameterSet = SeqParameterSet.read(is);
                    this.seqParameterSetList.add(toArray(data));
                    configureFramerate();
                }
                return NALActions.IGNORE;
            case a8.n /*8*/:
                if (this.pictureParameterSet == null) {
                    is = new ByteBufferBackedInputStream(data);
                    is.read();
                    this.pictureParameterSet = PictureParameterSet.read(is);
                    this.pictureParameterSetList.add(toArray(data));
                }
                return NALActions.IGNORE;
            case a6.D /*9*/:
                LOG.fine("Access unit delimiter type: " + (data.get(data.position() + 1) >> 5));
                return NALActions.BUFFER;
            case a6.h /*10*/:
            case a6.e /*11*/:
                return NALActions.END;
            default:
                System.err.println("Unknown NAL unit type: " + nal_unit_type);
                return NALActions.IGNORE;
        }
    }

    private void configureFramerate() {
        if (!this.determineFrameRate) {
            return;
        }
        if (this.seqParameterSet.vuiParams != null) {
            this.timescale = (long) (this.seqParameterSet.vuiParams.time_scale >> 1);
            this.frametick = this.seqParameterSet.vuiParams.num_units_in_tick;
            if (this.timescale == 0 || this.frametick == 0) {
                System.err.println("Warning: vuiParams contain invalid values: time_scale: " + this.timescale + " and frame_tick: " + this.frametick + ". Setting frame rate to 25fps");
                this.timescale = 90000;
                this.frametick = 3600;
                return;
            }
            return;
        }
        System.err.println("Warning: Can't determine frame rate. Guessing 25 fps");
        this.timescale = 90000;
        this.frametick = 3600;
    }

    public void printAccessUnitDelimiter(byte[] data) {
        LOG.fine("Access unit delimiter: " + (data[1] >> 5));
    }
}
