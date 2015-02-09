package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum et {
    ;
    public static final et INVALID_COUNTRY_CODE;
    public static final et NOT_A_NUMBER;
    public static final et TOO_LONG;
    public static final et TOO_SHORT_AFTER_IDD;
    public static final et TOO_SHORT_NSN;
    private static final et[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "v)<^dg(=Lg}4";
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
                        i4 = 56;
                        break;
                    case ay.f /*1*/:
                        i4 = 102;
                        break;
                    case ay.n /*2*/:
                        i4 = 104;
                        break;
                    case ay.p /*3*/:
                        i4 = 1;
                        break;
                    default:
                        i4 = 37;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "l)'^vp):Uzv5&";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "l)'^iw(/";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "q(>@iq\"7Bjm(<S|g%'E`";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    INVALID_COUNTRY_CODE = new et(z[4], 0);
                    NOT_A_NUMBER = new et(z[0], 1);
                    TOO_SHORT_AFTER_IDD = new et(z[1], 2);
                    TOO_SHORT_NSN = new et(z[2], 3);
                    TOO_LONG = new et(z[3], 4);
                    a = new et[]{INVALID_COUNTRY_CODE, NOT_A_NUMBER, TOO_SHORT_AFTER_IDD, TOO_SHORT_NSN, TOO_LONG};
                default:
                    strArr2[i2] = str;
                    str = "l)'^vp):Uzy <Dwg/,E";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
