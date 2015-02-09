package org.spongycastle.util;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public abstract class Pack {
    public static boolean a;

    public static long bigEndianToLong(byte[] bArr, int i) {
        return (((long) bigEndianToInt(bArr, i + 4)) & 4294967295L) | ((((long) bigEndianToInt(bArr, i)) & 4294967295L) << 32);
    }

    public static void longToBigEndian(long[] jArr, byte[] bArr, int i) {
        boolean z = a;
        int i2 = 0;
        while (i2 < jArr.length) {
            longToBigEndian(jArr[i2], bArr, i);
            i += 8;
            i2++;
            if (z) {
                return;
            }
        }
    }

    public static void intToLittleEndian(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        i3++;
        bArr[i3] = (byte) (i >>> 16);
        bArr[i3 + 1] = (byte) (i >>> 24);
    }

    public static int littleEndianToInt(byte[] bArr, int i) {
        int i2 = i + 1;
        i2++;
        int i3 = (((bArr[i] & 255) | ((bArr[i2] & 255) << 8)) | ((bArr[i2] & 255) << 16)) | (bArr[i2 + 1] << 24);
        if (a) {
            BaseKeyGenerator.a = !BaseKeyGenerator.a;
        }
        return i3;
    }

    public static void intToBigEndian(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        i3++;
        bArr[i3] = (byte) (i >>> 8);
        bArr[i3 + 1] = (byte) i;
    }

    public static void longToBigEndian(long j, byte[] bArr, int i) {
        intToBigEndian((int) (j >>> 32), bArr, i);
        intToBigEndian((int) (4294967295L & j), bArr, i + 4);
    }

    public static int bigEndianToInt(byte[] bArr, int i) {
        boolean z = a;
        int i2 = i + 1;
        i2++;
        int i3 = (((bArr[i] << 24) | ((bArr[i2] & 255) << 16)) | ((bArr[i2] & 255) << 8)) | (bArr[i2 + 1] & 255);
        if (BaseKeyGenerator.a) {
            a = !z;
        }
        return i3;
    }

    public static void bigEndianToInt(byte[] bArr, int i, int[] iArr) {
        boolean z = a;
        int i2 = 0;
        while (i2 < iArr.length) {
            iArr[i2] = bigEndianToInt(bArr, i);
            i += 4;
            i2++;
            if (z) {
                return;
            }
        }
    }

    public static void bigEndianToLong(byte[] bArr, int i, long[] jArr) {
        boolean z = a;
        int i2 = 0;
        while (i2 < jArr.length) {
            jArr[i2] = bigEndianToLong(bArr, i);
            i += 8;
            i2++;
            if (z) {
                return;
            }
        }
    }

    public static void intToBigEndian(int[] iArr, byte[] bArr, int i) {
        boolean z = a;
        int i2 = 0;
        while (i2 < iArr.length) {
            intToBigEndian(iArr[i2], bArr, i);
            i += 4;
            i2++;
            if (z) {
                return;
            }
        }
    }
}
