package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class f6 extends fr {
    private static final String z;

    static {
        char[] toCharArray = "AIcT".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 105;
                    break;
                case ay.f /*1*/:
                    i2 = 122;
                    break;
                case ay.n /*2*/:
                    i2 = 90;
                    break;
                case ay.p /*3*/:
                    i2 = 102;
                    break;
                default:
                    i2 = 116;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    f6(da daVar) {
        super(daVar);
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
        stringBuilder.append(a().a(50, null).c());
        String toString = stringBuilder.toString();
        if (gC.a) {
            f4.a = i + 1;
        }
        return toString;
    }
}
