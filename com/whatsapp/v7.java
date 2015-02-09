package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class v7 implements OnClickListener {
    private static final String z;
    final ContactPickerHelp a;

    static {
        char[] toCharArray = "n:om-n!i| }zrq#z<oo%~<cu)\"6mp/f0e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 13;
                    break;
                case ay.f /*1*/:
                    i2 = 85;
                    break;
                case ay.n /*2*/:
                    i2 = 1;
                    break;
                case ay.p /*3*/:
                    i2 = 25;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Log.i(z);
        a5w.a(new gr(this.a, null), new Void[0]);
    }

    v7(ContactPickerHelp contactPickerHelp) {
        this.a = contactPickerHelp;
    }
}
