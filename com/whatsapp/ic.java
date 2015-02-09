package com.whatsapp;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ic implements Runnable {
    private static final String z;
    final Runnable a;
    final Runnable b;
    final l7 c;

    static {
        char[] toCharArray = "a8\u001bm\fc9\u00191\ni(\u0019w\u000ei/Sl\u001do.\u0015h\u001dhd\u0019l\nc9\\".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 12;
                    break;
                case ay.f /*1*/:
                    i2 = 75;
                    break;
                case ay.n /*2*/:
                    i2 = 124;
                    break;
                case ay.p /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ic(l7 l7Var, Runnable runnable, Runnable runnable2) {
        this.c = l7Var;
        this.b = runnable;
        this.a = runnable2;
    }

    public void run() {
        int i = m3.d;
        for (sb sbVar : l7.d(this.c).values()) {
            if (sbVar.b < 500) {
                if (i != 0) {
                    break;
                }
            }
            Log.w(z + sbVar.b);
            if (this.b != null) {
                this.b.run();
                return;
            }
            return;
        }
        if (this.a != null) {
            this.a.run();
        }
    }
}
