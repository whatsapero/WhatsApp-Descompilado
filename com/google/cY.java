package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum cy {
    ;
    public static final cy ADDRESSBOOK;
    public static final cy CALENDAR;
    public static final cy EMAIL_ADDRESS;
    public static final cy GEO;
    public static final cy ISBN;
    public static final cy PRODUCT;
    public static final cy SMS;
    public static final cy TEL;
    public static final cy TEXT;
    public static final cy URI;
    public static final cy VIN;
    public static final cy WIFI;
    public static boolean b;
    private static final String[] z;

    static {
        String[] strArr = new String[12];
        String str = "bm\\v";
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
                        i4 = 54;
                        break;
                    case ay.f /*1*/:
                        i4 = 40;
                        break;
                    case ay.n /*2*/:
                        i4 = 4;
                        break;
                    case ay.p /*3*/:
                        i4 = 34;
                        break;
                    default:
                        i4 = 77;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "`aJ";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "uiHg\u0003riV";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "fzKf\u0018u|";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "czM";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u007f{Fl";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "qmK";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "wl@p\be{Fm\u0002}";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "aaBk";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "seEk\u0001ii@f\u001fs{W";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "bmH";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ADDRESSBOOK = new cy(z[8], 0);
                    EMAIL_ADDRESS = new cy(z[10], 1);
                    PRODUCT = new cy(z[4], 2);
                    URI = new cy(z[5], 3);
                    TEXT = new cy(z[0], 4);
                    GEO = new cy(z[7], 5);
                    TEL = new cy(z[11], 6);
                    SMS = new cy(z[1], 7);
                    CALENDAR = new cy(z[3], 8);
                    WIFI = new cy(z[9], 9);
                    ISBN = new cy(z[6], 10);
                    VIN = new cy(z[2], 11);
                    a = new cy[]{ADDRESSBOOK, EMAIL_ADDRESS, PRODUCT, URI, TEXT, GEO, TEL, SMS, CALENDAR, WIFI, ISBN, VIN};
                default:
                    strArr2[i2] = str;
                    str = "eeW";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
