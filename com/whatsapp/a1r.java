package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.TimerTask;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a1r extends TimerTask {
    private static final String z;
    hm a;

    static {
        char[] toCharArray = "\u0006UOIB\u0000\\~^U\u0010ED_D>DHAU\u000eEU\u0003D\u0018@D\u0016".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 33;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 48;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public a1r(hm hmVar) {
        this.a = hmVar;
    }

    public void run() {
        if (!this.a.f) {
            Log.i(z + this.a.m);
            this.a.c = true;
            switch (this.a.m) {
                case ay.n /*2*/:
                    App.p.U().post(hm.a(this.a));
                    break;
            }
            hm.k.remove(this.a.g);
        }
    }
}
