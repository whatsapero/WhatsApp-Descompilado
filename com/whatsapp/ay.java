package com.whatsapp;

import com.whatsapp.protocol.m;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;

public class ay extends ag {
    private static final String z;
    int b;
    m c;

    static {
        char[] toCharArray = "{@qt\u0015mm\\|\u0005|\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 10;
                    break;
                case org.whispersystems.libaxolotl.ay.f /*1*/:
                    i2 = 50;
                    break;
                case org.whispersystems.libaxolotl.ay.n /*2*/:
                    i2 = 46;
                    break;
                case org.whispersystems.libaxolotl.ay.p /*3*/:
                    i2 = 25;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public ay(m mVar, int i) {
        this.c = mVar;
        this.b = i;
    }

    public void c() {
        App.a(this.c, this.b);
    }

    public String a() {
        return z + this.c.toString();
    }
}
