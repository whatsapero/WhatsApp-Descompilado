package com.coremedia.iso;

import com.googlecode.mp4parser.util.IntHashMap;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public final class IsoTypeReader {
    private static byte[] codeBytes;
    private static IntHashMap codeCache;

    public static long readUInt32BE(ByteBuffer bb) {
        return (((((long) readUInt8(bb)) << 24) + (((long) readUInt8(bb)) << 16)) + (((long) readUInt8(bb)) << 8)) + (((long) readUInt8(bb)) << null);
    }

    public static long readUInt32(ByteBuffer bb) {
        long i = (long) bb.getInt();
        return i < 0 ? i + 4294967296L : i;
    }

    public static int readUInt24(ByteBuffer bb) {
        return (0 + (readUInt16(bb) << 8)) + byte2int(bb.get());
    }

    public static int readUInt16(ByteBuffer bb) {
        return (0 + (byte2int(bb.get()) << 8)) + byte2int(bb.get());
    }

    public static int readUInt16BE(ByteBuffer bb) {
        return (0 + byte2int(bb.get())) + (byte2int(bb.get()) << 8);
    }

    public static int readUInt8(ByteBuffer bb) {
        return byte2int(bb.get());
    }

    public static int byte2int(byte b) {
        return b < null ? b + 256 : b;
    }

    public static String readString(ByteBuffer byteBuffer) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        while (true) {
            int read = byteBuffer.get();
            if (read == 0) {
                return Utf8.convert(out.toByteArray());
            }
            out.write(read);
        }
    }

    public static String readString(ByteBuffer byteBuffer, int length) {
        byte[] buffer = new byte[length];
        byteBuffer.get(buffer);
        return Utf8.convert(buffer);
    }

    public static long readUInt64(ByteBuffer byteBuffer) {
        long result = 0 + (readUInt32(byteBuffer) << 32);
        if (result >= 0) {
            return result + readUInt32(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static double readFixedPoint1616(ByteBuffer bb) {
        byte[] bytes = new byte[4];
        bb.get(bytes);
        return ((double) ((((0 | ((bytes[0] << 24) & -16777216)) | ((bytes[1] << 16) & 16711680)) | ((bytes[2] << 8) & 65280)) | (bytes[3] & 255))) / 65536.0d;
    }

    public static double readFixedPoint0230(ByteBuffer bb) {
        byte[] bytes = new byte[4];
        bb.get(bytes);
        return ((double) ((((0 | ((bytes[0] << 24) & -16777216)) | ((bytes[1] << 16) & 16711680)) | ((bytes[2] << 8) & 65280)) | (bytes[3] & 255))) / 1.073741824E9d;
    }

    public static float readFixedPoint88(ByteBuffer bb) {
        byte[] bytes = new byte[2];
        bb.get(bytes);
        return ((float) ((short) ((bytes[1] & 255) | ((short) (((bytes[0] << 8) & 65280) | (short) 0))))) / 256.0f;
    }

    public static String readIso639(ByteBuffer bb) {
        int bits = readUInt16(bb);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            result.append((char) (((bits >> ((2 - i) * 5)) & 31) + 96));
        }
        return result.toString();
    }

    static {
        codeCache = new IntHashMap();
        codeBytes = new byte[4];
    }

    public static String read4cc(ByteBuffer bb) {
        UnsupportedEncodingException e;
        bb.get(codeBytes);
        int result = ((((codeBytes[0] << 24) & -16777216) | ((codeBytes[1] << 16) & 16711680)) | ((codeBytes[2] << 8) & 65280)) | (codeBytes[3] & 255);
        String code = (String) codeCache.get(result);
        if (code != null) {
            return code;
        }
        try {
            String code2 = new String(codeBytes, "ISO-8859-1");
            try {
                codeCache.put(result, code2);
                code = code2;
                return code2;
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                code = code2;
                throw new RuntimeException(e);
            }
        } catch (UnsupportedEncodingException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }
}
