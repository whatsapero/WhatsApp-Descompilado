package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ay extends ax implements bi {
    private gk e;
    private fH f;
    private e3 g;
    private List h;
    private Object i;
    private int j;

    public ax a() {
        return l();
    }

    public aJ a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    private gk i() {
        if (this.e == null) {
            boolean z;
            List list = this.h;
            if ((this.j & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            this.e = new gk(list, z, h(), f());
            this.h = null;
        }
        return this.e;
    }

    ay(b1 b1Var, gY gYVar) {
        this(b1Var);
    }

    public aI a(eb ebVar) {
        return a(ebVar);
    }

    public eb a() {
        return j();
    }

    public ay a(eb ebVar) {
        if (ebVar instanceof d7) {
            return a((d7) ebVar);
        }
        super.a(ebVar);
        return this;
    }

    public boolean h() {
        return (this.j & 4) == 4;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ay a(com.google.d7 r5) {
        /*
        r4_this = this;
        r0 = 0;
        r1 = com.google.dy.b;
        r2 = com.google.d7.n();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r5.h();
        if (r2 == 0) goto L_0x001f;
    L_0x0010:
        r2 = r4.j;
        r2 = r2 | 1;
        r4.j = r2;
        r2 = com.google.d7.a(r5);
        r4.i = r2;
        r4.e();
    L_0x001f:
        r2 = r4.e;
        if (r2 != 0) goto L_0x0054;
    L_0x0023:
        r2 = com.google.d7.c(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x008e;
    L_0x002d:
        r2 = r4.h;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x0043;
    L_0x0035:
        r2 = com.google.d7.c(r5);
        r4.h = r2;
        r2 = r4.j;
        r2 = r2 & -3;
        r4.j = r2;
        if (r1 == 0) goto L_0x004f;
    L_0x0043:
        r4.g();
        r2 = r4.h;
        r3 = com.google.d7.c(r5);
        r2.addAll(r3);
    L_0x004f:
        r4.e();
        if (r1 == 0) goto L_0x008e;
    L_0x0054:
        r2 = com.google.d7.c(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x008e;
    L_0x005e:
        r2 = r4.e;
        r2 = r2.c();
        if (r2 == 0) goto L_0x0085;
    L_0x0066:
        r2 = r4.e;
        r2.e();
        r4.e = r0;
        r2 = com.google.d7.c(r5);
        r4.h = r2;
        r2 = r4.j;
        r2 = r2 & -3;
        r4.j = r2;
        r2 = com.google.d0.d;
        if (r2 == 0) goto L_0x0081;
    L_0x007d:
        r0 = r4.i();
    L_0x0081:
        r4.e = r0;
        if (r1 == 0) goto L_0x008e;
    L_0x0085:
        r0 = r4.e;
        r1 = com.google.d7.c(r5);
        r0.a(r1);
    L_0x008e:
        r0 = r5.f();
        if (r0 == 0) goto L_0x009b;
    L_0x0094:
        r0 = r5.j();
        r4.a(r0);
    L_0x009b:
        r0 = r5.b();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ay.a(com.google.d7):com.google.ay");
    }

    public int m() {
        return this.e == null ? this.h.size() : this.e.j();
    }

    public ah a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public cj a(eb ebVar) {
        return a(ebVar);
    }

    public d7 k() {
        Object j = j();
        if (j.a()) {
            return j;
        }
        throw b(j);
    }

    private static ay a() {
        return new ay();
    }

    public aI a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public M c() {
        return cN.p();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ay a(com.google.e3 r4) {
        /*
        r3_this = this;
        r0 = com.google.dy.b;
        r1 = r3.f;
        if (r1 != 0) goto L_0x002e;
    L_0x0006:
        r1 = r3.j;
        r1 = r1 & 4;
        r2 = 4;
        if (r1 != r2) goto L_0x0027;
    L_0x000d:
        r1 = r3.g;
        r2 = com.google.e3.c();
        if (r1 == r2) goto L_0x0027;
    L_0x0015:
        r1 = r3.g;
        r1 = com.google.e3.a(r1);
        r1 = r1.a(r4);
        r1 = r1.j();
        r3.g = r1;
        if (r0 == 0) goto L_0x0029;
    L_0x0027:
        r3.g = r4;
    L_0x0029:
        r3.e();
        if (r0 == 0) goto L_0x0033;
    L_0x002e:
        r0 = r3.f;
        r0.a(r4);
    L_0x0033:
        r0 = r3.j;
        r0 = r0 | 4;
        r3.j = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ay.a(com.google.e3):com.google.ay");
    }

    private void f() {
        if (d0.d) {
            i();
            b();
        }
    }

    public eb c() {
        return n();
    }

    public a1 c() {
        return n();
    }

    public a1 b() {
        return k();
    }

    public d7 n() {
        return d7.n();
    }

    public a1 a() {
        return j();
    }

    public Object clone() {
        return l();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.d7 j() {
        /*
        r6_this = this;
        r0 = 1;
        r2 = com.google.dy.b;
        r3 = new com.google.d7;
        r1 = 0;
        r3.<init>(r6, r1);
        r4 = r6.j;
        r1 = 0;
        r5 = r4 & 1;
        if (r5 != r0) goto L_0x0065;
    L_0x0010:
        r1 = r6.i;
        com.google.d7.a(r3, r1);
        r1 = r6.e;
        if (r1 != 0) goto L_0x0035;
    L_0x0019:
        r1 = r6.j;
        r1 = r1 & 2;
        r5 = 2;
        if (r1 != r5) goto L_0x002e;
    L_0x0020:
        r1 = r6.h;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.h = r1;
        r1 = r6.j;
        r1 = r1 & -3;
        r6.j = r1;
    L_0x002e:
        r1 = r6.h;
        com.google.d7.a(r3, r1);
        if (r2 == 0) goto L_0x003e;
    L_0x0035:
        r1 = r6.e;
        r1 = r1.g();
        com.google.d7.a(r3, r1);
    L_0x003e:
        r1 = r4 & 4;
        r4 = 4;
        if (r1 != r4) goto L_0x0063;
    L_0x0043:
        r0 = r0 | 2;
        r1 = r0;
    L_0x0046:
        r0 = r6.f;
        if (r0 != 0) goto L_0x0051;
    L_0x004a:
        r0 = r6.g;
        com.google.d7.a(r3, r0);
        if (r2 == 0) goto L_0x005c;
    L_0x0051:
        r0 = r6.f;
        r0 = r0.c();
        r0 = (com.google.e3) r0;
        com.google.d7.a(r3, r0);
    L_0x005c:
        com.google.d7.a(r3, r1);
        r6.b();
        return r3;
    L_0x0063:
        r1 = r0;
        goto L_0x0046;
    L_0x0065:
        r0 = r1;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ay.j():com.google.d7");
    }

    private ay(b1 b1Var) {
        super(b1Var);
        this.i = "";
        this.h = Collections.emptyList();
        this.g = e3.c();
        f();
    }

    public final boolean a() {
        boolean z = dy.b;
        int i = 0;
        while (i < m()) {
            if (a(i).a()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        return !h() || d().a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ay a(com.google.I r5, com.google.aC r6) {
        /*
        r4_this = this;
        r2 = 0;
        r0 = com.google.d7.p;	 Catch:{ gc -> 0x000f }
        r0 = r0.a(r5, r6);	 Catch:{ gc -> 0x000f }
        r0 = (com.google.d7) r0;	 Catch:{ gc -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ gc -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.c();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.d7) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.ay.a(com.google.I, com.google.aC):com.google.ay");
    }

    public aI a() {
        return l();
    }

    protected er g() {
        return cN.i().a(d7.class, ay.class);
    }

    public ah a() {
        return l();
    }

    private ay() {
        this.i = "";
        this.h = Collections.emptyList();
        this.g = e3.c();
        f();
    }

    public dG a(int i) {
        return this.e == null ? (dG) this.h.get(i) : (dG) this.e.b(i);
    }

    private fH b() {
        if (this.f == null) {
            this.f = new fH(this.g, h(), f());
            this.g = null;
        }
        return this.f;
    }

    public eb b() {
        return k();
    }

    private void g() {
        if ((this.j & 2) != 2) {
            this.h = new ArrayList(this.h);
            this.j |= 2;
        }
    }

    public e3 d() {
        return this.f == null ? this.g : (e3) this.f.a();
    }

    public ay l() {
        return a().a(j());
    }

    static ay c() {
        return a();
    }
}
