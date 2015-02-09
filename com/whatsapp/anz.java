package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class anz implements OnClickListener {
    private static final String z;
    final Advanced a;

    static {
        char[] toCharArray = "6o[\"(0".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 83;
                    break;
                case ay.f /*1*/:
                    i2 = 14;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 2;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        App.v(z);
        new Thread(new a83(this)).start();
    }

    anz(Advanced advanced) {
        this.a = advanced;
    }
}
