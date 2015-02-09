package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class y4 implements Runnable {
    private static final String z;
    final vj a;

    static {
        char[] toCharArray = "O]tWgnZ)A\u007f\u007f\u00004E{".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 15;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 90;
                    break;
                case ay.p /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    y4(vj vjVar) {
        this.a = vjVar;
    }

    public void run() {
        mo.a(this.a.a).f.remove(App.af() + z);
    }
}
