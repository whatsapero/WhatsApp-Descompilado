package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ar extends a4 implements dY {
    private List f;
    private gk g;
    private int h;
    private boolean i;

    public a1 b() {
        return e();
    }

    public ar d() {
        return i().a(a());
    }

    private ar(b1 b1Var) {
        super(b1Var);
        this.i = true;
        this.f = Collections.emptyList();
        j();
    }

    public aI a() {
        return d();
    }

    public ah a() {
        return d();
    }

    public M c() {
        return cN.H();
    }

    public ar a(eb ebVar) {
        if (ebVar instanceof ed) {
            return a((ed) ebVar);
        }
        super.a(ebVar);
        return this;
    }

    private ar() {
        this.i = true;
        this.f = Collections.emptyList();
        j();
    }

    public eb b() {
        return e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ar a(com.google.ed r5) {
        /*
        r4_this = this;
        r0 = 0;
        r1 = com.google.dy.b;
        r2 = com.google.ed.h();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r5.c();
        if (r2 == 0) goto L_0x0017;
    L_0x0010:
        r2 = r5.j();
        r4.a(r2);
    L_0x0017:
        r2 = r4.g;
        if (r2 != 0) goto L_0x004c;
    L_0x001b:
        r2 = com.google.ed.a(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0086;
    L_0x0025:
        r2 = r4.f;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x003b;
    L_0x002d:
        r2 = com.google.ed.a(r5);
        r4.f = r2;
        r2 = r4.h;
        r2 = r2 & -3;
        r4.h = r2;
        if (r1 == 0) goto L_0x0047;
    L_0x003b:
        r4.f();
        r2 = r4.f;
        r3 = com.google.ed.a(r5);
        r2.addAll(r3);
    L_0x0047:
        r4.e();
        if (r1 == 0) goto L_0x0086;
    L_0x004c:
        r2 = com.google.ed.a(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0086;
    L_0x0056:
        r2 = r4.g;
        r2 = r2.c();
        if (r2 == 0) goto L_0x007d;
    L_0x005e:
        r2 = r4.g;
        r2.e();
        r4.g = r0;
        r2 = com.google.ed.a(r5);
        r4.f = r2;
        r2 = r4.h;
        r2 = r2 & -3;
        r4.h = r2;
        r2 = com.google.d0.d;
        if (r2 == 0) goto L_0x0079;
    L_0x0075:
        r0 = r4.c();
    L_0x0079:
        r4.g = r0;
        if (r1 == 0) goto L_0x0086;
    L_0x007d:
        r0 = r4.g;
        r1 = com.google.ed.a(r5);
        r0.a(r1);
    L_0x0086:
        r4.a(r5);
        r0 = r5.b();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.a(com.google.ed):com.google.ar");
    }

    public a1 c() {
        return b();
    }

    public eb a() {
        return a();
    }

    public a4 a() {
        return d();
    }

    public ed b() {
        return ed.h();
    }

    protected er g() {
        return cN.x().a(ed.class, ar.class);
    }

    public aJ a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    static ar h() {
        return i();
    }

    public cj a(eb ebVar) {
        return a(ebVar);
    }

    public ax a() {
        return d();
    }

    public eD a(int i) {
        return this.g == null ? (eD) this.f.get(i) : (eD) this.g.b(i);
    }

    public ed e() {
        Object a = a();
        if (a.a()) {
            return a;
        }
        throw b(a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ed a() {
        /*
        r4_this = this;
        r0 = 1;
        r2 = new com.google.ed;
        r1 = 0;
        r2.<init>(r4, r1);
        r3 = r4.h;
        r1 = 0;
        r3 = r3 & 1;
        if (r3 != r0) goto L_0x0045;
    L_0x000e:
        r1 = r4.i;
        com.google.ed.a(r2, r1);
        r1 = r4.g;
        if (r1 != 0) goto L_0x0035;
    L_0x0017:
        r1 = r4.h;
        r1 = r1 & 2;
        r3 = 2;
        if (r1 != r3) goto L_0x002c;
    L_0x001e:
        r1 = r4.f;
        r1 = java.util.Collections.unmodifiableList(r1);
        r4.f = r1;
        r1 = r4.h;
        r1 = r1 & -3;
        r4.h = r1;
    L_0x002c:
        r1 = r4.f;
        com.google.ed.a(r2, r1);
        r1 = com.google.dy.b;
        if (r1 == 0) goto L_0x003e;
    L_0x0035:
        r1 = r4.g;
        r1 = r1.g();
        com.google.ed.a(r2, r1);
    L_0x003e:
        com.google.ed.a(r2, r0);
        r4.b();
        return r2;
    L_0x0045:
        r0 = r1;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.a():com.google.ed");
    }

    public aI a(eb ebVar) {
        return a(ebVar);
    }

    private void f() {
        if ((this.h & 2) != 2) {
            this.f = new ArrayList(this.f);
            this.h |= 2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ar a(com.google.I r5, com.google.aC r6) {
        /*
        r4_this = this;
        r2 = 0;
        r0 = com.google.ed.g;	 Catch:{ gc -> 0x000f }
        r0 = r0.a(r5, r6);	 Catch:{ gc -> 0x000f }
        r0 = (com.google.ed) r0;	 Catch:{ gc -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ gc -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.c();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.ed) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.a(com.google.I, com.google.aC):com.google.ar");
    }

    public aI a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    private void j() {
        if (d0.d) {
            c();
        }
    }

    private gk c() {
        if (this.g == null) {
            this.g = new gk(this.f, (this.h & 2) == 2, h(), f());
            this.f = null;
        }
        return this.g;
    }

    public int g() {
        return this.g == null ? this.f.size() : this.g.j();
    }

    public ar a(boolean z) {
        this.h |= 1;
        this.i = z;
        e();
        return this;
    }

    public eb c() {
        return b();
    }

    private static ar i() {
        return new ar();
    }

    ar(b1 b1Var, gY gYVar) {
        this(b1Var);
    }

    public ah a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public Object clone() {
        return d();
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

    public a1 a() {
        return a();
    }
}
