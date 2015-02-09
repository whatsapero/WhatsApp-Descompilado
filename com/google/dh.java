package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum dH {
    ;
    public static final dH BOOL;
    public static final dH BYTES;
    public static final dH DOUBLE;
    public static final dH ENUM;
    public static final dH FIXED32;
    public static final dH FIXED64;
    public static final dH FLOAT;
    public static final dH GROUP;
    public static final dH INT32;
    public static final dH INT64;
    public static final dH MESSAGE;
    public static final dH SFIXED32;
    public static final dH SFIXED64;
    public static final dH SINT32;
    public static final dH SINT64;
    public static final dH STRING;
    public static final dH UINT32;
    public static final dH UINT64;
    private static final dH[] a;
    private static final String[] z;
    private f0 b;

    private dH(f0 f0Var) {
        this.b = f0Var;
    }

    static {
        int i;
        String[] strArr = new String[18];
        char[] toCharArray = "\u0000;,m8".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0000>;i(uE".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u00151*t)\u0002AW".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u0015>-xZr".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u000396a".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "\u000286n \u0003".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "\u000b20\u007f-\u00012".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "\u0015>-x_t".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "\u000f97\u001f^".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "\u0001%,y<".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "\u0013>-x_t".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "\u0013>-xZr".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "\u0004.7i?".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "\u00151*t)\u0002DQ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = "\u0000>;i(pC".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[14] = new String(cArr).intern();
        toCharArray = "\u0015#1e\"\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[15] = new String(cArr).intern();
        toCharArray = "\u000f97\u001aX".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[16] = new String(cArr).intern();
        toCharArray = "\u00048,`".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[17] = new String(cArr).intern();
        z = strArr;
        DOUBLE = new dH(z[5], 0, f0.DOUBLE);
        FLOAT = new dH(z[0], 1, f0.FLOAT);
        INT64 = new dH(z[16], 2, f0.LONG);
        UINT64 = new dH(z[11], 3, f0.LONG);
        INT32 = new dH(z[8], 4, f0.INT);
        FIXED64 = new dH(z[14], 5, f0.LONG);
        FIXED32 = new dH(z[1], 6, f0.INT);
        BOOL = new dH(z[17], 7, f0.BOOLEAN);
        STRING = new dH(z[15], 8, f0.STRING);
        GROUP = new dH(z[9], 9, f0.MESSAGE);
        MESSAGE = new dH(z[6], 10, f0.MESSAGE);
        BYTES = new dH(z[12], 11, f0.BYTE_STRING);
        UINT32 = new dH(z[10], 12, f0.INT);
        ENUM = new dH(z[4], 13, f0.ENUM);
        SFIXED32 = new dH(z[13], 14, f0.INT);
        SFIXED64 = new dH(z[2], 15, f0.LONG);
        SINT32 = new dH(z[7], 16, f0.INT);
        SINT64 = new dH(z[3], 17, f0.LONG);
        a = new dH[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64};
    }

    public b6 toProto() {
        return b6.valueOf(ordinal() + 1);
    }

    public static dH valueOf(b6 b6Var) {
        return values()[b6Var.getNumber() - 1];
    }

    public f0 getJavaType() {
        return this.b;
    }
}
