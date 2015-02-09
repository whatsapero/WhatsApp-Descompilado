package com.whatsapp;

import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class au extends ag {
    private static final String z;
    List b;

    static {
        char[] toCharArray = "\f\u001cSo#\u0013\u001amo8\u000eNoc9\u0013\u001a6,".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 125;
                    break;
                case ay.f /*1*/:
                    i2 = 110;
                    break;
                case ay.n /*2*/:
                    i2 = 12;
                    break;
                case ay.p /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void c() {
        App.a(this.b);
    }

    public au(List list) {
        this.b = list;
    }

    public String a() {
        return z + this.b.size();
    }
}
