package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class al extends w {
    private static final String z;
    final j a;

    static {
        char[] toCharArray = "\u0010_-]o\u0007".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 98;
                    break;
                case ay.f /*1*/:
                    i2 = 58;
                    break;
                case ay.n /*2*/:
                    i2 = 64;
                    break;
                case ay.p /*3*/:
                    i2 = 50;
                    break;
                default:
                    i2 = 25;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(bi biVar, String str) {
        bi.b(biVar.a(0), z);
        j.a(this.a).b();
    }

    al(j jVar) {
        this.a = jVar;
    }
}
