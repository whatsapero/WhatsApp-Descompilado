package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

enum ak {
    ;
    public static final ak DONE;
    public static final ak NOT_READY;
    public static final ak READY;
    private static final ak[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\n\u0000\u000b1\u001c\u0001\u000e\u001b7";
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
                        i4 = 68;
                        break;
                    case ay.f /*1*/:
                        i4 = 79;
                        break;
                    case ay.n /*2*/:
                        i4 = 95;
                        break;
                    case ay.p /*3*/:
                        i4 = 110;
                        break;
                    default:
                        i4 = 78;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0016\n\u001e*\u0017";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NOT_READY = new ak(z[0], 0);
                    READY = new ak(z[2], 1);
                    DONE = new ak(z[1], 2);
                    a = new ak[]{NOT_READY, READY, DONE};
                default:
                    strArr2[i2] = str;
                    str = "\u0000\u0000\u0011+";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
