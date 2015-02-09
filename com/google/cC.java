package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum cc {
    ;
    public static final cc BOOLEAN;
    public static final cc BYTE_STRING;
    public static final cc DOUBLE;
    public static final cc ENUM;
    public static final cc FLOAT;
    public static final cc INT;
    public static final cc LONG;
    public static final cc MESSAGE;
    public static final cc STRING;
    private static final cc[] a;
    private static final String[] z;
    private final Object b;

    private cc(Object obj) {
        this.b = obj;
    }

    Object a() {
        return this.b;
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[9];
        char[] toCharArray = "\u0011pp\u0003\u0003\u0000}v\u000f\u0012\u0014".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 83;
                    break;
                case ay.f /*1*/:
                    i2 = 41;
                    break;
                case ay.n /*2*/:
                    i2 = 36;
                    break;
                case ay.p /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0017fq\u0004\u0010\u0016".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 83;
                    break;
                case ay.f /*1*/:
                    i2 = 41;
                    break;
                case ay.n /*2*/:
                    i2 = 36;
                    break;
                case ay.p /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u0011fk\n\u0019\u0012g".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 83;
                    break;
                case ay.f /*1*/:
                    i2 = 41;
                    break;
                case ay.n /*2*/:
                    i2 = 36;
                    break;
                case ay.p /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u0000}v\u000f\u0012\u0014".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 83;
                    break;
                case ay.f /*1*/:
                    i2 = 41;
                    break;
                case ay.n /*2*/:
                    i2 = 36;
                    break;
                case ay.p /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u0016gq\u000b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 83;
                    break;
                case ay.f /*1*/:
                    i2 = 41;
                    break;
                case ay.n /*2*/:
                    i2 = 36;
                    break;
                case ay.p /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "\u001agp".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 83;
                    break;
                case ay.f /*1*/:
                    i2 = 41;
                    break;
                case ay.n /*2*/:
                    i2 = 36;
                    break;
                case ay.p /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "\u001elw\u0015\u001d\u0014l".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 83;
                    break;
                case ay.f /*1*/:
                    i2 = 41;
                    break;
                case ay.n /*2*/:
                    i2 = 36;
                    break;
                case ay.p /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "\u001ffj\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 83;
                    break;
                case ay.f /*1*/:
                    i2 = 41;
                    break;
                case ay.n /*2*/:
                    i2 = 36;
                    break;
                case ay.p /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "\u0015ek\u0007\b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 83;
                    break;
                case ay.f /*1*/:
                    i2 = 41;
                    break;
                case ay.n /*2*/:
                    i2 = 36;
                    break;
                case ay.p /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        z = strArr;
        INT = new cc(z[5], 0, Integer.valueOf(0));
        LONG = new cc(z[7], 1, Long.valueOf(0));
        FLOAT = new cc(z[8], 2, Float.valueOf(0.0f));
        DOUBLE = new cc(z[1], 3, Double.valueOf(0.0d));
        BOOLEAN = new cc(z[2], 4, Boolean.valueOf(false));
        STRING = new cc(z[3], 5, "");
        BYTE_STRING = new cc(z[0], 6, g2.a);
        ENUM = new cc(z[4], 7, null);
        MESSAGE = new cc(z[6], 8, null);
        a = new cc[]{INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE};
    }
}
