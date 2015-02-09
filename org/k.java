package org;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class k {
    private static final String z;

    static {
        char[] toCharArray = "3\u0006MuJ\u0013\f\u001bAt6H^zE\u0015\fRzA@HU{RZ\t\u001bbG\u0016\u0001_4B\u0013\u000fR`\u0006R\u001aZpO\u0002H\n\"\u000f@H".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 122;
                    break;
                case ay.f /*1*/:
                    i2 = 104;
                    break;
                case ay.n /*2*/:
                    i2 = 59;
                    break;
                case ay.p /*3*/:
                    i2 = 20;
                    break;
                default:
                    i2 = 38;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    static int a(byte b) {
        int i = c.a;
        int digit = Character.digit((char) b, 16);
        if (digit == -1) {
            throw new h(new StringBuffer().append(z).append(b).toString());
        }
        if (i != 0) {
            h.a++;
        }
        return digit;
    }
}
