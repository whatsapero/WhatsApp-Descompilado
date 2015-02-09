package com.whatsapp.wallpaper;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

enum c {
    ;
    public static final c Grow;
    public static final c Move;
    public static final c None;
    private static final c[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u007f=\fW";
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
                        i4 = 49;
                        break;
                    case ay.f /*1*/:
                        i4 = 82;
                        break;
                    case ay.n /*2*/:
                        i4 = 98;
                        break;
                    case ay.p /*3*/:
                        i4 = 50;
                        break;
                    default:
                        i4 = 36;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "v \rE";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    None = new c(z[0], 0);
                    Move = new c(z[1], 1);
                    Grow = new c(z[2], 2);
                    a = new c[]{None, Move, Grow};
                default:
                    strArr2[i2] = str;
                    str = "|=\u0014W";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
