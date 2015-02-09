package com.whatsapp.messaging;

import com.whatsapp.bd;
import com.whatsapp.protocol.cd;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class bw implements cd {
    private static final String z;
    final bf a;

    static {
        char[] toCharArray = "Xg~3QWxg7\u001bR%i1\u0011UzG-\u0017TLo*\u0012En".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 32;
                    break;
                case ay.f /*1*/:
                    i2 = 10;
                    break;
                case ay.n /*2*/:
                    i2 = 14;
                    break;
                case ay.p /*3*/:
                    i2 = 67;
                    break;
                default:
                    i2 = 126;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(int i) {
        Log.e(z);
        bd.d();
    }

    bw(bf bfVar) {
        this.a = bfVar;
    }
}
