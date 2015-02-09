package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum o2 {
    ;
    public static final o2 CENTER_CROP;
    public static final o2 FIT_CENTER;
    public static final o2 FIT_HEIGHT;
    public static final o2 FIT_WIDTH;
    private static final o2[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "\u001babhy\u0018fbrh";
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
                        i4 = 93;
                        break;
                    case ay.f /*1*/:
                        i4 = 40;
                        break;
                    case ay.n /*2*/:
                        i4 = 54;
                        break;
                    case ay.p /*3*/:
                        i4 = 55;
                        break;
                    default:
                        i4 = 58;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u001babhm\u0014lb\u007f";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u001babhr\u0018aq\u007fn";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    FIT_CENTER = new o2(z[0], 0);
                    FIT_WIDTH = new o2(z[2], 1);
                    FIT_HEIGHT = new o2(z[3], 2);
                    CENTER_CROP = new o2(z[1], 3);
                    a = new o2[]{FIT_CENTER, FIT_WIDTH, FIT_HEIGHT, CENTER_CROP};
                default:
                    strArr2[i2] = str;
                    str = "\u001emxc\u007f\u000fwueu\r";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
