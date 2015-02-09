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
import java.util.Collections;
import java.util.List;

public final class a6 extends d0 implements aM {
    public static boolean B = false;
    public static final int D = 9;
    public static final int F = 2;
    public static eR H = null;
    public static final int I = 1;
    public static final int e = 11;
    public static final int g = 5;
    public static final int h = 10;
    public static final int n = 7;
    public static final int p = 8;
    public static final int s = 12;
    private static final long serialVersionUID = 0;
    private static final a6 t;
    public static final int v = 6;
    public static final int w = 4;
    public static final int x = 3;
    public static final int z = 13;
    private g2 A;
    private int C;
    private int E;
    private g2 G;
    private int J;
    private g2 K;
    private aj f;
    private boolean i;
    private at j;
    private g2 k;
    private byte l;
    private int m;
    private final eS o;
    private a8 q;
    private List r;
    private int u;
    private int y;

    public cj b() {
        return w();
    }

    public g2 u() {
        return this.A;
    }

    public int h() {
        return this.m;
    }

    public g2 o() {
        return this.K;
    }

    public int d() {
        int i = 0;
        boolean z = B;
        int i2 = this.J;
        if (i2 != -1) {
            return i2;
        }
        if ((this.u & 1) == I) {
            i2 = bF.a((int) I, this.y) + 0;
        } else {
            i2 = 0;
        }
        if ((this.u & 2) == F) {
            i2 += bF.b((int) F, this.k);
        }
        if ((this.u & 4) == w) {
            i2 += bF.b((int) x, this.G);
        }
        if ((this.u & 8) == p) {
            i2 += bF.b((int) w, this.K);
        }
        if ((this.u & 16) == 16) {
            i2 += bF.a((int) g, this.E);
        }
        if ((this.u & 32) == 32) {
            i2 += bF.a((int) v, this.f);
        }
        int i3 = i2;
        while (i < this.r.size()) {
            i2 = bF.a((int) n, (a1) this.r.get(i)) + i3;
            i++;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        if ((this.u & 64) == 64) {
            i2 += bF.a((int) p, this.q);
        }
        if ((this.u & 128) == 128) {
            i2 += bF.a((int) D, this.j);
        }
        if ((this.u & 256) == 256) {
            i2 += bF.a((int) h, this.m);
        }
        if ((this.u & 512) == 512) {
            i2 += bF.a((int) e, this.C);
        }
        if ((this.u & 1024) == 1024) {
            i2 += bF.a((int) s, this.i);
        }
        if ((this.u & 2048) == 2048) {
            i2 += bF.b((int) z, this.A);
        }
        i2 += b().d();
        this.J = i2;
        return i2;
    }

    public boolean i() {
        return (this.u & 1) == I;
    }

    static boolean a(a6 a6Var, boolean z) {
        a6Var.i = z;
        return z;
    }

    public static final M N() {
        return bD.i();
    }

    a6(I i, aC aCVar, bb bbVar) {
        this(i, aCVar);
    }

    public P L() {
        return k();
    }

    public boolean s() {
        return (this.u & 64) == 64;
    }

    public static a6 a(I i) {
        return (a6) H.a(i);
    }

    public int F() {
        return this.y;
    }

    public aC f() {
        return this.j;
    }

    public static a6 a(byte[] bArr) {
        return (a6) H.a(bArr);
    }

    public static a6 b(InputStream inputStream) {
        return (a6) H.a(inputStream);
    }

    private a6(ax axVar) {
        super(axVar);
        this.l = (byte) -1;
        this.J = -1;
        this.o = axVar.b();
    }

    public boolean b() {
        return this.i;
    }

    public int r() {
        return this.E;
    }

    static a8 a(a6 a6Var, a8 a8Var) {
        a6Var.q = a8Var;
        return a8Var;
    }

    private void q() {
        this.y = 0;
        this.k = g2.a;
        this.G = g2.a;
        this.K = g2.a;
        this.E = 0;
        this.f = aj.c();
        this.r = Collections.emptyList();
        this.q = a8.q();
        this.j = at.m();
        this.m = 0;
        this.C = 0;
        this.i = false;
        this.A = g2.a;
    }

    public g2 J() {
        return this.G;
    }

    public static a6 c() {
        return t;
    }

    public aJ a() {
        return w();
    }

    public boolean l() {
        return (this.u & 16) == 16;
    }

    public boolean d() {
        return (this.u & 2048) == 2048;
    }

    static g2 d(a6 a6Var, g2 g2Var) {
        a6Var.G = g2Var;
        return g2Var;
    }

    public static P b(a6 a6Var) {
        return k().a(a6Var);
    }

    static int b(a6 a6Var, int i) {
        a6Var.u = i;
        return i;
    }

    public static a6 a(I i, aC aCVar) {
        return (a6) H.b(i, aCVar);
    }

    public boolean v() {
        return (this.u & 4) == w;
    }

    public at y() {
        return this.j;
    }

    public static a6 a(g2 g2Var) {
        return (a6) H.a(g2Var);
    }

    public a6 j() {
        return t;
    }

    public static a6 a(InputStream inputStream) {
        return (a6) H.b(inputStream);
    }

    public static a6 b(InputStream inputStream, aC aCVar) {
        return (a6) H.a(inputStream, aCVar);
    }

    static g2 c(a6 a6Var, g2 g2Var) {
        a6Var.K = g2Var;
        return g2Var;
    }

    public a1 c() {
        return j();
    }

    static g2 a(a6 a6Var, g2 g2Var) {
        a6Var.A = g2Var;
        return g2Var;
    }

    public aJ c() {
        return L();
    }

    public w g() {
        return this.q;
    }

    public static a6 a(g2 g2Var, aC aCVar) {
        return (a6) H.b(g2Var, aCVar);
    }

    static List a(a6 a6Var) {
        return a6Var.r;
    }

    public static a6 a(byte[] bArr, aC aCVar) {
        return (a6) H.a(bArr, aCVar);
    }

    public g2 E() {
        return this.k;
    }

    private a6(boolean z) {
        this.l = (byte) -1;
        this.J = -1;
        this.o = eS.e();
    }

    static int e(a6 a6Var, int i) {
        a6Var.m = i;
        return i;
    }

    public List I() {
        return this.r;
    }

    public List A() {
        return this.r;
    }

    protected P a(b1 b1Var) {
        return new P(b1Var, null);
    }

    static int a(a6 a6Var, int i) {
        a6Var.E = i;
        return i;
    }

    public eR c() {
        return H;
    }

    public y b(int i) {
        return (y) this.r.get(i);
    }

    protected er b() {
        return bD.t().a(a6.class, P.class);
    }

    static g2 b(a6 a6Var, g2 g2Var) {
        a6Var.k = g2Var;
        return g2Var;
    }

    public boolean p() {
        return (this.u & 2) == F;
    }

    public eb c() {
        return j();
    }

    static List a(a6 a6Var, List list) {
        a6Var.r = list;
        return list;
    }

    public static P k() {
        return P.c();
    }

    public boolean G() {
        return (this.u & 256) == 256;
    }

    public cj a() {
        return L();
    }

    static at a(a6 a6Var, at atVar) {
        a6Var.j = atVar;
        return atVar;
    }

    public boolean m() {
        return (this.u & 1024) == 1024;
    }

    public int H() {
        return this.C;
    }

    public boolean t() {
        return (this.u & 8) == p;
    }

    public static a6 a(InputStream inputStream, aC aCVar) {
        return (a6) H.b(inputStream, aCVar);
    }

    static aj a(a6 a6Var, aj ajVar) {
        a6Var.f = ajVar;
        return ajVar;
    }

    a6(ax axVar, bb bbVar) {
        this(axVar);
    }

    static {
        H = new n();
        t = new a6(true);
        t.q();
    }

    static int c(a6 a6Var, int i) {
        a6Var.y = i;
        return i;
    }

    static boolean x() {
        return d;
    }

    public y n() {
        return this.f;
    }

    public void a(bF bFVar) {
        boolean z = B;
        d();
        if ((this.u & 1) == I) {
            bFVar.i(I, this.y);
        }
        if ((this.u & 2) == F) {
            bFVar.a((int) F, this.k);
        }
        if ((this.u & 4) == w) {
            bFVar.a((int) x, this.G);
        }
        if ((this.u & 8) == p) {
            bFVar.a((int) w, this.K);
        }
        if ((this.u & 16) == 16) {
            bFVar.i(g, this.E);
        }
        if ((this.u & 32) == 32) {
            bFVar.d((int) v, this.f);
        }
        int i = 0;
        while (i < this.r.size()) {
            bFVar.d((int) n, (a1) this.r.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        if ((this.u & 64) == 64) {
            bFVar.d((int) p, this.q);
        }
        if ((this.u & 128) == 128) {
            bFVar.d((int) D, this.j);
        }
        if ((this.u & 256) == 256) {
            bFVar.i(h, this.m);
        }
        if ((this.u & 512) == 512) {
            bFVar.i(e, this.C);
        }
        if ((this.u & 1024) == 1024) {
            bFVar.b((int) s, this.i);
        }
        if ((this.u & 2048) == 2048) {
            bFVar.a((int) z, this.A);
        }
        b().a(bFVar);
    }

    static boolean B() {
        return d;
    }

    public a8 M() {
        return this.q;
    }

    public boolean z() {
        return (this.u & 512) == 512;
    }

    public P w() {
        return b(this);
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public final eS b() {
        return this.o;
    }

    public int C() {
        return this.r.size();
    }

    public aj a(int i) {
        return (aj) this.r.get(i);
    }

    public final boolean a() {
        byte b = this.l;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            this.l = (byte) 1;
            return true;
        }
    }

    public boolean K() {
        return (this.u & 32) == 32;
    }

    static int d(a6 a6Var, int i) {
        a6Var.C = i;
        return i;
    }

    public aj D() {
        return this.f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a6(com.google.I r10, com.google.aC r11) {
        /*
        r9_this = this;
        r2 = 1;
        r0 = 0;
        r1 = -1;
        r5 = 0;
        r8 = 64;
        r6 = B;
        r9.<init>();
        r9.l = r1;
        r9.J = r1;
        r9.q();
        r7 = com.google.eS.b();
        r1 = r0;
    L_0x0017:
        if (r0 != 0) goto L_0x014d;
    L_0x0019:
        r3 = r10.o();	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        switch(r3) {
            case 0: goto L_0x0163;
            case 8: goto L_0x0029;
            case 18: goto L_0x0037;
            case 26: goto L_0x0045;
            case 34: goto L_0x0053;
            case 40: goto L_0x0061;
            case 50: goto L_0x01c4;
            case 58: goto L_0x009f;
            case 66: goto L_0x00b9;
            case 74: goto L_0x01c1;
            case 80: goto L_0x0115;
            case 88: goto L_0x0123;
            case 96: goto L_0x0131;
            case 106: goto L_0x013f;
            default: goto L_0x0020;
        };
    L_0x0020:
        r3 = r9.a(r10, r7, r11, r3);	 Catch:{ gc -> 0x0168, IOException -> 0x0191 }
        if (r3 != 0) goto L_0x014b;
    L_0x0026:
        if (r6 == 0) goto L_0x01bf;
    L_0x0028:
        r0 = r2;
    L_0x0029:
        r3 = r9.u;	 Catch:{ gc -> 0x0187, IOException -> 0x0191 }
        r3 = r3 | 1;
        r9.u = r3;	 Catch:{ gc -> 0x0187, IOException -> 0x0191 }
        r3 = r10.e();	 Catch:{ gc -> 0x0187, IOException -> 0x0191 }
        r9.y = r3;	 Catch:{ gc -> 0x0187, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x0037:
        r3 = r9.u;	 Catch:{ gc -> 0x0189, IOException -> 0x0191 }
        r3 = r3 | 2;
        r9.u = r3;	 Catch:{ gc -> 0x0189, IOException -> 0x0191 }
        r3 = r10.z();	 Catch:{ gc -> 0x0189, IOException -> 0x0191 }
        r9.k = r3;	 Catch:{ gc -> 0x0189, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x0045:
        r3 = r9.u;	 Catch:{ gc -> 0x018b, IOException -> 0x0191 }
        r3 = r3 | 4;
        r9.u = r3;	 Catch:{ gc -> 0x018b, IOException -> 0x0191 }
        r3 = r10.z();	 Catch:{ gc -> 0x018b, IOException -> 0x0191 }
        r9.G = r3;	 Catch:{ gc -> 0x018b, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x0053:
        r3 = r9.u;	 Catch:{ gc -> 0x018d, IOException -> 0x0191 }
        r3 = r3 | 8;
        r9.u = r3;	 Catch:{ gc -> 0x018d, IOException -> 0x0191 }
        r3 = r10.z();	 Catch:{ gc -> 0x018d, IOException -> 0x0191 }
        r9.K = r3;	 Catch:{ gc -> 0x018d, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x0061:
        r3 = r9.u;	 Catch:{ gc -> 0x018f, IOException -> 0x0191 }
        r3 = r3 | 16;
        r9.u = r3;	 Catch:{ gc -> 0x018f, IOException -> 0x0191 }
        r3 = r10.e();	 Catch:{ gc -> 0x018f, IOException -> 0x0191 }
        r9.E = r3;	 Catch:{ gc -> 0x018f, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x006f:
        r3 = r0;
    L_0x0070:
        r0 = r9.u;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r0 = r0 & 32;
        r4 = 32;
        if (r0 != r4) goto L_0x01bc;
    L_0x0078:
        r0 = r9.f;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r0 = r0.q();	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r4 = r0;
    L_0x007f:
        r0 = org.whispersystems.libaxolotl.aj.o;	 Catch:{ gc -> 0x01a0, IOException -> 0x0191 }
        r0 = r10.a(r0, r11);	 Catch:{ gc -> 0x01a0, IOException -> 0x0191 }
        r0 = (org.whispersystems.libaxolotl.aj) r0;	 Catch:{ gc -> 0x01a0, IOException -> 0x0191 }
        r9.f = r0;	 Catch:{ gc -> 0x01a0, IOException -> 0x0191 }
        if (r4 == 0) goto L_0x0096;
    L_0x008b:
        r0 = r9.f;	 Catch:{ gc -> 0x01a0, IOException -> 0x0191 }
        r4.a(r0);	 Catch:{ gc -> 0x01a0, IOException -> 0x0191 }
        r0 = r4.b();	 Catch:{ gc -> 0x01a0, IOException -> 0x0191 }
        r9.f = r0;	 Catch:{ gc -> 0x01a0, IOException -> 0x0191 }
    L_0x0096:
        r0 = r9.u;	 Catch:{ gc -> 0x01a2, IOException -> 0x0191 }
        r0 = r0 | 32;
        r9.u = r0;	 Catch:{ gc -> 0x01a2, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x01b4;
    L_0x009e:
        r0 = r3;
    L_0x009f:
        r3 = r1 & 64;
        if (r3 == r8) goto L_0x00ac;
    L_0x00a3:
        r3 = new java.util.ArrayList;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r3.<init>();	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r9.r = r3;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r1 = r1 | 64;
    L_0x00ac:
        r3 = r9.r;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r4 = org.whispersystems.libaxolotl.aj.o;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r4 = r10.a(r4, r11);	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r3.add(r4);	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x00b9:
        r3 = r0;
        r0 = r9.u;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r0 = r0 & 64;
        if (r0 != r8) goto L_0x01b9;
    L_0x00c0:
        r0 = r9.q;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r0 = r0.t();	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r4 = r0;
    L_0x00c7:
        r0 = org.whispersystems.libaxolotl.a8.j;	 Catch:{ gc -> 0x01a4, IOException -> 0x0191 }
        r0 = r10.a(r0, r11);	 Catch:{ gc -> 0x01a4, IOException -> 0x0191 }
        r0 = (org.whispersystems.libaxolotl.a8) r0;	 Catch:{ gc -> 0x01a4, IOException -> 0x0191 }
        r9.q = r0;	 Catch:{ gc -> 0x01a4, IOException -> 0x0191 }
        if (r4 == 0) goto L_0x00de;
    L_0x00d3:
        r0 = r9.q;	 Catch:{ gc -> 0x01a4, IOException -> 0x0191 }
        r4.a(r0);	 Catch:{ gc -> 0x01a4, IOException -> 0x0191 }
        r0 = r4.d();	 Catch:{ gc -> 0x01a4, IOException -> 0x0191 }
        r9.q = r0;	 Catch:{ gc -> 0x01a4, IOException -> 0x0191 }
    L_0x00de:
        r0 = r9.u;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r0 = r0 | 64;
        r9.u = r0;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x01b4;
    L_0x00e6:
        r0 = r9.u;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r0 = r0 & 128;
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r0 != r4) goto L_0x01b6;
    L_0x00ee:
        r0 = r9.j;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r0 = r0.g();	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
        r4 = r0;
    L_0x00f5:
        r0 = org.whispersystems.libaxolotl.at.PARSER;	 Catch:{ gc -> 0x01a6, IOException -> 0x0191 }
        r0 = r10.a(r0, r11);	 Catch:{ gc -> 0x01a6, IOException -> 0x0191 }
        r0 = (org.whispersystems.libaxolotl.at) r0;	 Catch:{ gc -> 0x01a6, IOException -> 0x0191 }
        r9.j = r0;	 Catch:{ gc -> 0x01a6, IOException -> 0x0191 }
        if (r4 == 0) goto L_0x010c;
    L_0x0101:
        r0 = r9.j;	 Catch:{ gc -> 0x01a6, IOException -> 0x0191 }
        r4.a(r0);	 Catch:{ gc -> 0x01a6, IOException -> 0x0191 }
        r0 = r4.b();	 Catch:{ gc -> 0x01a6, IOException -> 0x0191 }
        r9.j = r0;	 Catch:{ gc -> 0x01a6, IOException -> 0x0191 }
    L_0x010c:
        r0 = r9.u;	 Catch:{ gc -> 0x01a8, IOException -> 0x0191 }
        r0 = r0 | 128;
        r9.u = r0;	 Catch:{ gc -> 0x01a8, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x01b4;
    L_0x0114:
        r0 = r3;
    L_0x0115:
        r3 = r9.u;	 Catch:{ gc -> 0x01a8, IOException -> 0x0191 }
        r3 = r3 | 256;
        r9.u = r3;	 Catch:{ gc -> 0x01a8, IOException -> 0x0191 }
        r3 = r10.e();	 Catch:{ gc -> 0x01a8, IOException -> 0x0191 }
        r9.m = r3;	 Catch:{ gc -> 0x01a8, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x0123:
        r3 = r9.u;	 Catch:{ gc -> 0x01aa, IOException -> 0x0191 }
        r3 = r3 | 512;
        r9.u = r3;	 Catch:{ gc -> 0x01aa, IOException -> 0x0191 }
        r3 = r10.e();	 Catch:{ gc -> 0x01aa, IOException -> 0x0191 }
        r9.C = r3;	 Catch:{ gc -> 0x01aa, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x0131:
        r3 = r9.u;	 Catch:{ gc -> 0x01ac, IOException -> 0x0191 }
        r3 = r3 | 1024;
        r9.u = r3;	 Catch:{ gc -> 0x01ac, IOException -> 0x0191 }
        r3 = r10.s();	 Catch:{ gc -> 0x01ac, IOException -> 0x0191 }
        r9.i = r3;	 Catch:{ gc -> 0x01ac, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x013f:
        r3 = r9.u;	 Catch:{ gc -> 0x01ae, IOException -> 0x0191 }
        r3 = r3 | 2048;
        r9.u = r3;	 Catch:{ gc -> 0x01ae, IOException -> 0x0191 }
        r3 = r10.z();	 Catch:{ gc -> 0x01ae, IOException -> 0x0191 }
        r9.A = r3;	 Catch:{ gc -> 0x01ae, IOException -> 0x0191 }
    L_0x014b:
        if (r6 == 0) goto L_0x0017;
    L_0x014d:
        r0 = r1 & 64;
        if (r0 != r8) goto L_0x0159;
    L_0x0151:
        r0 = r9.r;	 Catch:{ gc -> 0x01b0 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x01b0 }
        r9.r = r0;	 Catch:{ gc -> 0x01b0 }
    L_0x0159:
        r0 = r7.c();
        r9.o = r0;
        r9.c();
        return;
    L_0x0163:
        if (r6 == 0) goto L_0x01bf;
    L_0x0165:
        r0 = r2;
        goto L_0x0020;
    L_0x0168:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
    L_0x016a:
        r0 = move-exception;
        r0 = r0.a(r9);	 Catch:{ all -> 0x0170 }
        throw r0;	 Catch:{ all -> 0x0170 }
    L_0x0170:
        r0 = move-exception;
        r1 = r1 & 64;
        if (r1 != r8) goto L_0x017d;
    L_0x0175:
        r1 = r9.r;	 Catch:{ gc -> 0x01b2 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ gc -> 0x01b2 }
        r9.r = r1;	 Catch:{ gc -> 0x01b2 }
    L_0x017d:
        r1 = r7.c();
        r9.o = r1;
        r9.c();
        throw r0;
    L_0x0187:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0189, IOException -> 0x0191 }
    L_0x0189:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x018b, IOException -> 0x0191 }
    L_0x018b:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x018d, IOException -> 0x0191 }
    L_0x018d:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x018f, IOException -> 0x0191 }
    L_0x018f:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
    L_0x0191:
        r0 = move-exception;
        r2 = new com.google.gc;	 Catch:{ all -> 0x0170 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0170 }
        r2.<init>(r0);	 Catch:{ all -> 0x0170 }
        r0 = r2.a(r9);	 Catch:{ all -> 0x0170 }
        throw r0;	 Catch:{ all -> 0x0170 }
    L_0x01a0:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
    L_0x01a2:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
    L_0x01a4:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
    L_0x01a6:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
    L_0x01a8:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x01aa, IOException -> 0x0191 }
    L_0x01aa:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x01ac, IOException -> 0x0191 }
    L_0x01ac:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x01ae, IOException -> 0x0191 }
    L_0x01ae:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x016a, IOException -> 0x0191 }
    L_0x01b0:
        r0 = move-exception;
        throw r0;
    L_0x01b2:
        r0 = move-exception;
        throw r0;
    L_0x01b4:
        r0 = r3;
        goto L_0x014b;
    L_0x01b6:
        r4 = r5;
        goto L_0x00f5;
    L_0x01b9:
        r4 = r5;
        goto L_0x00c7;
    L_0x01bc:
        r4 = r5;
        goto L_0x007f;
    L_0x01bf:
        r0 = r2;
        goto L_0x014b;
    L_0x01c1:
        r3 = r0;
        goto L_0x00e6;
    L_0x01c4:
        r3 = r0;
        goto L_0x0070;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.a6.<init>(com.google.I, com.google.aC):void");
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public boolean e() {
        return (this.u & 128) == 128;
    }
}
