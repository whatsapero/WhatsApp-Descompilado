package com.coremedia.iso;

import java.nio.ByteBuffer;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class IsoTypeWriterVariable {
    public static void write(long v, ByteBuffer bb, int bytes) {
        switch (bytes) {
            case ay.f /*1*/:
                IsoTypeWriter.writeUInt8(bb, (int) (255 & v));
            case ay.n /*2*/:
                IsoTypeWriter.writeUInt16(bb, (int) (65535 & v));
            case ay.p /*3*/:
                IsoTypeWriter.writeUInt24(bb, (int) (16777215 & v));
            case aj.i /*4*/:
                IsoTypeWriter.writeUInt32(bb, v);
            case a8.n /*8*/:
                IsoTypeWriter.writeUInt64(bb, v);
            default:
                throw new RuntimeException("I don't know how to read " + bytes + " bytes");
        }
    }
}
