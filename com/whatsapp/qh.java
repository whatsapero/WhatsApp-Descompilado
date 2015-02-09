package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class qh implements OnClickListener {
    private static final String z;
    final Advanced a;

    static {
        char[] toCharArray = "\r-h\u0002Q\u001b/uQW\f)hKL\u0010hoVB\n-!\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 126;
                    break;
                case ay.f /*1*/:
                    i2 = 72;
                    break;
                case ay.n /*2*/:
                    i2 = 28;
                    break;
                case ay.p /*3*/:
                    i2 = 34;
                    break;
                default:
                    i2 = 35;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        App.v(z);
        App.d(this.a, 0);
        new pu(null).start();
    }

    qh(Advanced advanced) {
        this.a = advanced;
    }
}
