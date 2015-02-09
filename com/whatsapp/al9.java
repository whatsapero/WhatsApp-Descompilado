package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum al9 {
    ;
    public static final al9 BOTH;
    public static final al9 LEFT;
    public static final al9 NONE;
    public static final al9 RIGHT;
    private static final al9[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "':\u001f0";
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
                        i4 = 105;
                        break;
                    case ay.f /*1*/:
                        i4 = 117;
                        break;
                    case ay.n /*2*/:
                        i4 = 81;
                        break;
                    case ay.p /*3*/:
                        i4 = 117;
                        break;
                    default:
                        i4 = 25;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = ";<\u0016=M";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "+:\u0005=";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NONE = new al9(z[0], 0);
                    LEFT = new al9(z[1], 1);
                    RIGHT = new al9(z[2], 2);
                    BOTH = new al9(z[3], 3);
                    a = new al9[]{NONE, LEFT, RIGHT, BOTH};
                default:
                    strArr2[i2] = str;
                    str = "%0\u0017!";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
