package com.whatsapp;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class oz implements Runnable {
    private static final String z;
    final App a;

    static {
        char[] toCharArray = "^>\u000f\u001b.K5JR6\u000e\"\u0005OeW)\u001e\u001b6K\"\u001e\u001b1Al\u0019^7X)\u0018\u0000e]/\u0002^![ \u0003U\"\u000e<\u0018^eE)\u0013\u001b6K\"\u000eR+I".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 46;
                    break;
                case ay.f /*1*/:
                    i2 = 76;
                    break;
                case ay.n /*2*/:
                    i2 = 106;
                    break;
                case ay.p /*3*/:
                    i2 = 59;
                    break;
                default:
                    i2 = 69;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    oz(App app) {
        this.a = app;
    }

    public void run() {
        if (this.a.a6.d()) {
            Log.i(z);
            App.aD().post(new a_5(this, this.a.a6.a(), this.a.a6.b(), this.a.a6.f(), this.a.a6.c().a()));
        }
    }
}
