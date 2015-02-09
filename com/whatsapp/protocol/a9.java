package com.whatsapp.protocol;

import java.util.Hashtable;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a9 extends w {
    private static final String z;
    final j a;
    final Runnable b;
    final cd c;

    static {
        char[] toCharArray = "F\u000eTt\u0017B\u0019".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 54;
                    break;
                case ay.f /*1*/:
                    i2 = 124;
                    break;
                case ay.n /*2*/:
                    i2 = 59;
                    break;
                case ay.p /*3*/:
                    i2 = 25;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a9(j jVar, Runnable runnable, cd cdVar) {
        this.a = jVar;
        this.b = runnable;
        this.c = cdVar;
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }

    public void a(bi biVar, String str) {
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        j.a(this.a, biVar, hashtable, hashtable2, z);
        j.c(this.a).a(str, hashtable, hashtable2);
        if (this.b != null) {
            this.b.run();
        }
    }
}
