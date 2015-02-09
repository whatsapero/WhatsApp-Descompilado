package com.whatsapp.protocol;

import java.util.Hashtable;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ab extends w {
    private static final String z;
    final j a;
    final cd b;
    final Runnable c;

    static {
        char[] toCharArray = "\u000b.NJ>\n".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 111;
                    break;
                case ay.f /*1*/:
                    i2 = 75;
                    break;
                case ay.n /*2*/:
                    i2 = 35;
                    break;
                case ay.p /*3*/:
                    i2 = 37;
                    break;
                default:
                    i2 = 74;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }

    ab(j jVar, Runnable runnable, cd cdVar) {
        this.a = jVar;
        this.c = runnable;
        this.b = cdVar;
    }

    public void a(bi biVar, String str) {
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        j.a(this.a, biVar, hashtable, hashtable2, z);
        j.c(this.a).d(str, hashtable, hashtable2);
        if (this.c != null) {
            this.c.run();
        }
    }
}
