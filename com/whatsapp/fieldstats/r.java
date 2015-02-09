package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum r {
    ;
    public static final r DUPLICATE;
    public static final r ERROR_REQUEST;
    public static final r ERROR_UNKNOWN;
    public static final r ERROR_UPLOAD;
    public static final r OK;
    private static final r[] b;
    private static final String[] z;
    private final int a;

    private r(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[5];
        String str = "\u0010\u0018J\u0005\u000b\n\u001fH\u0006\u0016\u0014\u000e";
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
                        i4 = 85;
                        break;
                    case ay.f /*1*/:
                        i4 = 74;
                        break;
                    case ay.n /*2*/:
                        i4 = 24;
                        break;
                    case ay.p /*3*/:
                        i4 = 74;
                        break;
                    default:
                        i4 = 89;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0010\u0018J\u0005\u000b\n\u001fV\u0001\u0017\u001a\u001dV";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u0010\u0018J\u0005\u000b\n\u0018]\u001b\f\u0010\u0019L";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u001a\u0001";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new r(z[4], 0, 1);
                    DUPLICATE = new r(z[1], 1, 3);
                    ERROR_UNKNOWN = new r(z[2], 2, 2);
                    ERROR_REQUEST = new r(z[3], 3, 4);
                    ERROR_UPLOAD = new r(z[0], 4, 5);
                    b = new r[]{OK, DUPLICATE, ERROR_UNKNOWN, ERROR_REQUEST, ERROR_UPLOAD};
                default:
                    strArr2[i2] = str;
                    str = "\u0011\u001fH\u0006\u0010\u0016\u000bL\u000f";
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
}
