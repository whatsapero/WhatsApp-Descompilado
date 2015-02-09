package com.googlecode.mp4parser.boxes.ultraviolet;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;
import org.aspectj.runtime.reflect.Factory;

public class AssetInformationBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled;
    public static final String TYPE = "ainf";
    private static final /* synthetic */ StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ StaticPart ajc$tjp_3 = null;
    String apid;
    String profileVersion;

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AssetInformationBox.java", AssetInformationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getApid", "com.googlecode.mp4parser.boxes.ultraviolet.AssetInformationBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setApid", "com.googlecode.mp4parser.boxes.ultraviolet.AssetInformationBox", "java.lang.String", "apid", "", "void"), 66);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getProfileVersion", "com.googlecode.mp4parser.boxes.ultraviolet.AssetInformationBox", "", "", "", "java.lang.String"), 70);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setProfileVersion", "com.googlecode.mp4parser.boxes.ultraviolet.AssetInformationBox", "java.lang.String", "profileVersion", "", "void"), 74);
    }

    static {
        ajc$preClinit();
        $assertionsDisabled = !AssetInformationBox.class.desiredAssertionStatus() ? true : $assertionsDisabled;
    }

    public AssetInformationBox() {
        super(TYPE);
        this.apid = "";
        this.profileVersion = "0000";
    }

    protected long getContentSize() {
        return (long) (Utf8.utf8StringLengthInBytes(this.apid) + 9);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(Utf8.convert(this.profileVersion), 0, 4);
        byteBuffer.put(Utf8.convert(this.apid));
        byteBuffer.put((byte) 0);
    }

    public void _parseDetails(ByteBuffer content) {
        parseVersionAndFlags(content);
        this.profileVersion = IsoTypeReader.readString(content, 4);
        this.apid = IsoTypeReader.readString(content);
    }

    public String getApid() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.apid;
    }

    public void setApid(String apid) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, (Object) this, (Object) this, (Object) apid));
        this.apid = apid;
    }

    public String getProfileVersion() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.profileVersion;
    }

    public void setProfileVersion(String profileVersion) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, (Object) this, (Object) this, (Object) profileVersion));
        if ($assertionsDisabled || (profileVersion != null && profileVersion.length() == 4)) {
            this.profileVersion = profileVersion;
            return;
        }
        throw new AssertionError();
    }
}
