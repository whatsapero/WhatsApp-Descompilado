package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class a7 extends ag {
    private static final String z;
    m8 b;

    static {
        char[] toCharArray = "PE2,E@C2<HDYB".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 33;
                    break;
                case ay.f /*1*/:
                    i2 = 55;
                    break;
                case ay.n /*2*/:
                    i2 = 109;
                    break;
                case ay.p /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 45;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public a7(m8 m8Var) {
        this.b = m8Var;
    }

    public void c() {
        App.a(this.b);
    }

    public String a() {
        return z + this.b.e;
    }
}
