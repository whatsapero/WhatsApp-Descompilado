package com.whatsapp;

import com.whatsapp.protocol.cz;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aE;
import org.whispersystems.libaxolotl.ay;

class by implements Runnable {
    private static final String z;
    final anm a;
    final cz[] b;
    final int c;
    final cz d;
    final byte[] e;

    static {
        char[] toCharArray = "\u000f#Q[N.$\fMV?~\u0011IR".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 79;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 127;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 38;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        mo.a(this.a.a).f.remove(App.af() + z);
        App.a(this.e, aE.a(this.c), (byte) 5, this.b, this.d);
    }

    by(anm com_whatsapp_anm, byte[] bArr, int i, cz[] czVarArr, cz czVar) {
        this.a = com_whatsapp_anm;
        this.e = bArr;
        this.c = i;
        this.b = czVarArr;
        this.d = czVar;
    }
}
