package com.whatsapp;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class o_ implements Runnable {
    private static final String z;
    final RegisterName a;

    static {
        char[] toCharArray = "wd>@Tqd+GFhdvMNdm6N\blo0]Wwn>[Bvrv[Bhn/LCl`5F@".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 5;
                    break;
                case ay.f /*1*/:
                    i2 = 1;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        Log.i(z);
        this.a.removeDialog(0);
    }

    o_(RegisterName registerName) {
        this.a = registerName;
    }
}
