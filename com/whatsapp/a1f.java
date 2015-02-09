package com.whatsapp;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class a1f implements Runnable {
    private static final String z;
    final _5 a;
    private final boolean b;

    static {
        char[] toCharArray = "6d\rb`0\u007f\t}buh\u0001~`7j\u0003y,3d\u00122c;L\u0005f\\'n+wu\u001bd\u000ew6u".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 85;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 96;
                    break;
                case ay.p /*3*/:
                    i2 = 18;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        Log.i(z + this.b);
        mo.a(this.a.b).f.remove(this.a.a);
        if (this.b) {
            App.aF();
        }
    }

    a1f(_5 _5, boolean z) {
        this.a = _5;
        this.b = z;
    }
}
