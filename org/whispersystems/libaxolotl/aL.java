package org.whispersystems.libaxolotl;

import com.google.I;
import com.google.M;
import com.google.a1;
import com.google.aC;
import com.google.aJ;
import com.google.ax;
import com.google.b1;
import com.google.bF;
import com.google.cj;
import com.google.d0;
import com.google.eR;
import com.google.eS;
import com.google.eb;
import com.google.er;
import com.google.g2;
import java.io.InputStream;

public final class al extends d0 implements bq {
    private static final al g;
    public static final int j = 1;
    public static final int k = 2;
    public static eR m;
    private static final long serialVersionUID = 0;
    private g2 e;
    private int f;
    private byte h;
    private g2 i;
    private final eS l;
    private int n;

    protected er b() {
        return bD.D().a(al.class, H.class);
    }

    public eR c() {
        return m;
    }

    public static al a(InputStream inputStream) {
        return (al) m.b(inputStream);
    }

    public static al a(g2 g2Var, aC aCVar) {
        return (al) m.b(g2Var, aCVar);
    }

    public a1 c() {
        return l();
    }

    public al l() {
        return g;
    }

    public final boolean a() {
        byte b = this.h;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            this.h = (byte) 1;
            return true;
        }
    }

    static g2 b(al alVar, g2 g2Var) {
        alVar.i = g2Var;
        return g2Var;
    }

    public static al a(I i, aC aCVar) {
        return (al) m.b(i, aCVar);
    }

    static int a(al alVar, int i) {
        alVar.n = i;
        return i;
    }

    static boolean e() {
        return d;
    }

    private void k() {
        this.i = g2.a;
        this.e = g2.a;
    }

    public void a(bF bFVar) {
        d();
        if ((this.n & 1) == j) {
            bFVar.a((int) j, this.i);
        }
        if ((this.n & 2) == k) {
            bFVar.a((int) k, this.e);
        }
        b().a(bFVar);
    }

    public static al a(byte[] bArr, aC aCVar) {
        return (al) m.a(bArr, aCVar);
    }

    public static al f() {
        return g;
    }

    static g2 a(al alVar, g2 g2Var) {
        alVar.e = g2Var;
        return g2Var;
    }

    public aJ a() {
        return m();
    }

    private al(ax axVar) {
        super(axVar);
        this.h = (byte) -1;
        this.f = -1;
        this.l = axVar.b();
    }

    al(I i, aC aCVar, bb bbVar) {
        this(i, aCVar);
    }

    public boolean i() {
        return (this.n & 1) == j;
    }

    public final eS b() {
        return this.l;
    }

    static {
        m = new f();
        g = new al(true);
        g.k();
    }

    public H m() {
        return a(this);
    }

    al(ax axVar, bb bbVar) {
        this(axVar);
    }

    public g2 c() {
        return this.i;
    }

    public cj a() {
        return d();
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private al(com.google.I r6, com.google.aC r7) {
        /*
        r5_this = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.libaxolotl.a6.B;
        r5.<init>();
        r5.h = r0;
        r5.f = r0;
        r5.k();
        r3 = com.google.eS.b();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x0041;
    L_0x0015:
        r4 = r6.o();	 Catch:{ gc -> 0x0051, IOException -> 0x0066 }
        switch(r4) {
            case 0: goto L_0x004b;
            case 10: goto L_0x0025;
            case 18: goto L_0x0033;
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
        r4 = r5.n;	 Catch:{ gc -> 0x0062, IOException -> 0x0066 }
        r4 = r4 | 1;
        r5.n = r4;	 Catch:{ gc -> 0x0062, IOException -> 0x0066 }
        r4 = r6.z();	 Catch:{ gc -> 0x0062, IOException -> 0x0066 }
        r5.i = r4;	 Catch:{ gc -> 0x0062, IOException -> 0x0066 }
        if (r2 == 0) goto L_0x003f;
    L_0x0033:
        r4 = r5.n;	 Catch:{ gc -> 0x0064, IOException -> 0x0066 }
        r4 = r4 | 2;
        r5.n = r4;	 Catch:{ gc -> 0x0064, IOException -> 0x0066 }
        r4 = r6.z();	 Catch:{ gc -> 0x0064, IOException -> 0x0066 }
        r5.e = r4;	 Catch:{ gc -> 0x0064, IOException -> 0x0066 }
    L_0x003f:
        if (r2 == 0) goto L_0x0013;
    L_0x0041:
        r0 = r3.c();
        r5.l = r0;
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
        r5.l = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.al.<init>(com.google.I, com.google.aC):void");
    }

    public static al a(byte[] bArr) {
        return (al) m.a(bArr);
    }

    public boolean b() {
        return (this.n & 2) == k;
    }

    public static al a(g2 g2Var) {
        return (al) m.a(g2Var);
    }

    public static al a(InputStream inputStream, aC aCVar) {
        return (al) m.a(inputStream, aCVar);
    }

    public static al b(InputStream inputStream) {
        return (al) m.a(inputStream);
    }

    public static al b(InputStream inputStream, aC aCVar) {
        return (al) m.b(inputStream, aCVar);
    }

    private al(boolean z) {
        this.h = (byte) -1;
        this.f = -1;
        this.l = eS.e();
    }

    public static H g() {
        return H.h();
    }

    public aJ c() {
        return d();
    }

    public static H a(al alVar) {
        return g().a(alVar);
    }

    public eb c() {
        return l();
    }

    protected H a(b1 b1Var) {
        return new H(b1Var, null);
    }

    public static final M h() {
        return bD.f();
    }

    public g2 j() {
        return this.e;
    }

    public H d() {
        return g();
    }

    public int d() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.n & 1) == j) {
            i = 0 + bF.b((int) j, this.i);
        }
        if ((this.n & 2) == k) {
            i += bF.b((int) k, this.e);
        }
        i += b().d();
        this.f = i;
        return i;
    }

    public static al a(I i) {
        return (al) m.a(i);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public cj b() {
        return m();
    }
}
