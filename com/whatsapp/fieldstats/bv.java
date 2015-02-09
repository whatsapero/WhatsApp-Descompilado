package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum bv {
    ;
    public static final bv EXISTING;
    public static final bv FROM_LIMBO;
    public static final bv NEW;
    public static final bv WIPED;
    private static final bv[] a;
    private static final String[] z;
    private final int b;

    private bv(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[4];
        String str = "Y&>K\u0004";
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
                        i4 = 14;
                        break;
                    case ay.f /*1*/:
                        i4 = 111;
                        break;
                    case ay.n /*2*/:
                        i4 = 110;
                        break;
                    case ay.p /*3*/:
                        i4 = 14;
                        break;
                    default:
                        i4 = 64;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "@*9";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "H=!C\u001fB&#L\u000f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NEW = new bv(z[2], 0, 1);
                    EXISTING = new bv(z[1], 1, 2);
                    FROM_LIMBO = new bv(z[3], 2, 3);
                    WIPED = new bv(z[0], 3, 4);
                    a = new bv[]{NEW, EXISTING, FROM_LIMBO, WIPED};
                default:
                    strArr2[i2] = str;
                    str = "K7']\u0014G!)";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
