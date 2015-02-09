package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.whispersystems.libaxolotl.ay;

public abstract class BaseAlgorithmParameters extends AlgorithmParametersSpi {
    private static final String z;

    static {
        char[] toCharArray = "\u0012O\u000bM\u0004\u0016S\u0018\u0018\u001d\u001c\u001d\u000b]\u001d#\\\u001eY\u0004\u0016I\tJ:\u0003X\u000f\u0018\u0004\u0006N\u0018\u0018\u0007\u001cILZ\fSS\u0019T\u0005".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 115;
                    break;
                case ay.f /*1*/:
                    i2 = 61;
                    break;
                case ay.n /*2*/:
                    i2 = 108;
                    break;
                case ay.p /*3*/:
                    i2 = 56;
                    break;
                default:
                    i2 = 105;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class cls);

    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        try {
            throw new NullPointerException(z);
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
