package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;
import org.aspectj.runtime.reflect.Factory;

public class SubSampleInformationBox extends AbstractFullBox {
    public static final String TYPE = "subs";
    private static final /* synthetic */ StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_2 = null;
    private List<SampleEntry> entries;
    private long entryCount;

    public static class SampleEntry {
        private long sampleDelta;
        private int subsampleCount;
        private List<SubsampleEntry> subsampleEntries;

        public static class SubsampleEntry {
            private int discardable;
            private long reserved;
            private int subsamplePriority;
            private long subsampleSize;

            public long getSubsampleSize() {
                return this.subsampleSize;
            }

            public void setSubsampleSize(long subsampleSize) {
                this.subsampleSize = subsampleSize;
            }

            public int getSubsamplePriority() {
                return this.subsamplePriority;
            }

            public void setSubsamplePriority(int subsamplePriority) {
                this.subsamplePriority = subsamplePriority;
            }

            public int getDiscardable() {
                return this.discardable;
            }

            public void setDiscardable(int discardable) {
                this.discardable = discardable;
            }

            public long getReserved() {
                return this.reserved;
            }

            public void setReserved(long reserved) {
                this.reserved = reserved;
            }

            public String toString() {
                return "SubsampleEntry{subsampleSize=" + this.subsampleSize + ", subsamplePriority=" + this.subsamplePriority + ", discardable=" + this.discardable + ", reserved=" + this.reserved + '}';
            }
        }

        public SampleEntry() {
            this.subsampleEntries = new ArrayList();
        }

        public long getSampleDelta() {
            return this.sampleDelta;
        }

        public void setSampleDelta(long sampleDelta) {
            this.sampleDelta = sampleDelta;
        }

        public int getSubsampleCount() {
            return this.subsampleCount;
        }

        public void setSubsampleCount(int subsampleCount) {
            this.subsampleCount = subsampleCount;
        }

        public List<SubsampleEntry> getSubsampleEntries() {
            return this.subsampleEntries;
        }

        public void addSubsampleEntry(SubsampleEntry subsampleEntry) {
            this.subsampleEntries.add(subsampleEntry);
            this.subsampleCount++;
        }

        public String toString() {
            return "SampleEntry{sampleDelta=" + this.sampleDelta + ", subsampleCount=" + this.subsampleCount + ", subsampleEntries=" + this.subsampleEntries + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SubSampleInformationBox.java", SubSampleInformationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.util.List"), 51);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "java.util.List", "entries", "", "void"), 55);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.lang.String"), 115);
    }

    public SubSampleInformationBox() {
        super(TYPE);
        this.entries = new ArrayList();
    }

    public List<SampleEntry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<SampleEntry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, (Object) this, (Object) this, (Object) entries));
        this.entries = entries;
        this.entryCount = (long) entries.size();
    }

    protected long getContentSize() {
        long entries = 8 + (6 * this.entryCount);
        int subsampleEntries = 0;
        for (SampleEntry sampleEntry : this.entries) {
            subsampleEntries += ((((getVersion() == 1 ? 4 : 2) + 1) + 1) + 4) * sampleEntry.getSubsampleCount();
        }
        return ((long) subsampleEntries) + entries;
    }

    public void _parseDetails(ByteBuffer content) {
        parseVersionAndFlags(content);
        this.entryCount = IsoTypeReader.readUInt32(content);
        for (int i = 0; ((long) i) < this.entryCount; i++) {
            SampleEntry sampleEntry = new SampleEntry();
            sampleEntry.setSampleDelta(IsoTypeReader.readUInt32(content));
            int subsampleCount = IsoTypeReader.readUInt16(content);
            for (int j = 0; j < subsampleCount; j++) {
                SubsampleEntry subsampleEntry = new SubsampleEntry();
                subsampleEntry.setSubsampleSize(getVersion() == 1 ? IsoTypeReader.readUInt32(content) : (long) IsoTypeReader.readUInt16(content));
                subsampleEntry.setSubsamplePriority(IsoTypeReader.readUInt8(content));
                subsampleEntry.setDiscardable(IsoTypeReader.readUInt8(content));
                subsampleEntry.setReserved(IsoTypeReader.readUInt32(content));
                sampleEntry.addSubsampleEntry(subsampleEntry);
            }
            this.entries.add(sampleEntry);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.entries.size());
        for (SampleEntry sampleEntry : this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer, sampleEntry.getSampleDelta());
            IsoTypeWriter.writeUInt16(byteBuffer, sampleEntry.getSubsampleCount());
            for (SubsampleEntry subsampleEntry : sampleEntry.getSubsampleEntries()) {
                if (getVersion() == 1) {
                    IsoTypeWriter.writeUInt32(byteBuffer, subsampleEntry.getSubsampleSize());
                } else {
                    IsoTypeWriter.writeUInt16(byteBuffer, CastUtils.l2i(subsampleEntry.getSubsampleSize()));
                }
                IsoTypeWriter.writeUInt8(byteBuffer, subsampleEntry.getSubsamplePriority());
                IsoTypeWriter.writeUInt8(byteBuffer, subsampleEntry.getDiscardable());
                IsoTypeWriter.writeUInt32(byteBuffer, subsampleEntry.getReserved());
            }
        }
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return "SubSampleInformationBox{entryCount=" + this.entryCount + ", entries=" + this.entries + '}';
    }
}
