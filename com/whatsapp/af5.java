package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class af5 implements OnClickListener {
    private static final String z;
    final Advanced a;

    static {
        char[] toCharArray = "+%NUMy,\\CMy7\\BW0.Z".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 89;
                    break;
                case ay.f /*1*/:
                    i2 = 64;
                    break;
                case ay.n /*2*/:
                    i2 = 61;
                    break;
                case ay.p /*3*/:
                    i2 = 48;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    af5(Advanced advanced) {
        this.a = advanced;
    }

    public void onClick(View view) {
        App.v(z);
        ac.d();
    }
}
