package org.whispersystems.libaxolotl;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ecc.a;
import org.whispersystems.libaxolotl.ecc.f;

public class ac {
    private static final String z;
    private final az a;
    private final a b;
    private final f c;
    private final aK d;
    private final a e;
    private final b2 f;

    static {
        char[] toCharArray = "_T\u0005.cg@\u00057&0".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 17;
                    break;
                case ay.f /*1*/:
                    i2 = 33;
                    break;
                case ay.n /*2*/:
                    i2 = 105;
                    break;
                case ay.p /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ac(az azVar, a aVar, a aVar2, aK aKVar, b2 b2Var, f fVar) {
        this.a = azVar;
        this.b = aVar;
        this.e = aVar2;
        this.d = aKVar;
        this.f = b2Var;
        this.c = fVar;
        if (azVar == null || aVar == null || aVar2 == null || aKVar == null || b2Var == null || fVar == null) {
            try {
                throw new IllegalArgumentException(z);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public a c() {
        return this.e;
    }

    public a e() {
        return this.b;
    }

    public f g() {
        return this.c;
    }

    public b2 b() {
        return this.f;
    }

    public static ab f() {
        return new ab();
    }

    public aK d() {
        return this.d;
    }

    public az a() {
        return this.a;
    }
}
