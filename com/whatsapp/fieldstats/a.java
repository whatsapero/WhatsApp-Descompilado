package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum a {
    ;
    public static final a ERROR_FAILED;
    public static final a SUCCESS;
    public static final a TIME_EXPIRED;
    public static final a USER_STOPPED;
    private static final a[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    private a(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[4];
        String str = "<9\bF!<?";
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
                        i4 = 111;
                        break;
                    case ay.f /*1*/:
                        i4 = 108;
                        break;
                    case ay.n /*2*/:
                        i4 = 75;
                        break;
                    case ay.p /*3*/:
                        i4 = 5;
                        break;
                    default:
                        i4 = 100;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "*>\u0019J60*\nL(*(";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = ":?\u000eW;<8\u0004U4*(";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SUCCESS = new a(z[0], 0, 1);
                    USER_STOPPED = new a(z[3], 1, 2);
                    TIME_EXPIRED = new a(z[1], 2, 3);
                    ERROR_FAILED = new a(z[2], 3, 4);
                    b = new a[]{SUCCESS, USER_STOPPED, TIME_EXPIRED, ERROR_FAILED};
                default:
                    strArr2[i2] = str;
                    str = ";%\u0006@;*4\u001bL6*(";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
