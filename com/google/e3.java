package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class e3 extends eZ implements eM {
    private static final e3 i;
    public static eR k = null;
    public static final int l = 999;
    private static final long serialVersionUID = 0;
    private final eS f;
    private int g;
    private byte h;
    private List j;

    public static e3 a(I i) {
        return (e3) k.a(i);
    }

    public static e3 c() {
        return i;
    }

    public static e3 a(byte[] bArr) {
        return (e3) k.a(bArr);
    }

    public static e3 b(InputStream inputStream) {
        return (e3) k.b(inputStream);
    }

    public aJ a() {
        return g();
    }

    public List i() {
        return this.j;
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public int k() {
        return this.j.size();
    }

    public eb c() {
        return j();
    }

    public static e3 a(InputStream inputStream, aC aCVar) {
        return (e3) k.b(inputStream, aCVar);
    }

    private e3(boolean z) {
        this.h = (byte) -1;
        this.g = -1;
        this.f = eS.e();
    }

    public static e3 b(InputStream inputStream, aC aCVar) {
        return (e3) k.a(inputStream, aCVar);
    }

    public static e3 a(I i, aC aCVar) {
        return (e3) k.b(i, aCVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e3(com.google.I r8, com.google.aC r9) {
        /*
        r7_this = this;
        r0 = 0;
        r1 = -1;
        r2 = 1;
        r3 = com.google.dy.b;
        r7.<init>();
        r7.h = r1;
        r7.g = r1;
        r7.b();
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
        r7.j = r5;	 Catch:{ gc -> 0x005c, IOException -> 0x0079 }
        r1 = r1 | 1;
    L_0x0033:
        r5 = r7.j;	 Catch:{ gc -> 0x005c, IOException -> 0x0079 }
        r6 = com.google.eD.e;	 Catch:{ gc -> 0x005c, IOException -> 0x0079 }
        r6 = r8.a(r6, r9);	 Catch:{ gc -> 0x005c, IOException -> 0x0079 }
        r5.add(r6);	 Catch:{ gc -> 0x005c, IOException -> 0x0079 }
    L_0x003e:
        if (r3 == 0) goto L_0x0014;
    L_0x0040:
        r0 = r1 & 1;
        if (r0 != r2) goto L_0x004c;
    L_0x0044:
        r0 = r7.j;	 Catch:{ gc -> 0x008a }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x008a }
        r7.j = r0;	 Catch:{ gc -> 0x008a }
    L_0x004c:
        r0 = r4.c();
        r7.f = r0;
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
        r1 = r7.j;	 Catch:{ gc -> 0x0088 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ gc -> 0x0088 }
        r7.j = r1;	 Catch:{ gc -> 0x0088 }
    L_0x006f:
        r1 = r4.c();
        r7.f = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.e3.<init>(com.google.I, com.google.aC):void");
    }

    static List b(e3 e3Var) {
        return e3Var.j;
    }

    public be d() {
        return h();
    }

    public aJ c() {
        return d();
    }

    public e3 j() {
        return i;
    }

    public void a(bF bFVar) {
        boolean z = dy.b;
        d();
        ey d = d();
        int i = 0;
        while (i < this.j.size()) {
            bFVar.d((int) l, (a1) this.j.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        d.a(536870912, bFVar);
        b().a(bFVar);
    }

    public static be h() {
        return be.f();
    }

    public eR c() {
        return k;
    }

    protected er b() {
        return cN.t().a(e3.class, be.class);
    }

    protected be a(b1 b1Var) {
        return new be(b1Var, null);
    }

    public int d() {
        boolean z = dy.b;
        int i = this.g;
        if (i != -1) {
            return i;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i < this.j.size()) {
            i3 += bF.a((int) l, (a1) this.j.get(i));
            i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        i2 = (a() + i3) + b().d();
        this.g = i2;
        return i2;
    }

    private void b() {
        this.j = Collections.emptyList();
    }

    public a1 c() {
        return j();
    }

    public static e3 a(g2 g2Var) {
        return (e3) k.a(g2Var);
    }

    public static e3 a(InputStream inputStream) {
        return (e3) k.a(inputStream);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public List e() {
        return this.j;
    }

    public final eS b() {
        return this.f;
    }

    static List a(e3 e3Var, List list) {
        e3Var.j = list;
        return list;
    }

    public static e3 a(byte[] bArr, aC aCVar) {
        return (e3) k.a(bArr, aCVar);
    }

    public be g() {
        return a(this);
    }

    private e3(a4 a4Var) {
        super(a4Var);
        this.h = (byte) -1;
        this.g = -1;
        this.f = a4Var.b();
    }

    public static e3 a(g2 g2Var, aC aCVar) {
        return (e3) k.b(g2Var, aCVar);
    }

    public cj a() {
        return d();
    }

    static {
        k = new s();
        i = new e3(true);
        i.b();
    }

    public static be a(e3 e3Var) {
        return h().a(e3Var);
    }

    public static final M f() {
        return cN.A();
    }

    public final boolean a() {
        boolean z = dy.b;
        byte b = this.h;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            int i = 0;
            while (i < k()) {
                if (b(i).a()) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                this.h = (byte) 0;
                return false;
            }
            if (b()) {
                this.h = (byte) 1;
                return true;
            }
            this.h = (byte) 0;
            return false;
        }
    }

    public bI a(int i) {
        return (bI) this.j.get(i);
    }

    public eD b(int i) {
        return (eD) this.j.get(i);
    }

    e3(I i, aC aCVar, gY gYVar) {
        this(i, aCVar);
    }

    e3(a4 a4Var, gY gYVar) {
        this(a4Var);
    }

    public cj b() {
        return g();
    }
}
