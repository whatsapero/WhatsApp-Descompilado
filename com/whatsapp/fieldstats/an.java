package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum an {
    ;
    public static final an BROADCAST;
    public static final an GROUP;
    public static final an INDIVIDUAL;
    private static final an[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[3];
        String str = "K<%dyK64lc";
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
                        i4 = 2;
                        break;
                    case ay.f /*1*/:
                        i4 = 114;
                        break;
                    case ay.n /*2*/:
                        i4 = 97;
                        break;
                    case ay.p /*3*/:
                        i4 = 45;
                        break;
                    default:
                        i4 = 47;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "@ .lkA32y";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    INDIVIDUAL = new an(z[0], 0, 1);
                    GROUP = new an(z[1], 1, 2);
                    BROADCAST = new an(z[2], 2, 3);
                    b = new an[]{INDIVIDUAL, GROUP, BROADCAST};
                default:
                    strArr2[i2] = str;
                    str = "E .x\u007f";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.a;
    }

    private an(int i) {
        this.a = i;
    }
}
