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

public final class a0 extends d0 implements ap {
    public static final int e = 1;
    private static final a0 g;
    public static eR i;
    private static final long serialVersionUID = 0;
    private List f;
    private final eS h;
    private byte j;
    private int k;

    public aJ a() {
        return l();
    }

    static {
        i = new i();
        g = new a0(true);
        g.b();
    }

    static boolean i() {
        return d;
    }

    public a1 c() {
        return j();
    }

    static boolean h() {
        return d;
    }

    public final eS b() {
        return this.h;
    }

    public static a0 a(g2 g2Var) {
        return (a0) i.a(g2Var);
    }

    static List a(a0 a0Var, List list) {
        a0Var.f = list;
        return list;
    }

    public aJ c() {
        return c();
    }

    private void b() {
        this.f = Collections.emptyList();
    }

    a0(I i, aC aCVar, bb bbVar) {
        this(i, aCVar);
    }

    public static a0 a(I i) {
        return (a0) i.a(i);
    }

    public K l() {
        return a(this);
    }

    public static a0 a(g2 g2Var, aC aCVar) {
        return (a0) i.b(g2Var, aCVar);
    }

    public aU a(int i) {
        return (aU) this.f.get(i);
    }

    public static a0 a(byte[] bArr, aC aCVar) {
        return (a0) i.a(bArr, aCVar);
    }

    protected K a(b1 b1Var) {
        return new K(b1Var, null);
    }

    public eR c() {
        return i;
    }

    public static a0 b(InputStream inputStream, aC aCVar) {
        return (a0) i.a(inputStream, aCVar);
    }

    public cj b() {
        return l();
    }

    private a0(ax axVar) {
        super(axVar);
        this.j = (byte) -1;
        this.k = -1;
        this.h = axVar.b();
    }

    public static a0 k() {
        return g;
    }

    public List d() {
        return this.f;
    }

    public static a0 a(InputStream inputStream) {
        return (a0) i.b(inputStream);
    }

    public int d() {
        boolean z = a6.B;
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i < this.f.size()) {
            i3 += bF.a((int) e, (a1) this.f.get(i));
            i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        i2 = b().d() + i3;
        this.k = i2;
        return i2;
    }

    public void a(bF bFVar) {
        boolean z = a6.B;
        d();
        int i = 0;
        while (i < this.f.size()) {
            bFVar.d((int) e, (a1) this.f.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        b().a(bFVar);
    }

    public static K a(a0 a0Var) {
        return g().a(a0Var);
    }

    a0(ax axVar, bb bbVar) {
        this(axVar);
    }

    public cj a() {
        return c();
    }

    public static final M a() {
        return bD.C();
    }

    public static a0 a(I i, aC aCVar) {
        return (a0) i.b(i, aCVar);
    }

    public a0 j() {
        return g;
    }

    static List b(a0 a0Var) {
        return a0Var.f;
    }

    public static K g() {
        return K.e();
    }

    public eb c() {
        return j();
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public static a0 a(byte[] bArr) {
        return (a0) i.a(bArr);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static a0 b(InputStream inputStream) {
        return (a0) i.a(inputStream);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a0(com.google.I r8, com.google.aC r9) {
        /*
        r7_this = this;
        r0 = 0;
        r1 = -1;
        r2 = 1;
        r3 = org.whispersystems.libaxolotl.a6.B;
        r7.<init>();
        r7.j = r1;
        r7.k = r1;
        r7.b();
        r4 = com.google.eS.b();
        r1 = r0;
    L_0x0014:
        if (r0 != 0) goto L_0x0040;
    L_0x0016:
        r5 = r8.o();	 Catch:{ gc -> 0x005c, IOException -> 0x007b }
        switch(r5) {
            case 0: goto L_0x0056;
            case 10: goto L_0x0026;
            default: goto L_0x001d;
        };
    L_0x001d:
        r5 = r7.a(r8, r4, r9, r5);	 Catch:{ gc -> 0x005a, IOException -> 0x007b }
        if (r5 != 0) goto L_0x003e;
    L_0x0023:
        if (r3 == 0) goto L_0x008c;
    L_0x0025:
        r0 = r2;
    L_0x0026:
        r5 = r1 & 1;
        if (r5 == r2) goto L_0x0033;
    L_0x002a:
        r5 = new java.util.ArrayList;	 Catch:{ gc -> 0x005c, IOException -> 0x007b }
        r5.<init>();	 Catch:{ gc -> 0x005c, IOException -> 0x007b }
        r7.f = r5;	 Catch:{ gc -> 0x005c, IOException -> 0x007b }
        r1 = r1 | 1;
    L_0x0033:
        r5 = r7.f;	 Catch:{ gc -> 0x005c, IOException -> 0x007b }
        r6 = org.whispersystems.libaxolotl.aU.p;	 Catch:{ gc -> 0x005c, IOException -> 0x007b }
        r6 = r8.a(r6, r9);	 Catch:{ gc -> 0x005c, IOException -> 0x007b }
        r5.add(r6);	 Catch:{ gc -> 0x005c, IOException -> 0x007b }
    L_0x003e:
        if (r3 == 0) goto L_0x0014;
    L_0x0040:
        r0 = r1 & 1;
        if (r0 != r2) goto L_0x004c;
    L_0x0044:
        r0 = r7.f;	 Catch:{ gc -> 0x0079 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x0079 }
        r7.f = r0;	 Catch:{ gc -> 0x0079 }
    L_0x004c:
        r0 = r4.c();
        r7.h = r0;
        r7.c();
        return;
    L_0x0056:
        if (r3 == 0) goto L_0x008c;
    L_0x0058:
        r0 = r2;
        goto L_0x001d;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x005c, IOException -> 0x007b }
    L_0x005c:
        r0 = move-exception;
        r0 = r0.a(r7);	 Catch:{ all -> 0x0062 }
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        r1 = r1 & 1;
        if (r1 != r2) goto L_0x006f;
    L_0x0067:
        r1 = r7.f;	 Catch:{ gc -> 0x008a }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ gc -> 0x008a }
        r7.f = r1;	 Catch:{ gc -> 0x008a }
    L_0x006f:
        r1 = r4.c();
        r7.h = r1;
        r7.c();
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = move-exception;
        r3 = new com.google.gc;	 Catch:{ all -> 0x0062 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0062 }
        r3.<init>(r0);	 Catch:{ all -> 0x0062 }
        r0 = r3.a(r7);	 Catch:{ all -> 0x0062 }
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = r2;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.a0.<init>(com.google.I, com.google.aC):void");
    }

    public K c() {
        return g();
    }

    protected er b() {
        return bD.B().a(a0.class, K.class);
    }

    private a0(boolean z) {
        this.j = (byte) -1;
        this.k = -1;
        this.h = eS.e();
    }

    public List e() {
        return this.f;
    }

    public aa b(int i) {
        return (aa) this.f.get(i);
    }

    public final boolean a() {
        byte b = this.j;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            this.j = (byte) 1;
            return true;
        }
    }

    public int f() {
        return this.f.size();
    }

    public static a0 a(InputStream inputStream, aC aCVar) {
        return (a0) i.b(inputStream, aCVar);
    }
}
