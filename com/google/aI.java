package com.google;

public final class ai extends ax implements X {
    private Object e;
    private int f;
    private boolean g;

    public aI a() {
        return c();
    }

    private static ai d() {
        return new ai();
    }

    public eb a() {
        return a();
    }

    public aJ a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public ah a() {
        return c();
    }

    public aI a(eb ebVar) {
        return a(ebVar);
    }

    public e9 i() {
        return e9.b();
    }

    public a1 b() {
        return g();
    }

    public a1 c() {
        return i();
    }

    public ax a() {
        return c();
    }

    public M c() {
        return cN.L();
    }

    public a1 a() {
        return a();
    }

    public eb b() {
        return g();
    }

    private void f() {
        if (!d0.d) {
        }
    }

    private ai(b1 b1Var) {
        super(b1Var);
        this.e = "";
        f();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ai a(com.google.I r5, com.google.aC r6) {
        /*
        r4_this = this;
        r2 = 0;
        r0 = com.google.e9.e;	 Catch:{ gc -> 0x000f }
        r0 = r0.a(r5, r6);	 Catch:{ gc -> 0x000f }
        r0 = (com.google.e9) r0;	 Catch:{ gc -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ gc -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.c();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.e9) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.a(com.google.I, com.google.aC):com.google.ai");
    }

    public e9 a() {
        int i = 1;
        e9 e9Var = new e9((ax) this, null);
        int i2 = this.f;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        e9.a(e9Var, this.e);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        e9.a(e9Var, this.g);
        e9.a(e9Var, i);
        b();
        return e9Var;
    }

    static ai h() {
        return d();
    }

    public boolean e() {
        return (this.f & 1) == 1;
    }

    ai(b1 b1Var, gY gYVar) {
        this(b1Var);
    }

    private ai() {
        this.e = "";
        f();
    }

    public cj a(eb ebVar) {
        return a(ebVar);
    }

    public ai a(boolean z) {
        this.f |= 2;
        this.g = z;
        e();
        return this;
    }

    public final boolean a() {
        return e() && b();
    }

    public eb c() {
        return i();
    }

    public ai a(e9 e9Var) {
        if (e9Var != e9.b()) {
            if (e9Var.k()) {
                this.f |= 1;
                this.e = e9.a(e9Var);
                e();
            }
            if (e9Var.d()) {
                a(e9Var.g());
            }
            a(e9Var.b());
        }
        return this;
    }

    public aI a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public ai a(eb ebVar) {
        if (ebVar instanceof e9) {
            return a((e9) ebVar);
        }
        super.a(ebVar);
        return this;
    }

    public ai c() {
        return d().a(a());
    }

    public ah a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public Object clone() {
        return c();
    }

    protected er g() {
        return cN.B().a(e9.class, ai.class);
    }

    public e9 g() {
        Object a = a();
        if (a.a()) {
            return a;
        }
        throw b(a);
    }

    public boolean b() {
        return (this.f & 2) == 2;
    }
}
