package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class b9 extends bD implements gx {
    private static final String z;
    private co a;
    private boolean b;

    static {
        char[] toCharArray = "N\u0012\u0016e>s\t_ekj\n\u0010e{~Z\u000by>x\u001f_yh\u007f\b\r\u007fz~\u001f\u00116|cZ\fc|y\u0016\u001eem\u007f\tQ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 26;
                    break;
                case ay.f /*1*/:
                    i2 = 122;
                    break;
                case ay.n /*2*/:
                    i2 = 127;
                    break;
                case ay.p /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 30;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Object clone() {
        return a();
    }

    public bD a() {
        return a();
    }

    static co a(b9 b9Var) {
        return b9Var.b();
    }

    public ah a() {
        return a();
    }

    public b9 a() {
        throw new UnsupportedOperationException(z);
    }

    protected b9() {
        this.a = co.f();
    }

    private co b() {
        this.a.h();
        this.b = false;
        return this.a;
    }
}
