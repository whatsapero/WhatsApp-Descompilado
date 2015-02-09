package com.whatsapp;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class u3 extends ClickableSpan {
    private static final String z;
    private final Intent a;

    static {
        char[] toCharArray = "v_.D{~H#\u0000dyH?Cy:O*Lc8[5\rdyH?Cy*".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 23;
                    break;
                case ay.f /*1*/:
                    i2 = 60;
                    break;
                case ay.n /*2*/:
                    i2 = 90;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public u3(Intent intent) {
        this.a = intent;
    }

    public void onClick(View view) {
        Log.i(z + this.a);
        view.getContext().startActivity(this.a);
    }
}
