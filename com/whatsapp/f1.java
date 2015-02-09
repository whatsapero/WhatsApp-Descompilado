package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class f1 implements Runnable {
    private static final String z;
    final String a;
    final jg b;
    final String c;

    static {
        char[] toCharArray = "ljr>ql".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 31;
                    break;
                case ay.f /*1*/:
                    i2 = 30;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 74;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        App.P.g(this.c);
        App.a(this.a, this.c, z);
        App.p.U().post(new kn(this));
    }

    f1(jg jgVar, String str, String str2) {
        this.b = jgVar;
        this.c = str;
        this.a = str2;
    }
}
