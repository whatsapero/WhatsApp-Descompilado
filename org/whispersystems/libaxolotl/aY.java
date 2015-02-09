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

public final class ay extends d0 implements bp {
    public static eR e = null;
    public static final int f = 1;
    private static final ay g;
    public static final int n = 2;
    public static final int p = 3;
    private static final long serialVersionUID = 0;
    private g2 h;
    private int i;
    private g2 j;
    private byte k;
    private int l;
    private int m;
    private final eS o;

    public cj a() {
        return c();
    }

    public g2 m() {
        return this.j;
    }

    static int b(ay ayVar, int i) {
        ayVar.i = i;
        return i;
    }

    public static ay f() {
        return g;
    }

    public static ay a(g2 g2Var) {
        return (ay) e.a(g2Var);
    }

    public int d() {
        int i = this.l;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.i & 1) == f) {
            i = 0 + bF.a((int) f, this.m);
        }
        if ((this.i & 2) == n) {
            i += bF.b((int) n, this.j);
        }
        if ((this.i & 4) == 4) {
            i += bF.b((int) p, this.h);
        }
        i += b().d();
        this.l = i;
        return i;
    }

    public static ay a(byte[] bArr, aC aCVar) {
        return (ay) e.a(bArr, aCVar);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public aJ c() {
        return c();
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public static ay a(InputStream inputStream) {
        return (ay) e.b(inputStream);
    }

    public eb c() {
        return d();
    }

    public static ay a(g2 g2Var, aC aCVar) {
        return (ay) e.b(g2Var, aCVar);
    }

    public boolean o() {
        return (this.i & 2) == n;
    }

    private ay(ax axVar) {
        super(axVar);
        this.k = (byte) -1;
        this.l = -1;
        this.o = axVar.b();
    }

    static g2 a(ay ayVar, g2 g2Var) {
        ayVar.j = g2Var;
        return g2Var;
    }

    static boolean k() {
        return d;
    }

    public aJ a() {
        return e();
    }

    public static ay a(I i) {
        return (ay) e.a(i);
    }

    public cj b() {
        return e();
    }

    static {
        e = new g();
        g = new ay(true);
        g.n();
    }

    public static ay a(I i, aC aCVar) {
        return (ay) e.b(i, aCVar);
    }

    public static I j() {
        return I.d();
    }

    public eR c() {
        return e;
    }

    public static ay b(InputStream inputStream, aC aCVar) {
        return (ay) e.a(inputStream, aCVar);
    }

    public final eS b() {
        return this.o;
    }

    public ay d() {
        return g;
    }

    static int a(ay ayVar, int i) {
        ayVar.m = i;
        return i;
    }

    private void n() {
        this.m = 0;
        this.j = g2.a;
        this.h = g2.a;
    }

    public static ay b(InputStream inputStream) {
        return (ay) e.a(inputStream);
    }

    private ay(boolean z) {
        this.k = (byte) -1;
        this.l = -1;
        this.o = eS.e();
    }

    public boolean l() {
        return (this.i & 4) == 4;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ay(com.google.I r6, com.google.aC r7) {
        /*
        r5_this = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.libaxolotl.a6.B;
        r5.<init>();
        r5.k = r0;
        r5.l = r0;
        r5.n();
        r3 = com.google.eS.b();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x004f;
    L_0x0015:
        r4 = r6.o();	 Catch:{ gc -> 0x005f, IOException -> 0x0076 }
        switch(r4) {
            case 0: goto L_0x0059;
            case 8: goto L_0x0025;
            case 18: goto L_0x0033;
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
        r4 = r5.i;	 Catch:{ gc -> 0x0070, IOException -> 0x0076 }
        r4 = r4 | 1;
        r5.i = r4;	 Catch:{ gc -> 0x0070, IOException -> 0x0076 }
        r4 = r6.e();	 Catch:{ gc -> 0x0070, IOException -> 0x0076 }
        r5.m = r4;	 Catch:{ gc -> 0x0070, IOException -> 0x0076 }
        if (r2 == 0) goto L_0x004d;
    L_0x0033:
        r4 = r5.i;	 Catch:{ gc -> 0x0072, IOException -> 0x0076 }
        r4 = r4 | 2;
        r5.i = r4;	 Catch:{ gc -> 0x0072, IOException -> 0x0076 }
        r4 = r6.z();	 Catch:{ gc -> 0x0072, IOException -> 0x0076 }
        r5.j = r4;	 Catch:{ gc -> 0x0072, IOException -> 0x0076 }
        if (r2 == 0) goto L_0x004d;
    L_0x0041:
        r4 = r5.i;	 Catch:{ gc -> 0x0074, IOException -> 0x0076 }
        r4 = r4 | 4;
        r5.i = r4;	 Catch:{ gc -> 0x0074, IOException -> 0x0076 }
        r4 = r6.z();	 Catch:{ gc -> 0x0074, IOException -> 0x0076 }
        r5.h = r4;	 Catch:{ gc -> 0x0074, IOException -> 0x0076 }
    L_0x004d:
        if (r2 == 0) goto L_0x0013;
    L_0x004f:
        r0 = r3.c();
        r5.o = r0;
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
        r5.o = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.ay.<init>(com.google.I, com.google.aC):void");
    }

    public static ay a(InputStream inputStream, aC aCVar) {
        return (ay) e.b(inputStream, aCVar);
    }

    public static final M h() {
        return bD.g();
    }

    public I e() {
        return a(this);
    }

    public static I a(ay ayVar) {
        return j().a(ayVar);
    }

    public void a(bF bFVar) {
        d();
        if ((this.i & 1) == f) {
            bFVar.i(f, this.m);
        }
        if ((this.i & 2) == n) {
            bFVar.a((int) n, this.j);
        }
        if ((this.i & 4) == 4) {
            bFVar.a((int) p, this.h);
        }
        b().a(bFVar);
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

    public g2 g() {
        return this.h;
    }

    static g2 b(ay ayVar, g2 g2Var) {
        ayVar.h = g2Var;
        return g2Var;
    }

    protected I a(b1 b1Var) {
        return new I(b1Var, null);
    }

    public I c() {
        return j();
    }

    protected er b() {
        return bD.y().a(ay.class, I.class);
    }

    public int i() {
        return this.m;
    }

    public boolean b() {
        return (this.i & 1) == f;
    }

    public a1 c() {
        return d();
    }

    public static ay a(byte[] bArr) {
        return (ay) e.a(bArr);
    }

    ay(I i, aC aCVar, bb bbVar) {
        this(i, aCVar);
    }

    ay(ax axVar, bb bbVar) {
        this(axVar);
    }
}
