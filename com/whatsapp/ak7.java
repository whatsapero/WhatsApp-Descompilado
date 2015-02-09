package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum ak7 {
    ;
    public static final ak7 BLOCKED;
    public static final ak7 ERROR_BAD_TOKEN;
    public static final ak7 FORMAT_WRONG;
    public static final ak7 INCORRECT;
    public static final ak7 LENGTH_LONG;
    public static final ak7 LENGTH_SHORT;
    public static final ak7 OLD_VERSION;
    public static final ak7 TEMPORARILY_UNAVAILABLE;
    private static final ak7[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = "3!\n|\u000e9?\u001dj\u00172";
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
                        i4 = 124;
                        break;
                    case ay.f /*1*/:
                        i4 = 109;
                        break;
                    case ay.n /*2*/:
                        i4 = 78;
                        break;
                    case ay.p /*3*/:
                        i4 = 35;
                        break;
                    default:
                        i4 = 88;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "9?\u001cl\n#/\u000fg\u0007(\"\u0005f\u0016";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = ">!\u0001`\u00139)";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "0(\u0000d\f42\u0002l\u0016;";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "5#\rl\n.(\rw";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "0(\u0000d\f42\u001dk\u0017.9";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "((\u0003s\u0017.,\u001cj\u0014%2\u001bm\u0019*,\u0007o\u0019>!\u000b";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    INCORRECT = new ak7(z[5], 0);
                    BLOCKED = new ak7(z[3], 1);
                    LENGTH_LONG = new ak7(z[4], 2);
                    LENGTH_SHORT = new ak7(z[6], 3);
                    FORMAT_WRONG = new ak7(z[1], 4);
                    TEMPORARILY_UNAVAILABLE = new ak7(z[7], 5);
                    OLD_VERSION = new ak7(z[0], 6);
                    ERROR_BAD_TOKEN = new ak7(z[2], 7);
                    a = new ak7[]{INCORRECT, BLOCKED, LENGTH_LONG, LENGTH_SHORT, FORMAT_WRONG, TEMPORARILY_UNAVAILABLE, OLD_VERSION, ERROR_BAD_TOKEN};
                default:
                    strArr2[i2] = str;
                    str = ":\"\u001cn\u0019(2\u0019q\u00172*";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
