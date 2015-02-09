package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum f0 {
    ;
    public static final f0 BOOLEAN;
    public static final f0 BYTE_STRING;
    public static final f0 DOUBLE;
    public static final f0 ENUM;
    public static final f0 FLOAT;
    public static final f0 INT;
    public static final f0 LONG;
    public static final f0 MESSAGE;
    public static final f0 STRING;
    private static final f0[] b;
    private static final String[] z;
    private final Object a;

    static Object a(f0 f0Var) {
        return f0Var.a;
    }

    private f0(Object obj) {
        this.a = obj;
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[9];
        char[] toCharArray = "N\u0006Ti?O".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 10;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 1;
                    break;
                case ay.p /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "H\u0010Un,Y\u001dSb=M".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 10;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 1;
                    break;
                case ay.p /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "C\u0007U".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 10;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 1;
                    break;
                case ay.p /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "F\u0006Ol".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 10;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 1;
                    break;
                case ay.p /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "Y\u001dSb=M".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 10;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 1;
                    break;
                case ay.p /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "L\u0005Nj'".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 10;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 1;
                    break;
                case ay.p /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "H\u0006Ng6K\u0007".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 10;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 1;
                    break;
                case ay.p /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "G\fRx2M\f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 10;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 1;
                    break;
                case ay.p /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "O\u0007Tf".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 10;
                    break;
                case ay.f /*1*/:
                    i2 = 73;
                    break;
                case ay.n /*2*/:
                    i2 = 1;
                    break;
                case ay.p /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        z = strArr;
        INT = new f0(z[2], 0, Integer.valueOf(0));
        LONG = new f0(z[3], 1, Long.valueOf(0));
        FLOAT = new f0(z[5], 2, Float.valueOf(0.0f));
        DOUBLE = new f0(z[0], 3, Double.valueOf(0.0d));
        BOOLEAN = new f0(z[6], 4, Boolean.valueOf(false));
        STRING = new f0(z[4], 5, "");
        BYTE_STRING = new f0(z[1], 6, g2.a);
        ENUM = new f0(z[8], 7, null);
        MESSAGE = new f0(z[7], 8, null);
        b = new f0[]{INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE};
    }
}
