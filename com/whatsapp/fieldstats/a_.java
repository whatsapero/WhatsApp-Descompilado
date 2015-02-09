package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum a_ {
    ;
    public static final a_ CELLULAR;
    public static final a_ NONE;
    public static final a_ WIFI;
    private static final a_[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    private a_(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[3];
        String str = "&<MH";
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
                        i4 = 113;
                        break;
                    case ay.f /*1*/:
                        i4 = 117;
                        break;
                    case ay.n /*2*/:
                        i4 = 11;
                        break;
                    case ay.p /*3*/:
                        i4 = 1;
                        break;
                    default:
                        i4 = 83;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "20GM\u0006=4Y";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CELLULAR = new a_(z[2], 0, 1);
                    WIFI = new a_(z[0], 1, 2);
                    NONE = new a_(z[1], 2, 3);
                    a = new a_[]{CELLULAR, WIFI, NONE};
                default:
                    strArr2[i2] = str;
                    str = "?:ED";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
