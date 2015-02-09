package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum atf {
    ;
    public static final atf EXTENSION_REQUESTED;
    public static final atf GIFT_RECEIVED;
    public static final atf PAYMENT_COMPLETED;
    public static final atf WHATSAPP_INITIATED;
    private static final atf[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "se\f\u0004]fi\t\u0015Kbi\u000e";
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
                        i4 = 52;
                        break;
                    case ay.f /*1*/:
                        i4 = 44;
                        break;
                    case ay.n /*2*/:
                        i4 = 74;
                        break;
                    case ay.p /*3*/:
                        i4 = 80;
                        break;
                    default:
                        i4 = 2;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "dm\u0013\u001dGzx\u0015\u0013My|\u0006\u0015Vqh";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "cd\u000b\u0004Qu|\u001a\u000fKze\u001e\u0019C`i\u000e";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    WHATSAPP_INITIATED = new atf(z[3], 0);
                    EXTENSION_REQUESTED = new atf(z[1], 1);
                    PAYMENT_COMPLETED = new atf(z[2], 2);
                    GIFT_RECEIVED = new atf(z[0], 3);
                    a = new atf[]{WHATSAPP_INITIATED, EXTENSION_REQUESTED, PAYMENT_COMPLETED, GIFT_RECEIVED};
                default:
                    strArr2[i2] = str;
                    str = "qt\u001e\u0015Lge\u0005\u001e]fi\u001b\u0005Ggx\u000f\u0014";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
