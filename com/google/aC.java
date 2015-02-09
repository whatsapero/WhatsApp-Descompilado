package com.google;

import java.util.Map;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class ac extends aI {
    private static final String[] z;
    private co a;
    private eS b;
    private final M c;

    static {
        int i;
        int i2;
        String[] strArr = new String[3];
        char[] toCharArray = "0r\u0005\u0015M7{\u00162J\u0018x\u0000\u0011Q;{\u0016wQ-7\u001d9T'7\u00046T7sR1W,7\u0014>]2s\u0001wO7c\u001awU;d\u00016_;7\u0006.H;9".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 94;
                    break;
                case ay.f /*1*/:
                    i2 = 23;
                    break;
                case ay.n /*2*/:
                    i2 = 114;
                    break;
                case ay.p /*3*/:
                    i2 = 87;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0018~\u0017;\\\u001ar\u00014J7g\u00068J~s\u001d2K~y\u001d#\u00183v\u00064P~z\u0017$K?p\u0017wL'g\u0017y".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 94;
                    break;
                case ay.f /*1*/:
                    i2 = 23;
                    break;
                case ay.n /*2*/:
                    i2 = 114;
                    break;
                case ay.p /*3*/:
                    i2 = 87;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "3r\u00000]\u0018e\u001d:\u0010\u0013r\u0001$Y9r[w[?yR8V2nR:],p\u0017wU;d\u00016_;dR8^~c\u001a2\u0018-v\u001f2\u0018*n\u00022\u0016".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 94;
                    break;
                case ay.f /*1*/:
                    i2 = 23;
                    break;
                case ay.n /*2*/:
                    i2 = 114;
                    break;
                case ay.p /*3*/:
                    i2 = 87;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
    }

    public eS b() {
        return this.b;
    }

    public dw b() {
        try {
            if (a()) {
                return c();
            }
            throw b(new dw(this.c, this.a, this.b, null));
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public ac a(eb ebVar) {
        if (!(ebVar instanceof dw)) {
            return (ac) super.a(ebVar);
        }
        dw dwVar = (dw) ebVar;
        try {
            if (dw.c(dwVar) != this.c) {
                throw new IllegalArgumentException(z[2]);
            }
            a();
            this.a.a(dw.a(dwVar));
            a(dw.b(dwVar));
            return this;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public Object b(dW dWVar) {
        a(dWVar);
        Object b = this.a.b((eY) dWVar);
        if (b != null) {
            return b;
        }
        try {
            if (dWVar.f() == f0.MESSAGE) {
                b = dw.a(dWVar.c());
                if (!dy.b) {
                    return b;
                }
            }
            return dWVar.j();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public ac a(dW dWVar, Object obj) {
        a(dWVar);
        a();
        this.a.c(dWVar, obj);
        return this;
    }

    public M c() {
        return this.c;
    }

    public Object clone() {
        return e();
    }

    public cj a(dW dWVar, Object obj) {
        return a(dWVar, obj);
    }

    public cj a(eS eSVar) {
        return b(eSVar);
    }

    public a1 b() {
        return b();
    }

    public a1 a() {
        return c();
    }

    public cj a(eb ebVar) {
        return a(ebVar);
    }

    private void a(dW dWVar) {
        try {
            if (dWVar.g() != this.c) {
                throw new IllegalArgumentException(z[1]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public ac a(eS eSVar) {
        this.b = eS.b(this.b).a(eSVar).c();
        return this;
    }

    private void a() {
        try {
            if (this.a.a()) {
                this.a = this.a.g();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private ac(M m) {
        this.c = m;
        this.a = co.i();
        this.b = eS.e();
    }

    ac(M m, x xVar) {
        this(m);
    }

    public dw c() {
        this.a.h();
        return new dw(this.c, this.a, this.b, null);
    }

    public dw d() {
        return dw.a(this.c);
    }

    public aI a() {
        return e();
    }

    public ac b(dW dWVar) {
        try {
            a(dWVar);
            if (dWVar.f() == f0.MESSAGE) {
                return new ac(dWVar.c());
            }
            throw new IllegalArgumentException(z[0]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public ac b(dW dWVar, Object obj) {
        a(dWVar);
        a();
        this.a.b((eY) dWVar, obj);
        return this;
    }

    public cj a(dW dWVar) {
        return b(dWVar);
    }

    public eb b() {
        return b();
    }

    public Map a() {
        return this.a.d();
    }

    public boolean a(dW dWVar) {
        a(dWVar);
        return this.a.c((eY) dWVar);
    }

    public eb c() {
        return d();
    }

    public ac e() {
        ac acVar = new ac(this.c);
        acVar.a.a(this.a);
        acVar.a(this.b);
        return acVar;
    }

    public boolean a() {
        return dw.a(this.c, this.a);
    }

    public cj b(dW dWVar, Object obj) {
        return b(dWVar, obj);
    }

    public a1 c() {
        return d();
    }

    public ac b(eS eSVar) {
        this.b = eSVar;
        return this;
    }

    public ah a() {
        return e();
    }

    public eb a() {
        return c();
    }

    public aI a(eb ebVar) {
        return a(ebVar);
    }

    public aI a(eS eSVar) {
        return a(eSVar);
    }
}
