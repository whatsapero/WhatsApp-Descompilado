package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class af6 implements OnClickListener {
    private static final String z;
    final Advanced a;

    static {
        char[] toCharArray = "\u0010;\n35\f9\u0017}y\u0005?\u0017\u007f<\u0007".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 99;
                    break;
                case ay.f /*1*/:
                    i2 = 94;
                    break;
                case ay.n /*2*/:
                    i2 = 126;
                    break;
                case ay.p /*3*/:
                    i2 = 19;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        App.v(z);
        App.e(true);
    }

    af6(Advanced advanced) {
        this.a = advanced;
    }
}
