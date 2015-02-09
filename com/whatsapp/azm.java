package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

enum azm {
    ;
    public static final azm CONNECTED;
    public static final azm CONNECTING;
    public static final azm DISCONNECTED;
    public static final azm DISCONNECTING;
    public static final azm UNKNOWN;
    private static final azm[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "\u0004j-\t9\u0004q&\u0003";
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
                        i4 = 71;
                        break;
                    case ay.f /*1*/:
                        i4 = 37;
                        break;
                    case ay.n /*2*/:
                        i4 = 99;
                        break;
                    case ay.p /*3*/:
                        i4 = 71;
                        break;
                    default:
                        i4 = 124;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0004j-\t9\u0004q*\t;";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u0003l0\u00043\tk&\u0004(\u000ek$";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u0012k(\t3\u0010k";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    UNKNOWN = new azm(z[4], 0);
                    CONNECTING = new azm(z[2], 1);
                    CONNECTED = new azm(z[0], 2);
                    DISCONNECTING = new azm(z[3], 3);
                    DISCONNECTED = new azm(z[1], 4);
                    a = new azm[]{UNKNOWN, CONNECTING, CONNECTED, DISCONNECTING, DISCONNECTED};
                default:
                    strArr2[i2] = str;
                    str = "\u0003l0\u00043\tk&\u0004(\u0002a";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
