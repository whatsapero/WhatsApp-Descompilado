package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum av {
    ;
    public static final av FIXED_LINE;
    public static final av FIXED_LINE_OR_MOBILE;
    public static final av MOBILE;
    public static final av PAGER;
    public static final av PERSONAL_NUMBER;
    public static final av PREMIUM_RATE;
    public static final av SHARED_COST;
    public static final av TOLL_FREE;
    public static final av UAN;
    public static final av UNKNOWN;
    public static final av VOICEMAIL;
    public static final av VOIP;
    private static final av[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[12];
        String str = "6l-";
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
                        i4 = 99;
                        break;
                    case ay.f /*1*/:
                        i4 = 45;
                        break;
                    case ay.n /*2*/:
                        i4 = 99;
                        break;
                    case ay.p /*3*/:
                        i4 = 85;
                        break;
                    default:
                        i4 = 118;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "5b*\u0005";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "3h1\u00069-l/\n86`!\u0010$";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "%d;\u00102<a*\u001b3";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = ".b!\u001c:&";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "0e\"\u00073'r \u001a%7";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "3l$\u0010$";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "5b*\u00163.l*\u0019";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "%d;\u00102<a*\u001b3<b1\n;,o*\u00193";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "6c(\u001b94c";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "3\u007f&\u0018?6`<\u000777h";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    FIXED_LINE = new av(z[4], 0);
                    MOBILE = new av(z[5], 1);
                    FIXED_LINE_OR_MOBILE = new av(z[9], 2);
                    TOLL_FREE = new av(z[1], 3);
                    PREMIUM_RATE = new av(z[11], 4);
                    SHARED_COST = new av(z[6], 5);
                    VOIP = new av(z[2], 6);
                    PERSONAL_NUMBER = new av(z[3], 7);
                    PAGER = new av(z[7], 8);
                    UAN = new av(z[0], 9);
                    VOICEMAIL = new av(z[8], 10);
                    UNKNOWN = new av(z[10], 11);
                    a = new av[]{FIXED_LINE, MOBILE, FIXED_LINE_OR_MOBILE, TOLL_FREE, PREMIUM_RATE, SHARED_COST, VOIP, PERSONAL_NUMBER, PAGER, UAN, VOICEMAIL, UNKNOWN};
                default:
                    strArr2[i2] = str;
                    str = "7b/\u0019)%\u007f&\u0010";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
