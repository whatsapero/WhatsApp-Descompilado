package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum x2 {
    ;
    public static final x2 CANCEL;
    public static final x2 FAILED_CANNOT_RESUME;
    public static final x2 FAILED_GENERIC;
    public static final x2 FAILED_HASH_MISMATCH;
    public static final x2 FAILED_INSUFFICIENT_SPACE;
    public static final x2 FAILED_INVALID_URL;
    public static final x2 FAILED_OUTPUT_STREAM;
    public static final x2 FAILED_TOO_OLD;
    public static final x2 SUCCESS;
    private static final x2[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[9];
        String str = "4m^_76s^]!'jQZ1;iYG-!|VP7";
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
                        i4 = 114;
                        break;
                    case ay.f /*1*/:
                        i4 = 44;
                        break;
                    case ay.n /*2*/:
                        i4 = 23;
                        break;
                    case ay.p /*3*/:
                        i4 = 19;
                        break;
                    default:
                        i4 = 114;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "4m^_76sPV<7~^P";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "4m^_76sXF&\"yCL!&~RR?";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "4m^_76sC\\=-c[W";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "4m^_76s^]$3`^W-'~[";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "!yTP7!\u007f";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "4m^_76s_R!:sZZ!?mCP:";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "1mYP7>";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    FAILED_GENERIC = new x2(z[2], 0);
                    SUCCESS = new x2(z[6], 1);
                    FAILED_INSUFFICIENT_SPACE = new x2(z[0], 2);
                    FAILED_TOO_OLD = new x2(z[4], 3);
                    FAILED_CANNOT_RESUME = new x2(z[1], 4);
                    FAILED_HASH_MISMATCH = new x2(z[7], 5);
                    FAILED_INVALID_URL = new x2(z[5], 6);
                    FAILED_OUTPUT_STREAM = new x2(z[3], 7);
                    CANCEL = new x2(z[8], 8);
                    a = new x2[]{FAILED_GENERIC, SUCCESS, FAILED_INSUFFICIENT_SPACE, FAILED_TOO_OLD, FAILED_CANNOT_RESUME, FAILED_HASH_MISMATCH, FAILED_INVALID_URL, FAILED_OUTPUT_STREAM, CANCEL};
                default:
                    strArr2[i2] = str;
                    str = "4m^_76sTR<<cCL 7\u007fB^7";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
