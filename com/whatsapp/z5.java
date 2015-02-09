package com.whatsapp;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class z5 implements Runnable {
    private static final String z;
    final nn a;

    static {
        char[] toCharArray = "*gv\u0001Kbpw\u0000I48v\u001aX!|z\u001f\u0014*gv\u0001K`f`\u001aX`t~\u0015R#".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 77;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 25;
                    break;
                case ay.p /*3*/:
                    i2 = 116;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        try {
            Thread.sleep(300);
            Log.i(z);
            App.an();
        } catch (InterruptedException e) {
        }
    }

    z5(nn nnVar) {
        this.a = nnVar;
    }
}
