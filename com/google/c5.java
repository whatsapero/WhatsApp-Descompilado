package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum c5 {
    ;
    public static final c5 E164;
    public static final c5 INTERNATIONAL;
    public static final c5 NATIONAL;
    public static final c5 RFC3966;
    private static final c5[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "k(o\u001c";
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
                        i4 = 46;
                        break;
                    case ay.f /*1*/:
                        i4 = 25;
                        break;
                    case ay.n /*2*/:
                        i4 = 89;
                        break;
                    case ay.p /*3*/:
                        i4 = 40;
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
                    str = "|_\u001a\u001b\u001c\u0018/";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "`X\raj`X\u0015";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    E164 = new c5(z[0], 0);
                    INTERNATIONAL = new c5(z[1], 1);
                    NATIONAL = new c5(z[3], 2);
                    RFC3966 = new c5(z[2], 3);
                    a = new c5[]{E164, INTERNATIONAL, NATIONAL, RFC3966};
                default:
                    strArr2[i2] = str;
                    str = "gW\rmw`X\raj`X\u0015";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
