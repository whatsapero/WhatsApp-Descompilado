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

public final class a8 extends d0 implements w {
    private static final a8 f;
    public static final int h = 5;
    public static eR j = null;
    public static final int n = 8;
    public static final int q = 2;
    public static final int s = 7;
    private static final long serialVersionUID = 0;
    public static final int u = 3;
    public static final int v = 4;
    public static final int w = 1;
    private g2 e;
    private g2 g;
    private int i;
    private byte k;
    private g2 l;
    private g2 m;
    private g2 o;
    private final eS p;
    private int r;
    private g2 t;
    private int x;

    public eR c() {
        return j;
    }

    static int a(a8 a8Var, int i) {
        a8Var.i = i;
        return i;
    }

    public static T a(a8 a8Var) {
        return u().a(a8Var);
    }

    public static a8 q() {
        return f;
    }

    public a8 e() {
        return f;
    }

    public cj a() {
        return h();
    }

    static g2 d(a8 a8Var, g2 g2Var) {
        a8Var.e = g2Var;
        return g2Var;
    }

    public T t() {
        return a(this);
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public T h() {
        return u();
    }

    public final boolean a() {
        byte b = this.k;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            this.k = (byte) 1;
            return true;
        }
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public boolean d() {
        return (this.i & 2) == q;
    }

    static g2 c(a8 a8Var, g2 g2Var) {
        a8Var.m = g2Var;
        return g2Var;
    }

    static g2 a(a8 a8Var, g2 g2Var) {
        a8Var.t = g2Var;
        return g2Var;
    }

    public a1 c() {
        return e();
    }

    public boolean k() {
        return (this.i & 1) == w;
    }

    public static a8 b(InputStream inputStream) {
        return (a8) j.a(inputStream);
    }

    a8(ax axVar, bb bbVar) {
        this(axVar);
    }

    public static a8 a(g2 g2Var) {
        return (a8) j.a(g2Var);
    }

    private a8(boolean z) {
        this.k = (byte) -1;
        this.r = -1;
        this.p = eS.e();
    }

    public int d() {
        int i = this.r;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.i & 1) == w) {
            i = 0 + bF.a((int) w, this.x);
        }
        if ((this.i & 2) == q) {
            i += bF.b((int) q, this.m);
        }
        if ((this.i & 4) == v) {
            i += bF.b((int) u, this.e);
        }
        if ((this.i & 8) == n) {
            i += bF.b((int) v, this.o);
        }
        if ((this.i & 16) == 16) {
            i += bF.b((int) h, this.g);
        }
        if ((this.i & 32) == 32) {
            i += bF.b((int) s, this.l);
        }
        if ((this.i & 64) == 64) {
            i += bF.b((int) n, this.t);
        }
        i += b().d();
        this.r = i;
        return i;
    }

    public g2 p() {
        return this.m;
    }

    public g2 v() {
        return this.e;
    }

    public static a8 a(g2 g2Var, aC aCVar) {
        return (a8) j.b(g2Var, aCVar);
    }

    protected T a(b1 b1Var) {
        return new T(b1Var, null);
    }

    public static a8 a(byte[] bArr) {
        return (a8) j.a(bArr);
    }

    public g2 l() {
        return this.g;
    }

    static g2 b(a8 a8Var, g2 g2Var) {
        a8Var.o = g2Var;
        return g2Var;
    }

    static boolean c() {
        return d;
    }

    public boolean j() {
        return (this.i & 4) == v;
    }

    public void a(bF bFVar) {
        d();
        if ((this.i & 1) == w) {
            bFVar.i(w, this.x);
        }
        if ((this.i & 2) == q) {
            bFVar.a((int) q, this.m);
        }
        if ((this.i & 4) == v) {
            bFVar.a((int) u, this.e);
        }
        if ((this.i & 8) == n) {
            bFVar.a((int) v, this.o);
        }
        if ((this.i & 16) == 16) {
            bFVar.a((int) h, this.g);
        }
        if ((this.i & 32) == 32) {
            bFVar.a((int) s, this.l);
        }
        if ((this.i & 64) == 64) {
            bFVar.a((int) n, this.t);
        }
        b().a(bFVar);
    }

    public eb c() {
        return e();
    }

    public g2 n() {
        return this.l;
    }

    private void g() {
        this.x = 0;
        this.m = g2.a;
        this.e = g2.a;
        this.o = g2.a;
        this.g = g2.a;
        this.l = g2.a;
        this.t = g2.a;
    }

    public static a8 b(InputStream inputStream, aC aCVar) {
        return (a8) j.b(inputStream, aCVar);
    }

    public static final M s() {
        return bD.x();
    }

    public static a8 a(I i) {
        return (a8) j.a(i);
    }

    public boolean f() {
        return (this.i & 16) == 16;
    }

    public static a8 a(InputStream inputStream, aC aCVar) {
        return (a8) j.a(inputStream, aCVar);
    }

    public cj b() {
        return t();
    }

    public static a8 a(byte[] bArr, aC aCVar) {
        return (a8) j.a(bArr, aCVar);
    }

    static g2 e(a8 a8Var, g2 g2Var) {
        a8Var.l = g2Var;
        return g2Var;
    }

    public boolean r() {
        return (this.i & 32) == 32;
    }

    public g2 o() {
        return this.t;
    }

    public aJ c() {
        return h();
    }

    public g2 w() {
        return this.o;
    }

    protected er b() {
        return bD.E().a(a8.class, T.class);
    }

    private a8(ax axVar) {
        super(axVar);
        this.k = (byte) -1;
        this.r = -1;
        this.p = axVar.b();
    }

    public aJ a() {
        return t();
    }

    public boolean b() {
        return (this.i & 64) == 64;
    }

    public int i() {
        return this.x;
    }

    public static a8 a(I i, aC aCVar) {
        return (a8) j.b(i, aCVar);
    }

    static g2 f(a8 a8Var, g2 g2Var) {
        a8Var.g = g2Var;
        return g2Var;
    }

    public static a8 a(InputStream inputStream) {
        return (a8) j.b(inputStream);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a8(com.google.I r6, com.google.aC r7) {
        /*
        r5_this = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.libaxolotl.a6.B;
        r5.<init>();
        r5.k = r0;
        r5.r = r0;
        r5.g();
        r3 = com.google.eS.b();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x0087;
    L_0x0015:
        r4 = r6.o();	 Catch:{ gc -> 0x0097, IOException -> 0x00b6 }
        switch(r4) {
            case 0: goto L_0x0091;
            case 8: goto L_0x0025;
            case 18: goto L_0x0033;
            case 26: goto L_0x0041;
            case 34: goto L_0x004f;
            case 42: goto L_0x005d;
            case 58: goto L_0x006b;
            case 66: goto L_0x0079;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ gc -> 0x0095, IOException -> 0x00b6 }
        if (r4 != 0) goto L_0x0085;
    L_0x0022:
        if (r2 == 0) goto L_0x00c5;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.i;	 Catch:{ gc -> 0x00a8, IOException -> 0x00b6 }
        r4 = r4 | 1;
        r5.i = r4;	 Catch:{ gc -> 0x00a8, IOException -> 0x00b6 }
        r4 = r6.e();	 Catch:{ gc -> 0x00a8, IOException -> 0x00b6 }
        r5.x = r4;	 Catch:{ gc -> 0x00a8, IOException -> 0x00b6 }
        if (r2 == 0) goto L_0x0085;
    L_0x0033:
        r4 = r5.i;	 Catch:{ gc -> 0x00aa, IOException -> 0x00b6 }
        r4 = r4 | 2;
        r5.i = r4;	 Catch:{ gc -> 0x00aa, IOException -> 0x00b6 }
        r4 = r6.z();	 Catch:{ gc -> 0x00aa, IOException -> 0x00b6 }
        r5.m = r4;	 Catch:{ gc -> 0x00aa, IOException -> 0x00b6 }
        if (r2 == 0) goto L_0x0085;
    L_0x0041:
        r4 = r5.i;	 Catch:{ gc -> 0x00ac, IOException -> 0x00b6 }
        r4 = r4 | 4;
        r5.i = r4;	 Catch:{ gc -> 0x00ac, IOException -> 0x00b6 }
        r4 = r6.z();	 Catch:{ gc -> 0x00ac, IOException -> 0x00b6 }
        r5.e = r4;	 Catch:{ gc -> 0x00ac, IOException -> 0x00b6 }
        if (r2 == 0) goto L_0x0085;
    L_0x004f:
        r4 = r5.i;	 Catch:{ gc -> 0x00ae, IOException -> 0x00b6 }
        r4 = r4 | 8;
        r5.i = r4;	 Catch:{ gc -> 0x00ae, IOException -> 0x00b6 }
        r4 = r6.z();	 Catch:{ gc -> 0x00ae, IOException -> 0x00b6 }
        r5.o = r4;	 Catch:{ gc -> 0x00ae, IOException -> 0x00b6 }
        if (r2 == 0) goto L_0x0085;
    L_0x005d:
        r4 = r5.i;	 Catch:{ gc -> 0x00b0, IOException -> 0x00b6 }
        r4 = r4 | 16;
        r5.i = r4;	 Catch:{ gc -> 0x00b0, IOException -> 0x00b6 }
        r4 = r6.z();	 Catch:{ gc -> 0x00b0, IOException -> 0x00b6 }
        r5.g = r4;	 Catch:{ gc -> 0x00b0, IOException -> 0x00b6 }
        if (r2 == 0) goto L_0x0085;
    L_0x006b:
        r4 = r5.i;	 Catch:{ gc -> 0x00b2, IOException -> 0x00b6 }
        r4 = r4 | 32;
        r5.i = r4;	 Catch:{ gc -> 0x00b2, IOException -> 0x00b6 }
        r4 = r6.z();	 Catch:{ gc -> 0x00b2, IOException -> 0x00b6 }
        r5.l = r4;	 Catch:{ gc -> 0x00b2, IOException -> 0x00b6 }
        if (r2 == 0) goto L_0x0085;
    L_0x0079:
        r4 = r5.i;	 Catch:{ gc -> 0x00b4, IOException -> 0x00b6 }
        r4 = r4 | 64;
        r5.i = r4;	 Catch:{ gc -> 0x00b4, IOException -> 0x00b6 }
        r4 = r6.z();	 Catch:{ gc -> 0x00b4, IOException -> 0x00b6 }
        r5.t = r4;	 Catch:{ gc -> 0x00b4, IOException -> 0x00b6 }
    L_0x0085:
        if (r2 == 0) goto L_0x0013;
    L_0x0087:
        r0 = r3.c();
        r5.p = r0;
        r5.c();
        return;
    L_0x0091:
        if (r2 == 0) goto L_0x00c5;
    L_0x0093:
        r0 = r1;
        goto L_0x001c;
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0097, IOException -> 0x00b6 }
    L_0x0097:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x009d }
        throw r0;	 Catch:{ all -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        r1 = r3.c();
        r5.p = r1;
        r5.c();
        throw r0;
    L_0x00a8:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00aa, IOException -> 0x00b6 }
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00ac, IOException -> 0x00b6 }
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00ae, IOException -> 0x00b6 }
    L_0x00ae:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00b0, IOException -> 0x00b6 }
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00b2, IOException -> 0x00b6 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00b4, IOException -> 0x00b6 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0097, IOException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        r1 = new com.google.gc;	 Catch:{ all -> 0x009d }
        r0 = r0.getMessage();	 Catch:{ all -> 0x009d }
        r1.<init>(r0);	 Catch:{ all -> 0x009d }
        r0 = r1.a(r5);	 Catch:{ all -> 0x009d }
        throw r0;	 Catch:{ all -> 0x009d }
    L_0x00c5:
        r0 = r1;
        goto L_0x0085;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.a8.<init>(com.google.I, com.google.aC):void");
    }

    public final eS b() {
        return this.p;
    }

    a8(I i, aC aCVar, bb bbVar) {
        this(i, aCVar);
    }

    static {
        j = new r();
        f = new a8(true);
        f.g();
    }

    static int b(a8 a8Var, int i) {
        a8Var.x = i;
        return i;
    }

    public boolean m() {
        return (this.i & 8) == n;
    }

    public static T u() {
        return T.c();
    }
}
