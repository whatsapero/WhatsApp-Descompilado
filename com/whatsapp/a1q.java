package com.whatsapp;

import android.content.Intent;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a1q implements Runnable {
    private static final String z;
    final Intent a;
    final BlockList b;

    static {
        char[] toCharArray = "\u0007 Y}$\u0007;".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 100;
                    break;
                case ay.f /*1*/:
                    i2 = 79;
                    break;
                case ay.n /*2*/:
                    i2 = 55;
                    break;
                case ay.p /*3*/:
                    i2 = 9;
                    break;
                default:
                    i2 = 69;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.a(this.b, true, this.a.getStringExtra(z));
        } catch (InterruptedException e) {
        }
    }

    a1q(BlockList blockList, Intent intent) {
        this.b = blockList;
        this.a = intent;
    }
}
