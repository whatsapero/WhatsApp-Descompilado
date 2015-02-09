package com.google;

import java.io.InputStream;

public final class dr extends d0 implements bp {
    private static final dr h;
    public static final int j = 1;
    public static final int k = 3;
    public static final int n = 2;
    public static eR p;
    private static final long serialVersionUID = 0;
    private byte e;
    private final eS f;
    private es g;
    private int i;
    private Object l;
    private int m;
    private int o;

    public static dr a(InputStream inputStream) {
        return (dr) p.a(inputStream);
    }

    public final boolean a() {
        byte b = this.e;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            if (!j() || h().a()) {
                this.e = (byte) 1;
                return true;
            }
            this.e = (byte) 0;
            return false;
        }
    }

    public aJ a() {
        return l();
    }

    public aJ c() {
        return d();
    }

    private dr(boolean z) {
        this.e = (byte) -1;
        this.o = -1;
        this.f = eS.e();
    }

    public dr e() {
        return h;
    }

    public static dr g() {
        return h;
    }

    public cj b() {
        return l();
    }

    public static dr a(byte[] bArr, aC aCVar) {
        return (dr) p.a(bArr, aCVar);
    }

    public aQ l() {
        return b(this);
    }

    public bX i() {
        return this.g;
    }

    public es h() {
        return this.g;
    }

    static {
        p = new h();
        h = new dr(true);
        h.k();
    }

    public static dr b(InputStream inputStream, aC aCVar) {
        return (dr) p.a(inputStream, aCVar);
    }

    static int a(dr drVar, int i) {
        drVar.i = i;
        return i;
    }

    public boolean j() {
        return (this.m & 4) == 4;
    }

    protected aQ a(b1 b1Var) {
        return new aQ(b1Var, null);
    }

    public static dr a(InputStream inputStream, aC aCVar) {
        return (dr) p.b(inputStream, aCVar);
    }

    protected er b() {
        return cN.q().a(dr.class, aQ.class);
    }

    public final eS b() {
        return this.f;
    }

    public eb c() {
        return e();
    }

    static Object a(dr drVar, Object obj) {
        drVar.l = obj;
        return obj;
    }

    public String b() {
        Object obj = this.l;
        if (obj instanceof String) {
            return (String) obj;
        }
        g2 g2Var = (g2) obj;
        String f = g2Var.f();
        if (g2Var.i()) {
            this.l = f;
        }
        return f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private dr(com.google.I r8, com.google.aC r9) {
        /*
        r7_this = this;
        r1 = 1;
        r0 = -1;
        r4 = com.google.dy.b;
        r7.<init>();
        r7.e = r0;
        r7.o = r0;
        r7.k();
        r5 = com.google.eS.b();
        r2 = 0;
    L_0x0013:
        if (r2 != 0) goto L_0x0072;
    L_0x0015:
        r3 = r8.o();	 Catch:{ gc -> 0x0082, IOException -> 0x0097 }
        switch(r3) {
            case 0: goto L_0x007c;
            case 10: goto L_0x00b1;
            case 16: goto L_0x00af;
            case 26: goto L_0x0043;
            default: goto L_0x001c;
        };
    L_0x001c:
        r0 = r2;
    L_0x001d:
        r2 = r7.a(r8, r5, r9, r3);	 Catch:{ gc -> 0x0080, IOException -> 0x0097 }
        if (r2 != 0) goto L_0x0070;
    L_0x0023:
        if (r4 == 0) goto L_0x00ad;
    L_0x0025:
        r0 = r1;
    L_0x0026:
        r2 = r7.m;	 Catch:{ gc -> 0x0093, IOException -> 0x0097 }
        r2 = r2 | 1;
        r7.m = r2;	 Catch:{ gc -> 0x0093, IOException -> 0x0097 }
        r2 = r8.z();	 Catch:{ gc -> 0x0093, IOException -> 0x0097 }
        r7.l = r2;	 Catch:{ gc -> 0x0093, IOException -> 0x0097 }
        if (r4 == 0) goto L_0x0070;
    L_0x0034:
        r2 = r7.m;	 Catch:{ gc -> 0x0095, IOException -> 0x0097 }
        r2 = r2 | 2;
        r7.m = r2;	 Catch:{ gc -> 0x0095, IOException -> 0x0097 }
        r2 = r8.r();	 Catch:{ gc -> 0x0095, IOException -> 0x0097 }
        r7.i = r2;	 Catch:{ gc -> 0x0095, IOException -> 0x0097 }
        if (r4 == 0) goto L_0x0070;
    L_0x0042:
        r2 = r0;
    L_0x0043:
        r0 = 0;
        r3 = r7.m;	 Catch:{ gc -> 0x0082, IOException -> 0x0097 }
        r3 = r3 & 4;
        r6 = 4;
        if (r3 != r6) goto L_0x00ab;
    L_0x004b:
        r0 = r7.g;	 Catch:{ gc -> 0x0082, IOException -> 0x0097 }
        r0 = r0.d();	 Catch:{ gc -> 0x0082, IOException -> 0x0097 }
        r3 = r0;
    L_0x0052:
        r0 = com.google.es.g;	 Catch:{ gc -> 0x00a6, IOException -> 0x0097 }
        r0 = r8.a(r0, r9);	 Catch:{ gc -> 0x00a6, IOException -> 0x0097 }
        r0 = (com.google.es) r0;	 Catch:{ gc -> 0x00a6, IOException -> 0x0097 }
        r7.g = r0;	 Catch:{ gc -> 0x00a6, IOException -> 0x0097 }
        if (r3 == 0) goto L_0x0069;
    L_0x005e:
        r0 = r7.g;	 Catch:{ gc -> 0x00a6, IOException -> 0x0097 }
        r3.a(r0);	 Catch:{ gc -> 0x00a6, IOException -> 0x0097 }
        r0 = r3.e();	 Catch:{ gc -> 0x00a6, IOException -> 0x0097 }
        r7.g = r0;	 Catch:{ gc -> 0x00a6, IOException -> 0x0097 }
    L_0x0069:
        r0 = r7.m;	 Catch:{ gc -> 0x0082, IOException -> 0x0097 }
        r0 = r0 | 4;
        r7.m = r0;	 Catch:{ gc -> 0x0082, IOException -> 0x0097 }
        r0 = r2;
    L_0x0070:
        if (r4 == 0) goto L_0x00a8;
    L_0x0072:
        r0 = r5.c();
        r7.f = r0;
        r7.c();
        return;
    L_0x007c:
        if (r4 == 0) goto L_0x00ad;
    L_0x007e:
        r0 = r1;
        goto L_0x001d;
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0082, IOException -> 0x0097 }
    L_0x0082:
        r0 = move-exception;
        r0 = r0.a(r7);	 Catch:{ all -> 0x0088 }
        throw r0;	 Catch:{ all -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        r1 = r5.c();
        r7.f = r1;
        r7.c();
        throw r0;
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0095, IOException -> 0x0097 }
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0082, IOException -> 0x0097 }
    L_0x0097:
        r0 = move-exception;
        r1 = new com.google.gc;	 Catch:{ all -> 0x0088 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0088 }
        r1.<init>(r0);	 Catch:{ all -> 0x0088 }
        r0 = r1.a(r7);	 Catch:{ all -> 0x0088 }
        throw r0;	 Catch:{ all -> 0x0088 }
    L_0x00a6:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0082, IOException -> 0x0097 }
    L_0x00a8:
        r2 = r0;
        goto L_0x0013;
    L_0x00ab:
        r3 = r0;
        goto L_0x0052;
    L_0x00ad:
        r0 = r1;
        goto L_0x0070;
    L_0x00af:
        r0 = r2;
        goto L_0x0034;
    L_0x00b1:
        r0 = r2;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dr.<init>(com.google.I, com.google.aC):void");
    }

    static Object a(dr drVar) {
        return drVar.l;
    }

    public static final M n() {
        return cN.F();
    }

    public static dr b(InputStream inputStream) {
        return (dr) p.b(inputStream);
    }

    public static dr a(I i) {
        return (dr) p.a(i);
    }

    private void k() {
        this.l = "";
        this.i = 0;
        this.g = es.c();
    }

    public eR c() {
        return p;
    }

    public int m() {
        return this.i;
    }

    public boolean f() {
        return (this.m & 2) == n;
    }

    public static aQ c() {
        return aQ.h();
    }

    public static dr a(g2 g2Var, aC aCVar) {
        return (dr) p.b(g2Var, aCVar);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public aQ d() {
        return c();
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public a1 c() {
        return e();
    }

    public static aQ b(dr drVar) {
        return c().a(drVar);
    }

    dr(I i, aC aCVar, gY gYVar) {
        this(i, aCVar);
    }

    dr(ax axVar, gY gYVar) {
        this(axVar);
    }

    public void a(bF bFVar) {
        d();
        if ((this.m & 1) == j) {
            bFVar.a((int) j, a());
        }
        if ((this.m & 2) == n) {
            bFVar.c((int) n, this.i);
        }
        if ((this.m & 4) == 4) {
            bFVar.d((int) k, this.g);
        }
        b().a(bFVar);
    }

    public static dr a(byte[] bArr) {
        return (dr) p.a(bArr);
    }

    static int b(dr drVar, int i) {
        drVar.m = i;
        return i;
    }

    public cj a() {
        return d();
    }

    public static dr a(g2 g2Var) {
        return (dr) p.a(g2Var);
    }

    static es a(dr drVar, es esVar) {
        drVar.g = esVar;
        return esVar;
    }

    public g2 a() {
        Object obj = this.l;
        if (!(obj instanceof String)) {
            return (g2) obj;
        }
        g2 a = g2.a((String) obj);
        this.l = a;
        return a;
    }

    public static dr a(I i, aC aCVar) {
        return (dr) p.b(i, aCVar);
    }

    public boolean o() {
        return (this.m & 1) == j;
    }

    private dr(ax axVar) {
        super(axVar);
        this.e = (byte) -1;
        this.o = -1;
        this.f = axVar.b();
    }

    public int d() {
        int i = this.o;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.m & 1) == j) {
            i = 0 + bF.b((int) j, a());
        }
        if ((this.m & 2) == n) {
            i += bF.g(n, this.i);
        }
        if ((this.m & 4) == 4) {
            i += bF.a((int) k, this.g);
        }
        i += b().d();
        this.o = i;
        return i;
    }
}
