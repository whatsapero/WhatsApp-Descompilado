package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum b0 {
    ;
    public static final b0 AUTO;
    public static final b0 BYTE;
    public static final b0 NUMERIC;
    public static final b0 TEXT;
    public static int b;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "\u0003\u001bF1";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 66;
                        break;
                    case ay.f /*1*/:
                        i4 = 78;
                        break;
                    case ay.n /*2*/:
                        i4 = 18;
                        break;
                    case ay.p /*3*/:
                        i4 = 126;
                        break;
                    default:
                        i4 = 31;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\f\u001b_;M\u000b\r";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u0000\u0017F;";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    AUTO = new b0(z[0], 0);
                    TEXT = new b0(z[1], 1);
                    BYTE = new b0(z[3], 2);
                    NUMERIC = new b0(z[2], 3);
                    a = new b0[]{AUTO, TEXT, BYTE, NUMERIC};
                default:
                    strArr2[i2] = str;
                    str = "\u0016\u000bJ*";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
