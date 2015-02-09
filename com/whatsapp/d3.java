package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

enum d3 {
    ;
    public static final d3 MAX;
    public static final d3 MID;
    public static final d3 MIN;
    private static final d3[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "!z:";
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
                        i4 = 59;
                        break;
                    case ay.n /*2*/:
                        i4 = 98;
                        break;
                    case ay.p /*3*/:
                        i4 = 48;
                        break;
                    default:
                        i4 = 112;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "!r&";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    MIN = new d3(z[1], 0);
                    MAX = new d3(z[0], 1);
                    MID = new d3(z[2], 2);
                    a = new d3[]{MIN, MAX, MID};
                default:
                    strArr2[i2] = str;
                    str = "!r,";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
