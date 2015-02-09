package org.spongycastle.util;

import java.math.BigInteger;

public final class Arrays {
    public static long[] clone(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    public static long[] clone(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 == null || jArr2.length != jArr.length) {
            return clone(jArr);
        }
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        return jArr2;
    }

    public static byte[] clone(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int[] clone(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    private Arrays() {
    }

    public static byte[][][] clone(byte[][][] bArr) {
        boolean z = Pack.a;
        if (bArr == null) {
            return (byte[][][]) null;
        }
        byte[][][] bArr2 = new byte[bArr.length][][];
        int i = 0;
        while (i != bArr2.length) {
            bArr2[i] = clone(bArr[i]);
            i++;
            if (z) {
                break;
            }
        }
        return bArr2;
    }

    public static byte[] clone(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return null;
        }
        if (bArr2 == null || bArr2.length != bArr.length) {
            return clone(bArr);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        return bArr2;
    }

    public static void fill(byte[] bArr, byte b) {
        boolean z = Pack.a;
        int i = 0;
        while (i < bArr.length) {
            bArr[i] = b;
            i++;
            if (z) {
                return;
            }
        }
    }

    public static BigInteger[] clone(BigInteger[] bigIntegerArr) {
        if (bigIntegerArr == null) {
            return null;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[bigIntegerArr.length];
        System.arraycopy(bigIntegerArr, 0, bigIntegerArr2, 0, bigIntegerArr.length);
        return bigIntegerArr2;
    }

    public static boolean areEqual(byte[] bArr, byte[] bArr2) {
        boolean z = Pack.a;
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        while (i != bArr.length) {
            if (bArr[i] == bArr2[i]) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean constantTimeAreEqual(byte[] bArr, byte[] bArr2) {
        boolean z = Pack.a;
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        while (i != bArr.length) {
            i2 |= bArr[i] ^ bArr2[i];
            i++;
            if (z) {
                break;
            }
        }
        return i2 == 0;
    }

    public static byte[][] clone(byte[][] bArr) {
        boolean z = Pack.a;
        if (bArr == null) {
            return (byte[][]) null;
        }
        byte[][] bArr2 = new byte[bArr.length][];
        int i = 0;
        while (i != bArr2.length) {
            bArr2[i] = clone(bArr[i]);
            i++;
            if (z) {
                break;
            }
        }
        return bArr2;
    }

    public static short[] clone(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        short[] sArr2 = new short[sArr.length];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    public static boolean areEqual(int[] iArr, int[] iArr2) {
        boolean z = Pack.a;
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        int i = 0;
        while (i != iArr.length) {
            if (iArr[i] == iArr2[i]) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        return true;
    }
}
