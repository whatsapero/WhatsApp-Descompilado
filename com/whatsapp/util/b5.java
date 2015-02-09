package com.whatsapp.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class b5 implements ThreadFactory {
    private static final String z;
    private final AtomicInteger a;

    static {
        char[] toCharArray = "\u0019n a\u0012\u000fv156!t*p\u0013n%".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 6;
                    break;
                case ay.n /*2*/:
                    i2 = 65;
                    break;
                case ay.p /*3*/:
                    i2 = 21;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    b5() {
        this.a = new AtomicInteger(1);
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(new m(this, runnable), z + this.a.getAndIncrement());
    }
}
