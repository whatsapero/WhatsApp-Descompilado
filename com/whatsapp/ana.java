package com.whatsapp;

import android.os.Handler;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class ana implements Runnable {
    private static final String z;
    final Handler a;

    static {
        char[] toCharArray = "\u0003G\u001a^vFF\tGm\bRHBp\u0007A\u0001Bp\u000fV\u001b\u0011b\u000fY\r".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 102;
                    break;
                case ay.f /*1*/:
                    i2 = 53;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 49;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ana(Handler handler) {
        this.a = handler;
    }

    public void run() {
        try {
            d7.c();
        } catch (Throwable e) {
            Log.b(z, e);
        }
        this.a.postDelayed(this, 900000);
    }
}
