package com.googlecode.mp4parser.boxes.cenc;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.UUIDConverter;
import java.nio.ByteBuffer;
import java.util.UUID;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;
import org.aspectj.runtime.reflect.Factory;

public class ProtectionSystemSpecificHeaderBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled;
    public static byte[] OMA2_SYSTEM_ID = null;
    public static byte[] PLAYREADY_SYSTEM_ID = null;
    public static final String TYPE = "pssh";
    private static final /* synthetic */ StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_3 = null;
    byte[] content;
    byte[] systemId;

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("ProtectionSystemSpecificHeaderBox.java", ProtectionSystemSpecificHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSystemId", "com.googlecode.mp4parser.boxes.cenc.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 38);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSystemId", "com.googlecode.mp4parser.boxes.cenc.ProtectionSystemSpecificHeaderBox", "[B", "systemId", "", "void"), 42);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getContent", "com.googlecode.mp4parser.boxes.cenc.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 47);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setContent", "com.googlecode.mp4parser.boxes.cenc.ProtectionSystemSpecificHeaderBox", "[B", "content", "", "void"), 51);
    }

    static {
        ajc$preClinit();
        $assertionsDisabled = !ProtectionSystemSpecificHeaderBox.class.desiredAssertionStatus() ? true : $assertionsDisabled;
        OMA2_SYSTEM_ID = UUIDConverter.convert(UUID.fromString("A2B55680-6F43-11E0-9A3F-0002A5D5C51B"));
        PLAYREADY_SYSTEM_ID = UUIDConverter.convert(UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95"));
    }

    public byte[] getSystemId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.systemId;
    }

    public void setSystemId(byte[] systemId) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, (Object) this, (Object) this, (Object) systemId));
        if ($assertionsDisabled || systemId.length == 16) {
            this.systemId = systemId;
            return;
        }
        throw new AssertionError();
    }

    public byte[] getContent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.content;
    }

    public void setContent(byte[] content) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, (Object) this, (Object) this, (Object) content));
        this.content = content;
    }

    public ProtectionSystemSpecificHeaderBox() {
        super(TYPE);
    }

    protected long getContentSize() {
        return (long) (this.content.length + 24);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if ($assertionsDisabled || this.systemId.length == 16) {
            byteBuffer.put(this.systemId, 0, 16);
            IsoTypeWriter.writeUInt32(byteBuffer, (long) this.content.length);
            byteBuffer.put(this.content);
            return;
        }
        throw new AssertionError();
    }

    protected void _parseDetails(ByteBuffer content) {
        parseVersionAndFlags(content);
        this.systemId = new byte[16];
        content.get(this.systemId);
        long length = IsoTypeReader.readUInt32(content);
        this.content = new byte[content.remaining()];
        content.get(this.content);
        if (!$assertionsDisabled && length != ((long) this.content.length)) {
            throw new AssertionError();
        }
    }
}
