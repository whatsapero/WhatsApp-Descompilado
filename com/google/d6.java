package com.google;

import java.io.InputStream;

public final class d6 extends d0 implements ei {
    public static final int e = 1;
    public static final int g = 4;
    public static eR j = null;
    public static final int l = 5;
    public static final int m = 3;
    public static final int n = 6;
    private static final long serialVersionUID = 0;
    public static final int u = 2;
    public static final int v = 7;
    public static final int w = 8;
    private static final d6 y;
    private Object f;
    private final eS h;
    private int i;
    private Object k;
    private Object o;
    private byte p;
    private int q;
    private Object r;
    private eJ s;
    private int t;
    private bt x;
    private b6 z;

    public static d6 b(InputStream inputStream) {
        return (d6) j.b(inputStream);
    }

    public g2 o() {
        Object obj = this.k;
        if (!(obj instanceof String)) {
            return (g2) obj;
        }
        g2 a = g2.a((String) obj);
        this.k = a;
        return a;
    }

    static Object b(d6 d6Var) {
        return d6Var.f;
    }

    static {
        j = new j();
        y = new d6(true);
        y.x();
    }

    public boolean e() {
        return (this.q & 8) == w;
    }

    public static aH k() {
        return aH.k();
    }

    static Object a(d6 d6Var, Object obj) {
        d6Var.f = obj;
        return obj;
    }

    public String l() {
        Object obj = this.r;
        if (obj instanceof String) {
            return (String) obj;
        }
        g2 g2Var = (g2) obj;
        String f = g2Var.f();
        if (g2Var.i()) {
            this.r = f;
        }
        return f;
    }

    public String u() {
        Object obj = this.o;
        if (obj instanceof String) {
            return (String) obj;
        }
        g2 g2Var = (g2) obj;
        String f = g2Var.f();
        if (g2Var.i()) {
            this.o = f;
        }
        return f;
    }

    public static d6 a(I i) {
        return (d6) j.a(i);
    }

    static Object d(d6 d6Var) {
        return d6Var.r;
    }

    public boolean v() {
        return (this.q & 128) == 128;
    }

    public static d6 a(byte[] bArr, aC aCVar) {
        return (d6) j.a(bArr, aCVar);
    }

    private d6(boolean z) {
        this.p = (byte) -1;
        this.i = -1;
        this.h = eS.e();
    }

    protected aH a(b1 b1Var) {
        return new aH(b1Var, null);
    }

    public boolean t() {
        return (this.q & 16) == 16;
    }

    public eJ A() {
        return this.s;
    }

    d6(I i, aC aCVar, gY gYVar) {
        this(i, aCVar);
    }

    public static d6 a(InputStream inputStream) {
        return (d6) j.a(inputStream);
    }

    static eJ a(d6 d6Var, eJ eJVar) {
        d6Var.s = eJVar;
        return eJVar;
    }

    static b6 a(d6 d6Var, b6 b6Var) {
        d6Var.z = b6Var;
        return b6Var;
    }

    public g2 s() {
        Object obj = this.r;
        if (!(obj instanceof String)) {
            return (g2) obj;
        }
        g2 a = g2.a((String) obj);
        this.r = a;
        return a;
    }

    public aJ c() {
        return i();
    }

    public static d6 a(byte[] bArr) {
        return (d6) j.a(bArr);
    }

    private void x() {
        this.f = "";
        this.t = 0;
        this.x = bt.LABEL_OPTIONAL;
        this.z = b6.TYPE_DOUBLE;
        this.k = "";
        this.o = "";
        this.r = "";
        this.s = eJ.d();
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    private d6(ax axVar) {
        super(axVar);
        this.p = (byte) -1;
        this.i = -1;
        this.h = axVar.b();
    }

    public bt h() {
        return this.x;
    }

    public static d6 a(g2 g2Var) {
        return (d6) j.a(g2Var);
    }

    static bt a(d6 d6Var, bt btVar) {
        d6Var.x = btVar;
        return btVar;
    }

    public String w() {
        Object obj = this.k;
        if (obj instanceof String) {
            return (String) obj;
        }
        g2 g2Var = (g2) obj;
        String f = g2Var.f();
        if (g2Var.i()) {
            this.k = f;
        }
        return f;
    }

    public static d6 n() {
        return y;
    }

    public int d() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.q & 1) == e) {
            i = 0 + bF.b((int) e, m());
        }
        if ((this.q & 32) == 32) {
            i += bF.b((int) u, z());
        }
        if ((this.q & 2) == u) {
            i += bF.g(m, this.t);
        }
        if ((this.q & 4) == g) {
            i += bF.h(g, this.x.getNumber());
        }
        if ((this.q & 8) == w) {
            i += bF.h(l, this.z.getNumber());
        }
        if ((this.q & 16) == 16) {
            i += bF.b((int) n, o());
        }
        if ((this.q & 64) == 64) {
            i += bF.b((int) v, s());
        }
        if ((this.q & 128) == 128) {
            i += bF.a((int) w, this.s);
        }
        i += b().d();
        this.i = i;
        return i;
    }

    public boolean p() {
        return (this.q & 64) == 64;
    }

    public String a() {
        Object obj = this.f;
        if (obj instanceof String) {
            return (String) obj;
        }
        g2 g2Var = (g2) obj;
        String f = g2Var.f();
        if (g2Var.i()) {
            this.f = f;
        }
        return f;
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public d6 b() {
        return y;
    }

    public eI B() {
        return this.s;
    }

    static Object c(d6 d6Var, Object obj) {
        d6Var.k = obj;
        return obj;
    }

    public int g() {
        return this.t;
    }

    public boolean f() {
        return (this.q & 32) == 32;
    }

    public static d6 a(I i, aC aCVar) {
        return (d6) j.b(i, aCVar);
    }

    public aJ a() {
        return y();
    }

    public eb c() {
        return b();
    }

    public static final M d() {
        return cN.y();
    }

    static int a(d6 d6Var, int i) {
        d6Var.q = i;
        return i;
    }

    public b6 j() {
        return this.z;
    }

    public static d6 a(g2 g2Var, aC aCVar) {
        return (d6) j.b(g2Var, aCVar);
    }

    public final eS b() {
        return this.h;
    }

    public aH y() {
        return e(this);
    }

    public g2 m() {
        Object obj = this.f;
        if (!(obj instanceof String)) {
            return (g2) obj;
        }
        g2 a = g2.a((String) obj);
        this.f = a;
        return a;
    }

    public cj a() {
        return i();
    }

    public boolean q() {
        return (this.q & 1) == e;
    }

    static Object c(d6 d6Var) {
        return d6Var.o;
    }

    public boolean r() {
        return (this.q & 2) == u;
    }

    public static aH e(d6 d6Var) {
        return k().a(d6Var);
    }

    static Object d(d6 d6Var, Object obj) {
        d6Var.r = obj;
        return obj;
    }

    public void a(bF bFVar) {
        d();
        if ((this.q & 1) == e) {
            bFVar.a((int) e, m());
        }
        if ((this.q & 32) == 32) {
            bFVar.a((int) u, z());
        }
        if ((this.q & 2) == u) {
            bFVar.c((int) m, this.t);
        }
        if ((this.q & 4) == g) {
            bFVar.d((int) g, this.x.getNumber());
        }
        if ((this.q & 8) == w) {
            bFVar.d((int) l, this.z.getNumber());
        }
        if ((this.q & 16) == 16) {
            bFVar.a((int) n, o());
        }
        if ((this.q & 64) == 64) {
            bFVar.a((int) v, s());
        }
        if ((this.q & 128) == 128) {
            bFVar.d((int) w, this.s);
        }
        b().a(bFVar);
    }

    static int b(d6 d6Var, int i) {
        d6Var.t = i;
        return i;
    }

    d6(ax axVar, gY gYVar) {
        this(axVar);
    }

    static Object a(d6 d6Var) {
        return d6Var.k;
    }

    protected er b() {
        return cN.f().a(d6.class, aH.class);
    }

    public aH i() {
        return k();
    }

    public boolean C() {
        return (this.q & 4) == g;
    }

    public static d6 a(InputStream inputStream, aC aCVar) {
        return (d6) j.a(inputStream, aCVar);
    }

    static Object b(d6 d6Var, Object obj) {
        d6Var.o = obj;
        return obj;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private d6(com.google.I r8, com.google.aC r9) {
        /*
        r7_this = this;
        r1 = 1;
        r0 = -1;
        r4 = com.google.dy.b;
        r7.<init>();
        r7.p = r0;
        r7.i = r0;
        r7.x();
        r5 = com.google.eS.b();
        r2 = 0;
    L_0x0013:
        if (r2 != 0) goto L_0x00d1;
    L_0x0015:
        r3 = r8.o();	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
        switch(r3) {
            case 0: goto L_0x00db;
            case 10: goto L_0x012f;
            case 18: goto L_0x012c;
            case 24: goto L_0x0129;
            case 32: goto L_0x0126;
            case 40: goto L_0x0123;
            case 50: goto L_0x0120;
            case 58: goto L_0x011d;
            case 66: goto L_0x00a1;
            default: goto L_0x001c;
        };
    L_0x001c:
        r0 = r2;
    L_0x001d:
        r2 = r7.a(r8, r5, r9, r3);	 Catch:{ gc -> 0x00e0, IOException -> 0x00f9 }
        if (r2 != 0) goto L_0x00cf;
    L_0x0023:
        if (r4 == 0) goto L_0x011b;
    L_0x0025:
        r0 = r1;
    L_0x0026:
        r2 = r7.q;	 Catch:{ gc -> 0x00f3, IOException -> 0x00f9 }
        r2 = r2 | 1;
        r7.q = r2;	 Catch:{ gc -> 0x00f3, IOException -> 0x00f9 }
        r2 = r8.z();	 Catch:{ gc -> 0x00f3, IOException -> 0x00f9 }
        r7.f = r2;	 Catch:{ gc -> 0x00f3, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x0034:
        r2 = r7.q;	 Catch:{ gc -> 0x00f5, IOException -> 0x00f9 }
        r2 = r2 | 32;
        r7.q = r2;	 Catch:{ gc -> 0x00f5, IOException -> 0x00f9 }
        r2 = r8.z();	 Catch:{ gc -> 0x00f5, IOException -> 0x00f9 }
        r7.o = r2;	 Catch:{ gc -> 0x00f5, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x0042:
        r2 = r7.q;	 Catch:{ gc -> 0x00f7, IOException -> 0x00f9 }
        r2 = r2 | 2;
        r7.q = r2;	 Catch:{ gc -> 0x00f7, IOException -> 0x00f9 }
        r2 = r8.r();	 Catch:{ gc -> 0x00f7, IOException -> 0x00f9 }
        r7.t = r2;	 Catch:{ gc -> 0x00f7, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x0050:
        r2 = r8.c();	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
        r3 = com.google.bt.valueOf(r2);	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
        if (r3 != 0) goto L_0x0060;
    L_0x005a:
        r6 = 4;
        r5.a(r6, r2);	 Catch:{ gc -> 0x0108, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x0060:
        r2 = r7.q;	 Catch:{ gc -> 0x010a, IOException -> 0x00f9 }
        r2 = r2 | 4;
        r7.q = r2;	 Catch:{ gc -> 0x010a, IOException -> 0x00f9 }
        r7.x = r3;	 Catch:{ gc -> 0x010a, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x006a:
        r2 = r8.c();	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
        r3 = com.google.b6.valueOf(r2);	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
        if (r3 != 0) goto L_0x007a;
    L_0x0074:
        r6 = 5;
        r5.a(r6, r2);	 Catch:{ gc -> 0x010c, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x007a:
        r2 = r7.q;	 Catch:{ gc -> 0x010e, IOException -> 0x00f9 }
        r2 = r2 | 8;
        r7.q = r2;	 Catch:{ gc -> 0x010e, IOException -> 0x00f9 }
        r7.z = r3;	 Catch:{ gc -> 0x010e, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x0084:
        r2 = r7.q;	 Catch:{ gc -> 0x0110, IOException -> 0x00f9 }
        r2 = r2 | 16;
        r7.q = r2;	 Catch:{ gc -> 0x0110, IOException -> 0x00f9 }
        r2 = r8.z();	 Catch:{ gc -> 0x0110, IOException -> 0x00f9 }
        r7.k = r2;	 Catch:{ gc -> 0x0110, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x0092:
        r2 = r7.q;	 Catch:{ gc -> 0x0112, IOException -> 0x00f9 }
        r2 = r2 | 64;
        r7.q = r2;	 Catch:{ gc -> 0x0112, IOException -> 0x00f9 }
        r2 = r8.z();	 Catch:{ gc -> 0x0112, IOException -> 0x00f9 }
        r7.r = r2;	 Catch:{ gc -> 0x0112, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x00a0:
        r2 = r0;
    L_0x00a1:
        r0 = 0;
        r3 = r7.q;	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
        r3 = r3 & 128;
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r3 != r6) goto L_0x0119;
    L_0x00aa:
        r0 = r7.s;	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
        r0 = r0.x();	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
        r3 = r0;
    L_0x00b1:
        r0 = com.google.eJ.x;	 Catch:{ gc -> 0x0114, IOException -> 0x00f9 }
        r0 = r8.a(r0, r9);	 Catch:{ gc -> 0x0114, IOException -> 0x00f9 }
        r0 = (com.google.eJ) r0;	 Catch:{ gc -> 0x0114, IOException -> 0x00f9 }
        r7.s = r0;	 Catch:{ gc -> 0x0114, IOException -> 0x00f9 }
        if (r3 == 0) goto L_0x00c8;
    L_0x00bd:
        r0 = r7.s;	 Catch:{ gc -> 0x0114, IOException -> 0x00f9 }
        r3.a(r0);	 Catch:{ gc -> 0x0114, IOException -> 0x00f9 }
        r0 = r3.k();	 Catch:{ gc -> 0x0114, IOException -> 0x00f9 }
        r7.s = r0;	 Catch:{ gc -> 0x0114, IOException -> 0x00f9 }
    L_0x00c8:
        r0 = r7.q;	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
        r0 = r0 | 128;
        r7.q = r0;	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
        r0 = r2;
    L_0x00cf:
        if (r4 == 0) goto L_0x0116;
    L_0x00d1:
        r0 = r5.c();
        r7.h = r0;
        r7.c();
        return;
    L_0x00db:
        if (r4 == 0) goto L_0x011b;
    L_0x00dd:
        r0 = r1;
        goto L_0x001d;
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
    L_0x00e2:
        r0 = move-exception;
        r0 = r0.a(r7);	 Catch:{ all -> 0x00e8 }
        throw r0;	 Catch:{ all -> 0x00e8 }
    L_0x00e8:
        r0 = move-exception;
        r1 = r5.c();
        r7.h = r1;
        r7.c();
        throw r0;
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00f5, IOException -> 0x00f9 }
    L_0x00f5:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00f7, IOException -> 0x00f9 }
    L_0x00f7:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
    L_0x00f9:
        r0 = move-exception;
        r1 = new com.google.gc;	 Catch:{ all -> 0x00e8 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x00e8 }
        r1.<init>(r0);	 Catch:{ all -> 0x00e8 }
        r0 = r1.a(r7);	 Catch:{ all -> 0x00e8 }
        throw r0;	 Catch:{ all -> 0x00e8 }
    L_0x0108:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x010a, IOException -> 0x00f9 }
    L_0x010a:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
    L_0x010c:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x010e, IOException -> 0x00f9 }
    L_0x010e:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0110, IOException -> 0x00f9 }
    L_0x0110:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0112, IOException -> 0x00f9 }
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
    L_0x0114:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00e2, IOException -> 0x00f9 }
    L_0x0116:
        r2 = r0;
        goto L_0x0013;
    L_0x0119:
        r3 = r0;
        goto L_0x00b1;
    L_0x011b:
        r0 = r1;
        goto L_0x00cf;
    L_0x011d:
        r0 = r2;
        goto L_0x0092;
    L_0x0120:
        r0 = r2;
        goto L_0x0084;
    L_0x0123:
        r0 = r2;
        goto L_0x006a;
    L_0x0126:
        r0 = r2;
        goto L_0x0050;
    L_0x0129:
        r0 = r2;
        goto L_0x0042;
    L_0x012c:
        r0 = r2;
        goto L_0x0034;
    L_0x012f:
        r0 = r2;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d6.<init>(com.google.I, com.google.aC):void");
    }

    public eR c() {
        return j;
    }

    public static d6 b(InputStream inputStream, aC aCVar) {
        return (d6) j.b(inputStream, aCVar);
    }

    public a1 c() {
        return b();
    }

    public final boolean a() {
        byte b = this.p;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            if (!v() || A().a()) {
                this.p = (byte) 1;
                return true;
            }
            this.p = (byte) 0;
            return false;
        }
    }

    public g2 z() {
        Object obj = this.o;
        if (!(obj instanceof String)) {
            return (g2) obj;
        }
        g2 a = g2.a((String) obj);
        this.o = a;
        return a;
    }

    public cj b() {
        return y();
    }
}
