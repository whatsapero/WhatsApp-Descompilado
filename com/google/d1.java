package com.google;

import java.lang.reflect.Method;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class d1 extends dq {
    private static final String[] z;
    private final Method h;
    private final Method i;

    static {
        int i;
        String[] strArr = new String[3];
        char[] toCharArray = "S\u0003_y*t\u0004".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 17;
                    break;
                case ay.f /*1*/:
                    i2 = 118;
                    break;
                case ay.n /*2*/:
                    i2 = 54;
                    break;
                case ay.p /*3*/:
                    i2 = 21;
                    break;
                default:
                    i2 = 78;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "v\u0013B".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 17;
                    break;
                case ay.f /*1*/:
                    i2 = 118;
                    break;
                case ay.n /*2*/:
                    i2 = 54;
                    break;
                case ay.p /*3*/:
                    i2 = 21;
                    break;
                default:
                    i2 = 78;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u007f\u0013AW;x\u001aRp<".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 17;
                    break;
                case ay.f /*1*/:
                    i2 = 118;
                    break;
                case ay.n /*2*/:
                    i2 = 54;
                    break;
                case ay.p /*3*/:
                    i2 = 21;
                    break;
                default:
                    i2 = 78;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
    }

    public cj a() {
        return (cj) d0.a(this.h, null, new Object[0]);
    }

    public void b(ax axVar, Object obj) {
        super.b(axVar, a(obj));
    }

    d1(dW dWVar, String str, Class cls, Class cls2) {
        super(dWVar, str, cls, cls2);
        this.h = d0.b(this.e, z[2], new Class[0]);
        this.i = d0.b(cls2, z[1] + str + z[0], new Class[0]);
    }

    private Object a(Object obj) {
        return this.e.isInstance(obj) ? obj : ((cj) d0.a(this.h, null, new Object[0])).a((eb) obj).a();
    }
}
