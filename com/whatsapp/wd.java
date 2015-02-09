package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class wd implements OnClickListener {
    private static final String z;
    final DeleteAccountConfirmation a;

    static {
        char[] toCharArray = "\u0007.?_\u000b\u0006*0Y\u000b\u0000$=\\\u0016\u0011&|T\u0010N(<T\u0011\u0006('S\t\n?*".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 99;
                    break;
                case ay.f /*1*/:
                    i2 = 75;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        if (App.a()) {
            this.a.showDialog(1);
            DeleteAccountConfirmation.a(this.a).sendEmptyMessageDelayed(0, 60000);
            App.a1();
            return;
        }
        Log.i(z);
        this.a.showDialog(2);
    }

    wd(DeleteAccountConfirmation deleteAccountConfirmation) {
        this.a = deleteAccountConfirmation;
    }
}
