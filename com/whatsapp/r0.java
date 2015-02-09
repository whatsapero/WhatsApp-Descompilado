package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class r0 implements OnClickListener {
    private static final String z;
    final DialogToastActivity a;

    static {
        char[] toCharArray = "\u0004\u001e+*\u001b\u0007X&)\u0013\t\u0019g \u0015\t\u001b/\"[\u0012\u00128#\u0013\t\u0004>#\u0006".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 96;
                    break;
                case ay.f /*1*/:
                    i2 = 119;
                    break;
                case ay.n /*2*/:
                    i2 = 74;
                    break;
                case ay.p /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 116;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    r0(DialogToastActivity dialogToastActivity) {
        this.a = dialogToastActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        this.a.removeDialog(110);
        OverlayAlert.a(this.a);
        this.a.finish();
    }
}
