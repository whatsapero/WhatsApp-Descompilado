package de.greenrobot.event.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class l {
    private static final String z;
    public final Map a;

    static {
        char[] toCharArray = "/d\u007f\rQ\u0004h6\u0018H\u0002+2\u001bR\u0012j8\u001b\u0001\u0013n,\rN\u0014y<\u001b\u0001(O\u007f\u0018N\u0014e;^G\u000ey\u007f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 95;
                    break;
                case ay.p /*3*/:
                    i2 = 126;
                    break;
                default:
                    i2 = 33;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer b(java.lang.Throwable r4) {
        /*
        r3_this = this;
        r0 = 20;
        r1 = r4;
    L_0x0003:
        r2 = r3.a(r1);
        if (r2 == 0) goto L_0x000b;
    L_0x0009:
        r0 = r2;
    L_0x000a:
        return r0;
    L_0x000b:
        r1 = r1.getCause();
        r0 = r0 + -1;
        if (r0 <= 0) goto L_0x0017;
    L_0x0013:
        if (r1 == r4) goto L_0x0017;
    L_0x0015:
        if (r1 != 0) goto L_0x0003;
    L_0x0017:
        r0 = de.greenrobot.event.g.k;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r1 = r1.append(r2);
        r1 = r1.append(r4);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
        r0 = 0;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.event.util.l.b(java.lang.Throwable):java.lang.Integer");
    }

    protected Integer a(Throwable th) {
        boolean z = h.a;
        Class cls = th.getClass();
        Integer num = (Integer) this.a.get(cls);
        if (num != null) {
            return num;
        }
        Class cls2 = null;
        Integer num2 = num;
        for (Entry entry : this.a.entrySet()) {
            Integer num3;
            Class cls3;
            Class cls4 = (Class) entry.getKey();
            if (cls4.isAssignableFrom(cls) && (cls2 == null || cls2.isAssignableFrom(cls4))) {
                Class cls5 = cls4;
                num3 = (Integer) entry.getValue();
                cls3 = cls5;
            } else {
                cls3 = cls2;
                num3 = num2;
            }
            if (z) {
                return num3;
            }
            cls2 = cls3;
            num2 = num3;
        }
        return num2;
    }

    public l a(Class cls, int i) {
        this.a.put(cls, Integer.valueOf(i));
        return this;
    }

    public l() {
        this.a = new HashMap();
    }
}
