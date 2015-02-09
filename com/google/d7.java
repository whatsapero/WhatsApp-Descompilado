package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class d7 extends d0 implements bi {
    private static final d7 e;
    public static final int j = 1;
    public static final int l = 3;
    public static final int o = 2;
    public static eR p;
    private static final long serialVersionUID = 0;
    private Object f;
    private int g;
    private e3 h;
    private List i;
    private int k;
    private byte m;
    private final eS n;

    static Object a(d7 d7Var) {
        return d7Var.f;
    }

    public final boolean a() {
        boolean z = dy.b;
        byte b = this.m;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            int i = 0;
            while (i < b()) {
                if (b(i).a()) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                this.m = (byte) 0;
                return false;
            }
            if (!f() || j().a()) {
                this.m = (byte) 1;
                return true;
            }
            this.m = (byte) 0;
            return false;
        }
    }

    public aJ c() {
        return e();
    }

    public int b() {
        return this.i.size();
    }

    public String l() {
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

    public eb c() {
        return o();
    }

    public cj b() {
        return m();
    }

    public static d7 b(InputStream inputStream, aC aCVar) {
        return (d7) p.b(inputStream, aCVar);
    }

    public static d7 n() {
        return e;
    }

    private d7(boolean z) {
        this.m = (byte) -1;
        this.k = -1;
        this.n = eS.e();
    }

    public List k() {
        return this.i;
    }

    static List c(d7 d7Var) {
        return d7Var.i;
    }

    public aJ a() {
        return m();
    }

    public a1 c() {
        return o();
    }

    public ez a(int i) {
        return (ez) this.i.get(i);
    }

    public static d7 a(byte[] bArr) {
        return (d7) p.a(bArr);
    }

    public final eS b() {
        return this.n;
    }

    d7(I i, aC aCVar, gY gYVar) {
        this(i, aCVar);
    }

    public eM q() {
        return this.h;
    }

    public static ay b(d7 d7Var) {
        return p().a(d7Var);
    }

    public static d7 a(g2 g2Var) {
        return (d7) p.a(g2Var);
    }

    static e3 a(d7 d7Var, e3 e3Var) {
        d7Var.h = e3Var;
        return e3Var;
    }

    public void a(bF bFVar) {
        boolean z = dy.b;
        d();
        if ((this.g & 1) == j) {
            bFVar.a((int) j, i());
        }
        int i = 0;
        while (i < this.i.size()) {
            bFVar.d((int) o, (a1) this.i.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        if ((this.g & 2) == o) {
            bFVar.d((int) l, this.h);
        }
        b().a(bFVar);
    }

    public eR c() {
        return p;
    }

    public boolean f() {
        return (this.g & 2) == o;
    }

    public static ay p() {
        return ay.c();
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

    public static final M g() {
        return cN.p();
    }

    protected ay a(b1 b1Var) {
        return new ay(b1Var, null);
    }

    public List a() {
        return this.i;
    }

    private d7(ax axVar) {
        super(axVar);
        this.m = (byte) -1;
        this.k = -1;
        this.n = axVar.b();
    }

    public int d() {
        int i = 0;
        boolean z = dy.b;
        int i2 = this.k;
        if (i2 != -1) {
            return i2;
        }
        if ((this.g & 1) == j) {
            i2 = bF.b((int) j, i()) + 0;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        while (i < this.i.size()) {
            i2 = bF.a((int) o, (a1) this.i.get(i)) + i3;
            i++;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        if ((this.g & 2) == o) {
            i2 += bF.a((int) l, this.h);
        }
        i2 += b().d();
        this.k = i2;
        return i2;
    }

    public static d7 a(byte[] bArr, aC aCVar) {
        return (d7) p.a(bArr, aCVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private d7(com.google.I r9, com.google.aC r10) {
        /*
        r8_this = this;
        r2 = 1;
        r3 = 0;
        r0 = -1;
        r7 = 2;
        r5 = com.google.dy.b;
        r8.<init>();
        r8.m = r0;
        r8.k = r0;
        r8.d();
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
        r3 = r8.g;	 Catch:{ gc -> 0x00b8, IOException -> 0x00bc }
        r3 = r3 | 1;
        r8.g = r3;	 Catch:{ gc -> 0x00b8, IOException -> 0x00bc }
        r3 = r9.z();	 Catch:{ gc -> 0x00b8, IOException -> 0x00bc }
        r8.f = r3;	 Catch:{ gc -> 0x00b8, IOException -> 0x00bc }
        if (r5 == 0) goto L_0x007d;
    L_0x0036:
        r3 = r1 & 2;
        if (r3 == r7) goto L_0x0043;
    L_0x003a:
        r3 = new java.util.ArrayList;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r3.<init>();	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r8.i = r3;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r1 = r1 | 2;
    L_0x0043:
        r3 = r8.i;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r4 = com.google.dG.m;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r4 = r9.a(r4, r10);	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r3.add(r4);	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        if (r5 == 0) goto L_0x007d;
    L_0x0050:
        r3 = r0;
    L_0x0051:
        r0 = 0;
        r4 = r8.g;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r4 = r4 & 2;
        if (r4 != r7) goto L_0x00d4;
    L_0x0058:
        r0 = r8.h;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r0 = r0.g();	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r4 = r0;
    L_0x005f:
        r0 = com.google.e3.k;	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
        r0 = r9.a(r0, r10);	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
        r0 = (com.google.e3) r0;	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
        r8.h = r0;	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
        if (r4 == 0) goto L_0x0076;
    L_0x006b:
        r0 = r8.h;	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
        r4.a(r0);	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
        r0 = r4.j();	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
        r8.h = r0;	 Catch:{ gc -> 0x00cb, IOException -> 0x00bc }
    L_0x0076:
        r0 = r8.g;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r0 = r0 | 2;
        r8.g = r0;	 Catch:{ gc -> 0x009b, IOException -> 0x00bc }
        r0 = r3;
    L_0x007d:
        if (r5 == 0) goto L_0x00d1;
    L_0x007f:
        r0 = r1 & 2;
        if (r0 != r7) goto L_0x008b;
    L_0x0083:
        r0 = r8.i;	 Catch:{ gc -> 0x00cf }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x00cf }
        r8.i = r0;	 Catch:{ gc -> 0x00cf }
    L_0x008b:
        r0 = r6.c();
        r8.n = r0;
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
        r1 = r8.i;	 Catch:{ gc -> 0x00cd }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ gc -> 0x00cd }
        r8.i = r1;	 Catch:{ gc -> 0x00cd }
    L_0x00ae:
        r1 = r6.c();
        r8.n = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.d7.<init>(com.google.I, com.google.aC):void");
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public ay m() {
        return b(this);
    }

    public static d7 a(InputStream inputStream, aC aCVar) {
        return (d7) p.a(inputStream, aCVar);
    }

    public cj a() {
        return e();
    }

    public static d7 a(g2 g2Var, aC aCVar) {
        return (d7) p.b(g2Var, aCVar);
    }

    public static d7 a(InputStream inputStream) {
        return (d7) p.b(inputStream);
    }

    static {
        p = new r();
        e = new d7(true);
        e.d();
    }

    public static d7 b(InputStream inputStream) {
        return (d7) p.a(inputStream);
    }

    static int a(d7 d7Var, int i) {
        d7Var.g = i;
        return i;
    }

    protected er b() {
        return cN.i().a(d7.class, ay.class);
    }

    public static d7 a(I i) {
        return (d7) p.a(i);
    }

    d7(ax axVar, gY gYVar) {
        this(axVar);
    }

    private void d() {
        this.f = "";
        this.i = Collections.emptyList();
        this.h = e3.c();
    }

    public dG b(int i) {
        return (dG) this.i.get(i);
    }

    public e3 j() {
        return this.h;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    static Object a(d7 d7Var, Object obj) {
        d7Var.f = obj;
        return obj;
    }

    public ay e() {
        return p();
    }

    public d7 o() {
        return e;
    }

    static List a(d7 d7Var, List list) {
        d7Var.i = list;
        return list;
    }

    public boolean h() {
        return (this.g & 1) == j;
    }

    public static d7 a(I i, aC aCVar) {
        return (d7) p.b(i, aCVar);
    }
}
