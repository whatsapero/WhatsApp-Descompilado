package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class an5 implements OnClickListener {
    private static final String z;
    final OverlayAlert a;

    static {
        char[] toCharArray = "'\u000f\u0018w!)\u0000Rw(:\u001c\u001al><\u001c\u000f*.$\u0010\u001en(,".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 72;
                    break;
                case ay.f /*1*/:
                    i2 = 121;
                    break;
                case ay.n /*2*/:
                    i2 = 125;
                    break;
                case ay.p /*3*/:
                    i2 = 5;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    an5(OverlayAlert overlayAlert) {
        this.a = overlayAlert;
    }

    public void onClick(View view) {
        Log.i(z);
        OverlayAlert.a(this.a);
    }
}
