package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

enum n3 {
    ;
    public static final n3 AGREE_1;
    public static final n3 AGREE_2;
    public static final n3 AGREE_NONE;
    private static final n3[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\r4\u001f7\u0001\u0013=\u0002<\u0001";
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
                        i4 = 76;
                        break;
                    case ay.f /*1*/:
                        i4 = 115;
                        break;
                    case ay.n /*2*/:
                        i4 = 77;
                        break;
                    case ay.p /*3*/:
                        i4 = 114;
                        break;
                    default:
                        i4 = 68;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\r4\u001f7\u0001\u0013A";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    AGREE_NONE = new n3(z[0], 0);
                    AGREE_1 = new n3(z[1], 1);
                    AGREE_2 = new n3(z[2], 2);
                    a = new n3[]{AGREE_NONE, AGREE_1, AGREE_2};
                default:
                    strArr2[i2] = str;
                    str = "\r4\u001f7\u0001\u0013B";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
