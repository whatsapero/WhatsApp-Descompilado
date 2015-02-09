package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class c7 {
    private static final String z;
    public long a;
    public String b;
    public int c;
    public long d;
    public int e;

    static {
        char[] toCharArray = " u\u001a~e\u0019Y>^e\u001fE?N,\u001fE=\u001b1\u0004M+H1\fM>".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 109;
                    break;
                case ay.f /*1*/:
                    i2 = 32;
                    break;
                case ay.n /*2*/:
                    i2 = 78;
                    break;
                case ay.p /*3*/:
                    i2 = 59;
                    break;
                default:
                    i2 = 69;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public c7(String str, int i, long j) {
        this(str, i, 0, j);
    }

    public c7(String str, int i, int i2, long j) {
        this.b = str;
        this.e = i;
        this.d = j;
        this.c = i2;
    }

    public c7(String str, int i) {
        this(str, i, 0);
        if (i == 5) {
            throw new IllegalArgumentException(z);
        }
    }
}
