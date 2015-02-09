package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class d0 implements Runnable {
    private static final String z;
    final String a;
    final String b;
    final String c;
    final long d;
    final jg e;

    static {
        char[] toCharArray = "\u0000\n\u0005\u000b\u0014\u0000".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 115;
                    break;
                case ay.f /*1*/:
                    i2 = 126;
                    break;
                case ay.n /*2*/:
                    i2 = 100;
                    break;
                case ay.p /*3*/:
                    i2 = 127;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    d0(jg jgVar, String str, long j, String str2, String str3) {
        this.e = jgVar;
        this.b = str;
        this.d = j;
        this.a = str2;
        this.c = str3;
    }

    public void run() {
        App.P.a(this.b, this.d, this.a);
        App.a(this.c, this.b, z);
        App.p.U().post(new r5(this));
    }
}
