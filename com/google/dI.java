package com.google;

import java.io.InputStream;

public final class di extends d0 implements fw {
    private static final di f;
    public static final int g = 2;
    public static final int j = 1;
    public static eR l;
    private static final long serialVersionUID = 0;
    private final eS e;
    private int h;
    private int i;
    private int k;
    private byte m;
    private int n;

    static {
        l = new e();
        f = new di(true);
        f.e();
    }

    public cj a() {
        return c();
    }

    public final boolean a() {
        byte b = this.m;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            this.m = (byte) 1;
            return true;
        }
    }

    di(ax axVar, gY gYVar) {
        this(axVar);
    }

    public static di a(I i) {
        return (di) l.a(i);
    }

    public static di b(InputStream inputStream) {
        return (di) l.a(inputStream);
    }

    static int b(di diVar, int i) {
        diVar.n = i;
        return i;
    }

    public static au j() {
        return au.d();
    }

    public au k() {
        return a(this);
    }

    public static di a(byte[] bArr, aC aCVar) {
        return (di) l.a(bArr, aCVar);
    }

    protected er b() {
        return cN.e().a(di.class, au.class);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private di(com.google.I r6, com.google.aC r7) {
        /*
        r5_this = this;
        r1 = 1;
        r0 = -1;
        r2 = com.google.dy.b;
        r5.<init>();
        r5.m = r0;
        r5.h = r0;
        r5.e();
        r3 = com.google.eS.b();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x0041;
    L_0x0015:
        r4 = r6.o();	 Catch:{ gc -> 0x0051, IOException -> 0x0066 }
        switch(r4) {
            case 0: goto L_0x004b;
            case 8: goto L_0x0025;
            case 16: goto L_0x0033;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ gc -> 0x004f, IOException -> 0x0066 }
        if (r4 != 0) goto L_0x003f;
    L_0x0022:
        if (r2 == 0) goto L_0x0075;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.i;	 Catch:{ gc -> 0x0062, IOException -> 0x0066 }
        r4 = r4 | 1;
        r5.i = r4;	 Catch:{ gc -> 0x0062, IOException -> 0x0066 }
        r4 = r6.r();	 Catch:{ gc -> 0x0062, IOException -> 0x0066 }
        r5.n = r4;	 Catch:{ gc -> 0x0062, IOException -> 0x0066 }
        if (r2 == 0) goto L_0x003f;
    L_0x0033:
        r4 = r5.i;	 Catch:{ gc -> 0x0064, IOException -> 0x0066 }
        r4 = r4 | 2;
        r5.i = r4;	 Catch:{ gc -> 0x0064, IOException -> 0x0066 }
        r4 = r6.r();	 Catch:{ gc -> 0x0064, IOException -> 0x0066 }
        r5.k = r4;	 Catch:{ gc -> 0x0064, IOException -> 0x0066 }
    L_0x003f:
        if (r2 == 0) goto L_0x0013;
    L_0x0041:
        r0 = r3.c();
        r5.e = r0;
        r5.c();
        return;
    L_0x004b:
        if (r2 == 0) goto L_0x0075;
    L_0x004d:
        r0 = r1;
        goto L_0x001c;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0051, IOException -> 0x0066 }
    L_0x0051:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x0057 }
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        r1 = r3.c();
        r5.e = r1;
        r5.c();
        throw r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0064, IOException -> 0x0066 }
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0051, IOException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        r1 = new com.google.gc;	 Catch:{ all -> 0x0057 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0057 }
        r1.<init>(r0);	 Catch:{ all -> 0x0057 }
        r0 = r1.a(r5);	 Catch:{ all -> 0x0057 }
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x0075:
        r0 = r1;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.di.<init>(com.google.I, com.google.aC):void");
    }

    public static di a(InputStream inputStream) {
        return (di) l.b(inputStream);
    }

    static int a(di diVar, int i) {
        diVar.i = i;
        return i;
    }

    public boolean h() {
        return (this.i & 1) == j;
    }

    public static di a(InputStream inputStream, aC aCVar) {
        return (di) l.b(inputStream, aCVar);
    }

    public static final M f() {
        return cN.n();
    }

    private di(boolean z) {
        this.m = (byte) -1;
        this.h = -1;
        this.e = eS.e();
    }

    public aJ c() {
        return c();
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public static di b(InputStream inputStream, aC aCVar) {
        return (di) l.a(inputStream, aCVar);
    }

    public eb c() {
        return d();
    }

    public aJ a() {
        return k();
    }

    public int a() {
        return this.k;
    }

    public static di a(g2 g2Var) {
        return (di) l.a(g2Var);
    }

    public static au a(di diVar) {
        return j().a(diVar);
    }

    public static di a(I i, aC aCVar) {
        return (di) l.b(i, aCVar);
    }

    public static di b() {
        return f;
    }

    private di(ax axVar) {
        super(axVar);
        this.m = (byte) -1;
        this.h = -1;
        this.e = axVar.b();
    }

    public int d() {
        int i = this.h;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.i & 1) == j) {
            i = 0 + bF.g(j, this.n);
        }
        if ((this.i & 2) == g) {
            i += bF.g(g, this.k);
        }
        i += b().d();
        this.h = i;
        return i;
    }

    protected au a(b1 b1Var) {
        return new au(b1Var, null);
    }

    public a1 c() {
        return d();
    }

    public di d() {
        return f;
    }

    public au c() {
        return j();
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static di a(g2 g2Var, aC aCVar) {
        return (di) l.b(g2Var, aCVar);
    }

    public final eS b() {
        return this.e;
    }

    public eR c() {
        return l;
    }

    di(I i, aC aCVar, gY gYVar) {
        this(i, aCVar);
    }

    private void e() {
        this.n = 0;
        this.k = 0;
    }

    public boolean i() {
        return (this.i & 2) == g;
    }

    static int c(di diVar, int i) {
        diVar.k = i;
        return i;
    }

    public cj b() {
        return k();
    }

    public static di a(byte[] bArr) {
        return (di) l.a(bArr);
    }

    public int g() {
        return this.n;
    }

    public void a(bF bFVar) {
        d();
        if ((this.i & 1) == j) {
            bFVar.c((int) j, this.n);
        }
        if ((this.i & 2) == g) {
            bFVar.c((int) g, this.k);
        }
        b().a(bFVar);
    }
}
