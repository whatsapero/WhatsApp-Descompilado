package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

enum ec {
    ;
    public static final ec ANSIX12_ENCODE;
    public static final ec ASCII_ENCODE;
    public static final ec BASE256_ENCODE;
    public static final ec C40_ENCODE;
    public static final ec EDIFACT_ENCODE;
    public static final ec PAD_ENCODE;
    public static final ec TEXT_ENCODE;
    private static final ec[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[7];
        String str = "<Ne4W\"Ln/W";
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
                        i4 = 108;
                        break;
                    case ay.f /*1*/:
                        i4 = 15;
                        break;
                    case ay.n /*2*/:
                        i4 = 33;
                        break;
                    case ay.p /*3*/:
                        i4 = 107;
                        break;
                    default:
                        i4 = 18;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = ")Kh-S/[~.\\/@e.";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "-Ar\"J]=~.\\/@e.";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "-\\b\"[3Jo(](J";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = ".Nr. Y9~.\\/@e.";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "8Jy?M)Ab$V)";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    PAD_ENCODE = new ec(z[0], 0);
                    ASCII_ENCODE = new ec(z[4], 1);
                    C40_ENCODE = new ec(z[1], 2);
                    TEXT_ENCODE = new ec(z[6], 3);
                    ANSIX12_ENCODE = new ec(z[3], 4);
                    EDIFACT_ENCODE = new ec(z[2], 5);
                    BASE256_ENCODE = new ec(z[5], 6);
                    a = new ec[]{PAD_ENCODE, ASCII_ENCODE, C40_ENCODE, TEXT_ENCODE, ANSIX12_ENCODE, EDIFACT_ENCODE, BASE256_ENCODE};
                default:
                    strArr2[i2] = str;
                    str = "/;\u00114W\"Ln/W";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
