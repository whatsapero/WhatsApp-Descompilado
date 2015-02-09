package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class kx implements OnClickListener {
    private static final String z;
    final Advanced a;

    static {
        char[] toCharArray = "Y\b:K]V\u0001".toCharArray();
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
                    i2 = 109;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 63;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    kx(Advanced advanced) {
        this.a = advanced;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        App.v(z);
    }
}
