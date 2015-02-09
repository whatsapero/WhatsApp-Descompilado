package com.whatsapp.gallerypicker;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum bq {
    ;
    public static final bq ALL;
    public static final bq EXTERNAL;
    public static final bq INTERNAL;
    public static final bq NONE;
    private static final bq[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "1\u0005y\u001a";
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
                        i4 = 127;
                        break;
                    case ay.f /*1*/:
                        i4 = 74;
                        break;
                    case ay.n /*2*/:
                        i4 = 55;
                        break;
                    case ay.p /*3*/:
                        i4 = 95;
                        break;
                    default:
                        i4 = 99;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = ":\u0012c\u001a11\u000b{";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = ">\u0006{";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NONE = new bq(z[0], 0);
                    INTERNAL = new bq(z[1], 1);
                    EXTERNAL = new bq(z[2], 2);
                    ALL = new bq(z[3], 3);
                    a = new bq[]{NONE, INTERNAL, EXTERNAL, ALL};
                default:
                    strArr2[i2] = str;
                    str = "6\u0004c\u001a11\u000b{";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
