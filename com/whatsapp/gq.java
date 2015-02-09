package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class gq implements Runnable {
    private static final String z;
    final a16 a;

    static {
        char[] toCharArray = "G5Z&;Gt".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 34;
                    break;
                case ay.f /*1*/:
                    i2 = 84;
                    break;
                case ay.n /*2*/:
                    i2 = 46;
                    break;
                case ay.p /*3*/:
                    i2 = 6;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    gq(a16 com_whatsapp_a16) {
        this.a = com_whatsapp_a16;
    }

    public void run() {
        while (true) {
            new StringBuilder().append(z);
        }
    }
}
