package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum az {
    ;
    public static final az BB_BES;
    public static final az BB_BIS;
    public static final az DIRECT;
    public static final az WAP;
    private static final az[] a;
    private static final String[] z;
    private final int b;

    private az(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[4];
        String str = "4G,4T$";
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
                        i4 = 112;
                        break;
                    case ay.f /*1*/:
                        i4 = 14;
                        break;
                    case ay.n /*2*/:
                        i4 = 126;
                        break;
                    case ay.p /*3*/:
                        i4 = 113;
                        break;
                    default:
                        i4 = 23;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "2L!3R#";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "2L!3^#";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    DIRECT = new az(z[0], 0, 0);
                    WAP = new az(z[1], 1, 1);
                    BB_BIS = new az(z[3], 2, 2);
                    BB_BES = new az(z[2], 3, 3);
                    a = new az[]{DIRECT, WAP, BB_BIS, BB_BES};
                default:
                    strArr2[i2] = str;
                    str = "'O.";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
