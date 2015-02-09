package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class ek extends eZ implements fD {
    public static eR f = null;
    public static final int g = 999;
    private static final ek j;
    public static final int n = 2;
    public static final int p = 1;
    private static final long serialVersionUID = 0;
    private byte h;
    private int i;
    private boolean k;
    private final eS l;
    private int m;
    private List o;
    private boolean q;

    public static a7 b(ek ekVar) {
        return i().a(ekVar);
    }

    protected er b() {
        return cN.G().a(ek.class, a7.class);
    }

    public static ek b(InputStream inputStream) {
        return (ek) f.a(inputStream);
    }

    ek(a4 a4Var, gY gYVar) {
        this(a4Var);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ek(com.google.I r9, com.google.aC r10) {
        /*
        r8_this = this;
        r2 = 1;
        r0 = 0;
        r1 = -1;
        r7 = 4;
        r3 = com.google.dy.b;
        r8.<init>();
        r8.h = r1;
        r8.i = r1;
        r8.d();
        r4 = com.google.eS.b();
        r1 = r0;
    L_0x0015:
        if (r0 != 0) goto L_0x005d;
    L_0x0017:
        r5 = r9.o();	 Catch:{ gc -> 0x0079, IOException -> 0x009c }
        switch(r5) {
            case 0: goto L_0x0073;
            case 8: goto L_0x0027;
            case 16: goto L_0x0035;
            case 7994: goto L_0x0043;
            default: goto L_0x001e;
        };
    L_0x001e:
        r5 = r8.a(r9, r4, r10, r5);	 Catch:{ gc -> 0x0077, IOException -> 0x009c }
        if (r5 != 0) goto L_0x005b;
    L_0x0024:
        if (r3 == 0) goto L_0x00af;
    L_0x0026:
        r0 = r2;
    L_0x0027:
        r5 = r8.m;	 Catch:{ gc -> 0x0096, IOException -> 0x009c }
        r5 = r5 | 1;
        r8.m = r5;	 Catch:{ gc -> 0x0096, IOException -> 0x009c }
        r5 = r9.s();	 Catch:{ gc -> 0x0096, IOException -> 0x009c }
        r8.q = r5;	 Catch:{ gc -> 0x0096, IOException -> 0x009c }
        if (r3 == 0) goto L_0x005b;
    L_0x0035:
        r5 = r8.m;	 Catch:{ gc -> 0x0098, IOException -> 0x009c }
        r5 = r5 | 2;
        r8.m = r5;	 Catch:{ gc -> 0x0098, IOException -> 0x009c }
        r5 = r9.s();	 Catch:{ gc -> 0x0098, IOException -> 0x009c }
        r8.k = r5;	 Catch:{ gc -> 0x0098, IOException -> 0x009c }
        if (r3 == 0) goto L_0x005b;
    L_0x0043:
        r5 = r1 & 4;
        if (r5 == r7) goto L_0x0050;
    L_0x0047:
        r5 = new java.util.ArrayList;	 Catch:{ gc -> 0x0079, IOException -> 0x009c }
        r5.<init>();	 Catch:{ gc -> 0x0079, IOException -> 0x009c }
        r8.o = r5;	 Catch:{ gc -> 0x0079, IOException -> 0x009c }
        r1 = r1 | 4;
    L_0x0050:
        r5 = r8.o;	 Catch:{ gc -> 0x0079, IOException -> 0x009c }
        r6 = com.google.eD.e;	 Catch:{ gc -> 0x0079, IOException -> 0x009c }
        r6 = r9.a(r6, r10);	 Catch:{ gc -> 0x0079, IOException -> 0x009c }
        r5.add(r6);	 Catch:{ gc -> 0x0079, IOException -> 0x009c }
    L_0x005b:
        if (r3 == 0) goto L_0x0015;
    L_0x005d:
        r0 = r1 & 4;
        if (r0 != r7) goto L_0x0069;
    L_0x0061:
        r0 = r8.o;	 Catch:{ gc -> 0x00ad }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x00ad }
        r8.o = r0;	 Catch:{ gc -> 0x00ad }
    L_0x0069:
        r0 = r4.c();
        r8.l = r0;
        r8.c();
        return;
    L_0x0073:
        if (r3 == 0) goto L_0x00af;
    L_0x0075:
        r0 = r2;
        goto L_0x001e;
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0079, IOException -> 0x009c }
    L_0x0079:
        r0 = move-exception;
        r0 = r0.a(r8);	 Catch:{ all -> 0x007f }
        throw r0;	 Catch:{ all -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        r1 = r1 & 4;
        if (r1 != r7) goto L_0x008c;
    L_0x0084:
        r1 = r8.o;	 Catch:{ gc -> 0x00ab }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ gc -> 0x00ab }
        r8.o = r1;	 Catch:{ gc -> 0x00ab }
    L_0x008c:
        r1 = r4.c();
        r8.l = r1;
        r8.c();
        throw r0;
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0098, IOException -> 0x009c }
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x009a, IOException -> 0x009c }
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0079, IOException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        r2 = new com.google.gc;	 Catch:{ all -> 0x007f }
        r0 = r0.getMessage();	 Catch:{ all -> 0x007f }
        r2.<init>(r0);	 Catch:{ all -> 0x007f }
        r0 = r2.a(r8);	 Catch:{ all -> 0x007f }
        throw r0;	 Catch:{ all -> 0x007f }
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = move-exception;
        throw r0;
    L_0x00af:
        r0 = r2;
        goto L_0x005b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ek.<init>(com.google.I, com.google.aC):void");
    }

    public static ek b(InputStream inputStream, aC aCVar) {
        return (ek) f.a(inputStream, aCVar);
    }

    public List j() {
        return this.o;
    }

    static List a(ek ekVar) {
        return ekVar.o;
    }

    public static a7 i() {
        return a7.i();
    }

    public a1 c() {
        return e();
    }

    public static ek a(g2 g2Var) {
        return (ek) f.a(g2Var);
    }

    public eR c() {
        return f;
    }

    static int a(ek ekVar, int i) {
        ekVar.m = i;
        return i;
    }

    public final eS b() {
        return this.l;
    }

    public int h() {
        return this.o.size();
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public boolean c() {
        return (this.m & 2) == n;
    }

    ek(I i, aC aCVar, gY gYVar) {
        this(i, aCVar);
    }

    static {
        f = new o();
        j = new ek(true);
        j.d();
    }

    static boolean a(ek ekVar, boolean z) {
        ekVar.k = z;
        return z;
    }

    public static ek a(byte[] bArr, aC aCVar) {
        return (ek) f.a(bArr, aCVar);
    }

    public a7 m() {
        return i();
    }

    private ek(a4 a4Var) {
        super(a4Var);
        this.h = (byte) -1;
        this.i = -1;
        this.l = a4Var.b();
    }

    public List n() {
        return this.o;
    }

    public boolean l() {
        return (this.m & 1) == p;
    }

    public boolean f() {
        return this.q;
    }

    private void d() {
        this.q = false;
        this.k = false;
        this.o = Collections.emptyList();
    }

    public int d() {
        int i = 0;
        boolean z = dy.b;
        int i2 = this.i;
        if (i2 != -1) {
            return i2;
        }
        if ((this.m & 1) == p) {
            i2 = bF.a((int) p, this.q) + 0;
        } else {
            i2 = 0;
        }
        if ((this.m & 2) == n) {
            i2 += bF.a((int) n, this.k);
        }
        int i3 = i2;
        while (i < this.o.size()) {
            i2 = bF.a((int) g, (a1) this.o.get(i)) + i3;
            i++;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        i2 = (i2 + a()) + b().d();
        this.i = i2;
        return i2;
    }

    static boolean b(ek ekVar, boolean z) {
        ekVar.q = z;
        return z;
    }

    public void a(bF bFVar) {
        boolean z = dy.b;
        d();
        ey d = d();
        if ((this.m & 1) == p) {
            bFVar.b((int) p, this.q);
        }
        if ((this.m & 2) == n) {
            bFVar.b((int) n, this.k);
        }
        int i = 0;
        while (i < this.o.size()) {
            bFVar.d((int) g, (a1) this.o.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        d.a(536870912, bFVar);
        b().a(bFVar);
    }

    protected a7 a(b1 b1Var) {
        return new a7(b1Var, null);
    }

    public static ek a(byte[] bArr) {
        return (ek) f.a(bArr);
    }

    public final boolean a() {
        boolean z = dy.b;
        byte b = this.h;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            int i = 0;
            while (i < h()) {
                if (b(i).a()) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                this.h = (byte) 0;
                return false;
            }
            if (b()) {
                this.h = (byte) 1;
                return true;
            }
            this.h = (byte) 0;
            return false;
        }
    }

    public static final M a() {
        return cN.k();
    }

    public ek e() {
        return j;
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public eb c() {
        return e();
    }

    public static ek a(InputStream inputStream, aC aCVar) {
        return (ek) f.b(inputStream, aCVar);
    }

    public static ek b() {
        return j;
    }

    public static ek a(I i) {
        return (ek) f.a(i);
    }

    public static ek a(InputStream inputStream) {
        return (ek) f.b(inputStream);
    }

    public aJ c() {
        return m();
    }

    public static ek a(I i, aC aCVar) {
        return (ek) f.b(i, aCVar);
    }

    public a7 k() {
        return b(this);
    }

    public aJ a() {
        return k();
    }

    public bI a(int i) {
        return (bI) this.o.get(i);
    }

    public cj a() {
        return m();
    }

    public boolean g() {
        return this.k;
    }

    static List a(ek ekVar, List list) {
        ekVar.o = list;
        return list;
    }

    private ek(boolean z) {
        this.h = (byte) -1;
        this.i = -1;
        this.l = eS.e();
    }

    public cj b() {
        return k();
    }

    public eD b(int i) {
        return (eD) this.o.get(i);
    }

    public static ek a(g2 g2Var, aC aCVar) {
        return (ek) f.b(g2Var, aCVar);
    }
}
