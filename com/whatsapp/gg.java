package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class gg implements OnClickListener {
    private static final String z;
    final Advanced a;

    static {
        char[] toCharArray = ">z\u0007&\"'c\u0011".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 116;
                    break;
                case ay.p /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        App.v(z);
    }

    gg(Advanced advanced) {
        this.a = advanced;
    }
}
