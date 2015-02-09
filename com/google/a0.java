package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a0 extends ax implements bc {
    private Object e;
    private int f;
    private List g;
    private Object h;
    private List i;

    public eb c() {
        return g();
    }

    public ee g() {
        return ee.f();
    }

    public ah a() {
        return c();
    }

    public a0 a(eb ebVar) {
        if (ebVar instanceof ee) {
            return a((ee) ebVar);
        }
        super.a(ebVar);
        return this;
    }

    public aI a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    private a0(b1 b1Var) {
        super(b1Var);
        this.i = Collections.emptyList();
        this.g = Collections.emptyList();
        this.h = "";
        this.e = "";
        j();
    }

    public eb b() {
        return b();
    }

    protected er g() {
        return cN.l().a(ee.class, a0.class);
    }

    public aJ a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.a0 a(com.google.I r5, com.google.aC r6) {
        /*
        r4_this = this;
        r2 = 0;
        r0 = com.google.ee.l;	 Catch:{ gc -> 0x000f }
        r0 = r0.a(r5, r6);	 Catch:{ gc -> 0x000f }
        r0 = (com.google.ee) r0;	 Catch:{ gc -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ gc -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.c();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.ee) r0;	 Catch:{ all -> 0x0026 }
        throw r1;	 Catch:{ all -> 0x0018 }
    L_0x0018:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001c:
        if (r1 == 0) goto L_0x0021;
    L_0x001e:
        r4.a(r1);	 Catch:{ gc -> 0x0022 }
    L_0x0021:
        throw r0;
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a0.a(com.google.I, com.google.aC):com.google.a0");
    }

    public final boolean a() {
        return true;
    }

    private a0() {
        this.i = Collections.emptyList();
        this.g = Collections.emptyList();
        this.h = "";
        this.e = "";
        j();
    }

    private void f() {
        if ((this.f & 1) != 1) {
            this.i = new ArrayList(this.i);
            this.f |= 1;
        }
    }

    public ah a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    private static a0 a() {
        return new a0();
    }

    public eb a() {
        return h();
    }

    public a1 c() {
        return g();
    }

    public a0 c() {
        return a().a(h());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.a0 a(com.google.ee r4) {
        /*
        r3_this = this;
        r0 = com.google.dy.b;
        r1 = com.google.ee.f();
        if (r4 != r1) goto L_0x0009;
    L_0x0008:
        return r3;
    L_0x0009:
        r1 = com.google.ee.e(r4);
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x0038;
    L_0x0013:
        r1 = r3.i;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0029;
    L_0x001b:
        r1 = com.google.ee.e(r4);
        r3.i = r1;
        r1 = r3.f;
        r1 = r1 & -2;
        r3.f = r1;
        if (r0 == 0) goto L_0x0035;
    L_0x0029:
        r3.f();
        r1 = r3.i;
        r2 = com.google.ee.e(r4);
        r1.addAll(r2);
    L_0x0035:
        r3.e();
    L_0x0038:
        r1 = com.google.ee.a(r4);
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x0067;
    L_0x0042:
        r1 = r3.g;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0058;
    L_0x004a:
        r1 = com.google.ee.a(r4);
        r3.g = r1;
        r1 = r3.f;
        r1 = r1 & -3;
        r3.f = r1;
        if (r0 == 0) goto L_0x0064;
    L_0x0058:
        r3.l();
        r0 = r3.g;
        r1 = com.google.ee.a(r4);
        r0.addAll(r1);
    L_0x0064:
        r3.e();
    L_0x0067:
        r0 = r4.h();
        if (r0 == 0) goto L_0x007c;
    L_0x006d:
        r0 = r3.f;
        r0 = r0 | 4;
        r3.f = r0;
        r0 = com.google.ee.b(r4);
        r3.h = r0;
        r3.e();
    L_0x007c:
        r0 = r4.b();
        if (r0 == 0) goto L_0x0091;
    L_0x0082:
        r0 = r3.f;
        r0 = r0 | 8;
        r3.f = r0;
        r0 = com.google.ee.d(r4);
        r3.e = r0;
        r3.e();
    L_0x0091:
        r0 = r4.b();
        r3.a(r0);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a0.a(com.google.ee):com.google.a0");
    }

    public ee h() {
        int i = 1;
        ee eeVar = new ee((ax) this, null);
        int i2 = this.f;
        if ((this.f & 1) == 1) {
            this.i = Collections.unmodifiableList(this.i);
            this.f &= -2;
        }
        ee.b(eeVar, this.i);
        if ((this.f & 2) == 2) {
            this.g = Collections.unmodifiableList(this.g);
            this.f &= -3;
        }
        ee.a(eeVar, this.g);
        if ((i2 & 4) != 4) {
            i = 0;
        }
        ee.a(eeVar, this.h);
        if ((i2 & 8) == 8) {
            i |= 2;
        }
        ee.b(eeVar, this.e);
        ee.a(eeVar, i);
        b();
        return eeVar;
    }

    static a0 k() {
        return a();
    }

    public ax a() {
        return c();
    }

    public cj a(eb ebVar) {
        return a(ebVar);
    }

    public aI a(eb ebVar) {
        return a(ebVar);
    }

    public Object clone() {
        return c();
    }

    public a1 b() {
        return b();
    }

    public ee b() {
        Object h = h();
        if (h.a()) {
            return h;
        }
        throw b(h);
    }

    public a1 a() {
        return h();
    }

    private void j() {
        if (!d0.d) {
        }
    }

    public M c() {
        return cN.E();
    }

    private void l() {
        if ((this.f & 2) != 2) {
            this.g = new ArrayList(this.g);
            this.f |= 2;
        }
    }

    public aI a() {
        return c();
    }

    a0(b1 b1Var, gY gYVar) {
        this(b1Var);
    }
}
