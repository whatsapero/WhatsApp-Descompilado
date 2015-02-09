package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a3 implements OnClickListener {
    private static final String z;
    final Advanced a;

    static {
        char[] toCharArray = ")gg\u001a#(\"o\u001dw,lo_%(q\u007f\u0010%(\"b\u000by".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 77;
                    break;
                case ay.f /*1*/:
                    i2 = 2;
                    break;
                case ay.n /*2*/:
                    i2 = 11;
                    break;
                case ay.p /*3*/:
                    i2 = 127;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a3(Advanced advanced) {
        this.a = advanced;
    }

    public void onClick(View view) {
        App.v(z);
        App.aJ.L();
        new pu(null).start();
    }
}
