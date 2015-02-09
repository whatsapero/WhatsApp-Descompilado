package com.coremedia.iso;

import java.nio.ByteBuffer;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class IsoTypeReaderVariable {
    public static long read(ByteBuffer bb, int bytes) {
        switch (bytes) {
            case ay.f /*1*/:
                return (long) IsoTypeReader.readUInt8(bb);
            case ay.n /*2*/:
                return (long) IsoTypeReader.readUInt16(bb);
            case ay.p /*3*/:
                return (long) IsoTypeReader.readUInt24(bb);
            case aj.i /*4*/:
                return IsoTypeReader.readUInt32(bb);
            case a8.n /*8*/:
                return IsoTypeReader.readUInt64(bb);
            default:
                throw new RuntimeException("I don't know how to read " + bytes + " bytes");
        }
    }
}
