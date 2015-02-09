package com.whatsapp;

import com.whatsapp.protocol.cs;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a_s implements cs {
    private static final String z;
    final ale a;
    final String b;

    static {
        char[] toCharArray = "n\u0000cG\u000eO\u0007>Q\u0016^]#U\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 46;
                    break;
                case ay.f /*1*/:
                    i2 = 115;
                    break;
                case ay.n /*2*/:
                    i2 = 77;
                    break;
                case ay.p /*3*/:
                    i2 = 48;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(String str) {
        App.as = this.b;
        App.q(App.af() + z);
    }

    a_s(ale com_whatsapp_ale, String str) {
        this.a = com_whatsapp_ale;
        this.b = str;
    }
}
