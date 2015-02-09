package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum df {
    ;
    public static final df FROM_DEFAULT_COUNTRY;
    public static final df FROM_NUMBER_WITHOUT_PLUS_SIGN;
    public static final df FROM_NUMBER_WITH_IDD;
    public static final df FROM_NUMBER_WITH_PLUS_SIGN;
    private static final df[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "9\u000f\u0012\tV1\b\u0010\u0006L-\u0002\n\r]7\u0002\r\b\\,\u0002\u000e\rN1";
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
                        i4 = 93;
                        break;
                    case ay.n /*2*/:
                        i4 = 93;
                        break;
                    case ay.p /*3*/:
                        i4 = 68;
                        break;
                    default:
                        i4 = 9;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "9\u000f\u0012\tV1\b\u0010\u0006L-\u0002\n\r]7\u0012\b\u0010V/\u0011\b\u0017V,\u0014\u001a\n";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "9\u000f\u0012\tV;\u0018\u001b\u0005\\3\t\u0002\u0007F*\u0013\t\u0016P";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    FROM_NUMBER_WITH_PLUS_SIGN = new df(z[0], 0);
                    FROM_NUMBER_WITH_IDD = new df(z[1], 1);
                    FROM_NUMBER_WITHOUT_PLUS_SIGN = new df(z[2], 2);
                    FROM_DEFAULT_COUNTRY = new df(z[3], 3);
                    a = new df[]{FROM_NUMBER_WITH_PLUS_SIGN, FROM_NUMBER_WITH_IDD, FROM_NUMBER_WITHOUT_PLUS_SIGN, FROM_DEFAULT_COUNTRY};
                default:
                    strArr2[i2] = str;
                    str = "9\u000f\u0012\tV1\b\u0010\u0006L-\u0002\n\r]7\u0002\u0014\u0000M";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
