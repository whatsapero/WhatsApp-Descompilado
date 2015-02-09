package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class ed extends eZ implements dY {
    public static final int f = 999;
    public static eR g = null;
    public static final int i = 2;
    private static final ed j;
    private static final long serialVersionUID = 0;
    private final eS h;
    private List k;
    private int l;
    private byte m;
    private boolean n;
    private int o;

    public bI a(int i) {
        return (bI) this.k.get(i);
    }

    public ar g() {
        return e();
    }

    ed(a4 a4Var, gY gYVar) {
        this(a4Var);
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    private ed(a4 a4Var) {
        super(a4Var);
        this.m = (byte) -1;
        this.l = -1;
        this.h = a4Var.b();
    }

    static boolean a(ed edVar, boolean z) {
        edVar.n = z;
        return z;
    }

    public static ed a(g2 g2Var) {
        return (ed) g.a(g2Var);
    }

    public eb c() {
        return f();
    }

    public final boolean a() {
        boolean z = dy.b;
        byte b = this.m;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            int i = 0;
            while (i < m()) {
                if (b(i).a()) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                this.m = (byte) 0;
                return false;
            }
            if (b()) {
                this.m = (byte) 1;
                return true;
            }
            this.m = (byte) 0;
            return false;
        }
    }

    public aJ c() {
        return g();
    }

    public static ed b(InputStream inputStream) {
        return (ed) g.b(inputStream);
    }

    public static ed a(InputStream inputStream) {
        return (ed) g.a(inputStream);
    }

    public a1 c() {
        return f();
    }

    protected er b() {
        return cN.x().a(ed.class, ar.class);
    }

    static {
        g = new g();
        j = new ed(true);
        j.i();
    }

    public List d() {
        return this.k;
    }

    public static ed a(I i, aC aCVar) {
        return (ed) g.b(i, aCVar);
    }

    public cj a() {
        return g();
    }

    public eR c() {
        return g;
    }

    private ed(boolean z) {
        this.m = (byte) -1;
        this.l = -1;
        this.h = eS.e();
    }

    public int m() {
        return this.k.size();
    }

    public int d() {
        int i = 0;
        boolean z = dy.b;
        int i2 = this.l;
        if (i2 != -1) {
            return i2;
        }
        if ((this.o & 1) == 1) {
            i2 = bF.a((int) i, this.n) + 0;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        while (i < this.k.size()) {
            i2 = bF.a((int) f, (a1) this.k.get(i)) + i3;
            i++;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        i2 = (i2 + a()) + b().d();
        this.l = i2;
        return i2;
    }

    public boolean j() {
        return this.n;
    }

    protected ar a(b1 b1Var) {
        return new ar(b1Var, null);
    }

    public static ed b(InputStream inputStream, aC aCVar) {
        return (ed) g.a(inputStream, aCVar);
    }

    public static ed a(InputStream inputStream, aC aCVar) {
        return (ed) g.b(inputStream, aCVar);
    }

    public void a(bF bFVar) {
        boolean z = dy.b;
        d();
        ey d = d();
        if ((this.o & 1) == 1) {
            bFVar.b((int) i, this.n);
        }
        int i = 0;
        while (i < this.k.size()) {
            bFVar.d((int) f, (a1) this.k.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        d.a(536870912, bFVar);
        b().a(bFVar);
    }

    public static ar b(ed edVar) {
        return e().a(edVar);
    }

    public aJ a() {
        return k();
    }

    public final eS b() {
        return this.h;
    }

    public boolean c() {
        return (this.o & 1) == 1;
    }

    public List l() {
        return this.k;
    }

    ed(I i, aC aCVar, gY gYVar) {
        this(i, aCVar);
    }

    static List a(ed edVar, List list) {
        edVar.k = list;
        return list;
    }

    public ed f() {
        return j;
    }

    public static ed a(g2 g2Var, aC aCVar) {
        return (ed) g.b(g2Var, aCVar);
    }

    public cj b() {
        return k();
    }

    public static ed a(byte[] bArr) {
        return (ed) g.a(bArr);
    }

    public ar k() {
        return b(this);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static final M n() {
        return cN.H();
    }

    private void i() {
        this.n = true;
        this.k = Collections.emptyList();
    }

    public static ed h() {
        return j;
    }

    public eD b(int i) {
        return (eD) this.k.get(i);
    }

    public static ed a(I i) {
        return (ed) g.a(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ed(com.google.I r9, com.google.aC r10) {
        /*
        r8_this = this;
        r2 = 1;
        r0 = 0;
        r1 = -1;
        r7 = 2;
        r3 = com.google.dy.b;
        r8.<init>();
        r8.m = r1;
        r8.l = r1;
        r8.i();
        r4 = com.google.eS.b();
        r1 = r0;
    L_0x0015:
        if (r0 != 0) goto L_0x004f;
    L_0x0017:
        r5 = r9.o();	 Catch:{ gc -> 0x006b, IOException -> 0x008c }
        switch(r5) {
            case 0: goto L_0x0065;
            case 16: goto L_0x0027;
            case 7994: goto L_0x0035;
            default: goto L_0x001e;
        };
    L_0x001e:
        r5 = r8.a(r9, r4, r10, r5);	 Catch:{ gc -> 0x0069, IOException -> 0x008c }
        if (r5 != 0) goto L_0x004d;
    L_0x0024:
        if (r3 == 0) goto L_0x009f;
    L_0x0026:
        r0 = r2;
    L_0x0027:
        r5 = r8.o;	 Catch:{ gc -> 0x0088, IOException -> 0x008c }
        r5 = r5 | 1;
        r8.o = r5;	 Catch:{ gc -> 0x0088, IOException -> 0x008c }
        r5 = r9.s();	 Catch:{ gc -> 0x0088, IOException -> 0x008c }
        r8.n = r5;	 Catch:{ gc -> 0x0088, IOException -> 0x008c }
        if (r3 == 0) goto L_0x004d;
    L_0x0035:
        r5 = r1 & 2;
        if (r5 == r7) goto L_0x0042;
    L_0x0039:
        r5 = new java.util.ArrayList;	 Catch:{ gc -> 0x006b, IOException -> 0x008c }
        r5.<init>();	 Catch:{ gc -> 0x006b, IOException -> 0x008c }
        r8.k = r5;	 Catch:{ gc -> 0x006b, IOException -> 0x008c }
        r1 = r1 | 2;
    L_0x0042:
        r5 = r8.k;	 Catch:{ gc -> 0x006b, IOException -> 0x008c }
        r6 = com.google.eD.e;	 Catch:{ gc -> 0x006b, IOException -> 0x008c }
        r6 = r9.a(r6, r10);	 Catch:{ gc -> 0x006b, IOException -> 0x008c }
        r5.add(r6);	 Catch:{ gc -> 0x006b, IOException -> 0x008c }
    L_0x004d:
        if (r3 == 0) goto L_0x0015;
    L_0x004f:
        r0 = r1 & 2;
        if (r0 != r7) goto L_0x005b;
    L_0x0053:
        r0 = r8.k;	 Catch:{ gc -> 0x009d }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x009d }
        r8.k = r0;	 Catch:{ gc -> 0x009d }
    L_0x005b:
        r0 = r4.c();
        r8.h = r0;
        r8.c();
        return;
    L_0x0065:
        if (r3 == 0) goto L_0x009f;
    L_0x0067:
        r0 = r2;
        goto L_0x001e;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x006b, IOException -> 0x008c }
    L_0x006b:
        r0 = move-exception;
        r0 = r0.a(r8);	 Catch:{ all -> 0x0071 }
        throw r0;	 Catch:{ all -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        r1 = r1 & 2;
        if (r1 != r7) goto L_0x007e;
    L_0x0076:
        r1 = r8.k;	 Catch:{ gc -> 0x009b }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ gc -> 0x009b }
        r8.k = r1;	 Catch:{ gc -> 0x009b }
    L_0x007e:
        r1 = r4.c();
        r8.h = r1;
        r8.c();
        throw r0;
    L_0x0088:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x008a, IOException -> 0x008c }
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x006b, IOException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        r2 = new com.google.gc;	 Catch:{ all -> 0x0071 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0071 }
        r2.<init>(r0);	 Catch:{ all -> 0x0071 }
        r0 = r2.a(r8);	 Catch:{ all -> 0x0071 }
        throw r0;	 Catch:{ all -> 0x0071 }
    L_0x009b:
        r0 = move-exception;
        throw r0;
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r0 = r2;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ed.<init>(com.google.I, com.google.aC):void");
    }

    public static ed a(byte[] bArr, aC aCVar) {
        return (ed) g.a(bArr, aCVar);
    }

    public static ar e() {
        return ar.h();
    }

    static int a(ed edVar, int i) {
        edVar.o = i;
        return i;
    }

    static List a(ed edVar) {
        return edVar.k;
    }
}
