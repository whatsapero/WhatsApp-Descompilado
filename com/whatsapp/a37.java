package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

enum a37 {
    ;
    public static final a37 BLUETOOTH;
    public static final a37 EARPIECE;
    public static final a37 HEADSET;
    public static final a37 SPEAKER;
    private static final a37[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = ";\f^oC;\u000eI";
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
                        i4 = 126;
                        break;
                    case ay.f /*1*/:
                        i4 = 77;
                        break;
                    case ay.n /*2*/:
                        i4 = 12;
                        break;
                    case ay.p /*3*/:
                        i4 = 63;
                        break;
                    default:
                        i4 = 10;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "<\u0001Yz^1\u0002Xw";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "-\u001dI~A;\u001f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    EARPIECE = new a37(z[0], 0);
                    HEADSET = new a37(z[1], 1);
                    SPEAKER = new a37(z[3], 2);
                    BLUETOOTH = new a37(z[2], 3);
                    a = new a37[]{EARPIECE, HEADSET, SPEAKER, BLUETOOTH};
                default:
                    strArr2[i2] = str;
                    str = "6\bM{Y;\u0019";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
