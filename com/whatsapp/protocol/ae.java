package com.whatsapp.protocol;

import java.util.Hashtable;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ae extends w {
    private static final String z;
    final j a;
    final Runnable b;
    final cd c;

    static {
        char[] toCharArray = "%\u0000\u0005".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 68;
                    break;
                case ay.f /*1*/:
                    i2 = 100;
                    break;
                case ay.n /*2*/:
                    i2 = 97;
                    break;
                case ay.p /*3*/:
                    i2 = 78;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ae(j jVar, Runnable runnable, cd cdVar) {
        this.a = jVar;
        this.b = runnable;
        this.c = cdVar;
    }

    public void a(bi biVar, String str) {
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        j.a(this.a, biVar, hashtable, hashtable2, z);
        j.c(this.a).b(str, hashtable, hashtable2);
        if (this.b != null) {
            this.b.run();
        }
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }
}
