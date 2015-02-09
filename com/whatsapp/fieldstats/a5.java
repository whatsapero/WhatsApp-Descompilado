package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum a5 {
    ;
    public static final a5 MIXED;
    public static final a5 P2P;
    public static final a5 TCP_RELAY;
    public static final a5 UDP_RELAY;
    private static final a5[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[4];
        String str = "|!IZ|l)X\\";
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
                        i4 = 41;
                        break;
                    case ay.f /*1*/:
                        i4 = 101;
                        break;
                    case ay.n /*2*/:
                        i4 = 25;
                        break;
                    case ay.p /*3*/:
                        i4 = 5;
                        break;
                    default:
                        i4 = 46;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "d,A@j";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "}&IZ|l)X\\";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    P2P = new a5(z[1], 0, 1);
                    UDP_RELAY = new a5(z[0], 1, 2);
                    TCP_RELAY = new a5(z[3], 2, 3);
                    MIXED = new a5(z[2], 3, 4);
                    b = new a5[]{P2P, UDP_RELAY, TCP_RELAY, MIXED};
                default:
                    strArr2[i2] = str;
                    str = "yWI";
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

    private a5(int i) {
        this.a = i;
    }
}
