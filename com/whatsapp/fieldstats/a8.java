package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum a8 {
    ;
    public static final a8 ERROR_UNKNOWN;
    public static final a8 OK;
    public static final a8 OK_AFTER_RETRY;
    private static final a8[] b;
    private static final String[] z;
    private final int a;

    private a8(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[3];
        String str = "Ny";
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
                        i4 = 1;
                        break;
                    case ay.f /*1*/:
                        i4 = 50;
                        break;
                    case ay.n /*2*/:
                        i4 = 24;
                        break;
                    case ay.p /*3*/:
                        i4 = 94;
                        break;
                    default:
                        i4 = 92;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "NyG\u001f\u001aUwJ\u0001\u000eDfJ\u0007";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new a8(z[0], 0, 1);
                    OK_AFTER_RETRY = new a8(z[2], 1, 2);
                    ERROR_UNKNOWN = new a8(z[1], 2, 3);
                    b = new a8[]{OK, OK_AFTER_RETRY, ERROR_UNKNOWN};
                default:
                    strArr2[i2] = str;
                    str = "D`J\u0011\u000e^gV\u0015\u0012NeV";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
