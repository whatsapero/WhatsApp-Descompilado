package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum t {
    ;
    public static final t ERROR_UNKNOWN;
    public static final t OK;
    public static final t TIMEOUT;
    private static final t[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    private t(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[3];
        String str = "\\<T\u001f$]!";
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
                        i4 = 8;
                        break;
                    case ay.f /*1*/:
                        i4 = 117;
                        break;
                    case ay.n /*2*/:
                        i4 = 25;
                        break;
                    case ay.p /*3*/:
                        i4 = 90;
                        break;
                    default:
                        i4 = 107;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "M'K\u00159W W\u0011%G\"W";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new t(z[1], 0, 1);
                    TIMEOUT = new t(z[0], 1, 2);
                    ERROR_UNKNOWN = new t(z[2], 2, 3);
                    b = new t[]{OK, TIMEOUT, ERROR_UNKNOWN};
                default:
                    strArr2[i2] = str;
                    str = "G>";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
