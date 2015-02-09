package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

abstract class GCMUtil {
    private static final int E1 = -520093696;
    private static final byte E1B = (byte) -31;
    private static final long E1L = 63331869759897600L;
    private static final int[] LOOKUP;

    static void asBytes(int[] iArr, byte[] bArr) {
        Pack.intToBigEndian(iArr, bArr, 0);
    }

    static int[] oneAsInts() {
        int[] iArr = new int[4];
        iArr[0] = Integer.MIN_VALUE;
        return iArr;
    }

    static void xor(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] ^ jArr2[0];
        jArr[1] = jArr[1] ^ jArr2[1];
    }

    static void multiplyP8(int[] iArr) {
        int shiftRightN = shiftRightN(iArr, 8);
        iArr[0] = LOOKUP[shiftRightN >>> 24] ^ iArr[0];
    }

    static long[] oneAsLongs() {
        long[] jArr = new long[2];
        jArr[0] = Long.MIN_VALUE;
        return jArr;
    }

    static long shiftRight(long[] jArr) {
        long j = jArr[0];
        jArr[0] = j >>> 1;
        j <<= 63;
        long j2 = jArr[1];
        jArr[1] = j | (j2 >>> 1);
        return j2 << 63;
    }

    static byte[] oneAsBytes() {
        byte[] bArr = new byte[16];
        bArr[0] = Byte.MIN_VALUE;
        return bArr;
    }

    static void xor(int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[0] = iArr[0] ^ iArr2[0];
        iArr3[1] = iArr[1] ^ iArr2[1];
        iArr3[2] = iArr[2] ^ iArr2[2];
        iArr3[3] = iArr[3] ^ iArr2[3];
    }

    static void xor(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = 0;
        do {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
        } while (i < 16);
    }

    static int shiftRightN(int[] iArr, int i, int[] iArr2) {
        int i2 = iArr[0];
        int i3 = 32 - i;
        iArr2[0] = i2 >>> i;
        i2 <<= i3;
        int i4 = iArr[1];
        iArr2[1] = i2 | (i4 >>> i);
        i2 = i4 << i3;
        i4 = iArr[2];
        iArr2[2] = i2 | (i4 >>> i);
        i2 = i4 << i3;
        i4 = iArr[3];
        iArr2[3] = i2 | (i4 >>> i);
        return i4 << i3;
    }

    static byte shiftRight(byte[] bArr, byte[] bArr2) {
        boolean z = false;
        boolean z2 = Tables8kGCMMultiplier.a;
        int i = 0;
        int i2 = 0;
        do {
            int i3 = bArr[i2] & 255;
            int i4 = i2 + 1;
            bArr2[i2] = (byte) (i | (i3 >>> 1));
            i = (i3 & 1) << 7;
            i2 = bArr[i4] & 255;
            i3 = i4 + 1;
            bArr2[i4] = (byte) (i | (i2 >>> 1));
            i = (i2 & 1) << 7;
            i2 = bArr[i3] & 255;
            i4 = i3 + 1;
            bArr2[i3] = (byte) (i | (i2 >>> 1));
            i = (i2 & 1) << 7;
            i3 = bArr[i4] & 255;
            i2 = i4 + 1;
            bArr2[i4] = (byte) (i | (i3 >>> 1));
            i = (i3 & 1) << 7;
        } while (i2 < 16);
        byte b = (byte) i;
        if (z2) {
            if (!BaseKeyGenerator.a) {
                z = true;
            }
            BaseKeyGenerator.a = z;
        }
        return b;
    }

    static void multiply(long[] jArr, long[] jArr2) {
        boolean z = Tables8kGCMMultiplier.a;
        long[] jArr3 = new long[]{jArr[0], jArr[1]};
        long[] jArr4 = new long[2];
        int i = 0;
        while (i < 2) {
            long j = jArr2[i];
            int i2 = 63;
            while (i2 >= 0) {
                if (((1 << i2) & j) != 0) {
                    xor(jArr4, jArr3);
                }
                if (shiftRight(jArr3) != 0) {
                    jArr3[0] = jArr3[0] ^ E1L;
                }
                i2--;
                if (z) {
                    break;
                }
            }
            i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        jArr[0] = jArr4[0];
        jArr[1] = jArr4[1];
    }

    static void xor(int[] iArr, int[] iArr2) {
        iArr[0] = iArr[0] ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
        iArr[2] = iArr[2] ^ iArr2[2];
        iArr[3] = iArr[3] ^ iArr2[3];
    }

    static void xor(byte[] bArr, byte[] bArr2, int i, int i2) {
        boolean z = Tables8kGCMMultiplier.a;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                bArr[i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
                if (!z) {
                    i2 = i3;
                } else {
                    return;
                }
            }
            return;
        }
    }

    static long[] asLongs(byte[] bArr) {
        long[] jArr = new long[2];
        Pack.bigEndianToLong(bArr, 0, jArr);
        return jArr;
    }

    static int shiftRight(int[] iArr) {
        int i = iArr[0];
        iArr[0] = i >>> 1;
        i <<= 31;
        int i2 = iArr[1];
        iArr[1] = i | (i2 >>> 1);
        i = i2 << 31;
        i2 = iArr[2];
        iArr[2] = i | (i2 >>> 1);
        i = i2 << 31;
        i2 = iArr[3];
        iArr[3] = i | (i2 >>> 1);
        return i2 << 31;
    }

    static void xor(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
    }

    static byte[] asBytes(int[] iArr) {
        byte[] bArr = new byte[16];
        Pack.intToBigEndian(iArr, bArr, 0);
        return bArr;
    }

    static void multiply(int[] iArr, int[] iArr2) {
        boolean z = Tables8kGCMMultiplier.a;
        int[] clone = Arrays.clone(iArr);
        int[] iArr3 = new int[4];
        int i = 0;
        while (i < 4) {
            int i2 = iArr2[i];
            int i3 = 31;
            while (i3 >= 0) {
                if (((1 << i3) & i2) != 0) {
                    xor(iArr3, clone);
                }
                if (shiftRight(clone) != 0) {
                    clone[0] = clone[0] ^ E1;
                }
                i3--;
                if (z) {
                    break;
                }
            }
            i3 = i + 1;
            if (z) {
                break;
            }
            i = i3;
        }
        System.arraycopy(iArr3, 0, iArr, 0, 4);
    }

    static {
        LOOKUP = generateLookup();
    }

    private static int[] generateLookup() {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            int i2 = 0;
            for (int i3 = 7; i3 >= 0; i3--) {
                if (((1 << i3) & i) != 0) {
                    i2 ^= E1 >>> (7 - i3);
                }
            }
            iArr[i] = i2;
        }
        return iArr;
    }

    static void asInts(byte[] bArr, int[] iArr) {
        Pack.bigEndianToInt(bArr, 0, iArr);
    }

    static int shiftRightN(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = 32 - i;
        iArr[0] = i2 >>> i;
        i2 <<= i3;
        int i4 = iArr[1];
        iArr[1] = i2 | (i4 >>> i);
        i2 = i4 << i3;
        i4 = iArr[2];
        iArr[2] = i2 | (i4 >>> i);
        i2 = i4 << i3;
        i4 = iArr[3];
        iArr[3] = i2 | (i4 >>> i);
        return i4 << i3;
    }

    static byte[] asBytes(long[] jArr) {
        byte[] bArr = new byte[16];
        Pack.longToBigEndian(jArr, bArr, 0);
        return bArr;
    }

    static int shiftRight(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        iArr2[0] = i >>> 1;
        i <<= 31;
        int i2 = iArr[1];
        iArr2[1] = i | (i2 >>> 1);
        i = i2 << 31;
        i2 = iArr[2];
        iArr2[2] = i | (i2 >>> 1);
        i = i2 << 31;
        i2 = iArr[3];
        iArr2[3] = i | (i2 >>> 1);
        return i2 << 31;
    }

    static long shiftRight(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        jArr2[0] = j >>> 1;
        j <<= 63;
        long j2 = jArr[1];
        jArr2[1] = j | (j2 >>> 1);
        return j2 << 63;
    }

    static void xor(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
        } while (i < 16);
    }

    static void multiply(byte[] bArr, byte[] bArr2) {
        boolean z = Tables8kGCMMultiplier.a;
        byte[] clone = Arrays.clone(bArr);
        byte[] bArr3 = new byte[16];
        int i = 0;
        while (i < 16) {
            byte b = bArr2[i];
            int i2 = 7;
            while (i2 >= 0) {
                if (((1 << i2) & b) != 0) {
                    xor(bArr3, clone);
                }
                if (shiftRight(clone) != null) {
                    clone[0] = (byte) (clone[0] ^ -31);
                }
                i2--;
                if (z) {
                    break;
                }
            }
            i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        System.arraycopy(bArr3, 0, bArr, 0, 16);
    }

    static void multiplyP(int[] iArr, int[] iArr2) {
        if (shiftRight(iArr, iArr2) != 0) {
            iArr2[0] = iArr2[0] ^ E1;
        }
    }

    static byte shiftRight(byte[] bArr) {
        boolean z = false;
        boolean z2 = Tables8kGCMMultiplier.a;
        int i = 0;
        int i2 = 0;
        do {
            int i3 = bArr[i2] & 255;
            int i4 = i2 + 1;
            bArr[i2] = (byte) (i | (i3 >>> 1));
            i = (i3 & 1) << 7;
            i2 = bArr[i4] & 255;
            i3 = i4 + 1;
            bArr[i4] = (byte) (i | (i2 >>> 1));
            i = (i2 & 1) << 7;
            i2 = bArr[i3] & 255;
            i4 = i3 + 1;
            bArr[i3] = (byte) (i | (i2 >>> 1));
            i = (i2 & 1) << 7;
            i3 = bArr[i4] & 255;
            i2 = i4 + 1;
            bArr[i4] = (byte) (i | (i3 >>> 1));
            i = (i3 & 1) << 7;
        } while (i2 < 16);
        byte b = (byte) i;
        if (BaseKeyGenerator.a) {
            if (!z2) {
                z = true;
            }
            Tables8kGCMMultiplier.a = z;
        }
        return b;
    }

    static void multiplyP8(int[] iArr, int[] iArr2) {
        int shiftRightN = shiftRightN(iArr, 8, iArr2);
        iArr2[0] = LOOKUP[shiftRightN >>> 24] ^ iArr2[0];
    }

    static void asBytes(long[] jArr, byte[] bArr) {
        Pack.longToBigEndian(jArr, bArr, 0);
    }

    static void multiplyP(int[] iArr) {
        if (shiftRight(iArr) != 0) {
            iArr[0] = iArr[0] ^ E1;
        }
    }

    GCMUtil() {
    }

    static void asLongs(byte[] bArr, long[] jArr) {
        Pack.bigEndianToLong(bArr, 0, jArr);
    }

    static int[] asInts(byte[] bArr) {
        int[] iArr = new int[4];
        Pack.bigEndianToInt(bArr, 0, iArr);
        return iArr;
    }
}
