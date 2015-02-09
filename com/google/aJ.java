package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aj extends a4 implements eI {
    private boolean f;
    private gk g;
    private boolean h;
    private int i;
    private List j;
    private fd k;
    private Object l;
    private boolean m;
    private boolean n;

    public ah a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    private void j() {
        try {
            if ((this.i & 64) != 64) {
                this.j = new ArrayList(this.j);
                this.i |= 64;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public eD a(int i) {
        try {
            return this.g == null ? (eD) this.j.get(i) : (eD) this.g.b(i);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public aJ a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.aj a(com.google.eJ r5) {
        /*
        r4_this = this;
        r0 = 0;
        r1 = com.google.dy.b;
        r2 = com.google.eJ.d();	 Catch:{ NullPointerException -> 0x000a }
        if (r5 != r2) goto L_0x000c;
    L_0x0009:
        return r4;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r2 = r5.e();	 Catch:{ NullPointerException -> 0x00de }
        if (r2 == 0) goto L_0x0019;
    L_0x0012:
        r2 = r5.o();	 Catch:{ NullPointerException -> 0x00de }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x00de }
    L_0x0019:
        r2 = r5.r();	 Catch:{ NullPointerException -> 0x00e0 }
        if (r2 == 0) goto L_0x0026;
    L_0x001f:
        r2 = r5.h();	 Catch:{ NullPointerException -> 0x00e0 }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x00e0 }
    L_0x0026:
        r2 = r5.u();	 Catch:{ NullPointerException -> 0x00e2 }
        if (r2 == 0) goto L_0x0033;
    L_0x002c:
        r2 = r5.t();	 Catch:{ NullPointerException -> 0x00e2 }
        r4.d(r2);	 Catch:{ NullPointerException -> 0x00e2 }
    L_0x0033:
        r2 = r5.v();	 Catch:{ NullPointerException -> 0x00e4 }
        if (r2 == 0) goto L_0x0040;
    L_0x0039:
        r2 = r5.c();	 Catch:{ NullPointerException -> 0x00e4 }
        r4.b(r2);	 Catch:{ NullPointerException -> 0x00e4 }
    L_0x0040:
        r2 = r5.w();	 Catch:{ NullPointerException -> 0x00e6 }
        if (r2 == 0) goto L_0x0055;
    L_0x0046:
        r2 = r4.i;	 Catch:{ NullPointerException -> 0x00e6 }
        r2 = r2 | 16;
        r4.i = r2;	 Catch:{ NullPointerException -> 0x00e6 }
        r2 = com.google.eJ.c(r5);	 Catch:{ NullPointerException -> 0x00e6 }
        r4.l = r2;	 Catch:{ NullPointerException -> 0x00e6 }
        r4.e();	 Catch:{ NullPointerException -> 0x00e6 }
    L_0x0055:
        r2 = r5.l();	 Catch:{ NullPointerException -> 0x00e8 }
        if (r2 == 0) goto L_0x0062;
    L_0x005b:
        r2 = r5.j();	 Catch:{ NullPointerException -> 0x00e8 }
        r4.c(r2);	 Catch:{ NullPointerException -> 0x00e8 }
    L_0x0062:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x00ea }
        if (r2 != 0) goto L_0x0097;
    L_0x0066:
        r2 = com.google.eJ.a(r5);	 Catch:{ NullPointerException -> 0x00ec }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00ec }
        if (r2 != 0) goto L_0x00d2;
    L_0x0070:
        r2 = r4.j;	 Catch:{ NullPointerException -> 0x00ee }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00ee }
        if (r2 == 0) goto L_0x0086;
    L_0x0078:
        r2 = com.google.eJ.a(r5);	 Catch:{ NullPointerException -> 0x00f0 }
        r4.j = r2;	 Catch:{ NullPointerException -> 0x00f0 }
        r2 = r4.i;	 Catch:{ NullPointerException -> 0x00f0 }
        r2 = r2 & -65;
        r4.i = r2;	 Catch:{ NullPointerException -> 0x00f0 }
        if (r1 == 0) goto L_0x0092;
    L_0x0086:
        r4.j();	 Catch:{ NullPointerException -> 0x00f0 }
        r2 = r4.j;	 Catch:{ NullPointerException -> 0x00f0 }
        r3 = com.google.eJ.a(r5);	 Catch:{ NullPointerException -> 0x00f0 }
        r2.addAll(r3);	 Catch:{ NullPointerException -> 0x00f0 }
    L_0x0092:
        r4.e();	 Catch:{ NullPointerException -> 0x00f2 }
        if (r1 == 0) goto L_0x00d2;
    L_0x0097:
        r2 = com.google.eJ.a(r5);	 Catch:{ NullPointerException -> 0x00f4 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00f4 }
        if (r2 != 0) goto L_0x00d2;
    L_0x00a1:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x00f6 }
        r2 = r2.c();	 Catch:{ NullPointerException -> 0x00f6 }
        if (r2 == 0) goto L_0x00c9;
    L_0x00a9:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x00f8 }
        r2.e();	 Catch:{ NullPointerException -> 0x00f8 }
        r2 = 0;
        r4.g = r2;	 Catch:{ NullPointerException -> 0x00f8 }
        r2 = com.google.eJ.a(r5);	 Catch:{ NullPointerException -> 0x00f8 }
        r4.j = r2;	 Catch:{ NullPointerException -> 0x00f8 }
        r2 = r4.i;	 Catch:{ NullPointerException -> 0x00f8 }
        r2 = r2 & -65;
        r4.i = r2;	 Catch:{ NullPointerException -> 0x00f8 }
        r2 = com.google.d0.d;	 Catch:{ NullPointerException -> 0x00f8 }
        if (r2 == 0) goto L_0x00c5;
    L_0x00c1:
        r0 = r4.a();	 Catch:{ NullPointerException -> 0x00f8 }
    L_0x00c5:
        r4.g = r0;	 Catch:{ NullPointerException -> 0x00fa }
        if (r1 == 0) goto L_0x00d2;
    L_0x00c9:
        r0 = r4.g;	 Catch:{ NullPointerException -> 0x00fa }
        r1 = com.google.eJ.a(r5);	 Catch:{ NullPointerException -> 0x00fa }
        r0.a(r1);	 Catch:{ NullPointerException -> 0x00fa }
    L_0x00d2:
        r4.a(r5);
        r0 = r5.b();
        r4.a(r0);
        goto L_0x0009;
    L_0x00de:
        r0 = move-exception;
        throw r0;
    L_0x00e0:
        r0 = move-exception;
        throw r0;
    L_0x00e2:
        r0 = move-exception;
        throw r0;
    L_0x00e4:
        r0 = move-exception;
        throw r0;
    L_0x00e6:
        r0 = move-exception;
        throw r0;
    L_0x00e8:
        r0 = move-exception;
        throw r0;
    L_0x00ea:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ec }
    L_0x00ec:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ee }
    L_0x00ee:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00f0 }
    L_0x00f0:
        r0 = move-exception;
        throw r0;
    L_0x00f2:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00f4 }
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00f6 }
    L_0x00f6:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00f8 }
    L_0x00f8:
        r0 = move-exception;
        throw r0;
    L_0x00fa:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aj.a(com.google.eJ):com.google.aj");
    }

    public aj d(boolean z) {
        this.i |= 4;
        this.m = z;
        e();
        return this;
    }

    public cj a(eb ebVar) {
        return a(ebVar);
    }

    public a1 b() {
        return g();
    }

    private void f() {
        try {
            if (d0.d) {
                a();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public aj a(boolean z) {
        this.i |= 2;
        this.n = z;
        e();
        return this;
    }

    public int i() {
        try {
            return this.g == null ? this.j.size() : this.g.j();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public eb b() {
        return g();
    }

    private aj() {
        this.k = fd.STRING;
        this.l = "";
        this.j = Collections.emptyList();
        f();
    }

    public aj c(boolean z) {
        this.i |= 32;
        this.h = z;
        e();
        return this;
    }

    public eJ n() {
        return eJ.d();
    }

    public a1 c() {
        return n();
    }

    public eb c() {
        return n();
    }

    public aI a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public aj b(boolean z) {
        this.i |= 8;
        this.f = z;
        e();
        return this;
    }

    public aj m() {
        return h().a(k());
    }

    public aj a(eb ebVar) {
        try {
            if (ebVar instanceof eJ) {
                this = a((eJ) ebVar);
            } else {
                super.a(ebVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private aj(b1 b1Var) {
        super(b1Var);
        this.k = fd.STRING;
        this.l = "";
        this.j = Collections.emptyList();
        f();
    }

    aj(b1 b1Var, gY gYVar) {
        this(b1Var);
    }

    public aI a(eb ebVar) {
        return a(ebVar);
    }

    private static aj h() {
        return new aj();
    }

    public Object clone() {
        return m();
    }

    static aj l() {
        return h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.aj a(com.google.I r5, com.google.aC r6) {
        /*
        r4_this = this;
        r2 = 0;
        r0 = com.google.eJ.x;	 Catch:{ gc -> 0x000f }
        r0 = r0.a(r5, r6);	 Catch:{ gc -> 0x000f }
        r0 = (com.google.eJ) r0;	 Catch:{ gc -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ gc -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.c();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.eJ) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.aj.a(com.google.I, com.google.aC):com.google.aj");
    }

    public a4 a() {
        return m();
    }

    public ah a() {
        return m();
    }

    public ax a() {
        return m();
    }

    public a1 a() {
        return k();
    }

    public aI a() {
        return m();
    }

    public aj a(fd fdVar) {
        if (fdVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.i |= 1;
        this.k = fdVar;
        e();
        return this;
    }

    private gk a() {
        try {
            if (this.g == null) {
                boolean z;
                List list = this.j;
                if ((this.i & 64) == 64) {
                    z = true;
                } else {
                    z = false;
                }
                this.g = new gk(list, z, h(), f());
                this.j = null;
            }
            return this.g;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    protected er g() {
        return cN.O().a(eJ.class, aj.class);
    }

    public eJ g() {
        Object k = k();
        try {
            if (k.a()) {
                return k;
            }
            throw b(k);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public eb a() {
        return k();
    }

    public M c() {
        return cN.v();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.eJ k() {
        /*
        r5_this = this;
        r0 = 1;
        r2 = new com.google.eJ;
        r1 = 0;
        r2.<init>(r5, r1);
        r3 = r5.i;
        r1 = 0;
        r4 = r3 & 1;
        if (r4 != r0) goto L_0x008b;
    L_0x000e:
        r1 = r5.k;
        com.google.eJ.a(r2, r1);
        r1 = r3 & 2;
        r4 = 2;
        if (r1 != r4) goto L_0x001a;
    L_0x0018:
        r0 = r0 | 2;
    L_0x001a:
        r1 = r5.n;
        com.google.eJ.c(r2, r1);
        r1 = r3 & 4;
        r4 = 4;
        if (r1 != r4) goto L_0x0026;
    L_0x0024:
        r0 = r0 | 4;
    L_0x0026:
        r1 = r5.m;
        com.google.eJ.a(r2, r1);
        r1 = r3 & 8;
        r4 = 8;
        if (r1 != r4) goto L_0x0033;
    L_0x0031:
        r0 = r0 | 8;
    L_0x0033:
        r1 = r5.f;
        com.google.eJ.d(r2, r1);
        r1 = r3 & 16;
        r4 = 16;
        if (r1 != r4) goto L_0x0040;
    L_0x003e:
        r0 = r0 | 16;
    L_0x0040:
        r1 = r5.l;
        com.google.eJ.a(r2, r1);
        r1 = r3 & 32;
        r3 = 32;
        if (r1 != r3) goto L_0x004d;
    L_0x004b:
        r0 = r0 | 32;
    L_0x004d:
        r1 = r5.h;	 Catch:{ NullPointerException -> 0x0085 }
        com.google.eJ.b(r2, r1);	 Catch:{ NullPointerException -> 0x0085 }
        r1 = r5.g;	 Catch:{ NullPointerException -> 0x0085 }
        if (r1 != 0) goto L_0x0075;
    L_0x0056:
        r1 = r5.i;	 Catch:{ NullPointerException -> 0x0087 }
        r1 = r1 & 64;
        r3 = 64;
        if (r1 != r3) goto L_0x006c;
    L_0x005e:
        r1 = r5.j;	 Catch:{ NullPointerException -> 0x0087 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ NullPointerException -> 0x0087 }
        r5.j = r1;	 Catch:{ NullPointerException -> 0x0087 }
        r1 = r5.i;	 Catch:{ NullPointerException -> 0x0087 }
        r1 = r1 & -65;
        r5.i = r1;	 Catch:{ NullPointerException -> 0x0087 }
    L_0x006c:
        r1 = r5.j;	 Catch:{ NullPointerException -> 0x0089 }
        com.google.eJ.a(r2, r1);	 Catch:{ NullPointerException -> 0x0089 }
        r1 = com.google.dy.b;	 Catch:{ NullPointerException -> 0x0089 }
        if (r1 == 0) goto L_0x007e;
    L_0x0075:
        r1 = r5.g;	 Catch:{ NullPointerException -> 0x0089 }
        r1 = r1.g();	 Catch:{ NullPointerException -> 0x0089 }
        com.google.eJ.a(r2, r1);	 Catch:{ NullPointerException -> 0x0089 }
    L_0x007e:
        com.google.eJ.a(r2, r0);
        r5.b();
        return r2;
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = move-exception;
        throw r0;
    L_0x008b:
        r0 = r1;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aj.k():com.google.eJ");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
        r4_this = this;
        r1 = 0;
        r2 = com.google.dy.b;
        r0 = r1;
    L_0x0004:
        r3 = r4.i();
        if (r0 >= r3) goto L_0x001b;
    L_0x000a:
        r3 = r4.a(r0);	 Catch:{ NullPointerException -> 0x0015 }
        r3 = r3.a();	 Catch:{ NullPointerException -> 0x0015 }
        if (r3 != 0) goto L_0x0017;
    L_0x0014:
        return r1;
    L_0x0015:
        r0 = move-exception;
        throw r0;
    L_0x0017:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0004;
    L_0x001b:
        r0 = r4.e();	 Catch:{ NullPointerException -> 0x0023 }
        if (r0 == 0) goto L_0x0014;
    L_0x0021:
        r1 = 1;
        goto L_0x0014;
    L_0x0023:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aj.a():boolean");
    }
}
