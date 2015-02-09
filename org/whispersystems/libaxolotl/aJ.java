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

public final class aj extends d0 implements y {
    public static final int i = 4;
    public static final int j = 1;
    private static final aj n;
    public static eR o = null;
    public static final int q = 2;
    public static final int r = 3;
    private static final long serialVersionUID = 0;
    private g2 e;
    private int f;
    private byte g;
    private g2 h;
    private aS k;
    private final eS l;
    private List m;
    private int p;

    protected Object writeReplace() {
        return super.writeReplace();
    }

    static g2 a(aj ajVar, g2 g2Var) {
        ajVar.h = g2Var;
        return g2Var;
    }

    public static aj a(g2 g2Var, aC aCVar) {
        return (aj) o.b(g2Var, aCVar);
    }

    public a1 c() {
        return g();
    }

    public static Q a(aj ajVar) {
        return e().a(ajVar);
    }

    static List b(aj ajVar) {
        return ajVar.m;
    }

    public a5 a(int i) {
        return (a5) this.m.get(i);
    }

    public static aj c() {
        return n;
    }

    static g2 b(aj ajVar, g2 g2Var) {
        ajVar.e = g2Var;
        return g2Var;
    }

    public static aj b(InputStream inputStream) {
        return (aj) o.a(inputStream);
    }

    public int n() {
        return this.m.size();
    }

    public boolean j() {
        return (this.f & 1) == j;
    }

    public Q o() {
        return e();
    }

    private aj(boolean z) {
        this.g = (byte) -1;
        this.p = -1;
        this.l = eS.e();
    }

    public static aj a(InputStream inputStream) {
        return (aj) o.b(inputStream);
    }

    static {
        o = new o();
        n = new aj(true);
        n.k();
    }

    public cj b() {
        return q();
    }

    public List l() {
        return this.m;
    }

    public static Q e() {
        return Q.l();
    }

    public static aj a(I i) {
        return (aj) o.a(i);
    }

    protected er b() {
        return bD.n().a(aj.class, Q.class);
    }

    public final boolean a() {
        byte b = this.g;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            this.g = (byte) 1;
            return true;
        }
    }

    public eb c() {
        return g();
    }

    static boolean b() {
        return d;
    }

    public b9 b(int i) {
        return (b9) this.m.get(i);
    }

    static boolean h() {
        return d;
    }

    public static final M i() {
        return bD.l();
    }

    public Q q() {
        return a(this);
    }

    public static aj a(InputStream inputStream, aC aCVar) {
        return (aj) o.b(inputStream, aCVar);
    }

    public static aj a(g2 g2Var) {
        return (aj) o.a(g2Var);
    }

    public cj a() {
        return o();
    }

    public boolean r() {
        return (this.f & 2) == q;
    }

    public static aj a(I i, aC aCVar) {
        return (aj) o.b(i, aCVar);
    }

    public aJ a() {
        return q();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private aj(com.google.I r10, com.google.aC r11) {
        /*
        r9_this = this;
        r2 = 1;
        r0 = 0;
        r1 = -1;
        r8 = 8;
        r5 = org.whispersystems.libaxolotl.a6.B;
        r9.<init>();
        r9.g = r1;
        r9.p = r1;
        r9.k();
        r6 = com.google.eS.b();
        r1 = r0;
    L_0x0016:
        if (r0 != 0) goto L_0x008e;
    L_0x0018:
        r3 = r10.o();	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
        switch(r3) {
            case 0: goto L_0x00a4;
            case 10: goto L_0x0028;
            case 18: goto L_0x0036;
            case 26: goto L_0x00ea;
            case 34: goto L_0x0074;
            default: goto L_0x001f;
        };
    L_0x001f:
        r3 = r9.a(r10, r6, r11, r3);	 Catch:{ gc -> 0x00a9, IOException -> 0x00cc }
        if (r3 != 0) goto L_0x008c;
    L_0x0025:
        if (r5 == 0) goto L_0x00e8;
    L_0x0027:
        r0 = r2;
    L_0x0028:
        r3 = r9.f;	 Catch:{ gc -> 0x00c8, IOException -> 0x00cc }
        r3 = r3 | 1;
        r9.f = r3;	 Catch:{ gc -> 0x00c8, IOException -> 0x00cc }
        r3 = r10.z();	 Catch:{ gc -> 0x00c8, IOException -> 0x00cc }
        r9.h = r3;	 Catch:{ gc -> 0x00c8, IOException -> 0x00cc }
        if (r5 == 0) goto L_0x008c;
    L_0x0036:
        r3 = r9.f;	 Catch:{ gc -> 0x00ca, IOException -> 0x00cc }
        r3 = r3 | 2;
        r9.f = r3;	 Catch:{ gc -> 0x00ca, IOException -> 0x00cc }
        r3 = r10.z();	 Catch:{ gc -> 0x00ca, IOException -> 0x00cc }
        r9.e = r3;	 Catch:{ gc -> 0x00ca, IOException -> 0x00cc }
        if (r5 == 0) goto L_0x008c;
    L_0x0044:
        r3 = r0;
    L_0x0045:
        r0 = 0;
        r4 = r9.f;	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
        r4 = r4 & 4;
        r7 = 4;
        if (r4 != r7) goto L_0x00e5;
    L_0x004d:
        r0 = r9.k;	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
        r0 = r0.f();	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
        r4 = r0;
    L_0x0054:
        r0 = org.whispersystems.libaxolotl.aS.PARSER;	 Catch:{ gc -> 0x00db, IOException -> 0x00cc }
        r0 = r10.a(r0, r11);	 Catch:{ gc -> 0x00db, IOException -> 0x00cc }
        r0 = (org.whispersystems.libaxolotl.aS) r0;	 Catch:{ gc -> 0x00db, IOException -> 0x00cc }
        r9.k = r0;	 Catch:{ gc -> 0x00db, IOException -> 0x00cc }
        if (r4 == 0) goto L_0x006b;
    L_0x0060:
        r0 = r9.k;	 Catch:{ gc -> 0x00db, IOException -> 0x00cc }
        r4.a(r0);	 Catch:{ gc -> 0x00db, IOException -> 0x00cc }
        r0 = r4.g();	 Catch:{ gc -> 0x00db, IOException -> 0x00cc }
        r9.k = r0;	 Catch:{ gc -> 0x00db, IOException -> 0x00cc }
    L_0x006b:
        r0 = r9.f;	 Catch:{ gc -> 0x00dd, IOException -> 0x00cc }
        r0 = r0 | 4;
        r9.f = r0;	 Catch:{ gc -> 0x00dd, IOException -> 0x00cc }
        if (r5 == 0) goto L_0x00e3;
    L_0x0073:
        r0 = r3;
    L_0x0074:
        r3 = r1 & 8;
        if (r3 == r8) goto L_0x0081;
    L_0x0078:
        r3 = new java.util.ArrayList;	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
        r3.<init>();	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
        r9.m = r3;	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
        r1 = r1 | 8;
    L_0x0081:
        r3 = r9.m;	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
        r4 = org.whispersystems.libaxolotl.a5.PARSER;	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
        r4 = r10.a(r4, r11);	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
        r3.add(r4);	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
    L_0x008c:
        if (r5 == 0) goto L_0x0016;
    L_0x008e:
        r0 = r1 & 8;
        if (r0 != r8) goto L_0x009a;
    L_0x0092:
        r0 = r9.m;	 Catch:{ gc -> 0x00df }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x00df }
        r9.m = r0;	 Catch:{ gc -> 0x00df }
    L_0x009a:
        r0 = r6.c();
        r9.l = r0;
        r9.c();
        return;
    L_0x00a4:
        if (r5 == 0) goto L_0x00e8;
    L_0x00a6:
        r0 = r2;
        goto L_0x001f;
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
    L_0x00ab:
        r0 = move-exception;
        r0 = r0.a(r9);	 Catch:{ all -> 0x00b1 }
        throw r0;	 Catch:{ all -> 0x00b1 }
    L_0x00b1:
        r0 = move-exception;
        r1 = r1 & 8;
        if (r1 != r8) goto L_0x00be;
    L_0x00b6:
        r1 = r9.m;	 Catch:{ gc -> 0x00e1 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ gc -> 0x00e1 }
        r9.m = r1;	 Catch:{ gc -> 0x00e1 }
    L_0x00be:
        r1 = r6.c();
        r9.l = r1;
        r9.c();
        throw r0;
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00ca, IOException -> 0x00cc }
    L_0x00ca:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
    L_0x00cc:
        r0 = move-exception;
        r2 = new com.google.gc;	 Catch:{ all -> 0x00b1 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x00b1 }
        r2.<init>(r0);	 Catch:{ all -> 0x00b1 }
        r0 = r2.a(r9);	 Catch:{ all -> 0x00b1 }
        throw r0;	 Catch:{ all -> 0x00b1 }
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00ab, IOException -> 0x00cc }
    L_0x00df:
        r0 = move-exception;
        throw r0;
    L_0x00e1:
        r0 = move-exception;
        throw r0;
    L_0x00e3:
        r0 = r3;
        goto L_0x008c;
    L_0x00e5:
        r4 = r0;
        goto L_0x0054;
    L_0x00e8:
        r0 = r2;
        goto L_0x008c;
    L_0x00ea:
        r3 = r0;
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.aj.<init>(com.google.I, com.google.aC):void");
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public int d() {
        int i = 0;
        boolean z = a6.B;
        int i2 = this.p;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f & 1) == j) {
            i2 = bF.b((int) j, this.h) + 0;
        } else {
            i2 = 0;
        }
        if ((this.f & 2) == q) {
            i2 += bF.b((int) q, this.e);
        }
        if ((this.f & 4) == i) {
            i2 += bF.a((int) r, this.k);
        }
        int i3 = i2;
        while (i < this.m.size()) {
            i2 = bF.a((int) i, (a1) this.m.get(i)) + i3;
            i++;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        i2 += b().d();
        this.p = i2;
        return i2;
    }

    public x s() {
        return this.k;
    }

    public static aj a(byte[] bArr, aC aCVar) {
        return (aj) o.a(bArr, aCVar);
    }

    private aj(ax axVar) {
        super(axVar);
        this.g = (byte) -1;
        this.p = -1;
        this.l = axVar.b();
    }

    public List p() {
        return this.m;
    }

    private void k() {
        this.h = g2.a;
        this.e = g2.a;
        this.k = aS.i();
        this.m = Collections.emptyList();
    }

    protected Q a(b1 b1Var) {
        return new Q(b1Var, null);
    }

    public static aj b(InputStream inputStream, aC aCVar) {
        return (aj) o.a(inputStream, aCVar);
    }

    public aj g() {
        return n;
    }

    public g2 a() {
        return this.e;
    }

    static int a(aj ajVar, int i) {
        ajVar.f = i;
        return i;
    }

    public aS m() {
        return this.k;
    }

    public g2 d() {
        return this.h;
    }

    aj(ax axVar, bb bbVar) {
        this(axVar);
    }

    public final eS b() {
        return this.l;
    }

    aj(I i, aC aCVar, bb bbVar) {
        this(i, aCVar);
    }

    static List a(aj ajVar, List list) {
        ajVar.m = list;
        return list;
    }

    static aS a(aj ajVar, aS aSVar) {
        ajVar.k = aSVar;
        return aSVar;
    }

    public aJ c() {
        return o();
    }

    public static aj a(byte[] bArr) {
        return (aj) o.a(bArr);
    }

    public boolean f() {
        return (this.f & 4) == i;
    }

    public eR c() {
        return o;
    }

    public void a(bF bFVar) {
        boolean z = a6.B;
        d();
        if ((this.f & 1) == j) {
            bFVar.a((int) j, this.h);
        }
        if ((this.f & 2) == q) {
            bFVar.a((int) q, this.e);
        }
        if ((this.f & 4) == i) {
            bFVar.d((int) r, this.k);
        }
        int i = 0;
        while (i < this.m.size()) {
            bFVar.d((int) i, (a1) this.m.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        b().a(bFVar);
    }
}
