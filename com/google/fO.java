package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

enum fo {
    ;
    public static final fo AGGREGATES_ONLY;
    public static final fo ALL_SYMBOLS;
    public static final fo TYPES_ONLY;
    private static final fo[] a;
    private static final String[] z;

    static {
        int i;
        int i2;
        String[] strArr = new String[3];
        char[] toCharArray = " q[b\u001c&wHu\n>yR|\u0000".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 54;
                    break;
                case ay.n /*2*/:
                    i2 = 28;
                    break;
                case ay.p /*3*/:
                    i2 = 48;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = " zPo\n8{^\u007f\u00152".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 54;
                    break;
                case ay.n /*2*/:
                    i2 = 28;
                    break;
                case ay.p /*3*/:
                    i2 = 48;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "5oLu\n>yR|\u0000".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 54;
                    break;
                case ay.n /*2*/:
                    i2 = 28;
                    break;
                case ay.p /*3*/:
                    i2 = 48;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
        TYPES_ONLY = new fo(z[2], 0);
        AGGREGATES_ONLY = new fo(z[0], 1);
        ALL_SYMBOLS = new fo(z[1], 2);
        a = new fo[]{TYPES_ONLY, AGGREGATES_ONLY, ALL_SYMBOLS};
    }
}
