package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum aa {
    ;
    public static final aa ERROR_MAX_RETRY;
    public static final aa ERROR_UNKNOWN;
    public static final aa OK;
    public static final aa OK_AFTER_RETRY;
    private static final aa[] b;
    private static final String[] z;
    private final int a;

    private aa(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[4];
        String str = "\u0006!=}F\u001c&!yZ\f$!";
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
                        i4 = 67;
                        break;
                    case ay.f /*1*/:
                        i4 = 115;
                        break;
                    case ay.n /*2*/:
                        i4 = 111;
                        break;
                    case ay.p /*3*/:
                        i4 = 50;
                        break;
                    default:
                        i4 = 20;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\f8";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\f80sR\u00176=mF\u0006'=k";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new aa(z[2], 0, 1);
                    OK_AFTER_RETRY = new aa(z[3], 1, 2);
                    ERROR_UNKNOWN = new aa(z[0], 2, 3);
                    ERROR_MAX_RETRY = new aa(z[1], 3, 4);
                    b = new aa[]{OK, OK_AFTER_RETRY, ERROR_UNKNOWN, ERROR_MAX_RETRY};
                default:
                    strArr2[i2] = str;
                    str = "\u0006!=}F\u001c>.jK\u00116;`M";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
