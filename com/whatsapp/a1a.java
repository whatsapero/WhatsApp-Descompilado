package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a1a implements OnClickListener {
    private static final String z;
    final Main a;

    static {
        char[] toCharArray = "'\\hFj/V\"]k2Wb@+'Qx]j(\u001cZ}@\u0011".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 50;
                    break;
                case ay.n /*2*/:
                    i2 = 12;
                    break;
                case ay.p /*3*/:
                    i2 = 52;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        st.d();
        this.a.startActivity(new Intent(z, st.i()));
        this.a.removeDialog(0);
        this.a.finish();
    }

    a1a(Main main) {
        this.a = main;
    }
}
