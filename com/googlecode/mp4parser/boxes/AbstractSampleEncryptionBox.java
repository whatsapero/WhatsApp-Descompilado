package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.util.Path;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public abstract class AbstractSampleEncryptionBox extends AbstractFullBox {
    private static final /* synthetic */ StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_12 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_13 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_9 = null;
    int algorithmId;
    List<Entry> entries;
    int ivSize;
    byte[] kid;

    public class Entry {
        public byte[] iv;
        public List<Pair> pairs;

        public class Pair {
            public int clear;
            public long encrypted;

            public Pair(int clear, long encrypted) {
                this.clear = clear;
                this.encrypted = encrypted;
            }

            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || getClass() != o.getClass()) {
                    return false;
                }
                com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.Entry.Pair pair = (com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.Entry.Pair) o;
                if (this.clear != pair.clear) {
                    return false;
                }
                return this.encrypted == pair.encrypted;
            }

            public int hashCode() {
                return (this.clear * 31) + ((int) (this.encrypted ^ (this.encrypted >>> 32)));
            }

            public String toString() {
                return "clr:" + this.clear + " enc:" + this.encrypted;
            }
        }

        public Entry() {
            this.pairs = new LinkedList();
        }

        public int getSize() {
            int size;
            if (AbstractSampleEncryptionBox.this.isOverrideTrackEncryptionBoxParameters()) {
                size = AbstractSampleEncryptionBox.this.ivSize;
            } else {
                size = this.iv.length;
            }
            if (AbstractSampleEncryptionBox.this.isSubSampleEncryption()) {
                size += 2;
                for (Pair pair : this.pairs) {
                    size += 6;
                }
            }
            return size;
        }

        public Pair createPair(int clear, long encrypted) {
            return new Pair(clear, encrypted);
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.Entry entry = (com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.Entry) o;
            if (!new BigInteger(this.iv).equals(new BigInteger(entry.iv))) {
                return false;
            }
            if (this.pairs != null) {
                if (this.pairs.equals(entry.pairs)) {
                    return true;
                }
            } else if (entry.pairs == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int result;
            int i = 0;
            if (this.iv != null) {
                result = Arrays.hashCode(this.iv);
            } else {
                result = 0;
            }
            int i2 = result * 31;
            if (this.pairs != null) {
                i = this.pairs.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            return "Entry{iv=" + Hex.encodeHex(this.iv) + ", pairs=" + this.pairs + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AbstractSampleEncryptionBox.java", AbstractSampleEncryptionBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getOffsetToFirstIV", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 33);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleCount", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 81);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "createEntry", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox$Entry"), 194);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.lang.Object", "o", "", "boolean"), 307);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 334);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntrySizes", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 342);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 85);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.util.List", "entries", "", "void"), 89);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 93);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "int", "algorithmId", "", "void"), 97);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getIvSize", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 101);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setIvSize", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "int", "ivSize", "", "void"), 105);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getKid", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "[B"), 109);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setKid", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "[B", "kid", "", "void"), 113);
    }

    protected AbstractSampleEncryptionBox(String type) {
        super(type);
        this.algorithmId = -1;
        this.ivSize = -1;
        this.kid = new byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1};
        this.entries = new LinkedList();
    }

    public int getOffsetToFirstIV() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return ((getSize() > 4294967296L ? 16 : 8) + (isOverrideTrackEncryptionBoxParameters() ? 20 : 0)) + 4;
    }

    public void _parseDetails(ByteBuffer content) {
        parseVersionAndFlags(content);
        int useThisIvSize = -1;
        if ((getFlags() & 1) > 0) {
            this.algorithmId = IsoTypeReader.readUInt24(content);
            this.ivSize = IsoTypeReader.readUInt8(content);
            useThisIvSize = this.ivSize;
            this.kid = new byte[16];
            content.get(this.kid);
        } else {
            for (Box tkhd : Path.getPaths((Box) this, "/moov[0]/trak/tkhd")) {
                if (((TrackHeaderBox) tkhd).getTrackId() == ((TrackFragmentHeaderBox) getParent().getBoxes(TrackFragmentHeaderBox.class).get(0)).getTrackId()) {
                    AbstractTrackEncryptionBox tenc = (AbstractTrackEncryptionBox) Path.getPath(tkhd, "../mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
                    if (tenc == null) {
                        tenc = (AbstractTrackEncryptionBox) Path.getPath(tkhd, "../mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/uuid[0]");
                    }
                    useThisIvSize = tenc.getDefaultIvSize();
                }
            }
        }
        long numOfEntries = IsoTypeReader.readUInt32(content);
        while (true) {
            long numOfEntries2 = numOfEntries - 1;
            if (numOfEntries > 0) {
                int i;
                Entry e = new Entry();
                if (useThisIvSize < 0) {
                    i = 8;
                } else {
                    i = useThisIvSize;
                }
                e.iv = new byte[i];
                content.get(e.iv);
                if ((getFlags() & 2) > 0) {
                    int numOfPairs = IsoTypeReader.readUInt16(content);
                    e.pairs = new LinkedList();
                    int numOfPairs2 = numOfPairs;
                    while (true) {
                        numOfPairs = numOfPairs2 - 1;
                        if (numOfPairs2 <= 0) {
                            break;
                        }
                        e.pairs.add(e.createPair(IsoTypeReader.readUInt16(content), IsoTypeReader.readUInt32(content)));
                        numOfPairs2 = numOfPairs;
                    }
                }
                this.entries.add(e);
                numOfEntries = numOfEntries2;
            } else {
                return;
            }
        }
    }

    public int getSampleCount() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this));
        return this.entries.size();
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.entries;
    }

    public void setEntries(List<Entry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, (Object) this, (Object) this, (Object) entries));
        this.entries = entries;
    }

    public int getAlgorithmId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.algorithmId;
    }

    public void setAlgorithmId(int algorithmId) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, (Object) this, (Object) this, Conversions.intObject(algorithmId)));
        this.algorithmId = algorithmId;
    }

    public int getIvSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_6, this, this));
        return this.ivSize;
    }

    public void setIvSize(int ivSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_7, (Object) this, (Object) this, Conversions.intObject(ivSize)));
        this.ivSize = ivSize;
    }

    public byte[] getKid() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_8, this, this));
        return this.kid;
    }

    public void setKid(byte[] kid) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_9, (Object) this, (Object) this, (Object) kid));
        this.kid = kid;
    }

    @DoNotParseDetail
    public boolean isSubSampleEncryption() {
        return (getFlags() & 2) > 0;
    }

    @DoNotParseDetail
    public boolean isOverrideTrackEncryptionBoxParameters() {
        return (getFlags() & 1) > 0;
    }

    @DoNotParseDetail
    public void setSubSampleEncryption(boolean b) {
        if (b) {
            setFlags(getFlags() | 2);
        } else {
            setFlags(getFlags() & 16777213);
        }
    }

    @DoNotParseDetail
    public void setOverrideTrackEncryptionBoxParameters(boolean b) {
        if (b) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & 16777214);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (isOverrideTrackEncryptionBoxParameters()) {
            IsoTypeWriter.writeUInt24(byteBuffer, this.algorithmId);
            IsoTypeWriter.writeUInt8(byteBuffer, this.ivSize);
            byteBuffer.put(this.kid);
        }
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.entries.size());
        for (Entry entry : this.entries) {
            if (isOverrideTrackEncryptionBoxParameters()) {
                byte[] ivFull = new byte[this.ivSize];
                System.arraycopy(entry.iv, 0, ivFull, this.ivSize - entry.iv.length, entry.iv.length);
                byteBuffer.put(ivFull);
            } else {
                byteBuffer.put(entry.iv);
            }
            if (isSubSampleEncryption()) {
                IsoTypeWriter.writeUInt16(byteBuffer, entry.pairs.size());
                for (Pair pair : entry.pairs) {
                    IsoTypeWriter.writeUInt16(byteBuffer, pair.clear);
                    IsoTypeWriter.writeUInt32(byteBuffer, pair.encrypted);
                }
            }
        }
    }

    protected long getContentSize() {
        long contentSize = 4;
        if (isOverrideTrackEncryptionBoxParameters()) {
            contentSize = (4 + 4) + ((long) this.kid.length);
        }
        contentSize += 4;
        for (Entry entry : this.entries) {
            contentSize += (long) entry.getSize();
        }
        return contentSize;
    }

    public void getBox(WritableByteChannel os) throws IOException {
        super.getBox(os);
    }

    public Entry createEntry() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_10, this, this));
        return new Entry();
    }

    public boolean equals(Object o) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_11, (Object) this, (Object) this, o));
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractSampleEncryptionBox that = (AbstractSampleEncryptionBox) o;
        if (this.algorithmId != that.algorithmId) {
            return false;
        }
        if (this.ivSize != that.ivSize) {
            return false;
        }
        if (this.entries == null ? that.entries != null : !this.entries.equals(that.entries)) {
            return false;
        }
        return Arrays.equals(this.kid, that.kid);
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_12, this, this));
        int i2 = ((this.algorithmId * 31) + this.ivSize) * 31;
        if (this.kid != null) {
            hashCode = Arrays.hashCode(this.kid);
        } else {
            hashCode = 0;
        }
        hashCode = (i2 + hashCode) * 31;
        if (this.entries != null) {
            i = this.entries.hashCode();
        }
        return hashCode + i;
    }

    public List<Short> getEntrySizes() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_13, this, this));
        List entrySizes = new ArrayList(this.entries.size());
        for (Entry entry : this.entries) {
            short size = (short) entry.iv.length;
            if (isSubSampleEncryption()) {
                size = (short) ((entry.pairs.size() * 6) + ((short) (size + 2)));
            }
            entrySizes.add(Short.valueOf(size));
        }
        return entrySizes;
    }
}
