package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum b8 {
    ;
    public static final b8 EMAIL;
    public static final b8 SELF;
    public static final b8 SMS;
    public static final b8 VOICE;
    private static final b8[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[4];
        String str = "\u000f?2rv";
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
                        i4 = 112;
                        break;
                    case ay.n /*2*/:
                        i4 = 123;
                        break;
                    case ay.p /*3*/:
                        i4 = 49;
                        break;
                    default:
                        i4 = 51;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\n57w";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u001c=:x\u007f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SMS = new b8(z[1], 0, 1);
                    VOICE = new b8(z[0], 1, 2);
                    EMAIL = new b8(z[3], 2, 3);
                    SELF = new b8(z[2], 3, 4);
                    a = new b8[]{SMS, VOICE, EMAIL, SELF};
                default:
                    strArr2[i2] = str;
                    str = "\n=(";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private b8(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }
}
