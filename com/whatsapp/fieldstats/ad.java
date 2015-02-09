package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum ad {
    ;
    public static final ad BKG_FETCH;
    public static final ad BKG_NOTIFICATION;
    public static final ad USER;
    private static final ad[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    private ad(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[3];
        String str = "cQcm";
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
                        i4 = 54;
                        break;
                    case ay.f /*1*/:
                        i4 = 2;
                        break;
                    case ay.n /*2*/:
                        i4 = 38;
                        break;
                    case ay.p /*3*/:
                        i4 = 63;
                        break;
                    default:
                        i4 = 7;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "tIa`AsVew";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    USER = new ad(z[0], 0, 1);
                    BKG_NOTIFICATION = new ad(z[1], 1, 2);
                    BKG_FETCH = new ad(z[2], 2, 3);
                    b = new ad[]{USER, BKG_NOTIFICATION, BKG_FETCH};
                default:
                    strArr2[i2] = str;
                    str = "tIa`IyVoyNuCrvHx";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
