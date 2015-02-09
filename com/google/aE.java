package com.google;

import java.lang.reflect.Method;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class ae extends Z {
    private static final String z;
    private final Method k;

    static {
        char[] toCharArray = "Y\u007f\u000eG6^v\u001d`1".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 55;
                    break;
                case ay.f /*1*/:
                    i2 = 26;
                    break;
                case ay.n /*2*/:
                    i2 = 121;
                    break;
                case ay.p /*3*/:
                    i2 = 5;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private Object a(Object obj) {
        return this.a.isInstance(obj) ? obj : ((cj) d0.a(this.k, null, new Object[0])).a((eb) obj).b();
    }

    public cj a() {
        return (cj) d0.a(this.k, null, new Object[0]);
    }

    public void a(ax axVar, Object obj) {
        super.a(axVar, a(obj));
    }

    ae(dW dWVar, String str, Class cls, Class cls2) {
        super(dWVar, str, cls, cls2);
        this.k = d0.b(this.a, z, new Class[0]);
    }
}
