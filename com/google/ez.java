package com.google;

import java.util.Collections;
import java.util.Map;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class eZ extends d0 implements G {
    private static final String[] z;
    private final co e;

    static {
        int i;
        int i2;
        String[] strArr = new String[4];
        char[] toCharArray = "qW3\u0013FGF(\u0018\b]\\g\u0010GF\u000f3\u000fXQ\u000fe".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 52;
                    break;
                case ay.f /*1*/:
                    i2 = 47;
                    break;
                case ay.n /*2*/:
                    i2 = 71;
                    break;
                case ay.p /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0016\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 52;
                    break;
                case ay.f /*1*/:
                    i2 = 47;
                    break;
                case ay.n /*2*/:
                    i2 = 71;
                    break;
                case ay.p /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u0016\u000f0\u001eAWGg\u0012GQ\\g\u0018G@\u000f*\u0017\\WGg\u001bMG\\&\u0011M\u0014[>\u0006M\u0014\r".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 52;
                    break;
                case ay.f /*1*/:
                    i2 = 47;
                    break;
                case ay.n /*2*/:
                    i2 = 71;
                    break;
                case ay.p /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "rF\"\u001aLpJ4\u0015Z]_3\u0019Z\u0014K(\u0013[\u0014A(\u0002\bYN3\u0015@\u0014B\"\u0005[UH\"V\\M_\"X".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 52;
                    break;
                case ay.f /*1*/:
                    i2 = 47;
                    break;
                case ay.n /*2*/:
                    i2 = 71;
                    break;
                case ay.p /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[3] = new String(cArr).intern();
        z = strArr;
    }

    public final Object d(V v) {
        b(v);
        eY a = v.a();
        Object b = this.e.b(a);
        if (b != null) {
            return V.b(v, b);
        }
        try {
            if (a.a()) {
                return Collections.emptyList();
            }
            try {
                return a.f() == f0.MESSAGE ? v.b() : V.b(v, a.j());
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public Map a() {
        Map a = d0.a((d0) this);
        a.putAll(e());
        return Collections.unmodifiableMap(a);
    }

    protected eZ(a4 a4Var) {
        super(a4Var);
        this.e = a4.a(a4Var);
    }

    protected void c() {
        this.e.h();
    }

    public final Object a(V v, int i) {
        b(v);
        return V.a(v, this.e.a(v.a(), i));
    }

    public final int c(V v) {
        b(v);
        return this.e.a(v.a());
    }

    protected ey f() {
        return new ey(this, true, null);
    }

    public Object a(dW dWVar, int i) {
        try {
            if (!dWVar.n()) {
                return super.a(dWVar, i);
            }
            a(dWVar);
            return this.e.a((eY) dWVar, i);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int a(dW dWVar) {
        try {
            if (!dWVar.n()) {
                return super.a(dWVar);
            }
            a(dWVar);
            return this.e.a((eY) dWVar);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void b(V v) {
        try {
            if (v.a().g() != c()) {
                throw new IllegalArgumentException(z[0] + v.a().g().b() + z[2] + c().b() + z[1]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public final boolean a(V v) {
        b(v);
        return this.e.c(v.a());
    }

    protected boolean a(I i, ej ejVar, aC aCVar, int i2) {
        return aI.a(i, ejVar, aCVar, c(), null, this.e, i2);
    }

    public boolean a() {
        try {
            if (super.a()) {
                if (b()) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static co a(eZ eZVar) {
        return eZVar.e;
    }

    protected boolean b() {
        return this.e.c();
    }

    public boolean a(dW dWVar) {
        try {
            if (!dWVar.n()) {
                return super.a(dWVar);
            }
            a(dWVar);
            return this.e.c((eY) dWVar);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected eZ() {
        this.e = co.i();
    }

    protected int a() {
        return this.e.j();
    }

    protected Map e() {
        return this.e.d();
    }

    protected ey d() {
        return new ey(this, false, null);
    }

    private void a(dW dWVar) {
        try {
            if (dWVar.g() != c()) {
                throw new IllegalArgumentException(z[3]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected int c() {
        return this.e.b();
    }

    public Object b(dW dWVar) {
        if (!dWVar.n()) {
            return super.b(dWVar);
        }
        a(dWVar);
        Object b = this.e.b((eY) dWVar);
        if (b != null) {
            return b;
        }
        try {
            return dWVar.f() == f0.MESSAGE ? dw.a(dWVar.c()) : dWVar.j();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
