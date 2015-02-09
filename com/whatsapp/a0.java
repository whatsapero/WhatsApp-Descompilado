package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class a0 extends ag {
    private static final String z;
    boolean b;
    String c;

    static {
        char[] toCharArray = "O3\u0001\u00049R(-\u0012\u0005L$=\u000f*W$0\u0012)\u001e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 62;
                    break;
                case ay.f /*1*/:
                    i2 = 65;
                    break;
                case ay.n /*2*/:
                    i2 = 94;
                    break;
                case ay.p /*3*/:
                    i2 = 102;
                    break;
                default:
                    i2 = 90;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public a0(String str, boolean z) {
        this.c = str;
        this.b = z;
    }

    public String a() {
        return z + this.c;
    }

    public void c() {
        App.d(this.c, this.b);
    }
}
