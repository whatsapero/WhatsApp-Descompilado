package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class ky {
    private static final String z;
    private final boolean a;

    static {
        char[] toCharArray = "Op+FcL~*F\\p{9`y~q;Fjop+FcL~*F\\p{9\u001e".toCharArray();
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
                    i2 = 31;
                    break;
                case ay.n /*2*/:
                    i2 = 92;
                    break;
                case ay.p /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public ky(boolean z) {
        this.a = z;
    }

    public String toString() {
        return z + this.a + '}';
    }

    public boolean a() {
        return this.a;
    }
}
