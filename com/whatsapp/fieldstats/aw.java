package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum aw {
    ;
    public static final aw ANDROID;
    public static final aw BB;
    public static final aw BBX;
    public static final aw IPHONE;
    public static final aw S40;
    public static final aw SYMBIAN;
    public static final aw TEST;
    public static final aw UNKNOWN;
    public static final aw WEBCLIENT;
    public static final aw WP;
    private static final aw[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    private aw(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[10];
        String str = "&\u000b";
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
                        i4 = 91;
                        break;
                    case ay.n /*2*/:
                        i4 = 68;
                        break;
                    case ay.p /*3*/:
                        i4 = 100;
                        break;
                    default:
                        i4 = 52;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "8\u000b\f+z4";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "3\u0019";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "3\u0019\u001c";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\"ot";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "%\u001e\u00170";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "0\u0015\u00006{8\u001f";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "$\u0015\u000f*{&\u0015";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\"\u0002\t&}0\u0015";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    IPHONE = new aw(z[2], 0, 1);
                    ANDROID = new aw(z[7], 1, 2);
                    BB = new aw(z[3], 2, 3);
                    BBX = new aw(z[4], 3, 7);
                    S40 = new aw(z[5], 4, 4);
                    SYMBIAN = new aw(z[9], 5, 5);
                    WP = new aw(z[0], 6, 6);
                    WEBCLIENT = new aw(z[1], 7, 8);
                    TEST = new aw(z[6], 8, 9);
                    UNKNOWN = new aw(z[8], 9, 10);
                    a = new aw[]{IPHONE, ANDROID, BB, BBX, S40, SYMBIAN, WP, WEBCLIENT, TEST, UNKNOWN};
                default:
                    strArr2[i2] = str;
                    str = "&\u001e\u0006'x8\u001e\n0";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
