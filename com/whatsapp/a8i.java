package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a8i implements OnClickListener {
    private static final String z;
    final Advanced a;

    static {
        char[] toCharArray = "9H\u00130\u001e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 93;
                    break;
                case ay.f /*1*/:
                    i2 = 45;
                    break;
                case ay.n /*2*/:
                    i2 = 113;
                    break;
                case ay.p /*3*/:
                    i2 = 69;
                    break;
                default:
                    i2 = 121;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        App.P.a();
        Intent intent = new Intent(this.a, RegisterName.class);
        intent.putExtra(z, true);
        this.a.finish();
        this.a.startActivity(intent);
    }

    a8i(Advanced advanced) {
        this.a = advanced;
    }
}
