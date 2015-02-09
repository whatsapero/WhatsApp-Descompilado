package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum e8 {
    ;
    public static final e8 EXACT_MATCH;
    public static final e8 NOT_A_NUMBER;
    public static final e8 NO_MATCH;
    public static final e8 NSN_MATCH;
    public static final e8 SHORT_NSN_MATCH;
    private static final e8[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "\"9a\u0015a->l\u0002";
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
                        i4 = 108;
                        break;
                    case ay.f /*1*/:
                        i4 = 106;
                        break;
                    case ay.n /*2*/:
                        i4 = 47;
                        break;
                    case ay.p /*3*/:
                        i4 = 74;
                        break;
                    default:
                        i4 = 44;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "?\"`\u0018x3$|\u0004s!+{\td";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\"%{\u0015m3$z\u0007n)8";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\"%p\u0007m8)g";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NOT_A_NUMBER = new e8(z[3], 0);
                    NO_MATCH = new e8(z[4], 1);
                    SHORT_NSN_MATCH = new e8(z[2], 2);
                    NSN_MATCH = new e8(z[0], 3);
                    EXACT_MATCH = new e8(z[1], 4);
                    a = new e8[]{NOT_A_NUMBER, NO_MATCH, SHORT_NSN_MATCH, NSN_MATCH, EXACT_MATCH};
                default:
                    strArr2[i2] = str;
                    str = ")2n\tx3'n\u001eo$";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
