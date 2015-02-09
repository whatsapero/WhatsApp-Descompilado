package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

enum e4 {
    ;
    public static final e4 BROADCAST;
    public static final e4 CALL;
    public static final e4 NORMAL;
    private static final e4[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u0017\u0004N<(\u0015";
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
                        i4 = 89;
                        break;
                    case ay.f /*1*/:
                        i4 = 75;
                        break;
                    case ay.n /*2*/:
                        i4 = 28;
                        break;
                    case ay.p /*3*/:
                        i4 = 113;
                        break;
                    default:
                        i4 = 105;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u001a\nP=";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NORMAL = new e4(z[0], 0);
                    BROADCAST = new e4(z[1], 1);
                    CALL = new e4(z[2], 2);
                    a = new e4[]{NORMAL, BROADCAST, CALL};
                default:
                    strArr2[i2] = str;
                    str = "\u001b\u0019S0-\u001a\nO%";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
