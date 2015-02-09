package com.whatsapp;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class avz implements Runnable {
    private static final String z;
    final jl a;
    private final boolean b;

    static {
        char[] toCharArray = "`\f&\u0004hf\u0017\"\u001bj#\u0000*\u0018ha\u0002(\u001f$e\f9Tkm$.\u0000Tq\u0006\u0000\u0011}P\u0016(\u0017ap\u0010qT".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 3;
                    break;
                case ay.f /*1*/:
                    i2 = 99;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 116;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    avz(jl jlVar, boolean z) {
        this.a = jlVar;
        this.b = z;
    }

    public void run() {
        Log.i(z + this.b);
        mo.a(this.a.c).f.remove(this.a.d);
        if (this.b) {
            App.aF();
        }
    }
}
