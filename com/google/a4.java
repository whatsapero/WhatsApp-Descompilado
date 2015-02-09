package com.google;

import java.util.Collections;
import java.util.Map;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class a4 extends ax implements G {
    private static final String[] z;
    private co e;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "\u007f\u0019r$Y}\u0015d+OP\u0000c'O\u0019\u0014x-N\u0019\u001ex<\u001dT\u0011c+U\u0019\u001dr;NX\u0017rhI@\u0000rf".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 57;
                    break;
                case ay.f /*1*/:
                    i2 = 112;
                    break;
                case ay.n /*2*/:
                    i2 = 23;
                    break;
                case ay.p /*3*/:
                    i2 = 72;
                    break;
                default:
                    i2 = 61;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "m\u0018~;\u001dP\u00037;HI\u0000x;X]Pc'\u001d[\u00157'K\\\u0002e!Y]\u0015yh_@Pd=_Z\u001cv;N\\\u00039".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 57;
                    break;
                case ay.f /*1*/:
                    i2 = 112;
                    break;
                case ay.n /*2*/:
                    i2 = 23;
                    break;
                case ay.p /*3*/:
                    i2 = 72;
                    break;
                default:
                    i2 = 61;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public cj a(dW dWVar, Object obj) {
        return a(dWVar, obj);
    }

    protected final void a(eZ eZVar) {
        c();
        this.e.a(eZ.a(eZVar));
        e();
    }

    public boolean a() {
        try {
            if (super.a()) {
                if (e()) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
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
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    private void c() {
        try {
            if (this.e.a()) {
                this.e = this.e.g();
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public aI a() {
        return a();
    }

    protected boolean e() {
        return this.e.c();
    }

    private void a(dW dWVar) {
        try {
            if (dWVar.g() != c()) {
                throw new IllegalArgumentException(z[0]);
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public Object clone() {
        return a();
    }

    protected a4(b1 b1Var) {
        super(b1Var);
        this.e = co.f();
    }

    public a4 a() {
        throw new UnsupportedOperationException(z[1]);
    }

    public boolean a(dW dWVar) {
        try {
            if (!dWVar.n()) {
                return super.a(dWVar);
            }
            a(dWVar);
            return this.e.c((eY) dWVar);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    private co d() {
        this.e.h();
        return this.e;
    }

    public ax b(dW dWVar, Object obj) {
        return a(dWVar, obj);
    }

    public Map a() {
        Map a = ax.a((ax) this);
        a.putAll(this.e.d());
        return Collections.unmodifiableMap(a);
    }

    static co a(a4 a4Var) {
        return a4Var.d();
    }

    public a4 a(dW dWVar, Object obj) {
        try {
            if (!dWVar.n()) {
                return (a4) super.b(dWVar, obj);
            }
            a(dWVar);
            c();
            this.e.c(dWVar, obj);
            e();
            return this;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public ax a() {
        return a();
    }

    public a4 b(dW dWVar, Object obj) {
        try {
            if (!dWVar.n()) {
                return (a4) super.a(dWVar, obj);
            }
            a(dWVar);
            c();
            this.e.b((eY) dWVar, obj);
            e();
            return this;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public ah a() {
        return a();
    }

    public cj b(dW dWVar, Object obj) {
        return b(dWVar, obj);
    }

    protected a4() {
        this.e = co.f();
    }

    public ax a(dW dWVar, Object obj) {
        return b(dWVar, obj);
    }
}
