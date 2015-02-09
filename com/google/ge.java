package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class ge extends gW {
    private static final String z;

    static {
        char[] toCharArray = "%\u0004N&\n$".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 13;
                    break;
                case ay.f /*1*/:
                    i2 = 55;
                    break;
                case ay.n /*2*/:
                    i2 = 127;
                    break;
                case ay.p /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void c(StringBuilder stringBuilder, int i) {
        stringBuilder.append(z);
    }

    protected int a(int i) {
        return i;
    }

    ge(da daVar) {
        super(daVar);
    }
}
