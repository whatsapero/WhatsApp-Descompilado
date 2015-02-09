package com.google;

import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class a9 extends IOException {
    private static final long serialVersionUID = 3196188060225107702L;
    private static final String z;
    private final int a;
    private final int b;

    static {
        char[] toCharArray = "\u001dy".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 89;
                    break;
                case ay.n /*2*/:
                    i2 = 87;
                    break;
                case ay.p /*3*/:
                    i2 = 121;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public int b() {
        return this.b;
    }

    public a9(String str) {
        this(-1, -1, str);
    }

    public int a() {
        return this.a;
    }

    public a9(int i, int i2, String str) {
        super(Integer.toString(i) + ":" + i2 + z + str);
        this.a = i;
        this.b = i2;
    }
}
