package com.whatsapp;

import java.math.BigDecimal;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

enum p2 {
    ;
    public static final p2 BIG_DECIMAL;
    public static final p2 BYTE;
    public static final p2 DOUBLE;
    public static final p2 FLOAT;
    public static final p2 INTEGER;
    public static final p2 LONG;
    public static final p2 SHORT;
    private static final p2[] a;
    private static final String[] z;

    public Number toNumber(double d) {
        try {
            switch (at1.a[ordinal()]) {
                case ay.f /*1*/:
                    return new Long((long) d);
                case ay.n /*2*/:
                    return Double.valueOf(d);
                case ay.p /*3*/:
                    return new Integer((int) d);
                case aj.i /*4*/:
                    return new Float(d);
                case aV.r /*5*/:
                    return new Short((short) ((int) d));
                case aV.i /*6*/:
                    return new Byte((byte) ((int) d));
                case a8.s /*7*/:
                    return new BigDecimal(d);
                default:
                    throw new InstantiationError(z[3] + this + z[2]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    static {
        String[] strArr = new String[11];
        String str = "=W\u0004f+\u0001\u0002\nh/\u0000QI#";
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
                        i4 = 34;
                        break;
                    case ay.n /*2*/:
                        i4 = 105;
                        break;
                    case ay.p /*3*/:
                        i4 = 4;
                        break;
                    default:
                        i4 = 78;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    strArr2 = strArr3;
                    str = "SV\u0006$/Sl\u001ci,\u0016PIk,\u0019G\np";
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "\u0010C\u0007#:SA\u0006j8\u0016P\u001d$";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "5n&E\u001a";
                    i = 3;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    str = "7m<F\u00026";
                    i2 = 5;
                    strArr2 = strArr3;
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    str = "?m'C";
                    i2 = 6;
                    strArr2 = strArr3;
                    i = 5;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    strArr2 = strArr3;
                    str = "1{=A";
                    i = 6;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = " j&V\u001a";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "1k.[\n6a I\u000f?";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = ":l=A\t6p";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    LONG = new p2(z[6], 0);
                    DOUBLE = new p2(z[5], 1);
                    INTEGER = new p2(z[10], 2);
                    FLOAT = new p2(z[4], 3);
                    SHORT = new p2(z[8], 4);
                    BYTE = new p2(z[7], 5);
                    BIG_DECIMAL = new p2(z[9], 6);
                    a = new p2[]{LONG, DOUBLE, INTEGER, FLOAT, SHORT, BYTE, BIG_DECIMAL};
                default:
                    strArr2[i2] = str;
                    str = "T\u0002\u0000wn\u001dM\u001d$=\u0006R\u0019k<\u0007G\r";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static p2 fromNumber(Number number) {
        try {
            if (number instanceof Long) {
                return LONG;
            }
            try {
                if (number instanceof Double) {
                    return DOUBLE;
                }
                try {
                    if (number instanceof Integer) {
                        return INTEGER;
                    }
                    try {
                        if (number instanceof Float) {
                            return FLOAT;
                        }
                        try {
                            if (number instanceof Short) {
                                return SHORT;
                            }
                            try {
                                if (number instanceof Byte) {
                                    return BYTE;
                                }
                                try {
                                    if (number instanceof BigDecimal) {
                                        return BIG_DECIMAL;
                                    }
                                    throw new IllegalArgumentException(z[0] + number.getClass().getName() + z[1]);
                                } catch (IllegalArgumentException e) {
                                    throw e;
                                }
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        } catch (IllegalArgumentException e222222) {
            throw e222222;
        }
    }
}
