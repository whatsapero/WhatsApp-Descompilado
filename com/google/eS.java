package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class es extends eZ implements bX {
    public static eR g = null;
    private static final es h;
    public static final int i = 999;
    private static final long serialVersionUID = 0;
    private int f;
    private byte j;
    private final eS k;
    private List l;

    public aJ a() {
        return d();
    }

    public a6 g() {
        return h();
    }

    static {
        g = new i();
        h = new es(true);
        h.e();
    }

    public eb c() {
        return b();
    }

    public final eS b() {
        return this.k;
    }

    public eD b(int i) {
        return (eD) this.l.get(i);
    }

    es(I i, aC aCVar, gY gYVar) {
        this(i, aCVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private es(com.google.I r8, com.google.aC r9) {
        /*
        r7_this = this;
        r0 = 0;
        r1 = -1;
        r2 = 1;
        r3 = com.google.dy.b;
        r7.<init>();
        r7.j = r1;
        r7.f = r1;
        r7.e();
        r4 = com.google.eS.b();
        r1 = r0;
    L_0x0014:
        if (r0 != 0) goto L_0x0040;
    L_0x0016:
        r5 = r8.o();	 Catch:{ gc -> 0x005c, IOException -> 0x0079 }
        switch(r5) {
            case 0: goto L_0x0056;
            case 7994: goto L_0x0026;
            default: goto L_0x001d;
        };
    L_0x001d:
        r5 = r7.a(r8, r4, r9, r5);	 Catch:{ gc -> 0x005a, IOException -> 0x0079 }
        if (r5 != 0) goto L_0x003e;
    L_0x0023:
        if (r3 == 0) goto L_0x008c;
    L_0x0025:
        r0 = r2;
    L_0x0026:
        r5 = r1 & 1;
        if (r5 == r2) goto L_0x0033;
    L_0x002a:
        r5 = new java.util.ArrayList;	 Catch:{ gc -> 0x005c, IOException -> 0x0079 }
        r5.<init>();	 Catch:{ gc -> 0x005c, IOException -> 0x0079 }
        r7.l = r5;	 Catch:{ gc -> 0x005c, IOException -> 0x0079 }
        r1 = r1 | 1;
    L_0x0033:
        r5 = r7.l;	 Catch:{ gc -> 0x005c, IOException -> 0x0079 }
        r6 = com.google.eD.e;	 Catch:{ gc -> 0x005c, IOException -> 0x0079 }
        r6 = r8.a(r6, r9);	 Catch:{ gc -> 0x005c, IOException -> 0x0079 }
        r5.add(r6);	 Catch:{ gc -> 0x005c, IOException -> 0x0079 }
    L_0x003e:
        if (r3 == 0) goto L_0x0014;
    L_0x0040:
        r0 = r1 & 1;
        if (r0 != r2) goto L_0x004c;
    L_0x0044:
        r0 = r7.l;	 Catch:{ gc -> 0x008a }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x008a }
        r7.l = r0;	 Catch:{ gc -> 0x008a }
    L_0x004c:
        r0 = r4.c();
        r7.k = r0;
        r7.c();
        return;
    L_0x0056:
        if (r3 == 0) goto L_0x008c;
    L_0x0058:
        r0 = r2;
        goto L_0x001d;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x005c, IOException -> 0x0079 }
    L_0x005c:
        r0 = move-exception;
        r0 = r0.a(r7);	 Catch:{ all -> 0x0062 }
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        r1 = r1 & 1;
        if (r1 != r2) goto L_0x006f;
    L_0x0067:
        r1 = r7.l;	 Catch:{ gc -> 0x0088 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ gc -> 0x0088 }
        r7.l = r1;	 Catch:{ gc -> 0x0088 }
    L_0x006f:
        r1 = r4.c();
        r7.k = r1;
        r7.c();
        throw r0;
    L_0x0079:
        r0 = move-exception;
        r3 = new com.google.gc;	 Catch:{ all -> 0x0062 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0062 }
        r3.<init>(r0);	 Catch:{ all -> 0x0062 }
        r0 = r3.a(r7);	 Catch:{ all -> 0x0062 }
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = r2;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.es.<init>(com.google.I, com.google.aC):void");
    }

    public static es a(InputStream inputStream) {
        return (es) g.a(inputStream);
    }

    public int i() {
        return this.l.size();
    }

    protected er b() {
        return cN.j().a(es.class, a6.class);
    }

    public static es a(I i, aC aCVar) {
        return (es) g.b(i, aCVar);
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public static es a(I i) {
        return (es) g.a(i);
    }

    public static es a(g2 g2Var) {
        return (es) g.a(g2Var);
    }

    private void e() {
        this.l = Collections.emptyList();
    }

    protected a6 a(b1 b1Var) {
        return new a6(b1Var, null);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public final boolean a() {
        boolean z = dy.b;
        byte b = this.j;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            int i = 0;
            while (i < i()) {
                if (b(i).a()) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                this.j = (byte) 0;
                return false;
            }
            if (b()) {
                this.j = (byte) 1;
                return true;
            }
            this.j = (byte) 0;
            return false;
        }
    }

    public static es a(byte[] bArr) {
        return (es) g.a(bArr);
    }

    public bI a(int i) {
        return (bI) this.l.get(i);
    }

    public static a6 h() {
        return a6.d();
    }

    public static es a(byte[] bArr, aC aCVar) {
        return (es) g.a(bArr, aCVar);
    }

    public int d() {
        boolean z = dy.b;
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i < this.l.size()) {
            i3 += bF.a((int) i, (a1) this.l.get(i));
            i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        i2 = (a() + i3) + b().d();
        this.f = i2;
        return i2;
    }

    public static es b(InputStream inputStream) {
        return (es) g.b(inputStream);
    }

    public cj a() {
        return g();
    }

    public static es c() {
        return h;
    }

    public static final M j() {
        return cN.K();
    }

    public static es a(InputStream inputStream, aC aCVar) {
        return (es) g.a(inputStream, aCVar);
    }

    public eR c() {
        return g;
    }

    public aJ c() {
        return g();
    }

    public a1 c() {
        return b();
    }

    public static es b(InputStream inputStream, aC aCVar) {
        return (es) g.b(inputStream, aCVar);
    }

    public List a() {
        return this.l;
    }

    public cj b() {
        return d();
    }

    static List b(es esVar) {
        return esVar.l;
    }

    public List f() {
        return this.l;
    }

    static List a(es esVar, List list) {
        esVar.l = list;
        return list;
    }

    public es b() {
        return h;
    }

    es(a4 a4Var, gY gYVar) {
        this(a4Var);
    }

    private es(a4 a4Var) {
        super(a4Var);
        this.j = (byte) -1;
        this.f = -1;
        this.k = a4Var.b();
    }

    public void a(bF bFVar) {
        boolean z = dy.b;
        d();
        ey d = d();
        int i = 0;
        while (i < this.l.size()) {
            bFVar.d((int) i, (a1) this.l.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        d.a(536870912, bFVar);
        b().a(bFVar);
    }

    public static es a(g2 g2Var, aC aCVar) {
        return (es) g.b(g2Var, aCVar);
    }

    public static a6 a(es esVar) {
        return h().a(esVar);
    }

    private es(boolean z) {
        this.j = (byte) -1;
        this.f = -1;
        this.k = eS.e();
    }

    public a6 d() {
        return a(this);
    }
}
