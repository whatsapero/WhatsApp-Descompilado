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

public final class at extends d0 implements aC {
    public static final int BASEKEY_FIELD_NUMBER = 2;
    public static eR PARSER = null;
    public static final int PREKEYID_FIELD_NUMBER = 1;
    public static final int SIGNEDPREKEYID_FIELD_NUMBER = 3;
    private static final at e;
    private static final long serialVersionUID = 0;
    private int f;
    private g2 g;
    private int h;
    private int i;
    private int j;
    private final eS k;
    private byte l;

    public static at a(g2 g2Var) {
        return (at) PARSER.a(g2Var);
    }

    public static at b(InputStream inputStream, aC aCVar) {
        return (at) PARSER.a(inputStream, aCVar);
    }

    public void a(bF bFVar) {
        d();
        if ((this.j & 1) == PREKEYID_FIELD_NUMBER) {
            bFVar.i(PREKEYID_FIELD_NUMBER, this.f);
        }
        if ((this.j & 4) == 4) {
            bFVar.a((int) BASEKEY_FIELD_NUMBER, this.g);
        }
        if ((this.j & 2) == BASEKEY_FIELD_NUMBER) {
            bFVar.c((int) SIGNEDPREKEYID_FIELD_NUMBER, this.h);
        }
        b().a(bFVar);
    }

    public boolean j() {
        return (this.j & 1) == PREKEYID_FIELD_NUMBER;
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

    protected U a(b1 b1Var) {
        return new U(b1Var, null);
    }

    static boolean k() {
        return d;
    }

    public U b() {
        return o();
    }

    public g2 c() {
        return this.g;
    }

    public int e() {
        return this.h;
    }

    at(I i, aC aCVar, bb bbVar) {
        this(i, aCVar);
    }

    static int a(at atVar, int i) {
        atVar.f = i;
        return i;
    }

    public static at a(I i, aC aCVar) {
        return (at) PARSER.b(i, aCVar);
    }

    public boolean h() {
        return (this.j & 2) == BASEKEY_FIELD_NUMBER;
    }

    public static at a(g2 g2Var, aC aCVar) {
        return (at) PARSER.b(g2Var, aCVar);
    }

    public final eS b() {
        return this.k;
    }

    public boolean l() {
        return (this.j & 4) == 4;
    }

    at(ax axVar, bb bbVar) {
        this(axVar);
    }

    private void f() {
        this.f = 0;
        this.h = 0;
        this.g = g2.a;
    }

    public static at a(InputStream inputStream) {
        return (at) PARSER.b(inputStream);
    }

    public int d() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.j & 1) == PREKEYID_FIELD_NUMBER) {
            i = 0 + bF.a((int) PREKEYID_FIELD_NUMBER, this.f);
        }
        if ((this.j & 4) == 4) {
            i += bF.b((int) BASEKEY_FIELD_NUMBER, this.g);
        }
        if ((this.j & 2) == BASEKEY_FIELD_NUMBER) {
            i += bF.g(SIGNEDPREKEYID_FIELD_NUMBER, this.h);
        }
        i += b().d();
        this.i = i;
        return i;
    }

    public aJ a() {
        return g();
    }

    public a1 c() {
        return a();
    }

    public U g() {
        return a(this);
    }

    public cj a() {
        return b();
    }

    public cj b() {
        return g();
    }

    static {
        PARSER = new s();
        e = new at(true);
        e.f();
    }

    protected er b() {
        return bD.m().a(at.class, U.class);
    }

    public static U o() {
        return U.f();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private at(com.google.I r6, com.google.aC r7) {
        /*
        r5_this = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.libaxolotl.a6.B;
        r5.<init>();
        r5.l = r0;
        r5.i = r0;
        r5.f();
        r3 = com.google.eS.b();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x004f;
    L_0x0015:
        r4 = r6.o();	 Catch:{ gc -> 0x005f, IOException -> 0x0076 }
        switch(r4) {
            case 0: goto L_0x0059;
            case 8: goto L_0x0025;
            case 18: goto L_0x0033;
            case 24: goto L_0x0041;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ gc -> 0x005d, IOException -> 0x0076 }
        if (r4 != 0) goto L_0x004d;
    L_0x0022:
        if (r2 == 0) goto L_0x0085;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.j;	 Catch:{ gc -> 0x0070, IOException -> 0x0076 }
        r4 = r4 | 1;
        r5.j = r4;	 Catch:{ gc -> 0x0070, IOException -> 0x0076 }
        r4 = r6.e();	 Catch:{ gc -> 0x0070, IOException -> 0x0076 }
        r5.f = r4;	 Catch:{ gc -> 0x0070, IOException -> 0x0076 }
        if (r2 == 0) goto L_0x004d;
    L_0x0033:
        r4 = r5.j;	 Catch:{ gc -> 0x0072, IOException -> 0x0076 }
        r4 = r4 | 4;
        r5.j = r4;	 Catch:{ gc -> 0x0072, IOException -> 0x0076 }
        r4 = r6.z();	 Catch:{ gc -> 0x0072, IOException -> 0x0076 }
        r5.g = r4;	 Catch:{ gc -> 0x0072, IOException -> 0x0076 }
        if (r2 == 0) goto L_0x004d;
    L_0x0041:
        r4 = r5.j;	 Catch:{ gc -> 0x0074, IOException -> 0x0076 }
        r4 = r4 | 2;
        r5.j = r4;	 Catch:{ gc -> 0x0074, IOException -> 0x0076 }
        r4 = r6.r();	 Catch:{ gc -> 0x0074, IOException -> 0x0076 }
        r5.h = r4;	 Catch:{ gc -> 0x0074, IOException -> 0x0076 }
    L_0x004d:
        if (r2 == 0) goto L_0x0013;
    L_0x004f:
        r0 = r3.c();
        r5.k = r0;
        r5.c();
        return;
    L_0x0059:
        if (r2 == 0) goto L_0x0085;
    L_0x005b:
        r0 = r1;
        goto L_0x001c;
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x005f, IOException -> 0x0076 }
    L_0x005f:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x0065 }
        throw r0;	 Catch:{ all -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        r1 = r3.c();
        r5.k = r1;
        r5.c();
        throw r0;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0072, IOException -> 0x0076 }
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0074, IOException -> 0x0076 }
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x005f, IOException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        r1 = new com.google.gc;	 Catch:{ all -> 0x0065 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0065 }
        r1.<init>(r0);	 Catch:{ all -> 0x0065 }
        r0 = r1.a(r5);	 Catch:{ all -> 0x0065 }
        throw r0;	 Catch:{ all -> 0x0065 }
    L_0x0085:
        r0 = r1;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.at.<init>(com.google.I, com.google.aC):void");
    }

    public aJ c() {
        return b();
    }

    static int c(at atVar, int i) {
        atVar.h = i;
        return i;
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public int i() {
        return this.f;
    }

    private at(boolean z) {
        this.l = (byte) -1;
        this.i = -1;
        this.k = eS.e();
    }

    private at(ax axVar) {
        super(axVar);
        this.l = (byte) -1;
        this.i = -1;
        this.k = axVar.b();
    }

    public static at a(byte[] bArr) {
        return (at) PARSER.a(bArr);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static at a(I i) {
        return (at) PARSER.a(i);
    }

    public static at a(InputStream inputStream, aC aCVar) {
        return (at) PARSER.b(inputStream, aCVar);
    }

    public eb c() {
        return a();
    }

    public static at a(byte[] bArr, aC aCVar) {
        return (at) PARSER.a(bArr, aCVar);
    }

    public static at b(InputStream inputStream) {
        return (at) PARSER.a(inputStream);
    }

    static g2 a(at atVar, g2 g2Var) {
        atVar.g = g2Var;
        return g2Var;
    }

    public static U a(at atVar) {
        return o().a(atVar);
    }

    public static at m() {
        return e;
    }

    public eR c() {
        return PARSER;
    }

    static int b(at atVar, int i) {
        atVar.j = i;
        return i;
    }

    public at a() {
        return e;
    }

    public static final M n() {
        return bD.w();
    }
}
