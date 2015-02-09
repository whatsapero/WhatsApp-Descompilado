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

public final class ar extends d0 implements bd {
    public static eR PARSER = null;
    public static final int PRIVATE_FIELD_NUMBER = 2;
    public static final int PUBLIC_FIELD_NUMBER = 1;
    private static final ar j;
    private static final long serialVersionUID = 0;
    private g2 e;
    private g2 f;
    private byte g;
    private int h;
    private int i;
    private final eS k;

    public O a() {
        return a(this);
    }

    static int a(ar arVar, int i) {
        arVar.h = i;
        return i;
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

    static g2 a(ar arVar, g2 g2Var) {
        arVar.e = g2Var;
        return g2Var;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public ar c() {
        return j;
    }

    public g2 b() {
        return this.f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ar(com.google.I r6, com.google.aC r7) {
        /*
        r5_this = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.libaxolotl.a6.B;
        r5.<init>();
        r5.g = r0;
        r5.i = r0;
        r5.i();
        r3 = com.google.eS.b();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x0041;
    L_0x0015:
        r4 = r6.o();	 Catch:{ gc -> 0x0051, IOException -> 0x0066 }
        switch(r4) {
            case 0: goto L_0x004b;
            case 10: goto L_0x0025;
            case 18: goto L_0x0033;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ gc -> 0x004f, IOException -> 0x0066 }
        if (r4 != 0) goto L_0x003f;
    L_0x0022:
        if (r2 == 0) goto L_0x0075;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.h;	 Catch:{ gc -> 0x0062, IOException -> 0x0066 }
        r4 = r4 | 1;
        r5.h = r4;	 Catch:{ gc -> 0x0062, IOException -> 0x0066 }
        r4 = r6.z();	 Catch:{ gc -> 0x0062, IOException -> 0x0066 }
        r5.f = r4;	 Catch:{ gc -> 0x0062, IOException -> 0x0066 }
        if (r2 == 0) goto L_0x003f;
    L_0x0033:
        r4 = r5.h;	 Catch:{ gc -> 0x0064, IOException -> 0x0066 }
        r4 = r4 | 2;
        r5.h = r4;	 Catch:{ gc -> 0x0064, IOException -> 0x0066 }
        r4 = r6.z();	 Catch:{ gc -> 0x0064, IOException -> 0x0066 }
        r5.e = r4;	 Catch:{ gc -> 0x0064, IOException -> 0x0066 }
    L_0x003f:
        if (r2 == 0) goto L_0x0013;
    L_0x0041:
        r0 = r3.c();
        r5.k = r0;
        r5.c();
        return;
    L_0x004b:
        if (r2 == 0) goto L_0x0075;
    L_0x004d:
        r0 = r1;
        goto L_0x001c;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0051, IOException -> 0x0066 }
    L_0x0051:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x0057 }
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        r1 = r3.c();
        r5.k = r1;
        r5.c();
        throw r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0064, IOException -> 0x0066 }
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0051, IOException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        r1 = new com.google.gc;	 Catch:{ all -> 0x0057 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0057 }
        r1.<init>(r0);	 Catch:{ all -> 0x0057 }
        r0 = r1.a(r5);	 Catch:{ all -> 0x0057 }
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x0075:
        r0 = r1;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.ar.<init>(com.google.I, com.google.aC):void");
    }

    private ar(boolean z) {
        this.g = (byte) -1;
        this.i = -1;
        this.k = eS.e();
    }

    public cj b() {
        return a();
    }

    public g2 d() {
        return this.e;
    }

    public cj a() {
        return g();
    }

    public static ar a(InputStream inputStream) {
        return (ar) PARSER.b(inputStream);
    }

    public boolean j() {
        return (this.h & 2) == PRIVATE_FIELD_NUMBER;
    }

    public final eS b() {
        return this.k;
    }

    public static ar b(InputStream inputStream) {
        return (ar) PARSER.a(inputStream);
    }

    public static ar b(InputStream inputStream, aC aCVar) {
        return (ar) PARSER.a(inputStream, aCVar);
    }

    static boolean h() {
        return d;
    }

    public aJ c() {
        return g();
    }

    public static ar a(byte[] bArr) {
        return (ar) PARSER.a(bArr);
    }

    protected er b() {
        return bD.q().a(ar.class, O.class);
    }

    ar(ax axVar, bb bbVar) {
        this(axVar);
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public static ar a(byte[] bArr, aC aCVar) {
        return (ar) PARSER.a(bArr, aCVar);
    }

    ar(I i, aC aCVar, bb bbVar) {
        this(i, aCVar);
    }

    static {
        PARSER = new m();
        j = new ar(true);
        j.i();
    }

    public static ar a(g2 g2Var) {
        return (ar) PARSER.a(g2Var);
    }

    protected O a(b1 b1Var) {
        return new O(b1Var, null);
    }

    public void a(bF bFVar) {
        d();
        if ((this.h & 1) == PUBLIC_FIELD_NUMBER) {
            bFVar.a((int) PUBLIC_FIELD_NUMBER, this.f);
        }
        if ((this.h & 2) == PRIVATE_FIELD_NUMBER) {
            bFVar.a((int) PRIVATE_FIELD_NUMBER, this.e);
        }
        b().a(bFVar);
    }

    public eR c() {
        return PARSER;
    }

    public static O a(ar arVar) {
        return f().a(arVar);
    }

    public aJ a() {
        return a();
    }

    public static ar k() {
        return j;
    }

    public eb c() {
        return c();
    }

    public a1 c() {
        return c();
    }

    public static final M e() {
        return bD.h();
    }

    public O g() {
        return f();
    }

    public static O f() {
        return O.a();
    }

    private ar(ax axVar) {
        super(axVar);
        this.g = (byte) -1;
        this.i = -1;
        this.k = axVar.b();
    }

    public static ar a(g2 g2Var, aC aCVar) {
        return (ar) PARSER.b(g2Var, aCVar);
    }

    public int d() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.h & 1) == PUBLIC_FIELD_NUMBER) {
            i = 0 + bF.b((int) PUBLIC_FIELD_NUMBER, this.f);
        }
        if ((this.h & 2) == PRIVATE_FIELD_NUMBER) {
            i += bF.b((int) PRIVATE_FIELD_NUMBER, this.e);
        }
        i += b().d();
        this.i = i;
        return i;
    }

    public static ar a(I i, aC aCVar) {
        return (ar) PARSER.b(i, aCVar);
    }

    public static ar a(InputStream inputStream, aC aCVar) {
        return (ar) PARSER.b(inputStream, aCVar);
    }

    static g2 b(ar arVar, g2 g2Var) {
        arVar.f = g2Var;
        return g2Var;
    }

    public static ar a(I i) {
        return (ar) PARSER.a(i);
    }

    public boolean l() {
        return (this.h & 1) == PUBLIC_FIELD_NUMBER;
    }

    private void i() {
        this.f = g2.a;
        this.e = g2.a;
    }
}
