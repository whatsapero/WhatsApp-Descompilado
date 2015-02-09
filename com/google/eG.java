package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class eg extends eZ implements ea {
    public static final int A = 18;
    public static final int B = 10;
    private static final eg E;
    public static final int h = 999;
    public static eR l = null;
    public static final int m = 16;
    public static final int n = 1;
    public static final int o = 11;
    public static final int p = 9;
    private static final long serialVersionUID = 0;
    public static final int t = 17;
    public static final int u = 20;
    public static final int w = 8;
    private boolean C;
    private byte D;
    private Object f;
    private boolean g;
    private boolean i;
    private int j;
    private eu k;
    private Object q;
    private Object r;
    private int s;
    private List v;
    private final eS x;
    private boolean y;
    private boolean z;

    static int a(eg egVar, int i) {
        egVar.j = i;
        return i;
    }

    public aJ a() {
        return w();
    }

    public boolean p() {
        return (this.j & 4) == 4;
    }

    public static aG a(eg egVar) {
        return v().a(egVar);
    }

    public boolean t() {
        return this.g;
    }

    static Object b(eg egVar, Object obj) {
        egVar.f = obj;
        return obj;
    }

    public int z() {
        return this.v.size();
    }

    public static eg a(I i) {
        return (eg) l.a(i);
    }

    public final eS b() {
        return this.x;
    }

    private void C() {
        this.q = "";
        this.r = "";
        this.i = false;
        this.C = false;
        this.k = eu.SPEED;
        this.f = "";
        this.z = false;
        this.g = false;
        this.y = false;
        this.v = Collections.emptyList();
    }

    public static aG v() {
        return aG.i();
    }

    public List y() {
        return this.v;
    }

    public static eg n() {
        return E;
    }

    protected aG a(b1 b1Var) {
        return new aG(b1Var, null);
    }

    public eR c() {
        return l;
    }

    public g2 d() {
        Object obj = this.r;
        if (!(obj instanceof String)) {
            return (g2) obj;
        }
        g2 a = g2.a((String) obj);
        this.r = a;
        return a;
    }

    public List s() {
        return this.v;
    }

    public void a(bF bFVar) {
        boolean z = dy.b;
        d();
        ey d = d();
        if ((this.j & 1) == n) {
            bFVar.a((int) n, D());
        }
        if ((this.j & 2) == 2) {
            bFVar.a((int) w, d());
        }
        if ((this.j & 16) == m) {
            bFVar.d((int) p, this.k.getNumber());
        }
        if ((this.j & 4) == 4) {
            bFVar.b((int) B, this.i);
        }
        if ((this.j & 32) == 32) {
            bFVar.a((int) o, i());
        }
        if ((this.j & 64) == 64) {
            bFVar.b((int) m, this.z);
        }
        if ((this.j & 128) == 128) {
            bFVar.b((int) t, this.g);
        }
        if ((this.j & 256) == 256) {
            bFVar.b((int) A, this.y);
        }
        if ((this.j & 8) == w) {
            bFVar.b((int) u, this.C);
        }
        int i = 0;
        while (i < this.v.size()) {
            bFVar.d((int) h, (a1) this.v.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        d.a(536870912, bFVar);
        b().a(bFVar);
    }

    public static eg a(g2 g2Var) {
        return (eg) l.a(g2Var);
    }

    public final boolean a() {
        boolean z = dy.b;
        byte b = this.D;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            int i = 0;
            while (i < z()) {
                if (b(i).a()) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                this.D = (byte) 0;
                return false;
            }
            if (b()) {
                this.D = (byte) 1;
                return true;
            }
            this.D = (byte) 0;
            return false;
        }
    }

    public bI a(int i) {
        return (bI) this.v.get(i);
    }

    static Object e(eg egVar) {
        return egVar.r;
    }

    public static eg a(byte[] bArr) {
        return (eg) l.a(bArr);
    }

    public boolean E() {
        return this.y;
    }

    public cj b() {
        return w();
    }

    public static eg a(InputStream inputStream) {
        return (eg) l.a(inputStream);
    }

    public boolean h() {
        return (this.j & 64) == 64;
    }

    public aG w() {
        return a(this);
    }

    public boolean q() {
        return (this.j & 2) == 2;
    }

    public aJ c() {
        return e();
    }

    private eg(boolean z) {
        this.D = (byte) -1;
        this.s = -1;
        this.x = eS.e();
    }

    static List d(eg egVar) {
        return egVar.v;
    }

    public boolean l() {
        return (this.j & 16) == m;
    }

    static boolean b(eg egVar, boolean z) {
        egVar.g = z;
        return z;
    }

    public String m() {
        Object obj = this.r;
        if (obj instanceof String) {
            return (String) obj;
        }
        g2 g2Var = (g2) obj;
        String f = g2Var.f();
        if (g2Var.i()) {
            this.r = f;
        }
        return f;
    }

    eg(a4 a4Var, gY gYVar) {
        this(a4Var);
    }

    public g2 i() {
        Object obj = this.f;
        if (!(obj instanceof String)) {
            return (g2) obj;
        }
        g2 a = g2.a((String) obj);
        this.f = a;
        return a;
    }

    eg(I i, aC aCVar, gY gYVar) {
        this(i, aCVar);
    }

    static Object a(eg egVar, Object obj) {
        egVar.q = obj;
        return obj;
    }

    public boolean k() {
        return (this.j & 8) == w;
    }

    public boolean o() {
        return this.C;
    }

    static Object c(eg egVar) {
        return egVar.f;
    }

    static boolean c(eg egVar, boolean z) {
        egVar.z = z;
        return z;
    }

    public String j() {
        Object obj = this.f;
        if (obj instanceof String) {
            return (String) obj;
        }
        g2 g2Var = (g2) obj;
        String f = g2Var.f();
        if (g2Var.i()) {
            this.f = f;
        }
        return f;
    }

    public boolean f() {
        return this.z;
    }

    public static eg b(InputStream inputStream) {
        return (eg) l.b(inputStream);
    }

    static boolean e(eg egVar, boolean z) {
        egVar.y = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private eg(com.google.I r10, com.google.aC r11) {
        /*
        r9_this = this;
        r2 = 1;
        r0 = 0;
        r1 = -1;
        r8 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r3 = com.google.dy.b;
        r9.<init>();
        r9.D = r1;
        r9.s = r1;
        r9.C();
        r4 = com.google.eS.b();
        r1 = r0;
    L_0x0016:
        if (r0 != 0) goto L_0x00cd;
    L_0x0018:
        r5 = r10.o();	 Catch:{ gc -> 0x00ea, IOException -> 0x010b }
        switch(r5) {
            case 0: goto L_0x00e3;
            case 10: goto L_0x0028;
            case 66: goto L_0x0036;
            case 72: goto L_0x0044;
            case 80: goto L_0x005f;
            case 90: goto L_0x006d;
            case 128: goto L_0x007b;
            case 136: goto L_0x0089;
            case 144: goto L_0x0097;
            case 160: goto L_0x00a5;
            case 7994: goto L_0x00b3;
            default: goto L_0x001f;
        };
    L_0x001f:
        r5 = r9.a(r10, r4, r11, r5);	 Catch:{ gc -> 0x00e8, IOException -> 0x010b }
        if (r5 != 0) goto L_0x00cb;
    L_0x0025:
        if (r3 == 0) goto L_0x0130;
    L_0x0027:
        r0 = r2;
    L_0x0028:
        r5 = r9.j;	 Catch:{ gc -> 0x0107, IOException -> 0x010b }
        r5 = r5 | 1;
        r9.j = r5;	 Catch:{ gc -> 0x0107, IOException -> 0x010b }
        r5 = r10.z();	 Catch:{ gc -> 0x0107, IOException -> 0x010b }
        r9.q = r5;	 Catch:{ gc -> 0x0107, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x0036:
        r5 = r9.j;	 Catch:{ gc -> 0x0109, IOException -> 0x010b }
        r5 = r5 | 2;
        r9.j = r5;	 Catch:{ gc -> 0x0109, IOException -> 0x010b }
        r5 = r10.z();	 Catch:{ gc -> 0x0109, IOException -> 0x010b }
        r9.r = r5;	 Catch:{ gc -> 0x0109, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x0044:
        r5 = r10.c();	 Catch:{ gc -> 0x00ea, IOException -> 0x010b }
        r6 = com.google.eu.valueOf(r5);	 Catch:{ gc -> 0x00ea, IOException -> 0x010b }
        if (r6 != 0) goto L_0x0055;
    L_0x004e:
        r7 = 9;
        r4.a(r7, r5);	 Catch:{ gc -> 0x011a, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x0055:
        r5 = r9.j;	 Catch:{ gc -> 0x011c, IOException -> 0x010b }
        r5 = r5 | 16;
        r9.j = r5;	 Catch:{ gc -> 0x011c, IOException -> 0x010b }
        r9.k = r6;	 Catch:{ gc -> 0x011c, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x005f:
        r5 = r9.j;	 Catch:{ gc -> 0x011e, IOException -> 0x010b }
        r5 = r5 | 4;
        r9.j = r5;	 Catch:{ gc -> 0x011e, IOException -> 0x010b }
        r5 = r10.s();	 Catch:{ gc -> 0x011e, IOException -> 0x010b }
        r9.i = r5;	 Catch:{ gc -> 0x011e, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x006d:
        r5 = r9.j;	 Catch:{ gc -> 0x0120, IOException -> 0x010b }
        r5 = r5 | 32;
        r9.j = r5;	 Catch:{ gc -> 0x0120, IOException -> 0x010b }
        r5 = r10.z();	 Catch:{ gc -> 0x0120, IOException -> 0x010b }
        r9.f = r5;	 Catch:{ gc -> 0x0120, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x007b:
        r5 = r9.j;	 Catch:{ gc -> 0x0122, IOException -> 0x010b }
        r5 = r5 | 64;
        r9.j = r5;	 Catch:{ gc -> 0x0122, IOException -> 0x010b }
        r5 = r10.s();	 Catch:{ gc -> 0x0122, IOException -> 0x010b }
        r9.z = r5;	 Catch:{ gc -> 0x0122, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x0089:
        r5 = r9.j;	 Catch:{ gc -> 0x0124, IOException -> 0x010b }
        r5 = r5 | 128;
        r9.j = r5;	 Catch:{ gc -> 0x0124, IOException -> 0x010b }
        r5 = r10.s();	 Catch:{ gc -> 0x0124, IOException -> 0x010b }
        r9.g = r5;	 Catch:{ gc -> 0x0124, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x0097:
        r5 = r9.j;	 Catch:{ gc -> 0x0126, IOException -> 0x010b }
        r5 = r5 | 256;
        r9.j = r5;	 Catch:{ gc -> 0x0126, IOException -> 0x010b }
        r5 = r10.s();	 Catch:{ gc -> 0x0126, IOException -> 0x010b }
        r9.y = r5;	 Catch:{ gc -> 0x0126, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x00a5:
        r5 = r9.j;	 Catch:{ gc -> 0x0128, IOException -> 0x010b }
        r5 = r5 | 8;
        r9.j = r5;	 Catch:{ gc -> 0x0128, IOException -> 0x010b }
        r5 = r10.s();	 Catch:{ gc -> 0x0128, IOException -> 0x010b }
        r9.C = r5;	 Catch:{ gc -> 0x0128, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x00b3:
        r5 = r1 & 512;
        if (r5 == r8) goto L_0x00c0;
    L_0x00b7:
        r5 = new java.util.ArrayList;	 Catch:{ gc -> 0x00ea, IOException -> 0x010b }
        r5.<init>();	 Catch:{ gc -> 0x00ea, IOException -> 0x010b }
        r9.v = r5;	 Catch:{ gc -> 0x00ea, IOException -> 0x010b }
        r1 = r1 | 512;
    L_0x00c0:
        r5 = r9.v;	 Catch:{ gc -> 0x00ea, IOException -> 0x010b }
        r6 = com.google.eD.e;	 Catch:{ gc -> 0x00ea, IOException -> 0x010b }
        r6 = r10.a(r6, r11);	 Catch:{ gc -> 0x00ea, IOException -> 0x010b }
        r5.add(r6);	 Catch:{ gc -> 0x00ea, IOException -> 0x010b }
    L_0x00cb:
        if (r3 == 0) goto L_0x0016;
    L_0x00cd:
        r0 = r1 & 512;
        if (r0 != r8) goto L_0x00d9;
    L_0x00d1:
        r0 = r9.v;	 Catch:{ gc -> 0x012e }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x012e }
        r9.v = r0;	 Catch:{ gc -> 0x012e }
    L_0x00d9:
        r0 = r4.c();
        r9.x = r0;
        r9.c();
        return;
    L_0x00e3:
        if (r3 == 0) goto L_0x0130;
    L_0x00e5:
        r0 = r2;
        goto L_0x001f;
    L_0x00e8:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00ea, IOException -> 0x010b }
    L_0x00ea:
        r0 = move-exception;
        r0 = r0.a(r9);	 Catch:{ all -> 0x00f0 }
        throw r0;	 Catch:{ all -> 0x00f0 }
    L_0x00f0:
        r0 = move-exception;
        r1 = r1 & 512;
        if (r1 != r8) goto L_0x00fd;
    L_0x00f5:
        r1 = r9.v;	 Catch:{ gc -> 0x012c }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ gc -> 0x012c }
        r9.v = r1;	 Catch:{ gc -> 0x012c }
    L_0x00fd:
        r1 = r4.c();
        r9.x = r1;
        r9.c();
        throw r0;
    L_0x0107:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0109, IOException -> 0x010b }
    L_0x0109:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00ea, IOException -> 0x010b }
    L_0x010b:
        r0 = move-exception;
        r2 = new com.google.gc;	 Catch:{ all -> 0x00f0 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x00f0 }
        r2.<init>(r0);	 Catch:{ all -> 0x00f0 }
        r0 = r2.a(r9);	 Catch:{ all -> 0x00f0 }
        throw r0;	 Catch:{ all -> 0x00f0 }
    L_0x011a:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x011c, IOException -> 0x010b }
    L_0x011c:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x011e, IOException -> 0x010b }
    L_0x011e:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0120, IOException -> 0x010b }
    L_0x0120:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0122, IOException -> 0x010b }
    L_0x0122:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0124, IOException -> 0x010b }
    L_0x0124:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0126, IOException -> 0x010b }
    L_0x0126:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0128, IOException -> 0x010b }
    L_0x0128:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x012a, IOException -> 0x010b }
    L_0x012a:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00ea, IOException -> 0x010b }
    L_0x012c:
        r0 = move-exception;
        throw r0;
    L_0x012e:
        r0 = move-exception;
        throw r0;
    L_0x0130:
        r0 = r2;
        goto L_0x00cb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eg.<init>(com.google.I, com.google.aC):void");
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public static eg a(byte[] bArr, aC aCVar) {
        return (eg) l.a(bArr, aCVar);
    }

    public eD b(int i) {
        return (eD) this.v.get(i);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    static eu a(eg egVar, eu euVar) {
        egVar.k = euVar;
        return euVar;
    }

    protected er b() {
        return cN.d().a(eg.class, aG.class);
    }

    static boolean d(eg egVar, boolean z) {
        egVar.C = z;
        return z;
    }

    public eg A() {
        return E;
    }

    private eg(a4 a4Var) {
        super(a4Var);
        this.D = (byte) -1;
        this.s = -1;
        this.x = a4Var.b();
    }

    public boolean c() {
        return this.i;
    }

    public boolean r() {
        return (this.j & 1) == n;
    }

    public cj a() {
        return e();
    }

    public String x() {
        Object obj = this.q;
        if (obj instanceof String) {
            return (String) obj;
        }
        g2 g2Var = (g2) obj;
        String f = g2Var.f();
        if (g2Var.i()) {
            this.q = f;
        }
        return f;
    }

    public static eg a(InputStream inputStream, aC aCVar) {
        return (eg) l.a(inputStream, aCVar);
    }

    public boolean G() {
        return (this.j & 128) == 128;
    }

    static Object c(eg egVar, Object obj) {
        egVar.r = obj;
        return obj;
    }

    public eb c() {
        return A();
    }

    static Object b(eg egVar) {
        return egVar.q;
    }

    public static eg a(g2 g2Var, aC aCVar) {
        return (eg) l.b(g2Var, aCVar);
    }

    public int d() {
        int i = 0;
        boolean z = dy.b;
        int i2 = this.s;
        if (i2 != -1) {
            return i2;
        }
        if ((this.j & 1) == n) {
            i2 = bF.b((int) n, D()) + 0;
        } else {
            i2 = 0;
        }
        if ((this.j & 2) == 2) {
            i2 += bF.b((int) w, d());
        }
        if ((this.j & 16) == m) {
            i2 += bF.h(p, this.k.getNumber());
        }
        if ((this.j & 4) == 4) {
            i2 += bF.a((int) B, this.i);
        }
        if ((this.j & 32) == 32) {
            i2 += bF.b((int) o, i());
        }
        if ((this.j & 64) == 64) {
            i2 += bF.a((int) m, this.z);
        }
        if ((this.j & 128) == 128) {
            i2 += bF.a((int) t, this.g);
        }
        if ((this.j & 256) == 256) {
            i2 += bF.a((int) A, this.y);
        }
        if ((this.j & 8) == w) {
            i2 += bF.a((int) u, this.C);
        }
        int i3 = i2;
        while (i < this.v.size()) {
            i2 = bF.a((int) h, (a1) this.v.get(i)) + i3;
            i++;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        i2 = (i2 + a()) + b().d();
        this.s = i2;
        return i2;
    }

    static {
        l = new n();
        E = new eg(true);
        E.C();
    }

    public a1 c() {
        return A();
    }

    static List a(eg egVar, List list) {
        egVar.v = list;
        return list;
    }

    public eu g() {
        return this.k;
    }

    public g2 D() {
        Object obj = this.q;
        if (!(obj instanceof String)) {
            return (g2) obj;
        }
        g2 a = g2.a((String) obj);
        this.q = a;
        return a;
    }

    public static eg b(InputStream inputStream, aC aCVar) {
        return (eg) l.b(inputStream, aCVar);
    }

    public boolean F() {
        return (this.j & 32) == 32;
    }

    public static final M u() {
        return cN.o();
    }

    public static eg a(I i, aC aCVar) {
        return (eg) l.b(i, aCVar);
    }

    public boolean B() {
        return (this.j & 256) == 256;
    }

    static boolean a(eg egVar, boolean z) {
        egVar.i = z;
        return z;
    }

    public aG e() {
        return v();
    }
}
