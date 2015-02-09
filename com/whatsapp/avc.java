package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum avc {
    ;
    public static final avc ERROR_BAD_PARAMETER;
    public static final avc ERROR_BAD_TOKEN;
    public static final avc ERROR_BLOCKED;
    public static final avc ERROR_CONNECTIVITY;
    public static final avc ERROR_MISSING_PARAMETER;
    public static final avc ERROR_NEXT_METHOD;
    public static final avc ERROR_NO_ROUTES;
    public static final avc ERROR_OLD_VERSION;
    public static final avc ERROR_PROVIDER_TIMEOUT;
    public static final avc ERROR_PROVIDER_UNROUTABLE;
    public static final avc ERROR_TEMPORARILY_UNAVAILABLE;
    public static final avc ERROR_TOO_MANY;
    public static final avc ERROR_TOO_MANY_ALL_METHODS;
    public static final avc ERROR_TOO_MANY_GUESSES;
    public static final avc ERROR_TOO_RECENT;
    public static final avc ERROR_UNSPECIFIED;
    public static final avc EXPIRED;
    public static final avc OK;
    public static final avc YES;
    public static final avc YES_WITH_CODE;
    private static final avc[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[20];
        String str = "\u007f6G9\t\u007f*";
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
                        i4 = 58;
                        break;
                    case ay.f /*1*/:
                        i4 = 110;
                        break;
                    case ay.n /*2*/:
                        i4 = 23;
                        break;
                    case ay.p /*3*/:
                        i4 = 112;
                        break;
                    default:
                        i4 = 91;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u007f<E?\te:X?\u0004h+T5\u0015n";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u007f<E?\te,V4\u0004n!\\5\u0015";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u007f<E?\te X/\tu;C5\b";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u007f<E?\te>E?\rs*R\"\u0004o E?\u000en/U<\u001e";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u007f<E?\te,[?\u0018q+S";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u007f<E?\te:X?\u0004w/Y)\u0004{\"[/\u0016\u007f:_?\u001fi";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u007f<E?\te:X?\u0004w/Y)";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u007f<E?\te#^#\bs P/\u000b{<V=\u001en+E";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u007f<E?\te:R=\u000bu<V\"\u0012v7H%\u0015{8V9\u0017{,[5";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u007f<E?\te:X?\u0004w/Y)\u0004};R#\b\u007f=";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\u007f<E?\te>E?\rs*R\"\u0004n'Z5\u0014o:";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "\u007f<E?\te;Y#\u000b\u007f-^6\u0012\u007f*";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "\u007f<E?\te-X>\u0015\u007f-C9\rs:N";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "u%";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "\u007f<E?\te![4\u0004l+E#\u0012u ";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "\u007f<E?\te,V4\u0004j/E1\u0016\u007f:R\"";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "c+D/\fs:_/\u0018u*R";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\u007f<E?\te R(\u000fe#R$\u0013u*";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    YES = new avc(z[1], 0);
                    YES_WITH_CODE = new avc(z[18], 1);
                    OK = new avc(z[15], 2);
                    EXPIRED = new avc(z[0], 3);
                    ERROR_UNSPECIFIED = new avc(z[13], 4);
                    ERROR_CONNECTIVITY = new avc(z[14], 5);
                    ERROR_TOO_RECENT = new avc(z[2], 6);
                    ERROR_TOO_MANY = new avc(z[8], 7);
                    ERROR_OLD_VERSION = new avc(z[16], 8);
                    ERROR_TEMPORARILY_UNAVAILABLE = new avc(z[10], 9);
                    ERROR_NEXT_METHOD = new avc(z[19], 10);
                    ERROR_TOO_MANY_GUESSES = new avc(z[11], 11);
                    ERROR_BLOCKED = new avc(z[6], 12);
                    ERROR_BAD_PARAMETER = new avc(z[17], 13);
                    ERROR_MISSING_PARAMETER = new avc(z[9], 14);
                    ERROR_PROVIDER_TIMEOUT = new avc(z[12], 15);
                    ERROR_PROVIDER_UNROUTABLE = new avc(z[5], 16);
                    ERROR_BAD_TOKEN = new avc(z[3], 17);
                    ERROR_TOO_MANY_ALL_METHODS = new avc(z[7], 18);
                    ERROR_NO_ROUTES = new avc(z[4], 19);
                    a = new avc[]{YES, YES_WITH_CODE, OK, EXPIRED, ERROR_UNSPECIFIED, ERROR_CONNECTIVITY, ERROR_TOO_RECENT, ERROR_TOO_MANY, ERROR_OLD_VERSION, ERROR_TEMPORARILY_UNAVAILABLE, ERROR_NEXT_METHOD, ERROR_TOO_MANY_GUESSES, ERROR_BLOCKED, ERROR_BAD_PARAMETER, ERROR_MISSING_PARAMETER, ERROR_PROVIDER_TIMEOUT, ERROR_PROVIDER_UNROUTABLE, ERROR_BAD_TOKEN, ERROR_TOO_MANY_ALL_METHODS, ERROR_NO_ROUTES};
                default:
                    strArr2[i2] = str;
                    str = "c+D";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
