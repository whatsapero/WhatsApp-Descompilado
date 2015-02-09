package com.google;

import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum fm {
    ;
    public static final fm ALLOWED_EAN_EXTENSIONS;
    public static final fm ALLOWED_LENGTHS;
    public static final fm ASSUME_CODE_39_CHECK_DIGIT;
    public static final fm ASSUME_GS1;
    public static final fm CHARACTER_SET;
    public static final fm NEED_RESULT_POINT_CALLBACK;
    public static final fm OTHER;
    public static final fm POSSIBLE_FORMATS;
    public static final fm PURE_BARCODE;
    public static final fm RETURN_CODABAR_START_END;
    public static final fm TRY_HARDER;
    private static final String[] z;
    private final Class b;

    public Class getValueType() {
        return this.b;
    }

    static {
        String[] strArr = new String[11];
        String str = "aDK9DaXO9ZqI^";
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
                        i4 = 34;
                        break;
                    case ay.f /*1*/:
                        i4 = 12;
                        break;
                    case ay.n /*2*/:
                        i4 = 10;
                        break;
                    case ay.p /*3*/:
                        i4 = 107;
                        break;
                    default:
                        i4 = 5;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "c@F$RgHU'@lK^#V";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "pI^>WlSI$AcNK9ZqXK9Q}ID/";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "lIO/ZpIY>IvSZ$LlXU(Dn@H*Fi";
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    str = "rYX.Z`MX(JfI";
                    i = 4;
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    strArr2 = strArr3;
                    str = "c_Y>HgSM84";
                    i = 5;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "rCY8L`@O4Cm^G*Qq";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "c_Y>HgSI$AgS9RZaDO(N}HC,Lv";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "mXB.W";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "v^S4Mc^N.W";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OTHER = new fm(z[9], 0, Object.class);
                    PURE_BARCODE = new fm(z[5], 1, Void.class);
                    POSSIBLE_FORMATS = new fm(z[7], 2, List.class);
                    TRY_HARDER = new fm(z[10], 3, Void.class);
                    CHARACTER_SET = new fm(z[0], 4, String.class);
                    ALLOWED_LENGTHS = new fm(z[2], 5, int[].class);
                    ASSUME_CODE_39_CHECK_DIGIT = new fm(z[8], 6, Void.class);
                    ASSUME_GS1 = new fm(z[6], 7, Void.class);
                    RETURN_CODABAR_START_END = new fm(z[3], 8, Void.class);
                    NEED_RESULT_POINT_CALLBACK = new fm(z[4], 9, bH.class);
                    ALLOWED_EAN_EXTENSIONS = new fm(z[1], 10, int[].class);
                    a = new fm[]{OTHER, PURE_BARCODE, POSSIBLE_FORMATS, TRY_HARDER, CHARACTER_SET, ALLOWED_LENGTHS, ASSUME_CODE_39_CHECK_DIGIT, ASSUME_GS1, RETURN_CODABAR_START_END, NEED_RESULT_POINT_CALLBACK, ALLOWED_EAN_EXTENSIONS};
                default:
                    strArr2[i2] = str;
                    str = "c@F$RgHU.DlSO3QgBY\"Jl_";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private fm(Class cls) {
        this.b = cls;
    }
}
