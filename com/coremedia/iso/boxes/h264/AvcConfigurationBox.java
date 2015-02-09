package com.coremedia.iso.boxes.h264;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public final class AvcConfigurationBox extends AbstractBox {
    public static final String TYPE = "avcC";
    private static final /* synthetic */ StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_12 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_13 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_14 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_15 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_16 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_17 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_18 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_19 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_20 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_21 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_22 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_23 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_24 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_25 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_26 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_27 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_28 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_9 = null;
    public AVCDecoderConfigurationRecord avcDecoderConfigurationRecord;

    public static class AVCDecoderConfigurationRecord {
        public int avcLevelIndication;
        public int avcProfileIndication;
        public int bitDepthChromaMinus8;
        public int bitDepthChromaMinus8PaddingBits;
        public int bitDepthLumaMinus8;
        public int bitDepthLumaMinus8PaddingBits;
        public int chromaFormat;
        public int chromaFormatPaddingBits;
        public int configurationVersion;
        public boolean hasExts;
        public int lengthSizeMinusOne;
        public int lengthSizeMinusOnePaddingBits;
        public int numberOfSequenceParameterSetsPaddingBits;
        public List<byte[]> pictureParameterSets;
        public int profileCompatibility;
        public List<byte[]> sequenceParameterSetExts;
        public List<byte[]> sequenceParameterSets;

        public AVCDecoderConfigurationRecord() {
            this.sequenceParameterSets = new ArrayList();
            this.pictureParameterSets = new ArrayList();
            this.hasExts = true;
            this.chromaFormat = 1;
            this.bitDepthLumaMinus8 = 0;
            this.bitDepthChromaMinus8 = 0;
            this.sequenceParameterSetExts = new ArrayList();
            this.lengthSizeMinusOnePaddingBits = 63;
            this.numberOfSequenceParameterSetsPaddingBits = 7;
            this.chromaFormatPaddingBits = 31;
            this.bitDepthLumaMinus8PaddingBits = 31;
            this.bitDepthChromaMinus8PaddingBits = 31;
        }

        public AVCDecoderConfigurationRecord(ByteBuffer content) {
            int i;
            this.sequenceParameterSets = new ArrayList();
            this.pictureParameterSets = new ArrayList();
            this.hasExts = true;
            this.chromaFormat = 1;
            this.bitDepthLumaMinus8 = 0;
            this.bitDepthChromaMinus8 = 0;
            this.sequenceParameterSetExts = new ArrayList();
            this.lengthSizeMinusOnePaddingBits = 63;
            this.numberOfSequenceParameterSetsPaddingBits = 7;
            this.chromaFormatPaddingBits = 31;
            this.bitDepthLumaMinus8PaddingBits = 31;
            this.bitDepthChromaMinus8PaddingBits = 31;
            this.configurationVersion = IsoTypeReader.readUInt8(content);
            this.avcProfileIndication = IsoTypeReader.readUInt8(content);
            this.profileCompatibility = IsoTypeReader.readUInt8(content);
            this.avcLevelIndication = IsoTypeReader.readUInt8(content);
            BitReaderBuffer brb = new BitReaderBuffer(content);
            this.lengthSizeMinusOnePaddingBits = brb.readBits(6);
            this.lengthSizeMinusOne = brb.readBits(2);
            this.numberOfSequenceParameterSetsPaddingBits = brb.readBits(3);
            int numberOfSeuqenceParameterSets = brb.readBits(5);
            for (i = 0; i < numberOfSeuqenceParameterSets; i++) {
                byte[] sequenceParameterSetNALUnit = new byte[IsoTypeReader.readUInt16(content)];
                content.get(sequenceParameterSetNALUnit);
                this.sequenceParameterSets.add(sequenceParameterSetNALUnit);
            }
            long numberOfPictureParameterSets = (long) IsoTypeReader.readUInt8(content);
            i = 0;
            while (true) {
                if (((long) i) >= numberOfPictureParameterSets) {
                    break;
                }
                byte[] pictureParameterSetNALUnit = new byte[IsoTypeReader.readUInt16(content)];
                content.get(pictureParameterSetNALUnit);
                this.pictureParameterSets.add(pictureParameterSetNALUnit);
                i++;
            }
            if (content.remaining() < 4) {
                this.hasExts = false;
            }
            if (this.hasExts && (this.avcProfileIndication == 100 || this.avcProfileIndication == 110 || this.avcProfileIndication == 122 || this.avcProfileIndication == 144)) {
                brb = new BitReaderBuffer(content);
                this.chromaFormatPaddingBits = brb.readBits(6);
                this.chromaFormat = brb.readBits(2);
                this.bitDepthLumaMinus8PaddingBits = brb.readBits(5);
                this.bitDepthLumaMinus8 = brb.readBits(3);
                this.bitDepthChromaMinus8PaddingBits = brb.readBits(5);
                this.bitDepthChromaMinus8 = brb.readBits(3);
                long numOfSequenceParameterSetExt = (long) IsoTypeReader.readUInt8(content);
                i = 0;
                while (true) {
                    if (((long) i) < numOfSequenceParameterSetExt) {
                        byte[] sequenceParameterSetExtNALUnit = new byte[IsoTypeReader.readUInt16(content)];
                        content.get(sequenceParameterSetExtNALUnit);
                        this.sequenceParameterSetExts.add(sequenceParameterSetExtNALUnit);
                        i++;
                    } else {
                        return;
                    }
                }
            }
            this.chromaFormat = -1;
            this.bitDepthLumaMinus8 = -1;
            this.bitDepthChromaMinus8 = -1;
        }

        public void getContent(ByteBuffer byteBuffer) {
            IsoTypeWriter.writeUInt8(byteBuffer, this.configurationVersion);
            IsoTypeWriter.writeUInt8(byteBuffer, this.avcProfileIndication);
            IsoTypeWriter.writeUInt8(byteBuffer, this.profileCompatibility);
            IsoTypeWriter.writeUInt8(byteBuffer, this.avcLevelIndication);
            BitWriterBuffer bwb = new BitWriterBuffer(byteBuffer);
            bwb.writeBits(this.lengthSizeMinusOnePaddingBits, 6);
            bwb.writeBits(this.lengthSizeMinusOne, 2);
            bwb.writeBits(this.numberOfSequenceParameterSetsPaddingBits, 3);
            bwb.writeBits(this.pictureParameterSets.size(), 5);
            for (byte[] sequenceParameterSetNALUnit : this.sequenceParameterSets) {
                IsoTypeWriter.writeUInt16(byteBuffer, sequenceParameterSetNALUnit.length);
                byteBuffer.put(sequenceParameterSetNALUnit);
            }
            IsoTypeWriter.writeUInt8(byteBuffer, this.pictureParameterSets.size());
            for (byte[] pictureParameterSetNALUnit : this.pictureParameterSets) {
                IsoTypeWriter.writeUInt16(byteBuffer, pictureParameterSetNALUnit.length);
                byteBuffer.put(pictureParameterSetNALUnit);
            }
            if (!this.hasExts) {
                return;
            }
            if (this.avcProfileIndication == 100 || this.avcProfileIndication == 110 || this.avcProfileIndication == 122 || this.avcProfileIndication == 144) {
                bwb = new BitWriterBuffer(byteBuffer);
                bwb.writeBits(this.chromaFormatPaddingBits, 6);
                bwb.writeBits(this.chromaFormat, 2);
                bwb.writeBits(this.bitDepthLumaMinus8PaddingBits, 5);
                bwb.writeBits(this.bitDepthLumaMinus8, 3);
                bwb.writeBits(this.bitDepthChromaMinus8PaddingBits, 5);
                bwb.writeBits(this.bitDepthChromaMinus8, 3);
                for (byte[] sequenceParameterSetExtNALUnit : this.sequenceParameterSetExts) {
                    IsoTypeWriter.writeUInt16(byteBuffer, sequenceParameterSetExtNALUnit.length);
                    byteBuffer.put(sequenceParameterSetExtNALUnit);
                }
            }
        }

        public long getContentSize() {
            long size = 5 + 1;
            for (byte[] sequenceParameterSetNALUnit : this.sequenceParameterSets) {
                size = (size + 2) + ((long) sequenceParameterSetNALUnit.length);
            }
            size++;
            for (byte[] pictureParameterSetNALUnit : this.pictureParameterSets) {
                size = (size + 2) + ((long) pictureParameterSetNALUnit.length);
            }
            if (this.hasExts && (this.avcProfileIndication == 100 || this.avcProfileIndication == 110 || this.avcProfileIndication == 122 || this.avcProfileIndication == 144)) {
                size += 4;
                for (byte[] sequenceParameterSetExtNALUnit : this.sequenceParameterSetExts) {
                    size = (size + 2) + ((long) sequenceParameterSetExtNALUnit.length);
                }
            }
            return size;
        }

        public String[] getPPS() {
            ArrayList<String> l = new ArrayList();
            for (byte[] pictureParameterSet : this.pictureParameterSets) {
                String details = "not parsable";
                try {
                    l.add(PictureParameterSet.read(new ByteArrayInputStream(pictureParameterSet, 1, pictureParameterSet.length - 1)).toString());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return (String[]) l.toArray(new String[l.size()]);
        }

        public String[] getSPS() {
            ArrayList<String> l = new ArrayList();
            for (byte[] sequenceParameterSet : this.sequenceParameterSets) {
                String detail = "not parsable";
                try {
                    detail = SeqParameterSet.read(new ByteArrayInputStream(sequenceParameterSet, 1, sequenceParameterSet.length - 1)).toString();
                } catch (IOException e) {
                }
                l.add(detail);
            }
            return (String[]) l.toArray(new String[l.size()]);
        }

        public List<String> getSequenceParameterSetsAsStrings() {
            List<String> result = new ArrayList(this.sequenceParameterSets.size());
            for (byte[] parameterSet : this.sequenceParameterSets) {
                result.add(Hex.encodeHex(parameterSet));
            }
            return result;
        }

        public List<String> getSequenceParameterSetExtsAsStrings() {
            List<String> result = new ArrayList(this.sequenceParameterSetExts.size());
            for (byte[] parameterSet : this.sequenceParameterSetExts) {
                result.add(Hex.encodeHex(parameterSet));
            }
            return result;
        }

        public List<String> getPictureParameterSetsAsStrings() {
            List<String> result = new ArrayList(this.pictureParameterSets.size());
            for (byte[] parameterSet : this.pictureParameterSets) {
                result.add(Hex.encodeHex(parameterSet));
            }
            return result;
        }
    }

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AvcConfigurationBox.java", AvcConfigurationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getConfigurationVersion", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 54);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAvcProfileIndication", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 58);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAvcLevelIndication", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 94);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLengthSizeMinusOne", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 98);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSequenceParameterSets", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 102);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPictureParameterSets", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 106);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getChromaFormat", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 110);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setChromaFormat", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 114);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBitDepthLumaMinus8", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 118);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBitDepthLumaMinus8", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 122);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBitDepthChromaMinus8", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 126);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBitDepthChromaMinus8", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 130);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getProfileCompatibility", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 62);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSequenceParameterSetExts", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "java.util.List"), 134);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSequenceParameterSetExts", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 138);
        ajc$tjp_22 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hasExts", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "boolean"), 142);
        ajc$tjp_23 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setHasExts", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "boolean", "hasExts", "", "void"), 146);
        ajc$tjp_24 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getContentSize", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "long"), 157);
        ajc$tjp_25 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getContent", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 163);
        ajc$tjp_26 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSPS", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 168);
        ajc$tjp_27 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPPS", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 172);
        ajc$tjp_28 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getavcDecoderConfigurationRecord", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "com.coremedia.iso.boxes.h264.AvcConfigurationBox$AVCDecoderConfigurationRecord"), 177);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAvcLevelIndication", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 66);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLengthSizeMinusOne", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 70);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSequenceParameterSets", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "java.util.List"), 74);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPictureParameterSets", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "java.util.List"), 78);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setConfigurationVersion", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 82);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAvcProfileIndication", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 86);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setProfileCompatibility", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 90);
    }

    public AvcConfigurationBox() {
        super(TYPE);
        this.avcDecoderConfigurationRecord = new AVCDecoderConfigurationRecord();
    }

    public int getConfigurationVersion() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.avcDecoderConfigurationRecord.configurationVersion;
    }

    public int getAvcProfileIndication() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this));
        return this.avcDecoderConfigurationRecord.avcProfileIndication;
    }

    public int getProfileCompatibility() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.avcDecoderConfigurationRecord.profileCompatibility;
    }

    public int getAvcLevelIndication() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this));
        return this.avcDecoderConfigurationRecord.avcLevelIndication;
    }

    public int getLengthSizeMinusOne() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.avcDecoderConfigurationRecord.lengthSizeMinusOne;
    }

    public List<byte[]> getSequenceParameterSets() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, this, this));
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.sequenceParameterSets);
    }

    public List<byte[]> getPictureParameterSets() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_6, this, this));
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.pictureParameterSets);
    }

    public void setConfigurationVersion(int configurationVersion) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_7, (Object) this, (Object) this, Conversions.intObject(configurationVersion)));
        this.avcDecoderConfigurationRecord.configurationVersion = configurationVersion;
    }

    public void setAvcProfileIndication(int avcProfileIndication) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_8, (Object) this, (Object) this, Conversions.intObject(avcProfileIndication)));
        this.avcDecoderConfigurationRecord.avcProfileIndication = avcProfileIndication;
    }

    public void setProfileCompatibility(int profileCompatibility) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_9, (Object) this, (Object) this, Conversions.intObject(profileCompatibility)));
        this.avcDecoderConfigurationRecord.profileCompatibility = profileCompatibility;
    }

    public void setAvcLevelIndication(int avcLevelIndication) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_10, (Object) this, (Object) this, Conversions.intObject(avcLevelIndication)));
        this.avcDecoderConfigurationRecord.avcLevelIndication = avcLevelIndication;
    }

    public void setLengthSizeMinusOne(int lengthSizeMinusOne) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_11, (Object) this, (Object) this, Conversions.intObject(lengthSizeMinusOne)));
        this.avcDecoderConfigurationRecord.lengthSizeMinusOne = lengthSizeMinusOne;
    }

    public void setSequenceParameterSets(List<byte[]> sequenceParameterSets) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_12, (Object) this, (Object) this, (Object) sequenceParameterSets));
        this.avcDecoderConfigurationRecord.sequenceParameterSets = sequenceParameterSets;
    }

    public void setPictureParameterSets(List<byte[]> pictureParameterSets) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_13, (Object) this, (Object) this, (Object) pictureParameterSets));
        this.avcDecoderConfigurationRecord.pictureParameterSets = pictureParameterSets;
    }

    public int getChromaFormat() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_14, this, this));
        return this.avcDecoderConfigurationRecord.chromaFormat;
    }

    public void setChromaFormat(int chromaFormat) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_15, (Object) this, (Object) this, Conversions.intObject(chromaFormat)));
        this.avcDecoderConfigurationRecord.chromaFormat = chromaFormat;
    }

    public int getBitDepthLumaMinus8() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_16, this, this));
        return this.avcDecoderConfigurationRecord.bitDepthLumaMinus8;
    }

    public void setBitDepthLumaMinus8(int bitDepthLumaMinus8) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_17, (Object) this, (Object) this, Conversions.intObject(bitDepthLumaMinus8)));
        this.avcDecoderConfigurationRecord.bitDepthLumaMinus8 = bitDepthLumaMinus8;
    }

    public int getBitDepthChromaMinus8() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_18, this, this));
        return this.avcDecoderConfigurationRecord.bitDepthChromaMinus8;
    }

    public void setBitDepthChromaMinus8(int bitDepthChromaMinus8) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_19, (Object) this, (Object) this, Conversions.intObject(bitDepthChromaMinus8)));
        this.avcDecoderConfigurationRecord.bitDepthChromaMinus8 = bitDepthChromaMinus8;
    }

    public List<byte[]> getSequenceParameterSetExts() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_20, this, this));
        return this.avcDecoderConfigurationRecord.sequenceParameterSetExts;
    }

    public void setSequenceParameterSetExts(List<byte[]> sequenceParameterSetExts) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_21, (Object) this, (Object) this, (Object) sequenceParameterSetExts));
        this.avcDecoderConfigurationRecord.sequenceParameterSetExts = sequenceParameterSetExts;
    }

    public boolean hasExts() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_22, this, this));
        return this.avcDecoderConfigurationRecord.hasExts;
    }

    public void setHasExts(boolean hasExts) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_23, (Object) this, (Object) this, Conversions.booleanObject(hasExts)));
        this.avcDecoderConfigurationRecord.hasExts = hasExts;
    }

    public void _parseDetails(ByteBuffer content) {
        this.avcDecoderConfigurationRecord = new AVCDecoderConfigurationRecord(content);
    }

    public long getContentSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_24, this, this));
        return this.avcDecoderConfigurationRecord.getContentSize();
    }

    public void getContent(ByteBuffer byteBuffer) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_25, (Object) this, (Object) this, (Object) byteBuffer));
        this.avcDecoderConfigurationRecord.getContent(byteBuffer);
    }

    public String[] getSPS() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_26, this, this));
        return this.avcDecoderConfigurationRecord.getSPS();
    }

    public String[] getPPS() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_27, this, this));
        return this.avcDecoderConfigurationRecord.getPPS();
    }

    public AVCDecoderConfigurationRecord getavcDecoderConfigurationRecord() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_28, this, this));
        return this.avcDecoderConfigurationRecord;
    }
}
