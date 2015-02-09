package org;

import java.io.UnsupportedEncodingException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class f {
    public static boolean a;
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "3*".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 9;
                    break;
                case ay.f /*1*/:
                    i2 = 10;
                    break;
                case ay.n /*2*/:
                    i2 = 103;
                    break;
                case ay.p /*3*/:
                    i2 = 102;
                    break;
                default:
                    i2 = 63;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\\^!K\u0007".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 9;
                    break;
                case ay.f /*1*/:
                    i2 = 10;
                    break;
                case ay.n /*2*/:
                    i2 = 103;
                    break;
                case ay.p /*3*/:
                    i2 = 102;
                    break;
                default:
                    i2 = 63;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public static String a(byte[] bArr) {
        return a(bArr, z[1]);
    }

    private static IllegalStateException a(String str, UnsupportedEncodingException unsupportedEncodingException) {
        return new IllegalStateException(new StringBuffer().append(str).append(z[0]).append(unsupportedEncodingException).toString());
    }

    public static String a(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            throw a(str, e);
        }
    }
}
