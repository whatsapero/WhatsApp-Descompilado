package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum cq {
    ;
    public static final cq ALPHANUMERIC;
    public static final cq BYTE;
    public static final cq ECI;
    public static final cq FNC1_FIRST_POSITION;
    public static final cq FNC1_SECOND_POSITION;
    public static final cq HANZI;
    public static final cq KANJI;
    public static final cq NUMERIC;
    public static final cq STRUCTURED_APPEND;
    public static final cq TERMINATOR;
    private static final String[] z;
    private final int[] b;
    private final int c;

    public int getBits() {
        return this.c;
    }

    private cq(int[] iArr, int i) {
        this.b = iArr;
        this.c = i;
    }

    public static cq forBits(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                try {
                    return TERMINATOR;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case ay.f /*1*/:
                return NUMERIC;
            case ay.n /*2*/:
                return ALPHANUMERIC;
            case ay.p /*3*/:
                return STRUCTURED_APPEND;
            case aj.i /*4*/:
                return BYTE;
            case aV.r /*5*/:
                return FNC1_FIRST_POSITION;
            case a8.s /*7*/:
                return ECI;
            case a8.n /*8*/:
                return KANJI;
            case a6.D /*9*/:
                return FNC1_SECOND_POSITION;
            case a6.z /*13*/:
                return HANZI;
            default:
                throw new IllegalArgumentException();
        }
    }

    static {
        String[] strArr = new String[10];
        String str = "z\u000eNB\u001d}\u0018";
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
                        i4 = 52;
                        break;
                    case ay.f /*1*/:
                        i4 = 91;
                        break;
                    case ay.n /*2*/:
                        i4 = 3;
                        break;
                    case ay.p /*3*/:
                        i4 = 7;
                        break;
                    default:
                        i4 = 79;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "u\u0017SO\u000ez\u000eNB\u001d}\u0018";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "g\u000fQR\f`\u000eQB\u000bk\u001aSW\nz\u001f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "v\u0002WB";
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\u007f\u001aMM\u0006";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "r\u0015@6\u0010g\u001e@H\u0001p\u0004SH\u001c}\u000fJH\u0001";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    str = "|\u001aM]\u0006";
                    i = 6;
                    i2 = 7;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    strArr2 = strArr3;
                    str = "`\u001eQJ\u0006z\u001aWH\u001d";
                    i = 7;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "r\u0015@6\u0010r\u0012QT\u001bk\u000bLT\u0006`\u0012LI";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    TERMINATOR = new cq(z[8], 0, new int[]{0, 0, 0}, 0);
                    NUMERIC = new cq(z[0], 1, new int[]{10, 12, 14}, 1);
                    ALPHANUMERIC = new cq(z[2], 2, new int[]{9, 11, 13}, 2);
                    STRUCTURED_APPEND = new cq(z[3], 3, new int[]{0, 0, 0}, 3);
                    BYTE = new cq(z[4], 4, new int[]{8, 16, 16}, 4);
                    ECI = new cq(z[1], 5, new int[]{0, 0, 0}, 7);
                    KANJI = new cq(z[5], 6, new int[]{8, 10, 12}, 8);
                    FNC1_FIRST_POSITION = new cq(z[9], 7, new int[]{0, 0, 0}, 5);
                    FNC1_SECOND_POSITION = new cq(z[6], 8, new int[]{0, 0, 0}, 9);
                    HANZI = new cq(z[7], 9, new int[]{8, 10, 12}, 13);
                    a = new cq[]{TERMINATOR, NUMERIC, ALPHANUMERIC, STRUCTURED_APPEND, BYTE, ECI, KANJI, FNC1_FIRST_POSITION, FNC1_SECOND_POSITION, HANZI};
                default:
                    strArr2[i2] = str;
                    str = "q\u0018J";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCharacterCountBits(com.google.eB r4) {
        /*
        r3_this = this;
        r1 = com.google.eB.g;
        r2 = r4.c();
        r0 = 9;
        if (r2 > r0) goto L_0x000d;
    L_0x000a:
        r0 = 0;
        if (r1 == 0) goto L_0x0015;
    L_0x000d:
        r0 = 26;
        if (r2 > r0) goto L_0x0014;
    L_0x0011:
        r0 = 1;
        if (r1 == 0) goto L_0x0015;
    L_0x0014:
        r0 = 2;
    L_0x0015:
        r1 = r3.b;
        r0 = r1[r0];
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cq.getCharacterCountBits(com.google.eB):int");
    }
}
