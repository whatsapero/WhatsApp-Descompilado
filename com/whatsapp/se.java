package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class se implements OnClickListener {
    private static final String z;
    final Advanced a;

    static {
        char[] toCharArray = "f\u0011\u0012\u0006P~".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 10;
                    break;
                case ay.f /*1*/:
                    i2 = 126;
                    break;
                case ay.n /*2*/:
                    i2 = 117;
                    break;
                case ay.p /*3*/:
                    i2 = 105;
                    break;
                default:
                    i2 = 37;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        App.v(z);
        App.i();
    }

    se(Advanced advanced) {
        this.a = advanced;
    }
}
