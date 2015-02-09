package com.whatsapp.gallerypicker;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ah implements Runnable {
    private static final String z;
    final int a;
    final bs b;

    static {
        char[] toCharArray = "^T\u0000\u000e%PX\r\u0005%E@N\u001b%UX\n\f`TV\u0014\u00074\r".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 55;
                    break;
                case ay.f /*1*/:
                    i2 = 57;
                    break;
                case ay.n /*2*/:
                    i2 = 97;
                    break;
                case ay.p /*3*/:
                    i2 = 105;
                    break;
                default:
                    i2 = 64;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        if (!this.b.c) {
            this.b.a.setSupportProgressBarIndeterminateVisibility(false);
        }
        if (!this.b.isCancelled()) {
            Log.i(z + this.a);
            ImageGallery.a(this.b.a, this.a);
            ImageGallery.d(this.b.a).notifyDataSetChanged();
        }
    }

    ah(bs bsVar, int i) {
        this.b = bsVar;
        this.a = i;
    }
}
