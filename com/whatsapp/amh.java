package com.whatsapp;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class amh implements Runnable {
    private static final String z;
    final ata a;

    static {
        char[] toCharArray = "W<\u0007\u0019hX4\u0006\u0017}U6\u0007\u0015!Q+\u0010\u0000oS<\u0011\u0012!B8\u001b\u001eaUt\u0006\u0004oS-X\u0014l\f+\u0010\u0003zN+\u0010]cH*\u0006\u0019`Ft\u001e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 33;
                    break;
                case ay.f /*1*/:
                    i2 = 89;
                    break;
                case ay.n /*2*/:
                    i2 = 117;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        Log.i(z);
        ata.b(this.a).runOnUiThread(new uu(this));
    }

    amh(ata com_whatsapp_ata) {
        this.a = com_whatsapp_ata;
    }
}
