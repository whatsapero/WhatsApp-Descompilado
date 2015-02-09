package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a5 extends w {
    private static final String z;
    final j a;
    final Runnable b;
    final cd c;

    static {
        char[] toCharArray = "S%~y0G".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 62;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 26;
                    break;
                case ay.p /*3*/:
                    i2 = 16;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }

    a5(j jVar, Runnable runnable, cd cdVar) {
        this.a = jVar;
        this.b = runnable;
        this.c = cdVar;
    }

    public void a(bi biVar, String str) {
        bi a = biVar.a(0);
        bi.b(a, z);
        if (this.b != null) {
            this.b.run();
        }
        a = a.a(0);
        if (a != null) {
            v b = j.b(this.a, a);
            if (b != null) {
                j.a(this.a).a(b.a, b.b);
            }
        }
    }
}
