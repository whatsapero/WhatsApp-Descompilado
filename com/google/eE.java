package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class ee extends d0 implements bc {
    public static final int e = 2;
    public static final int i = 1;
    public static eR l = null;
    public static final int n = 3;
    public static final int r = 4;
    private static final long serialVersionUID = 0;
    private static final ee t;
    private int f;
    private int g;
    private int h;
    private Object j;
    private int k;
    private List m;
    private Object o;
    private List p;
    private final eS q;
    private byte s;

    public a0 d() {
        return j();
    }

    static Object a(ee eeVar, Object obj) {
        eeVar.j = obj;
        return obj;
    }

    static Object b(ee eeVar) {
        return eeVar.j;
    }

    public int b(int i) {
        return ((Integer) this.m.get(i)).intValue();
    }

    public aJ a() {
        return i();
    }

    protected er b() {
        return cN.l().a(ee.class, a0.class);
    }

    static Object d(ee eeVar) {
        return eeVar.o;
    }

    public void a(bF bFVar) {
        int i = 0;
        boolean z = dy.b;
        d();
        if (k().size() > 0) {
            bFVar.b(10);
            bFVar.b(this.k);
        }
        int i2 = 0;
        while (i2 < this.p.size()) {
            bFVar.j(((Integer) this.p.get(i2)).intValue());
            int i3 = i2 + 1;
            if (z) {
                break;
            }
            i2 = i3;
        }
        if (e().size() > 0) {
            bFVar.b(18);
            bFVar.b(this.h);
        }
        while (i < this.m.size()) {
            bFVar.j(((Integer) this.m.get(i)).intValue());
            i++;
            if (z) {
                break;
            }
        }
        if ((this.f & 1) == i) {
            bFVar.a((int) n, o());
        }
        if ((this.f & 2) == e) {
            bFVar.a((int) r, a());
        }
        b().a(bFVar);
    }

    public g2 o() {
        Object obj = this.j;
        if (!(obj instanceof String)) {
            return (g2) obj;
        }
        g2 a = g2.a((String) obj);
        this.j = a;
        return a;
    }

    public static ee a(InputStream inputStream) {
        return (ee) l.a(inputStream);
    }

    public cj b() {
        return i();
    }

    protected a0 a(b1 b1Var) {
        return new a0(b1Var, null);
    }

    static int a(ee eeVar, int i) {
        eeVar.f = i;
        return i;
    }

    static List e(ee eeVar) {
        return eeVar.p;
    }

    public boolean h() {
        return (this.f & 1) == i;
    }

    public static ee a(g2 g2Var, aC aCVar) {
        return (ee) l.b(g2Var, aCVar);
    }

    public eb c() {
        return c();
    }

    public static ee a(I i, aC aCVar) {
        return (ee) l.b(i, aCVar);
    }

    public a1 c() {
        return c();
    }

    static {
        l = new u();
        t = new ee(true);
        t.g();
    }

    private ee(boolean z) {
        this.k = -1;
        this.h = -1;
        this.s = (byte) -1;
        this.g = -1;
        this.q = eS.e();
    }

    public String m() {
        Object obj = this.j;
        if (obj instanceof String) {
            return (String) obj;
        }
        g2 g2Var = (g2) obj;
        String f = g2Var.f();
        if (g2Var.i()) {
            this.j = f;
        }
        return f;
    }

    public static ee a(I i) {
        return (ee) l.a(i);
    }

    public static ee b(InputStream inputStream) {
        return (ee) l.b(inputStream);
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public a0 i() {
        return c(this);
    }

    ee(ax axVar, gY gYVar) {
        this(axVar);
    }

    ee(I i, aC aCVar, gY gYVar) {
        this(i, aCVar);
    }

    public int d() {
        int i = 0;
        boolean z = dy.b;
        int i2 = this.g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.p.size()) {
            i4 += bF.p(((Integer) this.p.get(i3)).intValue());
            i2 = i3 + 1;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = 0 + i4;
        if (k().isEmpty()) {
            i3 = i2;
        } else {
            i3 = (i2 + 1) + bF.p(i4);
        }
        this.k = i4;
        i4 = 0;
        while (i < this.m.size()) {
            i2 = bF.p(((Integer) this.m.get(i)).intValue()) + i4;
            i++;
            if (z) {
                break;
            }
            i4 = i2;
        }
        i2 = i4;
        i3 += i2;
        if (!e().isEmpty()) {
            i3 = (i3 + 1) + bF.p(i2);
        }
        this.h = i2;
        if ((this.f & 1) == i) {
            i3 += bF.b((int) n, o());
        }
        if ((this.f & 2) == e) {
            i3 += bF.b((int) r, a());
        }
        i2 = b().d() + i3;
        this.g = i2;
        return i2;
    }

    public static final M l() {
        return cN.E();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ee(com.google.I r10, com.google.aC r11) {
        /*
        r9_this = this;
        r0 = 0;
        r8 = 2;
        r1 = -1;
        r2 = 1;
        r3 = com.google.dy.b;
        r9.<init>();
        r9.k = r1;
        r9.h = r1;
        r9.s = r1;
        r9.g = r1;
        r9.g();
        r4 = com.google.eS.b();
        r1 = r0;
    L_0x0019:
        if (r0 != 0) goto L_0x00e9;
    L_0x001b:
        r5 = r10.o();	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        switch(r5) {
            case 0: goto L_0x010b;
            case 8: goto L_0x002b;
            case 10: goto L_0x0047;
            case 16: goto L_0x007c;
            case 18: goto L_0x0098;
            case 26: goto L_0x00cd;
            case 34: goto L_0x00db;
            default: goto L_0x0022;
        };
    L_0x0022:
        r5 = r9.a(r10, r4, r11, r5);	 Catch:{ gc -> 0x0110, IOException -> 0x013d }
        if (r5 != 0) goto L_0x00e7;
    L_0x0028:
        if (r3 == 0) goto L_0x015c;
    L_0x002a:
        r0 = r2;
    L_0x002b:
        r5 = r1 & 1;
        if (r5 == r2) goto L_0x0038;
    L_0x002f:
        r5 = new java.util.ArrayList;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r5.<init>();	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r9.p = r5;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r1 = r1 | 1;
    L_0x0038:
        r5 = r9.p;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r6 = r10.r();	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r5.add(r6);	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        if (r3 == 0) goto L_0x00e7;
    L_0x0047:
        r5 = r10.h();	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r5 = r10.f(r5);	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r6 = r1 & 1;
        if (r6 == r2) goto L_0x0062;
    L_0x0053:
        r6 = r10.i();	 Catch:{ gc -> 0x013b, IOException -> 0x013d }
        if (r6 <= 0) goto L_0x0062;
    L_0x0059:
        r6 = new java.util.ArrayList;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r6.<init>();	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r9.p = r6;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r1 = r1 | 1;
    L_0x0062:
        r6 = r10.i();	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        if (r6 <= 0) goto L_0x0077;
    L_0x0068:
        r6 = r9.p;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r7 = r10.r();	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r6.add(r7);	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        if (r3 == 0) goto L_0x0062;
    L_0x0077:
        r10.c(r5);	 Catch:{ gc -> 0x014c, IOException -> 0x013d }
        if (r3 == 0) goto L_0x00e7;
    L_0x007c:
        r5 = r1 & 2;
        if (r5 == r8) goto L_0x0089;
    L_0x0080:
        r5 = new java.util.ArrayList;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r5.<init>();	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r9.m = r5;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r1 = r1 | 2;
    L_0x0089:
        r5 = r9.m;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r6 = r10.r();	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r5.add(r6);	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        if (r3 == 0) goto L_0x00e7;
    L_0x0098:
        r5 = r10.h();	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r5 = r10.f(r5);	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r6 = r1 & 2;
        if (r6 == r8) goto L_0x00b3;
    L_0x00a4:
        r6 = r10.i();	 Catch:{ gc -> 0x014e, IOException -> 0x013d }
        if (r6 <= 0) goto L_0x00b3;
    L_0x00aa:
        r6 = new java.util.ArrayList;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r6.<init>();	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r9.m = r6;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r1 = r1 | 2;
    L_0x00b3:
        r6 = r10.i();	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        if (r6 <= 0) goto L_0x00c8;
    L_0x00b9:
        r6 = r9.m;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r7 = r10.r();	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        r6.add(r7);	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
        if (r3 == 0) goto L_0x00b3;
    L_0x00c8:
        r10.c(r5);	 Catch:{ gc -> 0x0150, IOException -> 0x013d }
        if (r3 == 0) goto L_0x00e7;
    L_0x00cd:
        r5 = r9.f;	 Catch:{ gc -> 0x0150, IOException -> 0x013d }
        r5 = r5 | 1;
        r9.f = r5;	 Catch:{ gc -> 0x0150, IOException -> 0x013d }
        r5 = r10.z();	 Catch:{ gc -> 0x0150, IOException -> 0x013d }
        r9.j = r5;	 Catch:{ gc -> 0x0150, IOException -> 0x013d }
        if (r3 == 0) goto L_0x00e7;
    L_0x00db:
        r5 = r9.f;	 Catch:{ gc -> 0x0152, IOException -> 0x013d }
        r5 = r5 | 2;
        r9.f = r5;	 Catch:{ gc -> 0x0152, IOException -> 0x013d }
        r5 = r10.z();	 Catch:{ gc -> 0x0152, IOException -> 0x013d }
        r9.o = r5;	 Catch:{ gc -> 0x0152, IOException -> 0x013d }
    L_0x00e7:
        if (r3 == 0) goto L_0x0019;
    L_0x00e9:
        r0 = r1 & 1;
        if (r0 != r2) goto L_0x00f5;
    L_0x00ed:
        r0 = r9.p;	 Catch:{ gc -> 0x0158 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x0158 }
        r9.p = r0;	 Catch:{ gc -> 0x0158 }
    L_0x00f5:
        r0 = r1 & 2;
        if (r0 != r8) goto L_0x0101;
    L_0x00f9:
        r0 = r9.m;	 Catch:{ gc -> 0x015a }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x015a }
        r9.m = r0;	 Catch:{ gc -> 0x015a }
    L_0x0101:
        r0 = r4.c();
        r9.q = r0;
        r9.c();
        return;
    L_0x010b:
        if (r3 == 0) goto L_0x015c;
    L_0x010d:
        r0 = r2;
        goto L_0x0022;
    L_0x0110:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
    L_0x0112:
        r0 = move-exception;
        r0 = r0.a(r9);	 Catch:{ all -> 0x0118 }
        throw r0;	 Catch:{ all -> 0x0118 }
    L_0x0118:
        r0 = move-exception;
        r3 = r1 & 1;
        if (r3 != r2) goto L_0x0125;
    L_0x011d:
        r2 = r9.p;	 Catch:{ gc -> 0x0154 }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ gc -> 0x0154 }
        r9.p = r2;	 Catch:{ gc -> 0x0154 }
    L_0x0125:
        r1 = r1 & 2;
        if (r1 != r8) goto L_0x0131;
    L_0x0129:
        r1 = r9.m;	 Catch:{ gc -> 0x0156 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ gc -> 0x0156 }
        r9.m = r1;	 Catch:{ gc -> 0x0156 }
    L_0x0131:
        r1 = r4.c();
        r9.q = r1;
        r9.c();
        throw r0;
    L_0x013b:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
    L_0x013d:
        r0 = move-exception;
        r3 = new com.google.gc;	 Catch:{ all -> 0x0118 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0118 }
        r3.<init>(r0);	 Catch:{ all -> 0x0118 }
        r0 = r3.a(r9);	 Catch:{ all -> 0x0118 }
        throw r0;	 Catch:{ all -> 0x0118 }
    L_0x014c:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
    L_0x014e:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
    L_0x0150:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0152, IOException -> 0x013d }
    L_0x0152:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0112, IOException -> 0x013d }
    L_0x0154:
        r0 = move-exception;
        throw r0;
    L_0x0156:
        r0 = move-exception;
        throw r0;
    L_0x0158:
        r0 = move-exception;
        throw r0;
    L_0x015a:
        r0 = move-exception;
        throw r0;
    L_0x015c:
        r0 = r2;
        goto L_0x00e7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ee.<init>(com.google.I, com.google.aC):void");
    }

    public List k() {
        return this.p;
    }

    public eR c() {
        return l;
    }

    public int a(int i) {
        return ((Integer) this.p.get(i)).intValue();
    }

    public int p() {
        return this.m.size();
    }

    static List b(ee eeVar, List list) {
        eeVar.p = list;
        return list;
    }

    public static ee a(g2 g2Var) {
        return (ee) l.a(g2Var);
    }

    public static ee a(byte[] bArr, aC aCVar) {
        return (ee) l.a(bArr, aCVar);
    }

    public static a0 j() {
        return a0.k();
    }

    public ee c() {
        return t;
    }

    public List e() {
        return this.m;
    }

    public static ee f() {
        return t;
    }

    public cj a() {
        return d();
    }

    public String q() {
        Object obj = this.o;
        if (obj instanceof String) {
            return (String) obj;
        }
        g2 g2Var = (g2) obj;
        String f = g2Var.f();
        if (g2Var.i()) {
            this.o = f;
        }
        return f;
    }

    public static ee a(byte[] bArr) {
        return (ee) l.a(bArr);
    }

    public aJ c() {
        return d();
    }

    static List a(ee eeVar) {
        return eeVar.m;
    }

    static List a(ee eeVar, List list) {
        eeVar.m = list;
        return list;
    }

    static Object b(ee eeVar, Object obj) {
        eeVar.o = obj;
        return obj;
    }

    public final eS b() {
        return this.q;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    private ee(ax axVar) {
        super(axVar);
        this.k = -1;
        this.h = -1;
        this.s = (byte) -1;
        this.g = -1;
        this.q = axVar.b();
    }

    public static ee b(InputStream inputStream, aC aCVar) {
        return (ee) l.b(inputStream, aCVar);
    }

    public static a0 c(ee eeVar) {
        return j().a(eeVar);
    }

    public boolean b() {
        return (this.f & 2) == e;
    }

    public g2 a() {
        Object obj = this.o;
        if (!(obj instanceof String)) {
            return (g2) obj;
        }
        g2 a = g2.a((String) obj);
        this.o = a;
        return a;
    }

    public final boolean a() {
        byte b = this.s;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            this.s = (byte) 1;
            return true;
        }
    }

    public int n() {
        return this.p.size();
    }

    public static ee a(InputStream inputStream, aC aCVar) {
        return (ee) l.a(inputStream, aCVar);
    }

    private void g() {
        this.p = Collections.emptyList();
        this.m = Collections.emptyList();
        this.j = "";
        this.o = "";
    }
}
