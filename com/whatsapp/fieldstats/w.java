package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum w {
    ;
    public static final w CONTACTS;
    public static final w KEYS;
    public static final w MESSAGES;
    private static final w[] b;
    private static final String[] z;
    private final int a;

    private w(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[3];
        String str = "t\u0016n&9t\rs";
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
                        i4 = 55;
                        break;
                    case ay.f /*1*/:
                        i4 = 89;
                        break;
                    case ay.n /*2*/:
                        i4 = 32;
                        break;
                    case ay.p /*3*/:
                        i4 = 114;
                        break;
                    default:
                        i4 = 120;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "z\u001cs!9p\u001cs";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    MESSAGES = new w(z[2], 0, 1);
                    CONTACTS = new w(z[0], 1, 2);
                    KEYS = new w(z[1], 2, 3);
                    b = new w[]{MESSAGES, CONTACTS, KEYS};
                default:
                    strArr2[i2] = str;
                    str = "|\u001cy!";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.a;
    }
}
