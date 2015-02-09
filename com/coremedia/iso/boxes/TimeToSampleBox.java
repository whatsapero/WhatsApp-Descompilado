package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;
import org.aspectj.runtime.reflect.Factory;

public class TimeToSampleBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled;
    public static final String TYPE = "stts";
    private static final /* synthetic */ StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_2 = null;
    List<Entry> entries;

    public static class Entry {
        long count;
        long delta;

        public Entry(long count, long delta) {
            this.count = count;
            this.delta = delta;
        }

        public long getCount() {
            return this.count;
        }

        public long getDelta() {
            return this.delta;
        }

        public void setCount(long count) {
            this.count = count;
        }

        public void setDelta(long delta) {
            this.delta = delta;
        }

        public String toString() {
            return "Entry{count=" + this.count + ", delta=" + this.delta + '}';
        }
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TimeToSampleBox.java", TimeToSampleBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.util.List"), 81);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "", "void"), 85);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.lang.String"), 89);
    }

    static {
        ajc$preClinit();
        $assertionsDisabled = !TimeToSampleBox.class.desiredAssertionStatus() ? true : $assertionsDisabled;
    }

    public TimeToSampleBox() {
        super(TYPE);
        this.entries = Collections.emptyList();
    }

    protected long getContentSize() {
        return (long) ((this.entries.size() * 8) + 8);
    }

    public void _parseDetails(ByteBuffer content) {
        parseVersionAndFlags(content);
        int entryCount = CastUtils.l2i(IsoTypeReader.readUInt32(content));
        this.entries = new ArrayList(entryCount);
        for (int i = 0; i < entryCount; i++) {
            this.entries.add(new Entry(IsoTypeReader.readUInt32(content), IsoTypeReader.readUInt32(content)));
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.entries.size());
        for (Entry entry : this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getCount());
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getDelta());
        }
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<Entry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, (Object) this, (Object) this, (Object) entries));
        this.entries = entries;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return "TimeToSampleBox[entryCount=" + this.entries.size() + "]";
    }

    public static long[] blowupTimeToSamples(List<Entry> entries) {
        long numOfSamples = 0;
        for (Entry entry : entries) {
            numOfSamples += entry.getCount();
        }
        if ($assertionsDisabled || numOfSamples <= 2147483647L) {
            long[] decodingTime = new long[((int) numOfSamples)];
            int current = 0;
            for (Entry entry2 : entries) {
                int i = 0;
                while (((long) i) < entry2.getCount()) {
                    int current2 = current + 1;
                    decodingTime[current] = entry2.getDelta();
                    i++;
                    current = current2;
                }
            }
            return decodingTime;
        }
        throw new AssertionError();
    }
}
