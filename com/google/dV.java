package com.google;

import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class dv extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;
    private static final String z;

    static {
        char[] toCharArray = "))]US%3M@B\u001e\u0015MBR\u000b+\u0019GV\u0019fNB^\u001e/WW\u0017\u001e)\u0019Q\u0017\f*XD\u0017\b?MU\u0017\u000b4KQNJ'WT\u0017\u0018'W\u0010X\u001f2\u0019_QJ5IQT\u000fh".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 106;
                    break;
                case ay.f /*1*/:
                    i2 = 70;
                    break;
                case ay.n /*2*/:
                    i2 = 57;
                    break;
                case ay.p /*3*/:
                    i2 = 48;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    dv() {
        super(z);
    }
}
