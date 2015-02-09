package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum af {
    ;
    public static final af CANCEL;
    public static final af DID_NOT_REQUEST;
    public static final af FAILED;
    public static final af OK;
    private static final af[] b;
    private static final String[] z;
    private final int a;

    private af(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[4];
        String str = "5\u0007Frn7";
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
                        i4 = 115;
                        break;
                    case ay.f /*1*/:
                        i4 = 70;
                        break;
                    case ay.n /*2*/:
                        i4 = 15;
                        break;
                    case ay.p /*3*/:
                        i4 = 62;
                        break;
                    default:
                        i4 = 43;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "0\u0007A}n?";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "7\u000fKae<\u0012Pln\"\u0013Jm\u007f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new af(z[1], 0, 1);
                    CANCEL = new af(z[2], 1, 2);
                    DID_NOT_REQUEST = new af(z[3], 2, 3);
                    FAILED = new af(z[0], 3, 4);
                    b = new af[]{OK, CANCEL, DID_NOT_REQUEST, FAILED};
                default:
                    strArr2[i2] = str;
                    str = "<\r";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
