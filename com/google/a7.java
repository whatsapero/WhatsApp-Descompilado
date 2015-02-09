package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a7 extends a4 implements fD {
    private List f;
    private boolean g;
    private gk h;
    private int i;
    private boolean j;

    public a7 a(boolean z) {
        this.i |= 1;
        this.j = z;
        e();
        return this;
    }

    public cj a(eb ebVar) {
        return a(ebVar);
    }

    public ax a() {
        return l();
    }

    static a7 i() {
        return j();
    }

    public ah a() {
        return l();
    }

    public eD a(int i) {
        return this.h == null ? (eD) this.f.get(i) : (eD) this.h.b(i);
    }

    private void g() {
        if (d0.d) {
            b();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ek h() {
        /*
        r5_this = this;
        r0 = 1;
        r2 = new com.google.ek;
        r1 = 0;
        r2.<init>(r5, r1);
        r3 = r5.i;
        r1 = 0;
        r4 = r3 & 1;
        if (r4 != r0) goto L_0x0051;
    L_0x000e:
        r1 = r5.j;
        com.google.ek.b(r2, r1);
        r1 = r3 & 2;
        r3 = 2;
        if (r1 != r3) goto L_0x001a;
    L_0x0018:
        r0 = r0 | 2;
    L_0x001a:
        r1 = r5.g;
        com.google.ek.a(r2, r1);
        r1 = r5.h;
        if (r1 != 0) goto L_0x0041;
    L_0x0023:
        r1 = r5.i;
        r1 = r1 & 4;
        r3 = 4;
        if (r1 != r3) goto L_0x0038;
    L_0x002a:
        r1 = r5.f;
        r1 = java.util.Collections.unmodifiableList(r1);
        r5.f = r1;
        r1 = r5.i;
        r1 = r1 & -5;
        r5.i = r1;
    L_0x0038:
        r1 = r5.f;
        com.google.ek.a(r2, r1);
        r1 = com.google.dy.b;
        if (r1 == 0) goto L_0x004a;
    L_0x0041:
        r1 = r5.h;
        r1 = r1.g();
        com.google.ek.a(r2, r1);
    L_0x004a:
        com.google.ek.a(r2, r0);
        r5.b();
        return r2;
    L_0x0051:
        r0 = r1;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a7.h():com.google.ek");
    }

    public ek k() {
        Object h = h();
        if (h.a()) {
            return h;
        }
        throw b(h);
    }

    public a7 l() {
        return j().a(h());
    }

    private static a7 j() {
        return new a7();
    }

    public aI a(eb ebVar) {
        return a(ebVar);
    }

    public eb c() {
        return c();
    }

    private void f() {
        if ((this.i & 4) != 4) {
            this.f = new ArrayList(this.f);
            this.i |= 4;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.a7 a(com.google.I r5, com.google.aC r6) {
        /*
        r4_this = this;
        r2 = 0;
        r0 = com.google.ek.f;	 Catch:{ gc -> 0x000f }
        r0 = r0.a(r5, r6);	 Catch:{ gc -> 0x000f }
        r0 = (com.google.ek) r0;	 Catch:{ gc -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ gc -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.c();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.ek) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.a7.a(com.google.I, com.google.aC):com.google.a7");
    }

    public eb a() {
        return h();
    }

    public aJ a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public a1 c() {
        return c();
    }

    public aI a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    private gk b() {
        if (this.h == null) {
            boolean z;
            List list = this.f;
            if ((this.i & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            this.h = new gk(list, z, h(), f());
            this.f = null;
        }
        return this.h;
    }

    public ek c() {
        return ek.b();
    }

    a7(b1 b1Var, gY gYVar) {
        this(b1Var);
    }

    public M c() {
        return cN.k();
    }

    public int a() {
        return this.h == null ? this.f.size() : this.h.j();
    }

    private a7() {
        this.f = Collections.emptyList();
        g();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.a7 a(com.google.ek r5) {
        /*
        r4_this = this;
        r0 = 0;
        r1 = com.google.dy.b;
        r2 = com.google.ek.b();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r5.l();
        if (r2 == 0) goto L_0x0017;
    L_0x0010:
        r2 = r5.f();
        r4.a(r2);
    L_0x0017:
        r2 = r5.c();
        if (r2 == 0) goto L_0x0024;
    L_0x001d:
        r2 = r5.g();
        r4.b(r2);
    L_0x0024:
        r2 = r4.h;
        if (r2 != 0) goto L_0x0059;
    L_0x0028:
        r2 = com.google.ek.a(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0093;
    L_0x0032:
        r2 = r4.f;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x0048;
    L_0x003a:
        r2 = com.google.ek.a(r5);
        r4.f = r2;
        r2 = r4.i;
        r2 = r2 & -5;
        r4.i = r2;
        if (r1 == 0) goto L_0x0054;
    L_0x0048:
        r4.f();
        r2 = r4.f;
        r3 = com.google.ek.a(r5);
        r2.addAll(r3);
    L_0x0054:
        r4.e();
        if (r1 == 0) goto L_0x0093;
    L_0x0059:
        r2 = com.google.ek.a(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0093;
    L_0x0063:
        r2 = r4.h;
        r2 = r2.c();
        if (r2 == 0) goto L_0x008a;
    L_0x006b:
        r2 = r4.h;
        r2.e();
        r4.h = r0;
        r2 = com.google.ek.a(r5);
        r4.f = r2;
        r2 = r4.i;
        r2 = r2 & -5;
        r4.i = r2;
        r2 = com.google.d0.d;
        if (r2 == 0) goto L_0x0086;
    L_0x0082:
        r0 = r4.b();
    L_0x0086:
        r4.h = r0;
        if (r1 == 0) goto L_0x0093;
    L_0x008a:
        r0 = r4.h;
        r1 = com.google.ek.a(r5);
        r0.a(r1);
    L_0x0093:
        r4.a(r5);
        r0 = r5.b();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a7.a(com.google.ek):com.google.a7");
    }

    public aI a() {
        return l();
    }

    public a4 a() {
        return l();
    }

    protected er g() {
        return cN.G().a(ek.class, a7.class);
    }

    public a1 a() {
        return h();
    }

    public ah a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public final boolean a() {
        boolean z = dy.b;
        int i = 0;
        while (i < a()) {
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
        return k();
    }

    public a7 b(boolean z) {
        this.i |= 2;
        this.g = z;
        e();
        return this;
    }

    private a7(b1 b1Var) {
        super(b1Var);
        this.f = Collections.emptyList();
        g();
    }

    public Object clone() {
        return l();
    }

    public a7 a(eb ebVar) {
        if (ebVar instanceof ek) {
            return a((ek) ebVar);
        }
        super.a(ebVar);
        return this;
    }

    public eb b() {
        return k();
    }
}
