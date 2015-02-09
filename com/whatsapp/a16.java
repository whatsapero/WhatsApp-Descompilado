package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a16 implements OnClickListener {
    private static final String z;
    final Advanced a;

    static {
        char[] toCharArray = "/>Gs\r/2\\!\u0019".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 74;
                    break;
                case ay.f /*1*/:
                    i2 = 95;
                    break;
                case ay.n /*2*/:
                    i2 = 51;
                    break;
                case ay.p /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 96;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        App.v(z);
        new Thread(new gq(this)).start();
    }

    a16(Advanced advanced) {
        this.a = advanced;
    }
}
