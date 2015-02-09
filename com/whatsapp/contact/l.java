package com.whatsapp.contact;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum l {
    ;
    public static final l CHUNKED;
    public static final l DELTA;
    public static final l FULL;
    public static final l QUERY;
    private static final String[] z;
    private final String b;

    private l(String str) {
        this.b = str;
    }

    static {
        String[] strArr = new String[8];
        String str = "1{t\u0004{7w";
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
                        i4 = 51;
                        break;
                    case ay.n /*2*/:
                        i4 = 33;
                        break;
                    case ay.p /*3*/:
                        i4 = 74;
                        break;
                    default:
                        i4 = 48;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0014FM&";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "#fd\u0018i";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "6vm\u001eq";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u0003FD8I";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0016VM>Q";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0011[T$[\u0017W";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    FULL = new l(z[1], 0, z[2]);
                    DELTA = new l(z[4], 1, z[6]);
                    QUERY = new l(z[3], 2, z[5]);
                    CHUNKED = new l(z[0], 3, z[7]);
                    a = new l[]{FULL, DELTA, QUERY, CHUNKED};
                default:
                    strArr2[i2] = str;
                    str = "4fm\u0006";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public String getModeString() {
        return this.b;
    }
}
