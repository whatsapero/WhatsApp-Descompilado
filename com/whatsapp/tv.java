package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class tv implements OnClickListener {
    private static final String z;
    final Advanced a;

    static {
        char[] toCharArray = "\f7l\u0007[\u0019#".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 105;
                    break;
                case ay.f /*1*/:
                    i2 = 86;
                    break;
                case ay.n /*2*/:
                    i2 = 24;
                    break;
                case ay.p /*3*/:
                    i2 = 39;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    tv(Advanced advanced) {
        this.a = advanced;
    }

    public void onClick(View view) {
        App.v(z);
        new vp(this).handleMessage(null);
    }
}
