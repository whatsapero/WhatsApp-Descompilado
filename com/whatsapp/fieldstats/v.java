package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum v {
    ;
    public static final v NO_TIMESTAMP;
    public static final v PARSE;
    public static final v TIME_SHIFT;
    public static final v TOO_OLD;
    private static final v[] a;
    private static final String[] z;
    private final int b;

    private v(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[4];
        String str = "c($\t[`\"(\tS`7";
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
                        i4 = 45;
                        break;
                    case ay.f /*1*/:
                        i4 = 103;
                        break;
                    case ay.n /*2*/:
                        i4 = 123;
                        break;
                    case ay.p /*3*/:
                        i4 = 93;
                        break;
                    default:
                        i4 = 18;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "}&)\u000eW";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "y(4\u0002]a#";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NO_TIMESTAMP = new v(z[0], 0, 1);
                    TIME_SHIFT = new v(z[1], 1, 2);
                    TOO_OLD = new v(z[3], 2, 4);
                    PARSE = new v(z[2], 3, 3);
                    a = new v[]{NO_TIMESTAMP, TIME_SHIFT, TOO_OLD, PARSE};
                default:
                    strArr2[i2] = str;
                    str = "y.6\u0018M~/2\u001bF";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
