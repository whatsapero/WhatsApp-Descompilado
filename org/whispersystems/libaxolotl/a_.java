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

public final class a_ extends d0 implements bm {
    public static final int i = 2;
    public static eR j = null;
    private static final a_ l;
    public static final int o = 3;
    public static final int p = 4;
    public static final int q = 1;
    private static final long serialVersionUID = 0;
    private int e;
    private int f;
    private int g;
    private int h;
    private final eS k;
    private byte m;
    private g2 n;
    private g2 r;

    public aJ c() {
        return d();
    }

    public static final M i() {
        return aI.e();
    }

    public g2 f() {
        return this.r;
    }

    public boolean g() {
        return (this.h & 8) == 8;
    }

    public boolean o() {
        return (this.h & 1) == q;
    }

    static boolean m() {
        return d;
    }

    public final eS b() {
        return this.k;
    }

    public int d() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.h & 1) == q) {
            i = 0 + bF.a((int) q, this.e);
        }
        if ((this.h & 2) == i) {
            i += bF.a((int) i, this.g);
        }
        if ((this.h & 4) == p) {
            i += bF.b((int) o, this.n);
        }
        if ((this.h & 8) == 8) {
            i += bF.b((int) p, this.r);
        }
        i += b().d();
        this.f = i;
        return i;
    }

    public static a_ b(InputStream inputStream, aC aCVar) {
        return (a_) j.a(inputStream, aCVar);
    }

    public static a_ a(I i, aC aCVar) {
        return (a_) j.b(i, aCVar);
    }

    public static a_ b(InputStream inputStream) {
        return (a_) j.b(inputStream);
    }

    public int p() {
        return this.e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a_(com.google.I r6, com.google.aC r7) {
        /*
        r5_this = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.libaxolotl.aI.d;
        r5.<init>();
        r5.m = r0;
        r5.f = r0;
        r5.b();
        r3 = com.google.eS.b();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x005d;
    L_0x0015:
        r4 = r6.o();	 Catch:{ gc -> 0x006d, IOException -> 0x0086 }
        switch(r4) {
            case 0: goto L_0x0067;
            case 8: goto L_0x0025;
            case 16: goto L_0x0033;
            case 26: goto L_0x0041;
            case 34: goto L_0x004f;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ gc -> 0x006b, IOException -> 0x0086 }
        if (r4 != 0) goto L_0x005b;
    L_0x0022:
        if (r2 == 0) goto L_0x0095;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.h;	 Catch:{ gc -> 0x007e, IOException -> 0x0086 }
        r4 = r4 | 1;
        r5.h = r4;	 Catch:{ gc -> 0x007e, IOException -> 0x0086 }
        r4 = r6.e();	 Catch:{ gc -> 0x007e, IOException -> 0x0086 }
        r5.e = r4;	 Catch:{ gc -> 0x007e, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x0033:
        r4 = r5.h;	 Catch:{ gc -> 0x0080, IOException -> 0x0086 }
        r4 = r4 | 2;
        r5.h = r4;	 Catch:{ gc -> 0x0080, IOException -> 0x0086 }
        r4 = r6.e();	 Catch:{ gc -> 0x0080, IOException -> 0x0086 }
        r5.g = r4;	 Catch:{ gc -> 0x0080, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x0041:
        r4 = r5.h;	 Catch:{ gc -> 0x0082, IOException -> 0x0086 }
        r4 = r4 | 4;
        r5.h = r4;	 Catch:{ gc -> 0x0082, IOException -> 0x0086 }
        r4 = r6.z();	 Catch:{ gc -> 0x0082, IOException -> 0x0086 }
        r5.n = r4;	 Catch:{ gc -> 0x0082, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x004f:
        r4 = r5.h;	 Catch:{ gc -> 0x0084, IOException -> 0x0086 }
        r4 = r4 | 8;
        r5.h = r4;	 Catch:{ gc -> 0x0084, IOException -> 0x0086 }
        r4 = r6.z();	 Catch:{ gc -> 0x0084, IOException -> 0x0086 }
        r5.r = r4;	 Catch:{ gc -> 0x0084, IOException -> 0x0086 }
    L_0x005b:
        if (r2 == 0) goto L_0x0013;
    L_0x005d:
        r0 = r3.c();
        r5.k = r0;
        r5.c();
        return;
    L_0x0067:
        if (r2 == 0) goto L_0x0095;
    L_0x0069:
        r0 = r1;
        goto L_0x001c;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x006d, IOException -> 0x0086 }
    L_0x006d:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x0073 }
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        r1 = r3.c();
        r5.k = r1;
        r5.c();
        throw r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0080, IOException -> 0x0086 }
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0082, IOException -> 0x0086 }
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0084, IOException -> 0x0086 }
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x006d, IOException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        r1 = new com.google.gc;	 Catch:{ all -> 0x0073 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0073 }
        r1.<init>(r0);	 Catch:{ all -> 0x0073 }
        r0 = r1.a(r5);	 Catch:{ all -> 0x0073 }
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x0095:
        r0 = r1;
        goto L_0x005b;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.a_.<init>(com.google.I, com.google.aC):void");
    }

    public cj a() {
        return d();
    }

    public a1 c() {
        return l();
    }

    public void a(bF bFVar) {
        d();
        if ((this.h & 1) == q) {
            bFVar.i(q, this.e);
        }
        if ((this.h & 2) == i) {
            bFVar.i(i, this.g);
        }
        if ((this.h & 4) == p) {
            bFVar.a((int) o, this.n);
        }
        if ((this.h & 8) == 8) {
            bFVar.a((int) p, this.r);
        }
        b().a(bFVar);
    }

    public a_ l() {
        return l;
    }

    protected E a(b1 b1Var) {
        return new E(b1Var, null);
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    static g2 b(a_ a_Var, g2 g2Var) {
        a_Var.r = g2Var;
        return g2Var;
    }

    public aJ a() {
        return a();
    }

    a_(ax axVar, bv bvVar) {
        this(axVar);
    }

    public static a_ a(InputStream inputStream, aC aCVar) {
        return (a_) j.b(inputStream, aCVar);
    }

    public static a_ a(g2 g2Var, aC aCVar) {
        return (a_) j.b(g2Var, aCVar);
    }

    public static E a(a_ a_Var) {
        return e().a(a_Var);
    }

    static {
        j = new c();
        l = new a_(true);
        l.b();
    }

    static g2 a(a_ a_Var, g2 g2Var) {
        a_Var.n = g2Var;
        return g2Var;
    }

    static int a(a_ a_Var, int i) {
        a_Var.g = i;
        return i;
    }

    static int c(a_ a_Var, int i) {
        a_Var.e = i;
        return i;
    }

    a_(I i, aC aCVar, bv bvVar) {
        this(i, aCVar);
    }

    private a_(ax axVar) {
        super(axVar);
        this.m = (byte) -1;
        this.f = -1;
        this.k = axVar.b();
    }

    private a_(boolean z) {
        this.m = (byte) -1;
        this.f = -1;
        this.k = eS.e();
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

    public eR c() {
        return j;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public E a() {
        return a(this);
    }

    public static a_ a(I i) {
        return (a_) j.a(i);
    }

    public static a_ k() {
        return l;
    }

    public static E e() {
        return E.c();
    }

    public int c() {
        return this.g;
    }

    public g2 j() {
        return this.n;
    }

    public static a_ a(byte[] bArr, aC aCVar) {
        return (a_) j.a(bArr, aCVar);
    }

    protected er b() {
        return aI.c().a(a_.class, E.class);
    }

    static int b(a_ a_Var, int i) {
        a_Var.h = i;
        return i;
    }

    public E d() {
        return e();
    }

    public boolean n() {
        return (this.h & 2) == i;
    }

    public eb c() {
        return l();
    }

    public static a_ a(byte[] bArr) {
        return (a_) j.a(bArr);
    }

    public static a_ a(InputStream inputStream) {
        return (a_) j.a(inputStream);
    }

    public static a_ a(g2 g2Var) {
        return (a_) j.a(g2Var);
    }

    private void b() {
        this.e = 0;
        this.g = 0;
        this.n = g2.a;
        this.r = g2.a;
    }

    public cj b() {
        return a();
    }

    public boolean h() {
        return (this.h & 4) == p;
    }
}
