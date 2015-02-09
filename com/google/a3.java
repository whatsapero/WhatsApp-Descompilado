package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum a3 {
    ;
    public static final a3 EXACT_GROUPING;
    public static final a3 POSSIBLE;
    public static final a3 STRICT_GROUPING;
    public static final a3 VALID;
    private static final a3[] a;
    private static final String[] z;

    abstract boolean a(ft ftVar, String str, c8 c8Var);

    static {
        String[] strArr = new String[4];
        String str = "\u0003F\f1!\u0011E\u001a";
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
                        i4 = 83;
                        break;
                    case ay.f /*1*/:
                        i4 = 9;
                        break;
                    case ay.n /*2*/:
                        i4 = 95;
                        break;
                    case ay.p /*3*/:
                        i4 = 98;
                        break;
                    default:
                        i4 = 104;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0005H\u0013+,";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u0016Q\u001e!<\fN\r-=\u0003@\u0011%";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    POSSIBLE = new a8(z[0], 0);
                    VALID = new am(z[2], 1);
                    STRICT_GROUPING = new an(z[1], 2);
                    EXACT_GROUPING = new af(z[3], 3);
                    a = new a3[]{POSSIBLE, VALID, STRICT_GROUPING, EXACT_GROUPING};
                default:
                    strArr2[i2] = str;
                    str = "\u0000]\r++\u0007V\u00180'\u0006Y\u0016,/";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    a3(d5 d5Var) {
        this(r1, r2);
    }
}
