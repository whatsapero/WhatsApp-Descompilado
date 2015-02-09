package com.whatsapp;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class jz implements Runnable {
    private static final String z;
    private String a;
    final w7 b;
    private String c;

    static {
        char[] toCharArray = "@J{(V^[{6TB\u0017j2^UWk/\u001c".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 48;
                    break;
                case ay.f /*1*/:
                    i2 = 56;
                    break;
                case ay.n /*2*/:
                    i2 = 30;
                    break;
                case ay.p /*3*/:
                    i2 = 91;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        if (((akl) w7.a(this.b).get(this.c)) != null) {
            Log.i(z + this.c + " " + this.a);
            this.b.a(this.c, this.a);
            App.u(this.c);
        }
    }

    jz(w7 w7Var, String str, String str2) {
        this.b = w7Var;
        this.c = str;
        this.a = str2;
    }
}
