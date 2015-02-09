package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum ui {
    ;
    public static final ui AUTO_DETECTED;
    public static final ui RETRIED;
    public static final ui TAPPED_LINK;
    public static final ui TYPED;
    private static final ui[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "+\t#\u000bO";
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
                        i4 = 127;
                        break;
                    case ay.f /*1*/:
                        i4 = 80;
                        break;
                    case ay.n /*2*/:
                        i4 = 115;
                        break;
                    case ay.p /*3*/:
                        i4 = 78;
                        break;
                    default:
                        i4 = 11;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "-\u0015'\u001cB:\u0014";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = ">\u0005'\u0001T;\u0015'\u000bH+\u00157";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    TYPED = new ui(z[0], 0);
                    AUTO_DETECTED = new ui(z[3], 1);
                    TAPPED_LINK = new ui(z[1], 2);
                    RETRIED = new ui(z[2], 3);
                    a = new ui[]{TYPED, AUTO_DETECTED, TAPPED_LINK, RETRIED};
                default:
                    strArr2[i2] = str;
                    str = "+\u0011#\u001eN;\u000f?\u0007E4";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
