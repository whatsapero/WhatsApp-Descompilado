package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

enum ao {
    ;
    public static final ao ALPHA;
    public static final ao ALPHA_SHIFT;
    public static final ao LOWER;
    public static final ao MIXED;
    public static final ao PUNCT;
    public static final ao PUNCT_SHIFT;
    private static final ao[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[6];
        String str = "<\u001f 9H";
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
                        i4 = 113;
                        break;
                    case ay.f /*1*/:
                        i4 = 86;
                        break;
                    case ay.n /*2*/:
                        i4 = 120;
                        break;
                    case ay.p /*3*/:
                        i4 = 124;
                        break;
                    default:
                        i4 = 12;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "!\u00036?X.\u000505J%";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "=\u0019/9^";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "0\u001a(4M.\u000505J%";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "!\u00036?X";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALPHA = new ao(z[1], 0);
                    LOWER = new ao(z[3], 1);
                    MIXED = new ao(z[0], 2);
                    PUNCT = new ao(z[5], 3);
                    ALPHA_SHIFT = new ao(z[4], 4);
                    PUNCT_SHIFT = new ao(z[2], 5);
                    a = new ao[]{ALPHA, LOWER, MIXED, PUNCT, ALPHA_SHIFT, PUNCT_SHIFT};
                default:
                    strArr2[i2] = str;
                    str = "0\u001a(4M";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
