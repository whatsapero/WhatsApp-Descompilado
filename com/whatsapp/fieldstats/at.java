package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum at {
    ;
    public static final at CANCELLED;
    public static final at SENT;
    public static final at TOO_SHORT;
    private static final at[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[3];
        String str = "3\u0004zI6/\u0004gB";
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
                        i4 = 103;
                        break;
                    case ay.f /*1*/:
                        i4 = 75;
                        break;
                    case ay.n /*2*/:
                        i4 = 53;
                        break;
                    case ay.p /*3*/:
                        i4 = 22;
                        break;
                    default:
                        i4 = 101;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "4\u000e{B";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SENT = new at(z[2], 0, 1);
                    CANCELLED = new at(z[1], 1, 2);
                    TOO_SHORT = new at(z[0], 2, 3);
                    b = new at[]{SENT, CANCELLED, TOO_SHORT};
                default:
                    strArr2[i2] = str;
                    str = "$\n{U +\u0007pR";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private at(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }
}
