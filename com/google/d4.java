package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class d4 extends d0 implements B {
    public static eR e = null;
    public static final int h = 1;
    private static final d4 k;
    public static final int m = 2;
    public static final int p = 3;
    private static final long serialVersionUID = 0;
    private int f;
    private ed g;
    private int i;
    private final eS j;
    private List l;
    private byte n;
    private Object o;

    public List q() {
        return this.l;
    }

    public String b() {
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

    static List a(d4 d4Var, List list) {
        d4Var.l = list;
        return list;
    }

    public aJ c() {
        return o();
    }

    public d4 n() {
        return k;
    }

    private d4(ax axVar) {
        super(axVar);
        this.n = (byte) -1;
        this.i = -1;
        this.j = axVar.b();
    }

    public static aR a(d4 d4Var) {
        return g().a(d4Var);
    }

    public a1 c() {
        return n();
    }

    public ed i() {
        return this.g;
    }

    public int d() {
        int i = 0;
        boolean z = dy.b;
        int i2 = this.i;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f & 1) == h) {
            i2 = bF.b((int) h, c()) + 0;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        while (i < this.l.size()) {
            i2 = bF.a((int) m, (a1) this.l.get(i)) + i3;
            i++;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        if ((this.f & 2) == m) {
            i2 += bF.a((int) p, this.g);
        }
        i2 += b().d();
        this.i = i2;
        return i2;
    }

    static Object a(d4 d4Var, Object obj) {
        d4Var.o = obj;
        return obj;
    }

    public static d4 a(g2 g2Var) {
        return (d4) e.a(g2Var);
    }

    public g2 c() {
        Object obj = this.o;
        if (!(obj instanceof String)) {
            return (g2) obj;
        }
        g2 a = g2.a((String) obj);
        this.o = a;
        return a;
    }

    public cj b() {
        return k();
    }

    public static aR g() {
        return aR.a();
    }

    public eR c() {
        return e;
    }

    public dr b(int i) {
        return (dr) this.l.get(i);
    }

    public static d4 j() {
        return k;
    }

    static {
        e = new f();
        k = new d4(true);
        k.f();
    }

    public final boolean a() {
        boolean z = dy.b;
        byte b = this.n;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            int i = 0;
            while (i < e()) {
                if (b(i).a()) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                this.n = (byte) 0;
                return false;
            }
            if (!h() || i().a()) {
                this.n = (byte) 1;
                return true;
            }
            this.n = (byte) 0;
            return false;
        }
    }

    public List m() {
        return this.l;
    }

    public final eS b() {
        return this.j;
    }

    d4(I i, aC aCVar, gY gYVar) {
        this(i, aCVar);
    }

    public static d4 a(I i) {
        return (d4) e.a(i);
    }

    public void a(bF bFVar) {
        boolean z = dy.b;
        d();
        if ((this.f & 1) == h) {
            bFVar.a((int) h, c());
        }
        int i = 0;
        while (i < this.l.size()) {
            bFVar.d((int) m, (a1) this.l.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        if ((this.f & 2) == m) {
            bFVar.d((int) p, this.g);
        }
        b().a(bFVar);
    }

    public boolean h() {
        return (this.f & 2) == m;
    }

    public static d4 b(InputStream inputStream, aC aCVar) {
        return (d4) e.b(inputStream, aCVar);
    }

    static ed a(d4 d4Var, ed edVar) {
        d4Var.g = edVar;
        return edVar;
    }

    public dY a() {
        return this.g;
    }

    public static d4 a(InputStream inputStream, aC aCVar) {
        return (d4) e.a(inputStream, aCVar);
    }

    static List b(d4 d4Var) {
        return d4Var.l;
    }

    public aR k() {
        return a(this);
    }

    private void f() {
        this.o = "";
        this.l = Collections.emptyList();
        this.g = ed.h();
    }

    protected er b() {
        return cN.c().a(d4.class, aR.class);
    }

    public boolean l() {
        return (this.f & 1) == h;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public int e() {
        return this.l.size();
    }

    public static d4 a(InputStream inputStream) {
        return (d4) e.a(inputStream);
    }

    public static d4 a(g2 g2Var, aC aCVar) {
        return (d4) e.b(g2Var, aCVar);
    }

    public aR o() {
        return g();
    }

    public bp a(int i) {
        return (bp) this.l.get(i);
    }

    public static d4 a(byte[] bArr) {
        return (d4) e.a(bArr);
    }

    public static d4 a(I i, aC aCVar) {
        return (d4) e.b(i, aCVar);
    }

    public eb c() {
        return n();
    }

    public static d4 b(InputStream inputStream) {
        return (d4) e.b(inputStream);
    }

    public cj a() {
        return o();
    }

    public static d4 a(byte[] bArr, aC aCVar) {
        return (d4) e.a(bArr, aCVar);
    }

    protected aR a(b1 b1Var) {
        return new aR(b1Var, null);
    }

    static int a(d4 d4Var, int i) {
        d4Var.f = i;
        return i;
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    private d4(boolean z) {
        this.n = (byte) -1;
        this.i = -1;
        this.j = eS.e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private d4(com.google.I r9, com.google.aC r10) {
        /*
        r8_this = this;
        r2 = 1;
        r3 = 0;
        r0 = -1;
        r7 = 2;
        r5 = com.google.dy.b;
        r8.<init>();
        r8.n = r0;
        r8.i = r0;
        r8.f();
        r6 = com.google.eS.b();
        r1 = r3;
    L_0x0015:
        if (r3 != 0) goto L_0x007f;
    L_0x0017:
        r4 = r9.o();	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        switch(r4) {
            case 0: goto L_0x0095;
            case 10: goto L_0x00db;
            case 18: goto L_0x00d8;
            case 26: goto L_0x0051;
            default: goto L_0x001e;
        };
    L_0x001e:
        r0 = r3;
    L_0x001f:
        r3 = r8.a(r9, r6, r10, r4);	 Catch:{ gc -> 0x0099, IOException -> 0x00bc }
        if (r3 != 0) goto L_0x007d;
    L_0x0025:
        if (r5 == 0) goto L_0x00d6;
    L_0x0027:
        r0 = r2;
    L_0x0028:
        r3 = r8.f;	 Catch:{ gc -> 0x00b8, IOException -> 0x00bc }
        r3 = r3 | 1;
        r8.f = r3;	 Catch:{ gc -> 0x00b8, IOException -> 0x00bc }
        r3 = r9.z();	 Catch:{ gc -> 0x00b8, IOException -> 0x00bc }
        r8.o = r3;	 Catch:{ gc -> 0x00b8, IOException -> 0x00bc }
        if (r5 == 0) goto L_0x007d;
    L_0x0036:
        r3 = r1 & 2;
        if (r3 == r7) goto L_0x0043;
    L_0x003a:
        r3 = new java.util.ArrayList;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r3.<init>();	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r8.l = r3;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r1 = r1 | 2;
    L_0x0043:
        r3 = r8.l;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r4 = com.google.dr.p;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r4 = r9.a(r4, r10);	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r3.add(r4);	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        if (r5 == 0) goto L_0x007d;
    L_0x0050:
        r3 = r0;
    L_0x0051:
        r0 = 0;
        r4 = r8.f;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r4 = r4 & 2;
        if (r4 != r7) goto L_0x00d4;
    L_0x0058:
        r0 = r8.g;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r0 = r0.k();	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r4 = r0;
    L_0x005f:
        r0 = com.google.ed.g;	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
        r0 = r9.a(r0, r10);	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
        r0 = (com.google.ed) r0;	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
        r8.g = r0;	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
        if (r4 == 0) goto L_0x0076;
    L_0x006b:
        r0 = r8.g;	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
        r4.a(r0);	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
        r0 = r4.a();	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
        r8.g = r0;	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
    L_0x0076:
        r0 = r8.f;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r0 = r0 | 2;
        r8.f = r0;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r0 = r3;
    L_0x007d:
        if (r5 == 0) goto L_0x00d1;
    L_0x007f:
        r0 = r1 & 2;
        if (r0 != r7) goto L_0x008b;
    L_0x0083:
        r0 = r8.l;	 Catch:{ gc -> 0x00cf }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x00cf }
        r8.l = r0;	 Catch:{ gc -> 0x00cf }
    L_0x008b:
        r0 = r6.c();
        r8.j = r0;
        r8.c();
        return;
    L_0x0095:
        if (r5 == 0) goto L_0x00d6;
    L_0x0097:
        r0 = r2;
        goto L_0x001f;
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
    L_0x009b:
        r0 = move-exception;
        r0 = r0.a(r8);	 Catch:{ all -> 0x00a1 }
        throw r0;	 Catch:{ all -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        r1 = r1 & 2;
        if (r1 != r7) goto L_0x00ae;
    L_0x00a6:
        r1 = r8.l;	 Catch:{ gc -> 0x00cd }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ gc -> 0x00cd }
        r8.l = r1;	 Catch:{ gc -> 0x00cd }
    L_0x00ae:
        r1 = r6.c();
        r8.j = r1;
        r8.c();
        throw r0;
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00ba, IOException -> 0x00bc }
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        r2 = new com.google.gc;	 Catch:{ all -> 0x00a1 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x00a1 }
        r2.<init>(r0);	 Catch:{ all -> 0x00a1 }
        r0 = r2.a(r8);	 Catch:{ all -> 0x00a1 }
        throw r0;	 Catch:{ all -> 0x00a1 }
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
    L_0x00cd:
        r0 = move-exception;
        throw r0;
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r3 = r0;
        goto L_0x0015;
    L_0x00d4:
        r4 = r0;
        goto L_0x005f;
    L_0x00d6:
        r0 = r2;
        goto L_0x007d;
    L_0x00d8:
        r0 = r3;
        goto L_0x0036;
    L_0x00db:
        r0 = r3;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d4.<init>(com.google.I, com.google.aC):void");
    }

    static Object c(d4 d4Var) {
        return d4Var.o;
    }

    d4(ax axVar, gY gYVar) {
        this(axVar);
    }

    public static final M p() {
        return cN.J();
    }

    public aJ a() {
        return k();
    }
}
