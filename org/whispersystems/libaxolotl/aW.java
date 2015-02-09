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

public final class aw extends d0 implements bg {
    public static eR h = null;
    public static final int i = 1;
    public static final int k = 2;
    private static final aw l;
    private static final long serialVersionUID = 0;
    private List e;
    private byte f;
    private int g;
    private final eS j;
    private a6 m;
    private int n;

    public static aw a(g2 g2Var, aC aCVar) {
        return (aw) h.b(g2Var, aCVar);
    }

    aw(ax axVar, bb bbVar) {
        this(axVar);
    }

    public aM b(int i) {
        return (aM) this.e.get(i);
    }

    protected J a(b1 b1Var) {
        return new J(b1Var, null);
    }

    public a6 m() {
        return this.m;
    }

    public List i() {
        return this.e;
    }

    public static aw a(byte[] bArr) {
        return (aw) h.a(bArr);
    }

    static boolean c() {
        return d;
    }

    public List g() {
        return this.e;
    }

    static List b(aw awVar) {
        return awVar.e;
    }

    public eR c() {
        return h;
    }

    public J k() {
        return a(this);
    }

    public static aw b(InputStream inputStream) {
        return (aw) h.a(inputStream);
    }

    public a1 c() {
        return n();
    }

    private aw(ax axVar) {
        super(axVar);
        this.f = (byte) -1;
        this.n = -1;
        this.j = axVar.b();
    }

    public aJ a() {
        return k();
    }

    public int d() {
        int i = 0;
        boolean z = a6.B;
        int i2 = this.n;
        if (i2 != -1) {
            return i2;
        }
        if ((this.g & 1) == i) {
            i2 = bF.a((int) i, this.m) + 0;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        while (i < this.e.size()) {
            i2 = bF.a((int) k, (a1) this.e.get(i)) + i3;
            i++;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        i2 += b().d();
        this.n = i2;
        return i2;
    }

    public static aw l() {
        return l;
    }

    public static aw a(I i, aC aCVar) {
        return (aw) h.b(i, aCVar);
    }

    public aM d() {
        return this.m;
    }

    public void a(bF bFVar) {
        boolean z = a6.B;
        d();
        if ((this.g & 1) == i) {
            bFVar.d((int) i, this.m);
        }
        int i = 0;
        while (i < this.e.size()) {
            bFVar.d((int) k, (a1) this.e.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        b().a(bFVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private aw(com.google.I r9, com.google.aC r10) {
        /*
        r8_this = this;
        r0 = 0;
        r1 = -1;
        r7 = 2;
        r2 = 1;
        r5 = org.whispersystems.libaxolotl.a6.B;
        r8.<init>();
        r8.f = r1;
        r8.n = r1;
        r8.b();
        r6 = com.google.eS.b();
        r1 = r0;
    L_0x0015:
        if (r0 != 0) goto L_0x006f;
    L_0x0017:
        r3 = r9.o();	 Catch:{ gc -> 0x008b, IOException -> 0x00aa }
        switch(r3) {
            case 0: goto L_0x0085;
            case 10: goto L_0x00c6;
            case 18: goto L_0x0055;
            default: goto L_0x001e;
        };
    L_0x001e:
        r3 = r8.a(r9, r6, r10, r3);	 Catch:{ gc -> 0x0089, IOException -> 0x00aa }
        if (r3 != 0) goto L_0x006d;
    L_0x0024:
        if (r5 == 0) goto L_0x00c4;
    L_0x0026:
        r3 = r2;
    L_0x0027:
        r0 = 0;
        r4 = r8.g;	 Catch:{ gc -> 0x008b, IOException -> 0x00aa }
        r4 = r4 & 1;
        if (r4 != r2) goto L_0x00c1;
    L_0x002e:
        r0 = r8.m;	 Catch:{ gc -> 0x008b, IOException -> 0x00aa }
        r0 = r0.w();	 Catch:{ gc -> 0x008b, IOException -> 0x00aa }
        r4 = r0;
    L_0x0035:
        r0 = org.whispersystems.libaxolotl.a6.H;	 Catch:{ gc -> 0x00a8, IOException -> 0x00aa }
        r0 = r9.a(r0, r10);	 Catch:{ gc -> 0x00a8, IOException -> 0x00aa }
        r0 = (org.whispersystems.libaxolotl.a6) r0;	 Catch:{ gc -> 0x00a8, IOException -> 0x00aa }
        r8.m = r0;	 Catch:{ gc -> 0x00a8, IOException -> 0x00aa }
        if (r4 == 0) goto L_0x004c;
    L_0x0041:
        r0 = r8.m;	 Catch:{ gc -> 0x00a8, IOException -> 0x00aa }
        r4.a(r0);	 Catch:{ gc -> 0x00a8, IOException -> 0x00aa }
        r0 = r4.a();	 Catch:{ gc -> 0x00a8, IOException -> 0x00aa }
        r8.m = r0;	 Catch:{ gc -> 0x00a8, IOException -> 0x00aa }
    L_0x004c:
        r0 = r8.g;	 Catch:{ gc -> 0x00b9, IOException -> 0x00aa }
        r0 = r0 | 1;
        r8.g = r0;	 Catch:{ gc -> 0x00b9, IOException -> 0x00aa }
        if (r5 == 0) goto L_0x00bf;
    L_0x0054:
        r0 = r3;
    L_0x0055:
        r3 = r1 & 2;
        if (r3 == r7) goto L_0x0062;
    L_0x0059:
        r3 = new java.util.ArrayList;	 Catch:{ gc -> 0x008b, IOException -> 0x00aa }
        r3.<init>();	 Catch:{ gc -> 0x008b, IOException -> 0x00aa }
        r8.e = r3;	 Catch:{ gc -> 0x008b, IOException -> 0x00aa }
        r1 = r1 | 2;
    L_0x0062:
        r3 = r8.e;	 Catch:{ gc -> 0x008b, IOException -> 0x00aa }
        r4 = org.whispersystems.libaxolotl.a6.H;	 Catch:{ gc -> 0x008b, IOException -> 0x00aa }
        r4 = r9.a(r4, r10);	 Catch:{ gc -> 0x008b, IOException -> 0x00aa }
        r3.add(r4);	 Catch:{ gc -> 0x008b, IOException -> 0x00aa }
    L_0x006d:
        if (r5 == 0) goto L_0x0015;
    L_0x006f:
        r0 = r1 & 2;
        if (r0 != r7) goto L_0x007b;
    L_0x0073:
        r0 = r8.e;	 Catch:{ gc -> 0x00bb }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x00bb }
        r8.e = r0;	 Catch:{ gc -> 0x00bb }
    L_0x007b:
        r0 = r6.c();
        r8.j = r0;
        r8.c();
        return;
    L_0x0085:
        if (r5 == 0) goto L_0x00c4;
    L_0x0087:
        r0 = r2;
        goto L_0x001e;
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x008b, IOException -> 0x00aa }
    L_0x008b:
        r0 = move-exception;
        r0 = r0.a(r8);	 Catch:{ all -> 0x0091 }
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        r1 = r1 & 2;
        if (r1 != r7) goto L_0x009e;
    L_0x0096:
        r1 = r8.e;	 Catch:{ gc -> 0x00bd }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ gc -> 0x00bd }
        r8.e = r1;	 Catch:{ gc -> 0x00bd }
    L_0x009e:
        r1 = r6.c();
        r8.j = r1;
        r8.c();
        throw r0;
    L_0x00a8:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x008b, IOException -> 0x00aa }
    L_0x00aa:
        r0 = move-exception;
        r2 = new com.google.gc;	 Catch:{ all -> 0x0091 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0091 }
        r2.<init>(r0);	 Catch:{ all -> 0x0091 }
        r0 = r2.a(r8);	 Catch:{ all -> 0x0091 }
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x008b, IOException -> 0x00aa }
    L_0x00bb:
        r0 = move-exception;
        throw r0;
    L_0x00bd:
        r0 = move-exception;
        throw r0;
    L_0x00bf:
        r0 = r3;
        goto L_0x006d;
    L_0x00c1:
        r4 = r0;
        goto L_0x0035;
    L_0x00c4:
        r0 = r2;
        goto L_0x006d;
    L_0x00c6:
        r3 = r0;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.aw.<init>(com.google.I, com.google.aC):void");
    }

    public final eS b() {
        return this.j;
    }

    public static J a(aw awVar) {
        return j().a(awVar);
    }

    static {
        h = new h();
        l = new aw(true);
        l.b();
    }

    public final boolean a() {
        byte b = this.f;
        if (b != -1) {
            return b == (byte) 1;
        } else {
            this.f = (byte) 1;
            return true;
        }
    }

    aw(I i, aC aCVar, bb bbVar) {
        this(i, aCVar);
    }

    public eb c() {
        return n();
    }

    public static aw b(InputStream inputStream, aC aCVar) {
        return (aw) h.a(inputStream, aCVar);
    }

    public static final M f() {
        return bD.k();
    }

    static List a(aw awVar, List list) {
        awVar.e = list;
        return list;
    }

    public aJ c() {
        return a();
    }

    public aw n() {
        return l;
    }

    public cj b() {
        return k();
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public boolean e() {
        return (this.g & 1) == i;
    }

    public a6 a(int i) {
        return (a6) this.e.get(i);
    }

    private void b() {
        this.m = a6.c();
        this.e = Collections.emptyList();
    }

    public J a() {
        return j();
    }

    public cj a() {
        return a();
    }

    static boolean h() {
        return d;
    }

    public static J j() {
        return J.h();
    }

    static int a(aw awVar, int i) {
        awVar.g = i;
        return i;
    }

    public static aw a(InputStream inputStream) {
        return (aw) h.b(inputStream);
    }

    protected er b() {
        return bD.j().a(aw.class, J.class);
    }

    public static aw a(InputStream inputStream, aC aCVar) {
        return (aw) h.b(inputStream, aCVar);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public int o() {
        return this.e.size();
    }

    private aw(boolean z) {
        this.f = (byte) -1;
        this.n = -1;
        this.j = eS.e();
    }

    static a6 a(aw awVar, a6 a6Var) {
        awVar.m = a6Var;
        return a6Var;
    }

    public static aw a(byte[] bArr, aC aCVar) {
        return (aw) h.a(bArr, aCVar);
    }

    public static aw a(I i) {
        return (aw) h.a(i);
    }

    public static aw a(g2 g2Var) {
        return (aw) h.a(g2Var);
    }
}
