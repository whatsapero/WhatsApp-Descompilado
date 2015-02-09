package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aw extends ax implements bn {
    private List e;
    private gk f;
    private int g;

    public aI a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public aw i() {
        return a().a(g());
    }

    public aJ a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public eW h() {
        return eW.b();
    }

    public a1 c() {
        return h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.aw a(com.google.eW r5) {
        /*
        r4_this = this;
        r0 = 0;
        r1 = com.google.dy.b;
        r2 = com.google.eW.b();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r4.f;
        if (r2 != 0) goto L_0x003f;
    L_0x000e:
        r2 = com.google.eW.b(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0079;
    L_0x0018:
        r2 = r4.e;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x002e;
    L_0x0020:
        r2 = com.google.eW.b(r5);
        r4.e = r2;
        r2 = r4.g;
        r2 = r2 & -2;
        r4.g = r2;
        if (r1 == 0) goto L_0x003a;
    L_0x002e:
        r4.c();
        r2 = r4.e;
        r3 = com.google.eW.b(r5);
        r2.addAll(r3);
    L_0x003a:
        r4.e();
        if (r1 == 0) goto L_0x0079;
    L_0x003f:
        r2 = com.google.eW.b(r5);
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
        r2 = com.google.eW.b(r5);
        r4.e = r2;
        r2 = r4.g;
        r2 = r2 & -2;
        r4.g = r2;
        r2 = com.google.d0.d;
        if (r2 == 0) goto L_0x006c;
    L_0x0068:
        r0 = r4.k();
    L_0x006c:
        r4.f = r0;
        if (r1 == 0) goto L_0x0079;
    L_0x0070:
        r0 = r4.f;
        r1 = com.google.eW.b(r5);
        r0.a(r1);
    L_0x0079:
        r0 = r5.b();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aw.a(com.google.eW):com.google.aw");
    }

    public aI a(eb ebVar) {
        return a(ebVar);
    }

    public cj a(eb ebVar) {
        return a(ebVar);
    }

    static aw l() {
        return a();
    }

    public ax a() {
        return i();
    }

    aw(b1 b1Var, gY gYVar) {
        this(b1Var);
    }

    public M c() {
        return cN.z();
    }

    public Object clone() {
        return i();
    }

    private gk k() {
        boolean z = true;
        if (this.f == null) {
            List list = this.e;
            if ((this.g & 1) != 1) {
                z = false;
            }
            this.f = new gk(list, z, h(), f());
            this.e = null;
        }
        return this.f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.aw a(com.google.I r5, com.google.aC r6) {
        /*
        r4_this = this;
        r2 = 0;
        r0 = com.google.eW.g;	 Catch:{ gc -> 0x000f }
        r0 = r0.a(r5, r6);	 Catch:{ gc -> 0x000f }
        r0 = (com.google.eW) r0;	 Catch:{ gc -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ gc -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.c();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.eW) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.aw.a(com.google.I, com.google.aC):com.google.aw");
    }

    public eb a() {
        return g();
    }

    private void c() {
        if ((this.g & 1) != 1) {
            this.e = new ArrayList(this.e);
            this.g |= 1;
        }
    }

    protected er g() {
        return cN.C().a(eW.class, aw.class);
    }

    private aw() {
        this.e = Collections.emptyList();
        f();
    }

    public aw a(eb ebVar) {
        if (ebVar instanceof eW) {
            return a((eW) ebVar);
        }
        super.a(ebVar);
        return this;
    }

    public ah a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public ah a() {
        return i();
    }

    private aw(b1 b1Var) {
        super(b1Var);
        this.e = Collections.emptyList();
        f();
    }

    public eW j() {
        Object g = g();
        if (g.a()) {
            return g;
        }
        throw b(g);
    }

    public a1 a() {
        return g();
    }

    public aI a() {
        return i();
    }

    public eb c() {
        return h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.eW g() {
        /*
        r3_this = this;
        r0 = new com.google.eW;
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
        r1 = r3.e;
        r1 = java.util.Collections.unmodifiableList(r1);
        r3.e = r1;
        r1 = r3.g;
        r1 = r1 & -2;
        r3.g = r1;
    L_0x0021:
        r1 = r3.e;
        com.google.eW.a(r0, r1);
        r1 = com.google.dy.b;
        if (r1 == 0) goto L_0x0033;
    L_0x002a:
        r1 = r3.f;
        r1 = r1.g();
        com.google.eW.a(r0, r1);
    L_0x0033:
        r3.b();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aw.g():com.google.eW");
    }

    private void f() {
        if (d0.d) {
            k();
        }
    }

    private static aw a() {
        return new aw();
    }

    public eb b() {
        return j();
    }

    public final boolean a() {
        return true;
    }

    public a1 b() {
        return j();
    }
}
