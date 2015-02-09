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

public final class aP extends d0 implements aG {
    public static final int e = 1;
    private static final aP j;
    public static final int k = 2;
    public static eR o = null;
    public static final int p = 3;
    private static final long serialVersionUID = 0;
    private int f;
    private byte g;
    private g2 h;
    private int i;
    private int l;
    private final eS m;
    private int n;

    public F f() {
        return k();
    }

    public boolean g() {
        return (this.l & 4) == 4;
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    static int a(aP aPVar, int i) {
        aPVar.l = i;
        return i;
    }

    public F j() {
        return a(this);
    }

    public aJ c() {
        return f();
    }

    public g2 l() {
        return this.h;
    }

    static int c(aP aPVar, int i) {
        aPVar.i = i;
        return i;
    }

    public static aP a(I i) {
        return (aP) o.a(i);
    }

    public static aP a(g2 g2Var) {
        return (aP) o.a(g2Var);
    }

    public static final M h() {
        return aI.d();
    }

    public final eS b() {
        return this.m;
    }

    public cj a() {
        return f();
    }

    public int a() {
        return this.i;
    }

    public static aP a(I i, aC aCVar) {
        return (aP) o.b(i, aCVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private aP(com.google.I r6, com.google.aC r7) {
        /*
        r5_this = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.libaxolotl.aI.d;
        r5.<init>();
        r5.g = r0;
        r5.n = r0;
        r5.e();
        r3 = com.google.eS.b();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x004f;
    L_0x0015:
        r4 = r6.o();	 Catch:{ gc -> 0x005f, IOException -> 0x0076 }
        switch(r4) {
            case 0: goto L_0x0059;
            case 8: goto L_0x0025;
            case 16: goto L_0x0033;
            case 26: goto L_0x0041;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ gc -> 0x005d, IOException -> 0x0076 }
        if (r4 != 0) goto L_0x004d;
    L_0x0022:
        if (r2 == 0) goto L_0x0085;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.l;	 Catch:{ gc -> 0x0070, IOException -> 0x0076 }
        r4 = r4 | 1;
        r5.l = r4;	 Catch:{ gc -> 0x0070, IOException -> 0x0076 }
        r4 = r6.e();	 Catch:{ gc -> 0x0070, IOException -> 0x0076 }
        r5.i = r4;	 Catch:{ gc -> 0x0070, IOException -> 0x0076 }
        if (r2 == 0) goto L_0x004d;
    L_0x0033:
        r4 = r5.l;	 Catch:{ gc -> 0x0072, IOException -> 0x0076 }
        r4 = r4 | 2;
        r5.l = r4;	 Catch:{ gc -> 0x0072, IOException -> 0x0076 }
        r4 = r6.e();	 Catch:{ gc -> 0x0072, IOException -> 0x0076 }
        r5.f = r4;	 Catch:{ gc -> 0x0072, IOException -> 0x0076 }
        if (r2 == 0) goto L_0x004d;
    L_0x0041:
        r4 = r5.l;	 Catch:{ gc -> 0x0074, IOException -> 0x0076 }
        r4 = r4 | 4;
        r5.l = r4;	 Catch:{ gc -> 0x0074, IOException -> 0x0076 }
        r4 = r6.z();	 Catch:{ gc -> 0x0074, IOException -> 0x0076 }
        r5.h = r4;	 Catch:{ gc -> 0x0074, IOException -> 0x0076 }
    L_0x004d:
        if (r2 == 0) goto L_0x0013;
    L_0x004f:
        r0 = r3.c();
        r5.m = r0;
        r5.c();
        return;
    L_0x0059:
        if (r2 == 0) goto L_0x0085;
    L_0x005b:
        r0 = r1;
        goto L_0x001c;
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x005f, IOException -> 0x0076 }
    L_0x005f:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x0065 }
        throw r0;	 Catch:{ all -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        r1 = r3.c();
        r5.m = r1;
        r5.c();
        throw r0;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0072, IOException -> 0x0076 }
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0074, IOException -> 0x0076 }
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x005f, IOException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        r1 = new com.google.gc;	 Catch:{ all -> 0x0065 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0065 }
        r1.<init>(r0);	 Catch:{ all -> 0x0065 }
        r0 = r1.a(r5);	 Catch:{ all -> 0x0065 }
        throw r0;	 Catch:{ all -> 0x0065 }
    L_0x0085:
        r0 = r1;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.aP.<init>(com.google.I, com.google.aC):void");
    }

    public static aP c() {
        return j;
    }

    aP(ax axVar, bv bvVar) {
        this(axVar);
    }

    public static aP a(InputStream inputStream, aC aCVar) {
        return (aP) o.b(inputStream, aCVar);
    }

    static {
        o = new d();
        j = new aP(true);
        j.e();
    }

    private aP(boolean z) {
        this.g = (byte) -1;
        this.n = -1;
        this.m = eS.e();
    }

    public static aP a(byte[] bArr, aC aCVar) {
        return (aP) o.a(bArr, aCVar);
    }

    public static aP b(InputStream inputStream, aC aCVar) {
        return (aP) o.a(inputStream, aCVar);
    }

    public eR c() {
        return o;
    }

    static int b(aP aPVar, int i) {
        aPVar.f = i;
        return i;
    }

    public static aP a(InputStream inputStream) {
        return (aP) o.b(inputStream);
    }

    public boolean b() {
        return (this.l & 2) == k;
    }

    aP(I i, aC aCVar, bv bvVar) {
        this(i, aCVar);
    }

    static boolean n() {
        return d;
    }

    private aP(ax axVar) {
        super(axVar);
        this.g = (byte) -1;
        this.n = -1;
        this.m = axVar.b();
    }

    public static aP a(g2 g2Var, aC aCVar) {
        return (aP) o.b(g2Var, aCVar);
    }

    public aP d() {
        return j;
    }

    public static aP b(InputStream inputStream) {
        return (aP) o.a(inputStream);
    }

    public static aP a(byte[] bArr) {
        return (aP) o.a(bArr);
    }

    public static F a(aP aPVar) {
        return k().a(aPVar);
    }

    public int i() {
        return this.f;
    }

    protected er b() {
        return aI.b().a(aP.class, F.class);
    }

    static g2 a(aP aPVar, g2 g2Var) {
        aPVar.h = g2Var;
        return g2Var;
    }

    public boolean m() {
        return (this.l & 1) == e;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public int d() {
        int i = this.n;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.l & 1) == e) {
            i = 0 + bF.a((int) e, this.i);
        }
        if ((this.l & 2) == k) {
            i += bF.a((int) k, this.f);
        }
        if ((this.l & 4) == 4) {
            i += bF.b((int) p, this.h);
        }
        i += b().d();
        this.n = i;
        return i;
    }

    public static F k() {
        return F.a();
    }

    public eb c() {
        return d();
    }

    protected F a(b1 b1Var) {
        return new F(b1Var, null);
    }

    public a1 c() {
        return d();
    }

    public final boolean a() {
        byte b = this.g;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            this.g = (byte) 1;
            return true;
        }
    }

    private void e() {
        this.i = 0;
        this.f = 0;
        this.h = g2.a;
    }

    public void a(bF bFVar) {
        d();
        if ((this.l & 1) == e) {
            bFVar.i(e, this.i);
        }
        if ((this.l & 2) == k) {
            bFVar.i(k, this.f);
        }
        if ((this.l & 4) == 4) {
            bFVar.a((int) p, this.h);
        }
        b().a(bFVar);
    }

    public cj b() {
        return j();
    }

    public aJ a() {
        return j();
    }
}
