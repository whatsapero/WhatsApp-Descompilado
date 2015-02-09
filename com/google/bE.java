package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class be extends a4 implements eM {
    private gk f;
    private int g;
    private List h;

    public eb b() {
        return i();
    }

    public aI a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.be a(com.google.e3 r5) {
        /*
        r4_this = this;
        r0 = 0;
        r1 = com.google.dy.b;
        r2 = com.google.e3.c();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r4.f;
        if (r2 != 0) goto L_0x003f;
    L_0x000e:
        r2 = com.google.e3.b(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0079;
    L_0x0018:
        r2 = r4.h;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x002e;
    L_0x0020:
        r2 = com.google.e3.b(r5);
        r4.h = r2;
        r2 = r4.g;
        r2 = r2 & -2;
        r4.g = r2;
        if (r1 == 0) goto L_0x003a;
    L_0x002e:
        r4.a();
        r2 = r4.h;
        r3 = com.google.e3.b(r5);
        r2.addAll(r3);
    L_0x003a:
        r4.e();
        if (r1 == 0) goto L_0x0079;
    L_0x003f:
        r2 = com.google.e3.b(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0079;
    L_0x0049:
        r2 = r4.f;
        r2 = r2.c();
        if (r2 == 0) goto L_0x0070;
    L_0x0051:
        r2 = r4.f;
        r2.e();
        r4.f = r0;
        r2 = com.google.e3.b(r5);
        r4.h = r2;
        r2 = r4.g;
        r2 = r2 & -2;
        r4.g = r2;
        r2 = com.google.d0.d;
        if (r2 == 0) goto L_0x006c;
    L_0x0068:
        r0 = r4.b();
    L_0x006c:
        r4.f = r0;
        if (r1 == 0) goto L_0x0079;
    L_0x0070:
        r0 = r4.f;
        r1 = com.google.e3.b(r5);
        r0.a(r1);
    L_0x0079:
        r4.a(r5);
        r0 = r5.b();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.be.a(com.google.e3):com.google.be");
    }

    private void a() {
        if ((this.g & 1) != 1) {
            this.h = new ArrayList(this.h);
            this.g |= 1;
        }
    }

    private static be d() {
        return new be();
    }

    public final boolean a() {
        boolean z = dy.b;
        int i = 0;
        while (i < h()) {
            if (a(i).a()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        return e();
    }

    public ax a() {
        return e();
    }

    public a1 a() {
        return j();
    }

    public ah a() {
        return e();
    }

    public be a(eb ebVar) {
        if (ebVar instanceof e3) {
            return a((e3) ebVar);
        }
        super.a(ebVar);
        return this;
    }

    public aI a(eb ebVar) {
        return a(ebVar);
    }

    public int h() {
        return this.f == null ? this.h.size() : this.f.j();
    }

    protected er g() {
        return cN.t().a(e3.class, be.class);
    }

    public eb c() {
        return c();
    }

    private be() {
        this.h = Collections.emptyList();
        g();
    }

    public M c() {
        return cN.A();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.be a(com.google.I r5, com.google.aC r6) {
        /*
        r4_this = this;
        r2 = 0;
        r0 = com.google.e3.k;	 Catch:{ gc -> 0x000f }
        r0 = r0.a(r5, r6);	 Catch:{ gc -> 0x000f }
        r0 = (com.google.e3) r0;	 Catch:{ gc -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ gc -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.c();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.e3) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.be.a(com.google.I, com.google.aC):com.google.be");
    }

    private gk b() {
        boolean z = true;
        if (this.f == null) {
            List list = this.h;
            if ((this.g & 1) != 1) {
                z = false;
            }
            this.f = new gk(list, z, h(), f());
            this.h = null;
        }
        return this.f;
    }

    public a1 b() {
        return i();
    }

    public a1 c() {
        return c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.e3 j() {
        /*
        r3_this = this;
        r0 = new com.google.e3;
        r1 = 0;
        r0.<init>(r3, r1);
        r1 = r3.g;
        r1 = r3.f;
        if (r1 != 0) goto L_0x002a;
    L_0x000c:
        r1 = r3.g;
        r1 = r1 & 1;
        r2 = 1;
        if (r1 != r2) goto L_0x0021;
    L_0x0013:
        r1 = r3.h;
        r1 = java.util.Collections.unmodifiableList(r1);
        r3.h = r1;
        r1 = r3.g;
        r1 = r1 & -2;
        r3.g = r1;
    L_0x0021:
        r1 = r3.h;
        com.google.e3.a(r0, r1);
        r1 = com.google.dy.b;
        if (r1 == 0) goto L_0x0033;
    L_0x002a:
        r1 = r3.f;
        r1 = r1.g();
        com.google.e3.a(r0, r1);
    L_0x0033:
        r3.b();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.be.j():com.google.e3");
    }

    be(b1 b1Var, gY gYVar) {
        this(b1Var);
    }

    public aJ a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public be e() {
        return d().a(j());
    }

    private void g() {
        if (d0.d) {
            b();
        }
    }

    public ah a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public e3 i() {
        Object j = j();
        if (j.a()) {
            return j;
        }
        throw b(j);
    }

    public eb a() {
        return j();
    }

    public eD a(int i) {
        return this.f == null ? (eD) this.h.get(i) : (eD) this.f.b(i);
    }

    public Object clone() {
        return e();
    }

    public a4 a() {
        return e();
    }

    static be f() {
        return d();
    }

    public cj a(eb ebVar) {
        return a(ebVar);
    }

    private be(b1 b1Var) {
        super(b1Var);
        this.h = Collections.emptyList();
        g();
    }

    public aI a() {
        return e();
    }

    public e3 c() {
        return e3.c();
    }
}
