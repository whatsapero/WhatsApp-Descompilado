package com.google;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class f5 {
    private static final Logger a;
    private static final Set b;
    private static final Map c;
    private static final String z;

    static f8 b(int i) {
        if (!b.contains(Integer.valueOf(i))) {
            return null;
        }
        synchronized (c) {
            if (!c.containsKey(Integer.valueOf(i))) {
                a(i);
            }
        }
        return (f8) c.get(Integer.valueOf(i));
    }

    private static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                a.log(Level.WARNING, e.toString());
            }
        }
    }

    private static void a(int i) {
        InputStream objectInputStream;
        IOException e;
        Throwable th;
        int i2 = c8.b;
        try {
            objectInputStream = new ObjectInputStream(fl.class.getResourceAsStream(z + i));
            try {
                a5 a5Var = new a5();
                a5Var.readExternal(objectInputStream);
                for (f8 f8Var : a5Var.b()) {
                    c.put(Integer.valueOf(f8Var.N()), f8Var);
                    if (i2 != 0) {
                        break;
                    }
                }
                a(objectInputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    a.log(Level.WARNING, e.toString());
                    a(objectInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    a(objectInputStream);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            objectInputStream = null;
            a.log(Level.WARNING, e.toString());
            a(objectInputStream);
        } catch (Throwable th3) {
            th = th3;
            objectInputStream = null;
            a(objectInputStream);
            throw th;
        }
    }

    private f5() {
    }

    static {
        char[] toCharArray = "yF\u0018g\u000e1J\u0018mM3\n\u001e;\u00198\n\u0007bN8@\u0019\u007fL4@\u0005y\u000e2D\u0003k\u000e\u0006M\u0018dD\u0018P\u001ahD$d\u001b~D$K\u0016~D\u0010J\u0005g@\"V'xN\"J(".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 86;
                    break;
                case ay.f /*1*/:
                    i2 = 37;
                    break;
                case ay.n /*2*/:
                    i2 = 119;
                    break;
                case ay.p /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 33;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        a = Logger.getLogger(f5.class.getName());
        c = Collections.synchronizedMap(new HashMap());
        b = c6.a();
    }
}
