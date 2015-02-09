package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class fr implements OnClickListener {
    private static final String z;
    final InsufficientStorageSpaceActivity a;

    static {
        char[] toCharArray = "(SN]6 Y\u0004\\<=ICA>:\u0013ca\r\fodn\u0015\u0016n~`\u000b\bzop\n\fi~f\u0017\u000en".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 73;
                    break;
                case ay.f /*1*/:
                    i2 = 61;
                    break;
                case ay.n /*2*/:
                    i2 = 42;
                    break;
                case ay.p /*3*/:
                    i2 = 47;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    fr(InsufficientStorageSpaceActivity insufficientStorageSpaceActivity) {
        this.a = insufficientStorageSpaceActivity;
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(z));
    }
}
