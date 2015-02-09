package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aG extends a4 implements ea {
    private List f;
    private boolean g;
    private Object h;
    private boolean i;
    private eu j;
    private Object k;
    private boolean l;
    private boolean m;
    private gk n;
    private int o;
    private boolean p;
    private Object q;

    public a1 b() {
        return k();
    }

    public aG m() {
        return a().a(l());
    }

    public ah a() {
        return m();
    }

    public eb a() {
        return l();
    }

    protected er g() {
        return cN.d().a(eg.class, aG.class);
    }

    public Object clone() {
        return m();
    }

    public a1 a() {
        return l();
    }

    public eb b() {
        return k();
    }

    public M c() {
        return cN.o();
    }

    public aG a(boolean z) {
        this.o |= 256;
        this.l = z;
        e();
        return this;
    }

    public int b() {
        try {
            return this.n == null ? this.f.size() : this.n.j();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    aG(b1 b1Var, gY gYVar) {
        this(b1Var);
    }

    private gk g() {
        try {
            if (this.n == null) {
                boolean z;
                List list = this.f;
                if ((this.o & 512) == 512) {
                    z = true;
                } else {
                    z = false;
                }
                this.n = new gk(list, z, h(), f());
                this.f = null;
            }
            return this.n;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public aG a(eu euVar) {
        if (euVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.o |= 16;
        this.j = euVar;
        e();
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.eg l() {
        /*
        r5_this = this;
        r0 = 1;
        r2 = new com.google.eg;
        r1 = 0;
        r2.<init>(r5, r1);
        r3 = r5.o;
        r1 = 0;
        r4 = r3 & 1;
        if (r4 != r0) goto L_0x00b2;
    L_0x000e:
        r1 = r5.q;
        com.google.eg.a(r2, r1);
        r1 = r3 & 2;
        r4 = 2;
        if (r1 != r4) goto L_0x001a;
    L_0x0018:
        r0 = r0 | 2;
    L_0x001a:
        r1 = r5.h;
        com.google.eg.c(r2, r1);
        r1 = r3 & 4;
        r4 = 4;
        if (r1 != r4) goto L_0x0026;
    L_0x0024:
        r0 = r0 | 4;
    L_0x0026:
        r1 = r5.p;
        com.google.eg.a(r2, r1);
        r1 = r3 & 8;
        r4 = 8;
        if (r1 != r4) goto L_0x0033;
    L_0x0031:
        r0 = r0 | 8;
    L_0x0033:
        r1 = r5.i;
        com.google.eg.d(r2, r1);
        r1 = r3 & 16;
        r4 = 16;
        if (r1 != r4) goto L_0x0040;
    L_0x003e:
        r0 = r0 | 16;
    L_0x0040:
        r1 = r5.j;
        com.google.eg.a(r2, r1);
        r1 = r3 & 32;
        r4 = 32;
        if (r1 != r4) goto L_0x004d;
    L_0x004b:
        r0 = r0 | 32;
    L_0x004d:
        r1 = r5.k;
        com.google.eg.b(r2, r1);
        r1 = r3 & 64;
        r4 = 64;
        if (r1 != r4) goto L_0x005a;
    L_0x0058:
        r0 = r0 | 64;
    L_0x005a:
        r1 = r5.m;
        com.google.eg.c(r2, r1);
        r1 = r3 & 128;
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 != r4) goto L_0x0067;
    L_0x0065:
        r0 = r0 | 128;
    L_0x0067:
        r1 = r5.g;
        com.google.eg.b(r2, r1);
        r1 = r3 & 256;
        r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r1 != r3) goto L_0x0074;
    L_0x0072:
        r0 = r0 | 256;
    L_0x0074:
        r1 = r5.l;	 Catch:{ NullPointerException -> 0x00ac }
        com.google.eg.e(r2, r1);	 Catch:{ NullPointerException -> 0x00ac }
        r1 = r5.n;	 Catch:{ NullPointerException -> 0x00ac }
        if (r1 != 0) goto L_0x009c;
    L_0x007d:
        r1 = r5.o;	 Catch:{ NullPointerException -> 0x00ae }
        r1 = r1 & 512;
        r3 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r1 != r3) goto L_0x0093;
    L_0x0085:
        r1 = r5.f;	 Catch:{ NullPointerException -> 0x00ae }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ NullPointerException -> 0x00ae }
        r5.f = r1;	 Catch:{ NullPointerException -> 0x00ae }
        r1 = r5.o;	 Catch:{ NullPointerException -> 0x00ae }
        r1 = r1 & -513;
        r5.o = r1;	 Catch:{ NullPointerException -> 0x00ae }
    L_0x0093:
        r1 = r5.f;	 Catch:{ NullPointerException -> 0x00b0 }
        com.google.eg.a(r2, r1);	 Catch:{ NullPointerException -> 0x00b0 }
        r1 = com.google.dy.b;	 Catch:{ NullPointerException -> 0x00b0 }
        if (r1 == 0) goto L_0x00a5;
    L_0x009c:
        r1 = r5.n;	 Catch:{ NullPointerException -> 0x00b0 }
        r1 = r1.g();	 Catch:{ NullPointerException -> 0x00b0 }
        com.google.eg.a(r2, r1);	 Catch:{ NullPointerException -> 0x00b0 }
    L_0x00a5:
        com.google.eg.a(r2, r0);
        r5.b();
        return r2;
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ae }
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = r1;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aG.l():com.google.eg");
    }

    public aI a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    private void j() {
        try {
            if (d0.d) {
                g();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private static aG a() {
        return new aG();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.aG a(com.google.I r5, com.google.aC r6) {
        /*
        r4_this = this;
        r2 = 0;
        r0 = com.google.eg.l;	 Catch:{ gc -> 0x000f }
        r0 = r0.a(r5, r6);	 Catch:{ gc -> 0x000f }
        r0 = (com.google.eg) r0;	 Catch:{ gc -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ gc -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.c();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.eg) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.aG.a(com.google.I, com.google.aC):com.google.aG");
    }

    public aG a(eb ebVar) {
        try {
            if (ebVar instanceof eg) {
                this = a((eg) ebVar);
            } else {
                super.a(ebVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public aG e(boolean z) {
        this.o |= 8;
        this.i = z;
        e();
        return this;
    }

    public aI a() {
        return m();
    }

    public cj a(eb ebVar) {
        return a(ebVar);
    }

    private aG(b1 b1Var) {
        super(b1Var);
        this.q = "";
        this.h = "";
        this.j = eu.SPEED;
        this.k = "";
        this.f = Collections.emptyList();
        j();
    }

    public ah a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    private aG() {
        this.q = "";
        this.h = "";
        this.j = eu.SPEED;
        this.k = "";
        this.f = Collections.emptyList();
        j();
    }

    public eg k() {
        Object l = l();
        try {
            if (l.a()) {
                return l;
            }
            throw b(l);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public aG d(boolean z) {
        this.o |= 128;
        this.g = z;
        e();
        return this;
    }

    public aI a(eb ebVar) {
        return a(ebVar);
    }

    public eb c() {
        return h();
    }

    public a1 c() {
        return h();
    }

    public eD a(int i) {
        try {
            return this.n == null ? (eD) this.f.get(i) : (eD) this.n.b(i);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public aG c(boolean z) {
        this.o |= 64;
        this.m = z;
        e();
        return this;
    }

    public eg h() {
        return eg.n();
    }

    public a4 a() {
        return m();
    }

    public ax a() {
        return m();
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
        r3 = r4.b();
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.aG.a():boolean");
    }

    private void f() {
        try {
            if ((this.o & 512) != 512) {
                this.f = new ArrayList(this.f);
                this.o |= 512;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public aJ a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public aG b(boolean z) {
        this.o |= 4;
        this.p = z;
        e();
        return this;
    }

    static aG i() {
        return a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.aG a(com.google.eg r5) {
        /*
        r4_this = this;
        r0 = 0;
        r1 = com.google.dy.b;
        r2 = com.google.eg.n();	 Catch:{ NullPointerException -> 0x000a }
        if (r5 != r2) goto L_0x000c;
    L_0x0009:
        return r4;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r2 = r5.r();	 Catch:{ NullPointerException -> 0x0115 }
        if (r2 == 0) goto L_0x0021;
    L_0x0012:
        r2 = r4.o;	 Catch:{ NullPointerException -> 0x0115 }
        r2 = r2 | 1;
        r4.o = r2;	 Catch:{ NullPointerException -> 0x0115 }
        r2 = com.google.eg.b(r5);	 Catch:{ NullPointerException -> 0x0115 }
        r4.q = r2;	 Catch:{ NullPointerException -> 0x0115 }
        r4.e();	 Catch:{ NullPointerException -> 0x0115 }
    L_0x0021:
        r2 = r5.q();	 Catch:{ NullPointerException -> 0x0117 }
        if (r2 == 0) goto L_0x0036;
    L_0x0027:
        r2 = r4.o;	 Catch:{ NullPointerException -> 0x0117 }
        r2 = r2 | 2;
        r4.o = r2;	 Catch:{ NullPointerException -> 0x0117 }
        r2 = com.google.eg.e(r5);	 Catch:{ NullPointerException -> 0x0117 }
        r4.h = r2;	 Catch:{ NullPointerException -> 0x0117 }
        r4.e();	 Catch:{ NullPointerException -> 0x0117 }
    L_0x0036:
        r2 = r5.p();	 Catch:{ NullPointerException -> 0x0119 }
        if (r2 == 0) goto L_0x0043;
    L_0x003c:
        r2 = r5.c();	 Catch:{ NullPointerException -> 0x0119 }
        r4.b(r2);	 Catch:{ NullPointerException -> 0x0119 }
    L_0x0043:
        r2 = r5.k();	 Catch:{ NullPointerException -> 0x011b }
        if (r2 == 0) goto L_0x0050;
    L_0x0049:
        r2 = r5.o();	 Catch:{ NullPointerException -> 0x011b }
        r4.e(r2);	 Catch:{ NullPointerException -> 0x011b }
    L_0x0050:
        r2 = r5.l();	 Catch:{ NullPointerException -> 0x011d }
        if (r2 == 0) goto L_0x005d;
    L_0x0056:
        r2 = r5.g();	 Catch:{ NullPointerException -> 0x011d }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x011d }
    L_0x005d:
        r2 = r5.F();	 Catch:{ NullPointerException -> 0x011f }
        if (r2 == 0) goto L_0x0072;
    L_0x0063:
        r2 = r4.o;	 Catch:{ NullPointerException -> 0x011f }
        r2 = r2 | 32;
        r4.o = r2;	 Catch:{ NullPointerException -> 0x011f }
        r2 = com.google.eg.c(r5);	 Catch:{ NullPointerException -> 0x011f }
        r4.k = r2;	 Catch:{ NullPointerException -> 0x011f }
        r4.e();	 Catch:{ NullPointerException -> 0x011f }
    L_0x0072:
        r2 = r5.h();	 Catch:{ NullPointerException -> 0x0121 }
        if (r2 == 0) goto L_0x007f;
    L_0x0078:
        r2 = r5.f();	 Catch:{ NullPointerException -> 0x0121 }
        r4.c(r2);	 Catch:{ NullPointerException -> 0x0121 }
    L_0x007f:
        r2 = r5.G();	 Catch:{ NullPointerException -> 0x0123 }
        if (r2 == 0) goto L_0x008c;
    L_0x0085:
        r2 = r5.t();	 Catch:{ NullPointerException -> 0x0123 }
        r4.d(r2);	 Catch:{ NullPointerException -> 0x0123 }
    L_0x008c:
        r2 = r5.B();	 Catch:{ NullPointerException -> 0x0125 }
        if (r2 == 0) goto L_0x0099;
    L_0x0092:
        r2 = r5.E();	 Catch:{ NullPointerException -> 0x0125 }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x0125 }
    L_0x0099:
        r2 = r4.n;	 Catch:{ NullPointerException -> 0x0127 }
        if (r2 != 0) goto L_0x00ce;
    L_0x009d:
        r2 = com.google.eg.d(r5);	 Catch:{ NullPointerException -> 0x0129 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x0129 }
        if (r2 != 0) goto L_0x0109;
    L_0x00a7:
        r2 = r4.f;	 Catch:{ NullPointerException -> 0x012b }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x012b }
        if (r2 == 0) goto L_0x00bd;
    L_0x00af:
        r2 = com.google.eg.d(r5);	 Catch:{ NullPointerException -> 0x012d }
        r4.f = r2;	 Catch:{ NullPointerException -> 0x012d }
        r2 = r4.o;	 Catch:{ NullPointerException -> 0x012d }
        r2 = r2 & -513;
        r4.o = r2;	 Catch:{ NullPointerException -> 0x012d }
        if (r1 == 0) goto L_0x00c9;
    L_0x00bd:
        r4.f();	 Catch:{ NullPointerException -> 0x012d }
        r2 = r4.f;	 Catch:{ NullPointerException -> 0x012d }
        r3 = com.google.eg.d(r5);	 Catch:{ NullPointerException -> 0x012d }
        r2.addAll(r3);	 Catch:{ NullPointerException -> 0x012d }
    L_0x00c9:
        r4.e();	 Catch:{ NullPointerException -> 0x012f }
        if (r1 == 0) goto L_0x0109;
    L_0x00ce:
        r2 = com.google.eg.d(r5);	 Catch:{ NullPointerException -> 0x0131 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x0131 }
        if (r2 != 0) goto L_0x0109;
    L_0x00d8:
        r2 = r4.n;	 Catch:{ NullPointerException -> 0x0133 }
        r2 = r2.c();	 Catch:{ NullPointerException -> 0x0133 }
        if (r2 == 0) goto L_0x0100;
    L_0x00e0:
        r2 = r4.n;	 Catch:{ NullPointerException -> 0x0135 }
        r2.e();	 Catch:{ NullPointerException -> 0x0135 }
        r2 = 0;
        r4.n = r2;	 Catch:{ NullPointerException -> 0x0135 }
        r2 = com.google.eg.d(r5);	 Catch:{ NullPointerException -> 0x0135 }
        r4.f = r2;	 Catch:{ NullPointerException -> 0x0135 }
        r2 = r4.o;	 Catch:{ NullPointerException -> 0x0135 }
        r2 = r2 & -513;
        r4.o = r2;	 Catch:{ NullPointerException -> 0x0135 }
        r2 = com.google.d0.d;	 Catch:{ NullPointerException -> 0x0135 }
        if (r2 == 0) goto L_0x00fc;
    L_0x00f8:
        r0 = r4.g();	 Catch:{ NullPointerException -> 0x0135 }
    L_0x00fc:
        r4.n = r0;	 Catch:{ NullPointerException -> 0x0137 }
        if (r1 == 0) goto L_0x0109;
    L_0x0100:
        r0 = r4.n;	 Catch:{ NullPointerException -> 0x0137 }
        r1 = com.google.eg.d(r5);	 Catch:{ NullPointerException -> 0x0137 }
        r0.a(r1);	 Catch:{ NullPointerException -> 0x0137 }
    L_0x0109:
        r4.a(r5);
        r0 = r5.b();
        r4.a(r0);
        goto L_0x0009;
    L_0x0115:
        r0 = move-exception;
        throw r0;
    L_0x0117:
        r0 = move-exception;
        throw r0;
    L_0x0119:
        r0 = move-exception;
        throw r0;
    L_0x011b:
        r0 = move-exception;
        throw r0;
    L_0x011d:
        r0 = move-exception;
        throw r0;
    L_0x011f:
        r0 = move-exception;
        throw r0;
    L_0x0121:
        r0 = move-exception;
        throw r0;
    L_0x0123:
        r0 = move-exception;
        throw r0;
    L_0x0125:
        r0 = move-exception;
        throw r0;
    L_0x0127:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0129 }
    L_0x0129:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x012b }
    L_0x012b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x012d }
    L_0x012d:
        r0 = move-exception;
        throw r0;
    L_0x012f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0131 }
    L_0x0131:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0133 }
    L_0x0133:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0135 }
    L_0x0135:
        r0 = move-exception;
        throw r0;
    L_0x0137:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aG.a(com.google.eg):com.google.aG");
    }
}
