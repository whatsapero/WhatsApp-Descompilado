package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public class SampleAuxiliaryInformationSizesBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled;
    public static final String TYPE = "saiz";
    private static final /* synthetic */ StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_9 = null;
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private int defaultSampleInfoSize;
    private int sampleCount;
    private List<Short> sampleInfoSizes;

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SampleAuxiliaryInformationSizesBox.java", SampleAuxiliaryInformationSizesBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAuxInfoType", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 98);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAuxInfoType", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoType", "", "void"), 102);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 140);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAuxInfoTypeParameter", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 106);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAuxInfoTypeParameter", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 110);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDefaultSampleInfoSize", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 114);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDefaultSampleInfoSize", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "int", "defaultSampleInfoSize", "", "void"), 118);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleInfoSizes", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "java.util.List"), 123);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleInfoSizes", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "java.util.List", "sampleInfoSizes", "", "void"), 127);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleCount", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 131);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleCount", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "int", "sampleCount", "", "void"), 135);
    }

    static {
        ajc$preClinit();
        $assertionsDisabled = !SampleAuxiliaryInformationSizesBox.class.desiredAssertionStatus() ? true : $assertionsDisabled;
    }

    public SampleAuxiliaryInformationSizesBox() {
        super(TYPE);
        this.sampleInfoSizes = new LinkedList();
    }

    protected long getContentSize() {
        int size = 4;
        if ((getFlags() & 1) == 1) {
            size = 4 + 8;
        }
        return (long) ((size + 5) + (this.defaultSampleInfoSize == 0 ? this.sampleInfoSizes.size() : 0));
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(IsoFile.fourCCtoBytes(this.auxInfoType));
            byteBuffer.put(IsoFile.fourCCtoBytes(this.auxInfoTypeParameter));
        }
        IsoTypeWriter.writeUInt8(byteBuffer, this.defaultSampleInfoSize);
        if (this.defaultSampleInfoSize == 0) {
            IsoTypeWriter.writeUInt32(byteBuffer, (long) this.sampleInfoSizes.size());
            for (Short sh : this.sampleInfoSizes) {
                IsoTypeWriter.writeUInt8(byteBuffer, sh.shortValue());
            }
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.sampleCount);
    }

    public void _parseDetails(ByteBuffer content) {
        parseVersionAndFlags(content);
        if ((getFlags() & 1) == 1) {
            this.auxInfoType = IsoTypeReader.read4cc(content);
            this.auxInfoTypeParameter = IsoTypeReader.read4cc(content);
        }
        this.defaultSampleInfoSize = (short) IsoTypeReader.readUInt8(content);
        this.sampleCount = CastUtils.l2i(IsoTypeReader.readUInt32(content));
        this.sampleInfoSizes.clear();
        if (this.defaultSampleInfoSize == 0) {
            for (int i = 0; i < this.sampleCount; i++) {
                this.sampleInfoSizes.add(Short.valueOf((short) IsoTypeReader.readUInt8(content)));
            }
        }
    }

    public String getAuxInfoType() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.auxInfoType;
    }

    public void setAuxInfoType(String auxInfoType) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, (Object) this, (Object) this, (Object) auxInfoType));
        this.auxInfoType = auxInfoType;
    }

    public String getAuxInfoTypeParameter() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.auxInfoTypeParameter;
    }

    public void setAuxInfoTypeParameter(String auxInfoTypeParameter) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, (Object) this, (Object) this, (Object) auxInfoTypeParameter));
        this.auxInfoTypeParameter = auxInfoTypeParameter;
    }

    public int getDefaultSampleInfoSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.defaultSampleInfoSize;
    }

    public void setDefaultSampleInfoSize(int defaultSampleInfoSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, (Object) this, (Object) this, Conversions.intObject(defaultSampleInfoSize)));
        if ($assertionsDisabled || defaultSampleInfoSize <= 255) {
            this.defaultSampleInfoSize = defaultSampleInfoSize;
            return;
        }
        throw new AssertionError();
    }

    public List<Short> getSampleInfoSizes() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_6, this, this));
        return this.sampleInfoSizes;
    }

    public void setSampleInfoSizes(List<Short> sampleInfoSizes) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_7, (Object) this, (Object) this, (Object) sampleInfoSizes));
        this.sampleInfoSizes = sampleInfoSizes;
    }

    public int getSampleCount() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_8, this, this));
        return this.sampleCount;
    }

    public void setSampleCount(int sampleCount) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_9, (Object) this, (Object) this, Conversions.intObject(sampleCount)));
        this.sampleCount = sampleCount;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_10, this, this));
        return "SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=" + this.defaultSampleInfoSize + ", sampleCount=" + this.sampleCount + ", auxInfoType='" + this.auxInfoType + '\'' + ", auxInfoTypeParameter='" + this.auxInfoTypeParameter + '\'' + '}';
    }
}
