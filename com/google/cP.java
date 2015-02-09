package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class cp extends RuntimeException {
    private static final long serialVersionUID = 5469741279507848266L;
    private static final String z;

    static {
        char[] toCharArray = "dal(#byf\u0018b\\eg:`[)r:p\u0010hi)fQm|{`Qei>g\u0010hk?#Shk5lD)g>#Shi7fT)h.oD`u7f\u0010}l6fC'".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 48;
                    break;
                case ay.f /*1*/:
                    i2 = 9;
                    break;
                case ay.n /*2*/:
                    i2 = 5;
                    break;
                case ay.p /*3*/:
                    i2 = 91;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public cp() {
        super(z);
    }
}
