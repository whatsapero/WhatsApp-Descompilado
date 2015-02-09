package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a6 extends a4 implements bX {
    private int f;
    private List g;
    private gk h;

    private void h() {
        if (d0.d) {
            i();
        }
    }

    static a6 d() {
        return j();
    }

    public M c() {
        return cN.K();
    }

    public eb a() {
        return e();
    }

    public a4 a() {
        return b();
    }

    protected er g() {
        return cN.j().a(es.class, a6.class);
    }

    public ah a() {
        return b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.es e() {
        /*
        r3_this = this;
        r0 = new com.google.es;
        r1 = 0;
        r0.<init>(r3, r1);
        r1 = r3.f;
        r1 = r3.h;
        if (r1 != 0) goto L_0x002a;
    L_0x000c:
        r1 = r3.f;
        r1 = r1 & 1;
        r2 = 1;
        if (r1 != r2) goto L_0x0021;
    L_0x0013:
        r1 = r3.g;
        r1 = java.util.Collections.unmodifiableList(r1);
        r3.g = r1;
        r1 = r3.f;
        r1 = r1 & -2;
        r3.f = r1;
    L_0x0021:
        r1 = r3.g;
        com.google.es.a(r0, r1);
        r1 = com.google.dy.b;
        if (r1 == 0) goto L_0x0033;
    L_0x002a:
        r1 = r3.h;
        r1 = r1.g();
        com.google.es.a(r0, r1);
    L_0x0033:
        r3.b();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a6.e():com.google.es");
    }

    public int g() {
        return this.h == null ? this.g.size() : this.h.j();
    }

    public ah a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public cj a(eb ebVar) {
        return a(ebVar);
    }

    public es a() {
        Object e = e();
        if (e.a()) {
            return e;
        }
        throw b(e);
    }

    public eb b() {
        return a();
    }

    public a1 a() {
        return e();
    }

    private void f() {
        if ((this.f & 1) != 1) {
            this.g = new ArrayList(this.g);
            this.f |= 1;
        }
    }

    public es c() {
        return es.c();
    }

    public eD a(int i) {
        return this.h == null ? (eD) this.g.get(i) : (eD) this.h.b(i);
    }

    public a1 c() {
        return c();
    }

    public aJ a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    private a6(b1 b1Var) {
        super(b1Var);
        this.g = Collections.emptyList();
        h();
    }

    private a6() {
        this.g = Collections.emptyList();
        h();
    }

    private static a6 j() {
        return new a6();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.a6 a(com.google.es r5) {
        /*
        r4_this = this;
        r0 = 0;
        r1 = com.google.dy.b;
        r2 = com.google.es.c();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r4.h;
        if (r2 != 0) goto L_0x003f;
    L_0x000e:
        r2 = com.google.es.b(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0079;
    L_0x0018:
        r2 = r4.g;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x002e;
    L_0x0020:
        r2 = com.google.es.b(r5);
        r4.g = r2;
        r2 = r4.f;
        r2 = r2 & -2;
        r4.f = r2;
        if (r1 == 0) goto L_0x003a;
    L_0x002e:
        r4.f();
        r2 = r4.g;
        r3 = com.google.es.b(r5);
        r2.addAll(r3);
    L_0x003a:
        r4.e();
        if (r1 == 0) goto L_0x0079;
    L_0x003f:
        r2 = com.google.es.b(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0079;
    L_0x0049:
        r2 = r4.h;
        r2 = r2.c();
        if (r2 == 0) goto L_0x0070;
    L_0x0051:
        r2 = r4.h;
        r2.e();
        r4.h = r0;
        r2 = com.google.es.b(r5);
        r4.g = r2;
        r2 = r4.f;
        r2 = r2 & -2;
        r4.f = r2;
        r2 = com.google.d0.d;
        if (r2 == 0) goto L_0x006c;
    L_0x0068:
        r0 = r4.i();
    L_0x006c:
        r4.h = r0;
        if (r1 == 0) goto L_0x0079;
    L_0x0070:
        r0 = r4.h;
        r1 = com.google.es.b(r5);
        r0.a(r1);
    L_0x0079:
        r4.a(r5);
        r0 = r5.b();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a6.a(com.google.es):com.google.a6");
    }

    public a6 b() {
        return j().a(e());
    }

    public aI a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public aI a() {
        return b();
    }

    a6(b1 b1Var, gY gYVar) {
        this(b1Var);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.a6 a(com.google.I r5, com.google.aC r6) {
        /*
        r4_this = this;
        r2 = 0;
        r0 = com.google.es.g;	 Catch:{ gc -> 0x000f }
        r0 = r0.a(r5, r6);	 Catch:{ gc -> 0x000f }
        r0 = (com.google.es) r0;	 Catch:{ gc -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ gc -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.c();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.es) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.a6.a(com.google.I, com.google.aC):com.google.a6");
    }

    public Object clone() {
        return b();
    }

    public final boolean a() {
        boolean z = dy.b;
        int i = 0;
        while (i < g()) {
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

    public a1 b() {
        return a();
    }

    public aI a(eb ebVar) {
        return a(ebVar);
    }

    public ax a() {
        return b();
    }

    public a6 a(eb ebVar) {
        if (ebVar instanceof es) {
            return a((es) ebVar);
        }
        super.a(ebVar);
        return this;
    }

    public eb c() {
        return c();
    }

    private gk i() {
        boolean z = true;
        if (this.h == null) {
            List list = this.g;
            if ((this.f & 1) != 1) {
                z = false;
            }
            this.h = new gk(list, z, h(), f());
            this.g = null;
        }
        return this.h;
    }
}
