package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a5v implements OnClickListener {
    private static final String z;
    final DialogToastListActivity a;

    static {
        char[] toCharArray = "/=0\u000ep,{=\rx\":|\u0004~\"84\u0006091#\u0007x\"'%\u0007m".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 75;
                    break;
                case ay.f /*1*/:
                    i2 = 84;
                    break;
                case ay.n /*2*/:
                    i2 = 81;
                    break;
                case ay.p /*3*/:
                    i2 = 98;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        this.a.removeDialog(110);
        OverlayAlert.a(this.a);
        this.a.finish();
    }

    a5v(DialogToastListActivity dialogToastListActivity) {
        this.a = dialogToastListActivity;
    }
}
