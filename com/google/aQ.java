package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class aq {
    private static final String[] z;
    private final a1 a;
    private final Object b;
    private final e0 c;
    private final a1 d;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "G\u000b@\u001bfj\u0011B\u0003'`\u0010E\u0019!]\u0007\\\u0012\u0002l\u0018M\u0002*}7B\u00042h\u0010O\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 9;
                    break;
                case ay.f /*1*/:
                    i2 = 126;
                    break;
                case ay.n /*2*/:
                    i2 = 44;
                    break;
                case ay.p /*3*/:
                    i2 = 119;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "G\u000b@\u001bfd\u001b_\u0004'n\u001bh\u0012 h\u000b@\u0003\u000fg\rX\u0016(j\u001b".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 9;
                    break;
                case ay.f /*1*/:
                    i2 = 126;
                    break;
                case ay.n /*2*/:
                    i2 = 44;
                    break;
                case ay.p /*3*/:
                    i2 = 119;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public int b() {
        return this.c.e();
    }

    aq(a1 a1Var, Object obj, a1 a1Var2, e0 e0Var, gh ghVar) {
        this(a1Var, obj, a1Var2, e0Var);
    }

    static e0 a(aq aqVar) {
        return aqVar.c;
    }

    static Object c(aq aqVar) {
        return aqVar.b;
    }

    public a1 a() {
        return this.d;
    }

    static a1 b(aq aqVar) {
        return aqVar.a;
    }

    private aq(a1 a1Var, Object obj, a1 a1Var2, e0 e0Var) {
        if (a1Var == null) {
            throw new IllegalArgumentException(z[0]);
        }
        try {
            if (e0Var.d() == bJ.MESSAGE && a1Var2 == null) {
                throw new IllegalArgumentException(z[1]);
            }
            this.d = a1Var;
            this.b = obj;
            this.a = a1Var2;
            this.c = e0Var;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
