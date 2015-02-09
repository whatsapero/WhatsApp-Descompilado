package com.coremedia.iso.boxes;

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

public class SampleAuxiliaryInformationOffsetsBox extends AbstractFullBox {
    public static final String TYPE = "saio";
    private static final /* synthetic */ StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_5 = null;
    private long auxInfoType;
    private long auxInfoTypeParameter;
    private List<Long> offsets;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SampleAuxiliaryInformationOffsetsBox.java", SampleAuxiliaryInformationOffsetsBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAuxInfoType", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "", "", "", "long"), 108);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAuxInfoType", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "long", "auxInfoType", "", "void"), 112);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAuxInfoTypeParameter", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "", "", "", "long"), 116);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAuxInfoTypeParameter", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "long", "auxInfoTypeParameter", "", "void"), 120);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getOffsets", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.util.List"), 124);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setOffsets", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "java.util.List", "offsets", "", "void"), 128);
    }

    public SampleAuxiliaryInformationOffsetsBox() {
        super(TYPE);
        this.offsets = new LinkedList();
    }

    protected long getContentSize() {
        return (long) (((getFlags() & 1) == 1 ? 8 : 0) + ((getVersion() == 0 ? this.offsets.size() * 4 : this.offsets.size() * 8) + 8));
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.auxInfoType);
            IsoTypeWriter.writeUInt32(byteBuffer, this.auxInfoTypeParameter);
        }
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.offsets.size());
        for (Long offset : this.offsets) {
            if (getVersion() == 0) {
                IsoTypeWriter.writeUInt32(byteBuffer, offset.longValue());
            } else {
                IsoTypeWriter.writeUInt64(byteBuffer, offset.longValue());
            }
        }
    }

    public void _parseDetails(ByteBuffer content) {
        parseVersionAndFlags(content);
        if ((getFlags() & 1) == 1) {
            this.auxInfoType = IsoTypeReader.readUInt32(content);
            this.auxInfoTypeParameter = IsoTypeReader.readUInt32(content);
        }
        int entryCount = CastUtils.l2i(IsoTypeReader.readUInt32(content));
        this.offsets.clear();
        for (int i = 0; i < entryCount; i++) {
            if (getVersion() == 0) {
                this.offsets.add(Long.valueOf(IsoTypeReader.readUInt32(content)));
            } else {
                this.offsets.add(Long.valueOf(IsoTypeReader.readUInt64(content)));
            }
        }
    }

    public long getAuxInfoType() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.auxInfoType;
    }

    public void setAuxInfoType(long auxInfoType) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, (Object) this, (Object) this, Conversions.longObject(auxInfoType)));
        this.auxInfoType = auxInfoType;
    }

    public long getAuxInfoTypeParameter() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.auxInfoTypeParameter;
    }

    public void setAuxInfoTypeParameter(long auxInfoTypeParameter) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, (Object) this, (Object) this, Conversions.longObject(auxInfoTypeParameter)));
        this.auxInfoTypeParameter = auxInfoTypeParameter;
    }

    public List<Long> getOffsets() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.offsets;
    }

    public void setOffsets(List<Long> offsets) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, (Object) this, (Object) this, (Object) offsets));
        this.offsets = offsets;
    }
}
