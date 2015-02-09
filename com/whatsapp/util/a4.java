package com.whatsapp.util;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum a4 {
    ;
    public static final a4 CRYPT1;
    public static final a4 CRYPT2;
    public static final a4 CRYPT3;
    public static final a4 CRYPT4;
    public static final a4 CRYPT5;
    public static final a4 CRYPT6;
    public static final a4 CRYPT7;
    public static final a4 CRYPT8;
    private static final a4[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = "bF\u001d\u0005z\u0019";
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
                        i4 = 33;
                        break;
                    case ay.f /*1*/:
                        i4 = 20;
                        break;
                    case ay.n /*2*/:
                        i4 = 68;
                        break;
                    case ay.p /*3*/:
                        i4 = 85;
                        break;
                    default:
                        i4 = 46;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "bF\u001d\u0005z\u0016";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "bF\u001d\u0005z\u0013";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "bF\u001d\u0005z\u0017";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "bF\u001d\u0005z\u0012";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "bF\u001d\u0005z\u0014";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "bF\u001d\u0005z\u0010";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CRYPT1 = new a4(z[7], 0);
                    CRYPT2 = new a4(z[3], 1);
                    CRYPT3 = new a4(z[5], 2);
                    CRYPT4 = new a4(z[1], 3);
                    CRYPT5 = new a4(z[6], 4);
                    CRYPT6 = new a4(z[4], 5);
                    CRYPT7 = new a4(z[2], 6);
                    CRYPT8 = new a4(z[0], 7);
                    a = new a4[]{CRYPT1, CRYPT2, CRYPT3, CRYPT4, CRYPT5, CRYPT6, CRYPT7, CRYPT8};
                default:
                    strArr2[i2] = str;
                    str = "bF\u001d\u0005z\u0015";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
