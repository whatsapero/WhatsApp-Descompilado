package com.whatsapp;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class fx implements Runnable {
    private static final String z;

    static {
        char[] toCharArray = "\u0001\u007f\u001fx$\u000f}\f21\u0019a\fx&\u0005c\u001b6m\u0005}\u001d80".toCharArray();
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
                    i2 = 15;
                    break;
                case ay.n /*2*/:
                    i2 = 111;
                    break;
                case ay.p /*3*/:
                    i2 = 87;
                    break;
                default:
                    i2 = 66;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    fx() {
    }

    public void run() {
        try {
            App.a0.onChange(true);
        } catch (Throwable e) {
            Log.c(z, e);
        }
    }
}
