package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum ak {
    ;
    public static final ak APP_RESUMED;
    public static final ak CORRUPTED;
    public static final ak LOW_BATTERY;
    public static final ak NOT_ENOUGH_SPACE;
    public static final ak NOT_REGISTERED;
    public static final ak NOT_SIGNED_IN;
    public static final ak NO_CHAT_STORE;
    public static final ak OUT_OF_TIME;
    public static final ak TOO_LARGE;
    public static final ak TOO_OLD;
    public static final ak UPLOAD;
    private static final ak[] b;
    private static final String[] z;
    private final int a;

    private ak(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[11];
        String str = "\u0014 \n\td\u0001=\u0002\u0013";
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
                        i4 = 64;
                        break;
                    case ay.f /*1*/:
                        i4 = 111;
                        break;
                    case ay.n /*2*/:
                        i4 = 69;
                        break;
                    case ay.p /*3*/:
                        i4 = 86;
                        break;
                    default:
                        i4 = 40;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0001?\u0015\tz\u0005<\u0010\u001bm\u0004";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u000f:\u0011\tg\u00060\u0011\u001fe\u0005";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u000e \u0011\t{\t(\u000b\u0013l\u001f&\u000b";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u000e \u001a\u0015`\u0001;\u001a\u0005|\u000f=\u0000";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u000e \u0011\tm\u000e \u0010\u0011`\u001f<\u0015\u0017k\u0005";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0015?\t\u0019i\u0004";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\f \u0012\tj\u0001;\u0011\u0013z\u0019";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u000e \u0011\tz\u0005(\f\u0005|\u0005=\u0000\u0012";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u0014 \n\tg\f+";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NOT_REGISTERED = new ak(z[9], 0, 1);
                    NOT_SIGNED_IN = new ak(z[4], 1, 2);
                    NO_CHAT_STORE = new ak(z[5], 2, 3);
                    CORRUPTED = new ak(z[1], 3, 4);
                    NOT_ENOUGH_SPACE = new ak(z[6], 4, 5);
                    TOO_LARGE = new ak(z[0], 5, 6);
                    UPLOAD = new ak(z[7], 6, 7);
                    TOO_OLD = new ak(z[10], 7, 8);
                    LOW_BATTERY = new ak(z[8], 8, 9);
                    OUT_OF_TIME = new ak(z[3], 9, 10);
                    APP_RESUMED = new ak(z[2], 10, 11);
                    b = new ak[]{NOT_REGISTERED, NOT_SIGNED_IN, NO_CHAT_STORE, CORRUPTED, NOT_ENOUGH_SPACE, TOO_LARGE, UPLOAD, TOO_OLD, LOW_BATTERY, OUT_OF_TIME, APP_RESUMED};
                default:
                    strArr2[i2] = str;
                    str = "\u0003 \u0017\u0004}\u0010;\u0000\u0012";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
