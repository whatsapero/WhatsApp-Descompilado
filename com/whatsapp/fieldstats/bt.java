package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum bt {
    ;
    public static final bt APP_OPEN;
    public static final bt CHAT_OPEN;
    public static final bt OTHER;
    private static final bt[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[3];
        String str = "~\u001er\u0014+o\u000bl";
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
                        i4 = 63;
                        break;
                    case ay.f /*1*/:
                        i4 = 78;
                        break;
                    case ay.n /*2*/:
                        i4 = 34;
                        break;
                    case ay.p /*3*/:
                        i4 = 75;
                        break;
                    default:
                        i4 = 100;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "|\u0006c\u001f;p\u001eg\u0005";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OTHER = new bt(z[1], 0, 1);
                    APP_OPEN = new bt(z[0], 1, 2);
                    CHAT_OPEN = new bt(z[2], 2, 3);
                    b = new bt[]{OTHER, APP_OPEN, CHAT_OPEN};
                default:
                    strArr2[i2] = str;
                    str = "p\u001aj\u000e6";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private bt(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }
}
