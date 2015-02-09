package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class bz {
    public static boolean a;
    private static final String z;
    private final boolean b;

    static {
        char[] toCharArray = "#h)\rZ\u001eG4\u000bT\u000bg4\u000bT\u0015of".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 112;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 91;
                    break;
                case ay.p /*3*/:
                    i2 = 104;
                    break;
                default:
                    i2 = 63;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String toString() {
        return z + this.b + '}';
    }

    public boolean a() {
        return this.b;
    }

    public bz(boolean z) {
        this.b = z;
    }
}
