package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class fj extends fr {
    private static final String z;

    static {
        char[] toCharArray = "qD\u0013s".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 89;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 42;
                    break;
                case ay.p /*3*/:
                    i2 = 64;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String c() {
        int i = f4.a;
        if (b().d() < 48) {
            throw gv.a();
        }
        StringBuilder stringBuilder = new StringBuilder();
        b(stringBuilder, 8);
        int a = a().a(48, 2);
        stringBuilder.append(z);
        stringBuilder.append(a);
        stringBuilder.append(')');
        a = a().a(50, 10);
        if (a / 100 == 0) {
            stringBuilder.append('0');
        }
        if (a / 10 == 0) {
            stringBuilder.append('0');
        }
        stringBuilder.append(a);
        stringBuilder.append(a().a(60, null).c());
        String toString = stringBuilder.toString();
        if (i != 0) {
            gC.a = !gC.a;
        }
        return toString;
    }

    fj(da daVar) {
        super(daVar);
    }
}
