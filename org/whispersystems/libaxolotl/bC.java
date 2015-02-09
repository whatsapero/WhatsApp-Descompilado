package org.whispersystems.libaxolotl;

public class bC {
    private static final char[] a;

    private static void a(StringBuffer stringBuffer, int i) {
        stringBuffer.append(a[(i >> 4) & 15]);
        stringBuffer.append(a[i & 15]);
    }

    public static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    static {
        a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static String a(byte[] bArr, int i, int i2) {
        int i3 = aE.a;
        StringBuffer stringBuffer = new StringBuffer();
        int i4 = 0;
        while (i4 < i2) {
            a(stringBuffer, bArr[i + i4]);
            stringBuffer.append(" ");
            i4++;
            if (i3 != 0) {
                break;
            }
        }
        return stringBuffer.toString();
    }
}
