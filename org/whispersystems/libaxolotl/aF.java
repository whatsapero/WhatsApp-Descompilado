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

public final class af extends d0 implements aq {
    public static final int f = 3;
    private static final af i;
    public static eR j = null;
    public static final int n = 1;
    public static final int p = 4;
    public static final int r = 2;
    private static final long serialVersionUID = 0;
    private g2 e;
    private int g;
    private int h;
    private int k;
    private final eS l;
    private int m;
    private byte o;
    private g2 q;

    public void a(bF bFVar) {
        d();
        if ((this.g & 1) == n) {
            bFVar.a((int) n, this.q);
        }
        if ((this.g & 2) == r) {
            bFVar.i(r, this.k);
        }
        if ((this.g & 4) == p) {
            bFVar.i(f, this.m);
        }
        if ((this.g & 8) == 8) {
            bFVar.a((int) p, this.e);
        }
        b().a(bFVar);
    }

    af(ax axVar, bv bvVar) {
        this(axVar);
    }

    protected G a(b1 b1Var) {
        return new G(b1Var, null);
    }

    static {
        j = new e();
        i = new af(true);
        i.m();
    }

    public static G a(af afVar) {
        return g().a(afVar);
    }

    private void m() {
        this.q = g2.a;
        this.k = 0;
        this.m = 0;
        this.e = g2.a;
    }

    public static af a(InputStream inputStream) {
        return (af) j.a(inputStream);
    }

    private af(boolean z) {
        this.o = (byte) -1;
        this.h = -1;
        this.l = eS.e();
    }

    public aJ a() {
        return p();
    }

    public int d() {
        int i = this.h;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.g & 1) == n) {
            i = 0 + bF.b((int) n, this.q);
        }
        if ((this.g & 2) == r) {
            i += bF.a((int) r, this.k);
        }
        if ((this.g & 4) == p) {
            i += bF.a((int) f, this.m);
        }
        if ((this.g & 8) == 8) {
            i += bF.b((int) p, this.e);
        }
        i += b().d();
        this.h = i;
        return i;
    }

    public int h() {
        return this.k;
    }

    static int b(af afVar, int i) {
        afVar.m = i;
        return i;
    }

    public static G g() {
        return G.e();
    }

    static int a(af afVar, int i) {
        afVar.g = i;
        return i;
    }

    public af j() {
        return i;
    }

    static g2 a(af afVar, g2 g2Var) {
        afVar.q = g2Var;
        return g2Var;
    }

    public static af o() {
        return i;
    }

    public static final M q() {
        return aI.f();
    }

    public static af a(g2 g2Var, aC aCVar) {
        return (af) j.b(g2Var, aCVar);
    }

    static boolean l() {
        return d;
    }

    public static af b(InputStream inputStream, aC aCVar) {
        return (af) j.a(inputStream, aCVar);
    }

    public g2 c() {
        return this.q;
    }

    public boolean e() {
        return (this.g & 1) == n;
    }

    public boolean n() {
        return (this.g & 2) == r;
    }

    public aJ c() {
        return d();
    }

    public static af a(InputStream inputStream, aC aCVar) {
        return (af) j.b(inputStream, aCVar);
    }

    public a1 c() {
        return j();
    }

    public boolean k() {
        return (this.g & 8) == 8;
    }

    public eb c() {
        return j();
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    private af(ax axVar) {
        super(axVar);
        this.o = (byte) -1;
        this.h = -1;
        this.l = axVar.b();
    }

    public final boolean a() {
        byte b = this.o;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            this.o = (byte) 1;
            return true;
        }
    }

    public boolean b() {
        return (this.g & 4) == p;
    }

    public g2 i() {
        return this.e;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    static int c(af afVar, int i) {
        afVar.k = i;
        return i;
    }

    af(I i, aC aCVar, bv bvVar) {
        this(i, aCVar);
    }

    protected er b() {
        return aI.j().a(af.class, G.class);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private af(com.google.I r6, com.google.aC r7) {
        /*
        r5_this = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.libaxolotl.aI.d;
        r5.<init>();
        r5.o = r0;
        r5.h = r0;
        r5.m();
        r3 = com.google.eS.b();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x005d;
    L_0x0015:
        r4 = r6.o();	 Catch:{ gc -> 0x006d, IOException -> 0x0086 }
        switch(r4) {
            case 0: goto L_0x0067;
            case 10: goto L_0x0025;
            case 16: goto L_0x0033;
            case 24: goto L_0x0041;
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
        r4 = r5.g;	 Catch:{ gc -> 0x007e, IOException -> 0x0086 }
        r4 = r4 | 1;
        r5.g = r4;	 Catch:{ gc -> 0x007e, IOException -> 0x0086 }
        r4 = r6.z();	 Catch:{ gc -> 0x007e, IOException -> 0x0086 }
        r5.q = r4;	 Catch:{ gc -> 0x007e, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x0033:
        r4 = r5.g;	 Catch:{ gc -> 0x0080, IOException -> 0x0086 }
        r4 = r4 | 2;
        r5.g = r4;	 Catch:{ gc -> 0x0080, IOException -> 0x0086 }
        r4 = r6.e();	 Catch:{ gc -> 0x0080, IOException -> 0x0086 }
        r5.k = r4;	 Catch:{ gc -> 0x0080, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x0041:
        r4 = r5.g;	 Catch:{ gc -> 0x0082, IOException -> 0x0086 }
        r4 = r4 | 4;
        r5.g = r4;	 Catch:{ gc -> 0x0082, IOException -> 0x0086 }
        r4 = r6.e();	 Catch:{ gc -> 0x0082, IOException -> 0x0086 }
        r5.m = r4;	 Catch:{ gc -> 0x0082, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x004f:
        r4 = r5.g;	 Catch:{ gc -> 0x0084, IOException -> 0x0086 }
        r4 = r4 | 8;
        r5.g = r4;	 Catch:{ gc -> 0x0084, IOException -> 0x0086 }
        r4 = r6.z();	 Catch:{ gc -> 0x0084, IOException -> 0x0086 }
        r5.e = r4;	 Catch:{ gc -> 0x0084, IOException -> 0x0086 }
    L_0x005b:
        if (r2 == 0) goto L_0x0013;
    L_0x005d:
        r0 = r3.c();
        r5.l = r0;
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
        r5.l = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.af.<init>(com.google.I, com.google.aC):void");
    }

    public cj a() {
        return d();
    }

    public cj b() {
        return p();
    }

    public static af a(g2 g2Var) {
        return (af) j.a(g2Var);
    }

    public int f() {
        return this.m;
    }

    public static af b(InputStream inputStream) {
        return (af) j.b(inputStream);
    }

    public static af a(byte[] bArr) {
        return (af) j.a(bArr);
    }

    public static af a(I i) {
        return (af) j.a(i);
    }

    public G d() {
        return g();
    }

    public G p() {
        return a(this);
    }

    static g2 b(af afVar, g2 g2Var) {
        afVar.e = g2Var;
        return g2Var;
    }

    public final eS b() {
        return this.l;
    }

    public static af a(byte[] bArr, aC aCVar) {
        return (af) j.a(bArr, aCVar);
    }

    public static af a(I i, aC aCVar) {
        return (af) j.b(i, aCVar);
    }

    public eR c() {
        return j;
    }
}
