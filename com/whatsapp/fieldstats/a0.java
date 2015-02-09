package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum a0 {
    ;
    public static final a0 DELIVERED;
    public static final a0 PLAYED;
    public static final a0 READ;
    private static final a0[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[3];
        String str = "\u00157\u001cL\u0000\u0014 \u0015A";
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
                        i4 = 81;
                        break;
                    case ay.f /*1*/:
                        i4 = 114;
                        break;
                    case ay.n /*2*/:
                        i4 = 80;
                        break;
                    case ay.p /*3*/:
                        i4 = 5;
                        break;
                    default:
                        i4 = 86;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0001>\u0011\\\u0013\u0015";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    DELIVERED = new a0(z[0], 0, 1);
                    READ = new a0(z[1], 1, 2);
                    PLAYED = new a0(z[2], 2, 3);
                    a = new a0[]{DELIVERED, READ, PLAYED};
                default:
                    strArr2[i2] = str;
                    str = "\u00037\u0011A";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.b;
    }

    private a0(int i) {
        this.b = i;
    }
}
