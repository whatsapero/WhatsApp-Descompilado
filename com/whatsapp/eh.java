package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.InputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class eh implements w1 {
    private static final String z;
    final avr a;

    static {
        char[] toCharArray = "$\\wMT<\\jK\u001e?VzGP'CrAP6\u001cyKE;]n[E!GlKP?".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 82;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 30;
                    break;
                case ay.p /*3*/:
                    i2 = 46;
                    break;
                default:
                    i2 = 49;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public long c() {
        return -1;
    }

    public InputStream b() {
        Log.i(z);
        avr.a(this.a, new a3k(this, this.a.d().file));
        return avr.a(this.a);
    }

    eh(avr com_whatsapp_avr) {
        this.a = com_whatsapp_avr;
    }

    public String a() {
        return this.a.d().file.getName();
    }
}
