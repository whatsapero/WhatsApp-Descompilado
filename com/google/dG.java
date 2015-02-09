package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum dg {
    ;
    public static final dg AZTEC_LAYERS;
    public static final dg CHARACTER_SET;
    public static final dg DATA_MATRIX_SHAPE;
    public static final dg ERROR_CORRECTION;
    public static final dg MARGIN;
    public static final dg MAX_SIZE;
    public static final dg MIN_SIZE;
    public static final dg PDF417_COMPACT;
    public static final dg PDF417_COMPACTION;
    public static final dg PDF417_DIMENSIONS;
    private static final String[] z;

    static {
        String[] strArr = new String[10];
        String str = "HV--\rLM0";
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
                        i4 = 5;
                        break;
                    case ay.f /*1*/:
                        i4 = 23;
                        break;
                    case ay.n /*2*/:
                        i4 = 117;
                        break;
                    case ay.p /*3*/:
                        i4 = 114;
                        break;
                    default:
                        i4 = 94;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "@E'=\fZT: \f@T!;\u0011K";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "US3Fo2H6=\u0013UV6&";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "US3Fo2H1;\u0013@Y&;\u0011KD";
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    str = "AV!3\u0001HV! \u0017]H&:\u001fUR";
                    i = 4;
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    strArr2 = strArr3;
                    str = "H^;-\rLM0";
                    i = 5;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "HV'5\u0017K";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "DM!7\u001dZ[4+\u001bWD";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "F_4 \u001fFC0 \u0001VR!";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ERROR_CORRECTION = new dg(z[2], 0);
                    CHARACTER_SET = new dg(z[9], 1);
                    DATA_MATRIX_SHAPE = new dg(z[5], 2);
                    MIN_SIZE = new dg(z[6], 3);
                    MAX_SIZE = new dg(z[0], 4);
                    MARGIN = new dg(z[7], 5);
                    PDF417_COMPACT = new dg(z[3], 6);
                    PDF417_COMPACTION = new dg(z[1], 7);
                    PDF417_DIMENSIONS = new dg(z[4], 8);
                    AZTEC_LAYERS = new dg(z[8], 9);
                    a = new dg[]{ERROR_CORRECTION, CHARACTER_SET, DATA_MATRIX_SHAPE, MIN_SIZE, MAX_SIZE, MARGIN, PDF417_COMPACT, PDF417_COMPACTION, PDF417_DIMENSIONS, AZTEC_LAYERS};
                default:
                    strArr2[i2] = str;
                    str = "US3Fo2H6=\u0013UV6&\u0017JY";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
