package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum ed {
    ;
    public static final ed FAILED;
    public static final ed SUCCESS_CREATED;
    public static final ed SUCCESS_RESTORED;
    private static final ed[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "(0g{D(6{{S>$p}E";
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
                        i4 = 123;
                        break;
                    case ay.f /*1*/:
                        i4 = 101;
                        break;
                    case ay.n /*2*/:
                        i4 = 36;
                        break;
                    case ay.p /*3*/:
                        i4 = 56;
                        break;
                    default:
                        i4 = 1;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "=$mtD?";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    FAILED = new ed(z[2], 0);
                    SUCCESS_RESTORED = new ed(z[1], 1);
                    SUCCESS_CREATED = new ed(z[0], 2);
                    a = new ed[]{FAILED, SUCCESS_RESTORED, SUCCESS_CREATED};
                default:
                    strArr2[i2] = str;
                    str = "(0g{D(6{jD(1kjD?";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
