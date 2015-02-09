package com.whatsapp;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class e1 implements Runnable {
    private static final String z;
    final od a;

    static {
        char[] toCharArray = "S\u001d\u007fa2K\bwg2ZWoa>[\u0017n|s".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 62;
                    break;
                case ay.f /*1*/:
                    i2 = 120;
                    break;
                case ay.n /*2*/:
                    i2 = 27;
                    break;
                case ay.p /*3*/:
                    i2 = 8;
                    break;
                default:
                    i2 = 83;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        Log.i(z + this.a.a.k.e);
        this.a.a.cancel(true);
    }

    e1(od odVar) {
        this.a = odVar;
    }
}
