package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class az extends ax implements K {
    private List e;
    private gk f;
    private Object g;
    private gk h;
    private int i;
    private eW j;
    private fH k;
    private List l;
    private gk m;
    private c1 n;
    private List o;
    private Object p;
    private List q;
    private gk r;
    private fH s;
    private eg t;
    private List u;
    private List v;

    public ah a() {
        return o();
    }

    public aI a() {
        return o();
    }

    public dU c(int i) {
        return this.f == null ? (dU) this.o.get(i) : (dU) this.f.b(i);
    }

    private fH a() {
        if (this.k == null) {
            this.k = new fH(this.j, h(), f());
            this.j = null;
        }
        return this.k;
    }

    public dj v() {
        return dj.k();
    }

    private void q() {
        if ((this.i & 16) != 16) {
            this.v = new ArrayList(this.v);
            this.i |= 16;
        }
    }

    az(b1 b1Var, gY gYVar) {
        this(b1Var);
    }

    private gk e() {
        if (this.f == null) {
            boolean z;
            List list = this.o;
            if ((this.i & 32) == 32) {
                z = true;
            } else {
                z = false;
            }
            this.f = new gk(list, z, h(), f());
            this.o = null;
        }
        return this.f;
    }

    public d6 a(int i) {
        return this.h == null ? (d6) this.q.get(i) : (d6) this.h.b(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.dj d() {
        /*
        r6_this = this;
        r0 = 1;
        r2 = com.google.dy.b;
        r3 = new com.google.dj;
        r1 = 0;
        r3.<init>(r6, r1);
        r4 = r6.i;
        r1 = 0;
        r5 = r4 & 1;
        if (r5 != r0) goto L_0x0160;
    L_0x0010:
        r1 = r6.g;
        com.google.dj.b(r3, r1);
        r1 = r4 & 2;
        r5 = 2;
        if (r1 != r5) goto L_0x001c;
    L_0x001a:
        r0 = r0 | 2;
    L_0x001c:
        r1 = r6.p;
        com.google.dj.a(r3, r1);
        r1 = r6.i;
        r1 = r1 & 4;
        r5 = 4;
        if (r1 != r5) goto L_0x0037;
    L_0x0028:
        r1 = new com.google.d2;
        r5 = r6.n;
        r1.<init>(r5);
        r6.n = r1;
        r1 = r6.i;
        r1 = r1 & -5;
        r6.i = r1;
    L_0x0037:
        r1 = r6.n;
        com.google.dj.a(r3, r1);
        r1 = r6.i;
        r1 = r1 & 8;
        r5 = 8;
        if (r1 != r5) goto L_0x0052;
    L_0x0044:
        r1 = r6.e;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.e = r1;
        r1 = r6.i;
        r1 = r1 & -9;
        r6.i = r1;
    L_0x0052:
        r1 = r6.e;
        com.google.dj.f(r3, r1);
        r1 = r6.i;
        r1 = r1 & 16;
        r5 = 16;
        if (r1 != r5) goto L_0x006d;
    L_0x005f:
        r1 = r6.v;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.v = r1;
        r1 = r6.i;
        r1 = r1 & -17;
        r6.i = r1;
    L_0x006d:
        r1 = r6.v;
        com.google.dj.b(r3, r1);
        r1 = r6.f;
        if (r1 != 0) goto L_0x0093;
    L_0x0076:
        r1 = r6.i;
        r1 = r1 & 32;
        r5 = 32;
        if (r1 != r5) goto L_0x008c;
    L_0x007e:
        r1 = r6.o;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.o = r1;
        r1 = r6.i;
        r1 = r1 & -33;
        r6.i = r1;
    L_0x008c:
        r1 = r6.o;
        com.google.dj.e(r3, r1);
        if (r2 == 0) goto L_0x009c;
    L_0x0093:
        r1 = r6.f;
        r1 = r1.g();
        com.google.dj.e(r3, r1);
    L_0x009c:
        r1 = r6.r;
        if (r1 != 0) goto L_0x00bd;
    L_0x00a0:
        r1 = r6.i;
        r1 = r1 & 64;
        r5 = 64;
        if (r1 != r5) goto L_0x00b6;
    L_0x00a8:
        r1 = r6.l;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.l = r1;
        r1 = r6.i;
        r1 = r1 & -65;
        r6.i = r1;
    L_0x00b6:
        r1 = r6.l;
        com.google.dj.c(r3, r1);
        if (r2 == 0) goto L_0x00c6;
    L_0x00bd:
        r1 = r6.r;
        r1 = r1.g();
        com.google.dj.c(r3, r1);
    L_0x00c6:
        r1 = r6.m;
        if (r1 != 0) goto L_0x00e7;
    L_0x00ca:
        r1 = r6.i;
        r1 = r1 & 128;
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 != r5) goto L_0x00e0;
    L_0x00d2:
        r1 = r6.u;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.u = r1;
        r1 = r6.i;
        r1 = r1 & -129;
        r6.i = r1;
    L_0x00e0:
        r1 = r6.u;
        com.google.dj.d(r3, r1);
        if (r2 == 0) goto L_0x00f0;
    L_0x00e7:
        r1 = r6.m;
        r1 = r1.g();
        com.google.dj.d(r3, r1);
    L_0x00f0:
        r1 = r6.h;
        if (r1 != 0) goto L_0x0111;
    L_0x00f4:
        r1 = r6.i;
        r1 = r1 & 256;
        r5 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r1 != r5) goto L_0x010a;
    L_0x00fc:
        r1 = r6.q;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.q = r1;
        r1 = r6.i;
        r1 = r1 & -257;
        r6.i = r1;
    L_0x010a:
        r1 = r6.q;
        com.google.dj.a(r3, r1);
        if (r2 == 0) goto L_0x011a;
    L_0x0111:
        r1 = r6.h;
        r1 = r1.g();
        com.google.dj.a(r3, r1);
    L_0x011a:
        r1 = r4 & 512;
        r5 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r1 != r5) goto L_0x015e;
    L_0x0120:
        r0 = r0 | 4;
        r1 = r0;
    L_0x0123:
        r0 = r6.s;
        if (r0 != 0) goto L_0x012e;
    L_0x0127:
        r0 = r6.t;
        com.google.dj.a(r3, r0);
        if (r2 == 0) goto L_0x0139;
    L_0x012e:
        r0 = r6.s;
        r0 = r0.c();
        r0 = (com.google.eg) r0;
        com.google.dj.a(r3, r0);
    L_0x0139:
        r0 = r4 & 1024;
        r4 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r0 != r4) goto L_0x0141;
    L_0x013f:
        r1 = r1 | 8;
    L_0x0141:
        r0 = r6.k;
        if (r0 != 0) goto L_0x014c;
    L_0x0145:
        r0 = r6.j;
        com.google.dj.a(r3, r0);
        if (r2 == 0) goto L_0x0157;
    L_0x014c:
        r0 = r6.k;
        r0 = r0.c();
        r0 = (com.google.eW) r0;
        com.google.dj.a(r3, r0);
    L_0x0157:
        com.google.dj.a(r3, r1);
        r6.b();
        return r3;
    L_0x015e:
        r1 = r0;
        goto L_0x0123;
    L_0x0160:
        r0 = r1;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.az.d():com.google.dj");
    }

    private fH t() {
        if (this.s == null) {
            this.s = new fH(this.t, h(), f());
            this.t = null;
        }
        return this.s;
    }

    public eb b() {
        return r();
    }

    private void h() {
        if ((this.i & 8) != 8) {
            this.e = new ArrayList(this.e);
            this.i |= 8;
        }
    }

    public ax a() {
        return o();
    }

    public a1 b() {
        return r();
    }

    static az c() {
        return w();
    }

    public dj r() {
        Object d = d();
        if (d.a()) {
            return d;
        }
        throw b(d);
    }

    private gk n() {
        if (this.r == null) {
            boolean z;
            List list = this.l;
            if ((this.i & 64) == 64) {
                z = true;
            } else {
                z = false;
            }
            this.r = new gk(list, z, h(), f());
            this.l = null;
        }
        return this.r;
    }

    private void s() {
        if ((this.i & 32) != 32) {
            this.o = new ArrayList(this.o);
            this.i |= 32;
        }
    }

    private void k() {
        if ((this.i & 64) != 64) {
            this.l = new ArrayList(this.l);
            this.i |= 64;
        }
    }

    public az a(eb ebVar) {
        if (ebVar instanceof dj) {
            return a((dj) ebVar);
        }
        super.a(ebVar);
        return this;
    }

    public eb c() {
        return v();
    }

    public d4 d(int i) {
        return this.r == null ? (d4) this.l.get(i) : (d4) this.r.b(i);
    }

    public boolean z() {
        return (this.i & 512) == 512;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.az a(com.google.eW r4) {
        /*
        r3_this = this;
        r0 = com.google.dy.b;
        r1 = r3.k;
        if (r1 != 0) goto L_0x002f;
    L_0x0006:
        r1 = r3.i;
        r1 = r1 & 1024;
        r2 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r1 != r2) goto L_0x0028;
    L_0x000e:
        r1 = r3.j;
        r2 = com.google.eW.b();
        if (r1 == r2) goto L_0x0028;
    L_0x0016:
        r1 = r3.j;
        r1 = com.google.eW.a(r1);
        r1 = r1.a(r4);
        r1 = r1.g();
        r3.j = r1;
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r3.j = r4;
    L_0x002a:
        r3.e();
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r3.k;
        r0.a(r4);
    L_0x0034:
        r0 = r3.i;
        r0 = r0 | 1024;
        r3.i = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.az.a(com.google.eW):com.google.az");
    }

    private gk y() {
        if (this.m == null) {
            boolean z;
            List list = this.u;
            if ((this.i & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            this.m = new gk(list, z, h(), f());
            this.u = null;
        }
        return this.m;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.az a(com.google.eg r4) {
        /*
        r3_this = this;
        r0 = com.google.dy.b;
        r1 = r3.s;
        if (r1 != 0) goto L_0x002f;
    L_0x0006:
        r1 = r3.i;
        r1 = r1 & 512;
        r2 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r1 != r2) goto L_0x0028;
    L_0x000e:
        r1 = r3.t;
        r2 = com.google.eg.n();
        if (r1 == r2) goto L_0x0028;
    L_0x0016:
        r1 = r3.t;
        r1 = com.google.eg.a(r1);
        r1 = r1.a(r4);
        r1 = r1.l();
        r3.t = r1;
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r3.t = r4;
    L_0x002a:
        r3.e();
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r3.s;
        r0.a(r4);
    L_0x0034:
        r0 = r3.i;
        r0 = r0 | 512;
        r3.i = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.az.a(com.google.eg):com.google.az");
    }

    private az() {
        this.g = "";
        this.p = "";
        this.n = fI.a;
        this.e = Collections.emptyList();
        this.v = Collections.emptyList();
        this.o = Collections.emptyList();
        this.l = Collections.emptyList();
        this.u = Collections.emptyList();
        this.q = Collections.emptyList();
        this.t = eg.n();
        this.j = eW.b();
        j();
    }

    public aI a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    private void A() {
        if ((this.i & 4) != 4) {
            this.n = new fI(this.n);
            this.i |= 4;
        }
    }

    public a1 a() {
        return d();
    }

    public eg u() {
        return this.s == null ? this.t : (eg) this.s.a();
    }

    public a1 c() {
        return v();
    }

    public ah a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public int x() {
        return this.f == null ? this.o.size() : this.f.j();
    }

    private void g() {
        if ((this.i & 256) != 256) {
            this.q = new ArrayList(this.q);
            this.i |= 256;
        }
    }

    private void j() {
        if (d0.d) {
            e();
            n();
            y();
            b();
            t();
            a();
        }
    }

    private static az w() {
        return new az();
    }

    public aI a(eb ebVar) {
        return a(ebVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.az a(com.google.I r5, com.google.aC r6) {
        /*
        r4_this = this;
        r2 = 0;
        r0 = com.google.dj.s;	 Catch:{ gc -> 0x0011 }
        r0 = r0.a(r5, r6);	 Catch:{ gc -> 0x0011 }
        r0 = (com.google.dj) r0;	 Catch:{ gc -> 0x0011 }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ gc -> 0x000f }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.c();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.dj) r0;	 Catch:{ all -> 0x0026 }
        throw r1;	 Catch:{ all -> 0x001a }
    L_0x001a:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001e:
        if (r1 == 0) goto L_0x0023;
    L_0x0020:
        r4.a(r1);	 Catch:{ gc -> 0x0024 }
    L_0x0023:
        throw r0;
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.az.a(com.google.I, com.google.aC):com.google.az");
    }

    public int f() {
        return this.r == null ? this.l.size() : this.r.j();
    }

    private void p() {
        if ((this.i & 128) != 128) {
            this.u = new ArrayList(this.u);
            this.i |= 128;
        }
    }

    public M c() {
        return cN.I();
    }

    public cj a(eb ebVar) {
        return a(ebVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.az a(com.google.dj r5) {
        /*
        r4_this = this;
        r1 = 0;
        r2 = com.google.dy.b;
        r0 = com.google.dj.k();
        if (r5 != r0) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r0 = r5.z();
        if (r0 == 0) goto L_0x001f;
    L_0x0010:
        r0 = r4.i;
        r0 = r0 | 1;
        r4.i = r0;
        r0 = com.google.dj.e(r5);
        r4.g = r0;
        r4.e();
    L_0x001f:
        r0 = r5.j();
        if (r0 == 0) goto L_0x0034;
    L_0x0025:
        r0 = r4.i;
        r0 = r0 | 2;
        r4.i = r0;
        r0 = com.google.dj.j(r5);
        r4.p = r0;
        r4.e();
    L_0x0034:
        r0 = com.google.dj.d(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0063;
    L_0x003e:
        r0 = r4.n;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0054;
    L_0x0046:
        r0 = com.google.dj.d(r5);
        r4.n = r0;
        r0 = r4.i;
        r0 = r0 & -5;
        r4.i = r0;
        if (r2 == 0) goto L_0x0060;
    L_0x0054:
        r4.A();
        r0 = r4.n;
        r3 = com.google.dj.d(r5);
        r0.addAll(r3);
    L_0x0060:
        r4.e();
    L_0x0063:
        r0 = com.google.dj.f(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0092;
    L_0x006d:
        r0 = r4.e;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0083;
    L_0x0075:
        r0 = com.google.dj.f(r5);
        r4.e = r0;
        r0 = r4.i;
        r0 = r0 & -9;
        r4.i = r0;
        if (r2 == 0) goto L_0x008f;
    L_0x0083:
        r4.h();
        r0 = r4.e;
        r3 = com.google.dj.f(r5);
        r0.addAll(r3);
    L_0x008f:
        r4.e();
    L_0x0092:
        r0 = com.google.dj.h(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00c1;
    L_0x009c:
        r0 = r4.v;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x00b2;
    L_0x00a4:
        r0 = com.google.dj.h(r5);
        r4.v = r0;
        r0 = r4.i;
        r0 = r0 & -17;
        r4.i = r0;
        if (r2 == 0) goto L_0x00be;
    L_0x00b2:
        r4.q();
        r0 = r4.v;
        r3 = com.google.dj.h(r5);
        r0.addAll(r3);
    L_0x00be:
        r4.e();
    L_0x00c1:
        r0 = r4.f;
        if (r0 != 0) goto L_0x00f6;
    L_0x00c5:
        r0 = com.google.dj.i(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0130;
    L_0x00cf:
        r0 = r4.o;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x00e5;
    L_0x00d7:
        r0 = com.google.dj.i(r5);
        r4.o = r0;
        r0 = r4.i;
        r0 = r0 & -33;
        r4.i = r0;
        if (r2 == 0) goto L_0x00f1;
    L_0x00e5:
        r4.s();
        r0 = r4.o;
        r3 = com.google.dj.i(r5);
        r0.addAll(r3);
    L_0x00f1:
        r4.e();
        if (r2 == 0) goto L_0x0130;
    L_0x00f6:
        r0 = com.google.dj.i(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0130;
    L_0x0100:
        r0 = r4.f;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0127;
    L_0x0108:
        r0 = r4.f;
        r0.e();
        r4.f = r1;
        r0 = com.google.dj.i(r5);
        r4.o = r0;
        r0 = r4.i;
        r0 = r0 & -33;
        r4.i = r0;
        r0 = com.google.d0.d;
        if (r0 == 0) goto L_0x02a0;
    L_0x011f:
        r0 = r4.e();
    L_0x0123:
        r4.f = r0;
        if (r2 == 0) goto L_0x0130;
    L_0x0127:
        r0 = r4.f;
        r3 = com.google.dj.i(r5);
        r0.a(r3);
    L_0x0130:
        r0 = r4.r;
        if (r0 != 0) goto L_0x0165;
    L_0x0134:
        r0 = com.google.dj.b(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x019f;
    L_0x013e:
        r0 = r4.l;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0154;
    L_0x0146:
        r0 = com.google.dj.b(r5);
        r4.l = r0;
        r0 = r4.i;
        r0 = r0 & -65;
        r4.i = r0;
        if (r2 == 0) goto L_0x0160;
    L_0x0154:
        r4.k();
        r0 = r4.l;
        r3 = com.google.dj.b(r5);
        r0.addAll(r3);
    L_0x0160:
        r4.e();
        if (r2 == 0) goto L_0x019f;
    L_0x0165:
        r0 = com.google.dj.b(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x019f;
    L_0x016f:
        r0 = r4.r;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0196;
    L_0x0177:
        r0 = r4.r;
        r0.e();
        r4.r = r1;
        r0 = com.google.dj.b(r5);
        r4.l = r0;
        r0 = r4.i;
        r0 = r0 & -65;
        r4.i = r0;
        r0 = com.google.d0.d;
        if (r0 == 0) goto L_0x02a3;
    L_0x018e:
        r0 = r4.n();
    L_0x0192:
        r4.r = r0;
        if (r2 == 0) goto L_0x019f;
    L_0x0196:
        r0 = r4.r;
        r3 = com.google.dj.b(r5);
        r0.a(r3);
    L_0x019f:
        r0 = r4.m;
        if (r0 != 0) goto L_0x01d4;
    L_0x01a3:
        r0 = com.google.dj.a(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x020e;
    L_0x01ad:
        r0 = r4.u;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x01c3;
    L_0x01b5:
        r0 = com.google.dj.a(r5);
        r4.u = r0;
        r0 = r4.i;
        r0 = r0 & -129;
        r4.i = r0;
        if (r2 == 0) goto L_0x01cf;
    L_0x01c3:
        r4.p();
        r0 = r4.u;
        r3 = com.google.dj.a(r5);
        r0.addAll(r3);
    L_0x01cf:
        r4.e();
        if (r2 == 0) goto L_0x020e;
    L_0x01d4:
        r0 = com.google.dj.a(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x020e;
    L_0x01de:
        r0 = r4.m;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0205;
    L_0x01e6:
        r0 = r4.m;
        r0.e();
        r4.m = r1;
        r0 = com.google.dj.a(r5);
        r4.u = r0;
        r0 = r4.i;
        r0 = r0 & -129;
        r4.i = r0;
        r0 = com.google.d0.d;
        if (r0 == 0) goto L_0x02a6;
    L_0x01fd:
        r0 = r4.y();
    L_0x0201:
        r4.m = r0;
        if (r2 == 0) goto L_0x020e;
    L_0x0205:
        r0 = r4.m;
        r3 = com.google.dj.a(r5);
        r0.a(r3);
    L_0x020e:
        r0 = r4.h;
        if (r0 != 0) goto L_0x0243;
    L_0x0212:
        r0 = com.google.dj.g(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x027d;
    L_0x021c:
        r0 = r4.q;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0232;
    L_0x0224:
        r0 = com.google.dj.g(r5);
        r4.q = r0;
        r0 = r4.i;
        r0 = r0 & -257;
        r4.i = r0;
        if (r2 == 0) goto L_0x023e;
    L_0x0232:
        r4.g();
        r0 = r4.q;
        r3 = com.google.dj.g(r5);
        r0.addAll(r3);
    L_0x023e:
        r4.e();
        if (r2 == 0) goto L_0x027d;
    L_0x0243:
        r0 = com.google.dj.g(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x027d;
    L_0x024d:
        r0 = r4.h;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0274;
    L_0x0255:
        r0 = r4.h;
        r0.e();
        r4.h = r1;
        r0 = com.google.dj.g(r5);
        r4.q = r0;
        r0 = r4.i;
        r0 = r0 & -257;
        r4.i = r0;
        r0 = com.google.d0.d;
        if (r0 == 0) goto L_0x0270;
    L_0x026c:
        r1 = r4.b();
    L_0x0270:
        r4.h = r1;
        if (r2 == 0) goto L_0x027d;
    L_0x0274:
        r0 = r4.h;
        r1 = com.google.dj.g(r5);
        r0.a(r1);
    L_0x027d:
        r0 = r5.c();
        if (r0 == 0) goto L_0x028a;
    L_0x0283:
        r0 = r5.E();
        r4.a(r0);
    L_0x028a:
        r0 = r5.s();
        if (r0 == 0) goto L_0x0297;
    L_0x0290:
        r0 = r5.i();
        r4.a(r0);
    L_0x0297:
        r0 = r5.b();
        r4.a(r0);
        goto L_0x0009;
    L_0x02a0:
        r0 = r1;
        goto L_0x0123;
    L_0x02a3:
        r0 = r1;
        goto L_0x0192;
    L_0x02a6:
        r0 = r1;
        goto L_0x0201;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.az.a(com.google.dj):com.google.az");
    }

    public eb a() {
        return d();
    }

    public int l() {
        return this.m == null ? this.u.size() : this.m.j();
    }

    public Object clone() {
        return o();
    }

    private gk b() {
        if (this.h == null) {
            boolean z;
            List list = this.q;
            if ((this.i & 256) == 256) {
                z = true;
            } else {
                z = false;
            }
            this.h = new gk(list, z, h(), f());
            this.q = null;
        }
        return this.h;
    }

    public int m() {
        return this.h == null ? this.q.size() : this.h.j();
    }

    public aJ a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public az o() {
        return w().a(d());
    }

    public final boolean a() {
        boolean z = dy.b;
        int i = 0;
        while (i < x()) {
            if (c(i).a()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        i = 0;
        while (i < f()) {
            if (d(i).a()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        i = 0;
        while (i < l()) {
            if (b(i).a()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        i = 0;
        while (i < m()) {
            if (a(i).a()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        return !z() || u().a();
    }

    protected er g() {
        return cN.b().a(dj.class, az.class);
    }

    private az(b1 b1Var) {
        super(b1Var);
        this.g = "";
        this.p = "";
        this.n = fI.a;
        this.e = Collections.emptyList();
        this.v = Collections.emptyList();
        this.o = Collections.emptyList();
        this.l = Collections.emptyList();
        this.u = Collections.emptyList();
        this.q = Collections.emptyList();
        this.t = eg.n();
        this.j = eW.b();
        j();
    }

    public d7 b(int i) {
        return this.m == null ? (d7) this.u.get(i) : (d7) this.m.b(i);
    }
}
