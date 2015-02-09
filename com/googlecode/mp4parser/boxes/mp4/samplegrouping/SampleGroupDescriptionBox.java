package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

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

public class SampleGroupDescriptionBox extends AbstractFullBox {
    public static final String TYPE = "sgpd";
    private static final /* synthetic */ StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_8 = null;
    private int defaultLength;
    private int descriptionLength;
    private List<GroupEntry> groupEntries;
    private String groupingType;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SampleGroupDescriptionBox.java", SampleGroupDescriptionBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 135);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.String", "groupingType", "", "void"), 139);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 143);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "int", "defaultLength", "", "void"), 147);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.util.List"), 151);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.util.List", "groupEntries", "", "void"), 155);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.Object", "o", "", "boolean"), 160);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 184);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 192);
    }

    public SampleGroupDescriptionBox() {
        super(TYPE);
        this.groupEntries = new LinkedList();
    }

    protected long getContentSize() {
        long size = 8;
        if (getVersion() == 1) {
            size = 8 + 4;
        }
        size += 4;
        for (GroupEntry groupEntry : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                size += 4;
            }
            size += (long) groupEntry.size();
        }
        return size;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.groupingType.getBytes());
        if (getVersion() == 1) {
            IsoTypeWriter.writeUInt32(byteBuffer, (long) this.defaultLength);
        }
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.groupEntries.size());
        for (GroupEntry entry : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                IsoTypeWriter.writeUInt32(byteBuffer, (long) entry.get().limit());
            }
            byteBuffer.put(entry.get());
        }
    }

    protected void _parseDetails(ByteBuffer content) {
        parseVersionAndFlags(content);
        if (getVersion() != 1) {
            throw new RuntimeException("SampleGroupDescriptionBox are only supported in version 1");
        }
        this.groupingType = IsoTypeReader.read4cc(content);
        if (getVersion() == 1) {
            this.defaultLength = CastUtils.l2i(IsoTypeReader.readUInt32(content));
        }
        long entryCount = IsoTypeReader.readUInt32(content);
        while (true) {
            long entryCount2 = entryCount - 1;
            if (entryCount > 0) {
                int length = this.defaultLength;
                if (getVersion() != 1) {
                    break;
                }
                if (this.defaultLength == 0) {
                    this.descriptionLength = CastUtils.l2i(IsoTypeReader.readUInt32(content));
                    length = this.descriptionLength;
                }
                int finalPos = content.position() + length;
                ByteBuffer parseMe = content.slice();
                parseMe.limit(length);
                this.groupEntries.add(parseGroupEntry(parseMe, this.groupingType));
                content.position(finalPos);
                entryCount = entryCount2;
            } else {
                return;
            }
        }
        throw new RuntimeException("This should be implemented");
    }

    private GroupEntry parseGroupEntry(ByteBuffer content, String groupingType) {
        GroupEntry rollRecoveryEntry;
        if (RollRecoveryEntry.TYPE.equals(groupingType)) {
            rollRecoveryEntry = new RollRecoveryEntry();
        } else if (RateShareEntry.TYPE.equals(groupingType)) {
            rollRecoveryEntry = new RateShareEntry();
        } else if (CencSampleEncryptionInformationGroupEntry.TYPE.equals(groupingType)) {
            rollRecoveryEntry = new CencSampleEncryptionInformationGroupEntry();
        } else if (VisualRandomAccessEntry.TYPE.equals(groupingType)) {
            rollRecoveryEntry = new VisualRandomAccessEntry();
        } else if (TemporalLevelEntry.TYPE.equals(groupingType)) {
            rollRecoveryEntry = new TemporalLevelEntry();
        } else {
            rollRecoveryEntry = new UnknownEntry();
        }
        rollRecoveryEntry.parse(content);
        return rollRecoveryEntry;
    }

    public String getGroupingType() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.groupingType;
    }

    public void setGroupingType(String groupingType) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, (Object) this, (Object) this, (Object) groupingType));
        this.groupingType = groupingType;
    }

    public int getDefaultLength() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.defaultLength;
    }

    public void setDefaultLength(int defaultLength) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, (Object) this, (Object) this, Conversions.intObject(defaultLength)));
        this.defaultLength = defaultLength;
    }

    public List<GroupEntry> getGroupEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.groupEntries;
    }

    public void setGroupEntries(List<GroupEntry> groupEntries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, (Object) this, (Object) this, (Object) groupEntries));
        this.groupEntries = groupEntries;
    }

    public boolean equals(Object o) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_6, (Object) this, (Object) this, o));
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SampleGroupDescriptionBox that = (SampleGroupDescriptionBox) o;
        if (this.defaultLength != that.defaultLength) {
            return false;
        }
        if (this.groupEntries == null ? that.groupEntries != null : !this.groupEntries.equals(that.groupEntries)) {
            return false;
        }
        if (this.groupingType != null) {
            if (this.groupingType.equals(that.groupingType)) {
                return true;
            }
        } else if (that.groupingType == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result;
        int i = 0;
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_7, this, this));
        if (this.groupingType != null) {
            result = this.groupingType.hashCode();
        } else {
            result = 0;
        }
        int i2 = ((result * 31) + this.defaultLength) * 31;
        if (this.groupEntries != null) {
            i = this.groupEntries.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_8, this, this));
        return "SampleGroupDescriptionBox{groupingType='" + this.groupingType + '\'' + ", defaultLength=" + this.defaultLength + ", groupEntries=" + this.groupEntries + '}';
    }
}
