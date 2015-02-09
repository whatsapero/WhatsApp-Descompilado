package com.whatsapp;

import com.whatsapp.protocol.b;
import java.util.Collection;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ad extends ag {
    private static final String z;
    int b;
    String c;
    Collection d;

    static {
        char[] toCharArray = "(e'I)5H\u0015^+*7".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 89;
                    break;
                case ay.f /*1*/:
                    i2 = 23;
                    break;
                case ay.n /*2*/:
                    i2 = 120;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
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
        App.a(this.c, this.d, this.b);
    }

    public ad(String str, Collection collection, int i) {
        this.c = str;
        this.d = collection;
        this.b = i;
    }

    public String a() {
        int i = App.az;
        StringBuilder stringBuilder = new StringBuilder();
        for (b bVar : this.d) {
            stringBuilder.append(" ");
            stringBuilder.append(bVar.e.toString());
            if (i != 0) {
                break;
            }
        }
        return z + this.c + stringBuilder.toString() + " " + this.b;
    }
}
