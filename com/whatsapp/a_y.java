package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a_y implements OnClickListener {
    private static final String z;
    final Advanced a;

    static {
        char[] toCharArray = "\u0004R\f\u0018\u001d\u001fI\u000f\u0017X\u001cH".toCharArray();
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
                    i2 = 59;
                    break;
                case ay.n /*2*/:
                    i2 = 96;
                    break;
                case ay.p /*3*/:
                    i2 = 116;
                    break;
                default:
                    i2 = 61;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        App.v(z);
        new pu(null).start();
    }

    a_y(Advanced advanced) {
        this.a = advanced;
    }
}
