package com.whatsapp.protocol;

import java.util.Hashtable;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ao extends w {
    private static final String z;
    final Runnable a;
    final cd b;
    final j c;

    static {
        char[] toCharArray = "-\u001c\rM$:".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 95;
                    break;
                case ay.f /*1*/:
                    i2 = 121;
                    break;
                case ay.n /*2*/:
                    i2 = 96;
                    break;
                case ay.p /*3*/:
                    i2 = 34;
                    break;
                default:
                    i2 = 82;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ao(j jVar, Runnable runnable, cd cdVar) {
        this.c = jVar;
        this.a = runnable;
        this.b = cdVar;
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public void a(bi biVar, String str) {
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        j.a(this.c, biVar, hashtable, hashtable2, z);
        j.c(this.c).c(str, hashtable, hashtable2);
        if (this.a != null) {
            this.a.run();
        }
    }
}
