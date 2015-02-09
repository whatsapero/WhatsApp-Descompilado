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

public final class a5 extends d0 implements b9 {
    public static final int CIPHERKEY_FIELD_NUMBER = 2;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int IV_FIELD_NUMBER = 4;
    public static final int MACKEY_FIELD_NUMBER = 3;
    public static eR PARSER;
    private static final a5 f;
    private static final long serialVersionUID = 0;
    private g2 e;
    private byte g;
    private g2 h;
    private final eS i;
    private int j;
    private int k;
    private g2 l;
    private int m;

    public boolean l() {
        return (this.k & 8) == 8;
    }

    public eR c() {
        return PARSER;
    }

    public static a5 b(InputStream inputStream, aC aCVar) {
        return (a5) PARSER.a(inputStream, aCVar);
    }

    public boolean c() {
        return (this.k & 1) == INDEX_FIELD_NUMBER;
    }

    public void a(bF bFVar) {
        d();
        if ((this.k & 1) == INDEX_FIELD_NUMBER) {
            bFVar.i(INDEX_FIELD_NUMBER, this.j);
        }
        if ((this.k & 2) == CIPHERKEY_FIELD_NUMBER) {
            bFVar.a((int) CIPHERKEY_FIELD_NUMBER, this.l);
        }
        if ((this.k & 4) == IV_FIELD_NUMBER) {
            bFVar.a((int) MACKEY_FIELD_NUMBER, this.h);
        }
        if ((this.k & 8) == 8) {
            bFVar.a((int) IV_FIELD_NUMBER, this.e);
        }
        b().a(bFVar);
    }

    public g2 n() {
        return this.h;
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

    public aJ c() {
        return p();
    }

    public S f() {
        return a(this);
    }

    static g2 a(a5 a5Var, g2 g2Var) {
        a5Var.e = g2Var;
        return g2Var;
    }

    public S p() {
        return k();
    }

    public static a5 a(I i) {
        return (a5) PARSER.a(i);
    }

    public static S a(a5 a5Var) {
        return k().a(a5Var);
    }

    public a5 o() {
        return f;
    }

    protected S a(b1 b1Var) {
        return new S(b1Var, null);
    }

    public static a5 i() {
        return f;
    }

    public final eS b() {
        return this.i;
    }

    private a5(ax axVar) {
        super(axVar);
        this.g = (byte) -1;
        this.m = -1;
        this.i = axVar.b();
    }

    public g2 q() {
        return this.l;
    }

    public int d() {
        int i = this.m;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.k & 1) == INDEX_FIELD_NUMBER) {
            i = 0 + bF.a((int) INDEX_FIELD_NUMBER, this.j);
        }
        if ((this.k & 2) == CIPHERKEY_FIELD_NUMBER) {
            i += bF.b((int) CIPHERKEY_FIELD_NUMBER, this.l);
        }
        if ((this.k & 4) == IV_FIELD_NUMBER) {
            i += bF.b((int) MACKEY_FIELD_NUMBER, this.h);
        }
        if ((this.k & 8) == 8) {
            i += bF.b((int) IV_FIELD_NUMBER, this.e);
        }
        i += b().d();
        this.m = i;
        return i;
    }

    static boolean m() {
        return d;
    }

    public static S k() {
        return S.a();
    }

    public g2 g() {
        return this.e;
    }

    public static a5 b(InputStream inputStream) {
        return (a5) PARSER.b(inputStream);
    }

    static int a(a5 a5Var, int i) {
        a5Var.j = i;
        return i;
    }

    private void d() {
        this.j = 0;
        this.l = g2.a;
        this.h = g2.a;
        this.e = g2.a;
    }

    a5(I i, aC aCVar, bb bbVar) {
        this(i, aCVar);
    }

    public static a5 a(InputStream inputStream) {
        return (a5) PARSER.a(inputStream);
    }

    public static a5 a(byte[] bArr, aC aCVar) {
        return (a5) PARSER.a(bArr, aCVar);
    }

    a5(ax axVar, bb bbVar) {
        this(axVar);
    }

    public int h() {
        return this.j;
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public cj a() {
        return p();
    }

    static g2 c(a5 a5Var, g2 g2Var) {
        a5Var.l = g2Var;
        return g2Var;
    }

    public cj b() {
        return f();
    }

    public boolean j() {
        return (this.k & 4) == IV_FIELD_NUMBER;
    }

    public static a5 a(g2 g2Var, aC aCVar) {
        return (a5) PARSER.b(g2Var, aCVar);
    }

    protected er b() {
        return bD.r().a(a5.class, S.class);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    static {
        PARSER = new q();
        f = new a5(true);
        f.d();
    }

    public static a5 a(g2 g2Var) {
        return (a5) PARSER.a(g2Var);
    }

    public static final M e() {
        return bD.a();
    }

    public static a5 a(I i, aC aCVar) {
        return (a5) PARSER.b(i, aCVar);
    }

    public eb c() {
        return o();
    }

    public static a5 a(InputStream inputStream, aC aCVar) {
        return (a5) PARSER.b(inputStream, aCVar);
    }

    private a5(boolean z) {
        this.g = (byte) -1;
        this.m = -1;
        this.i = eS.e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a5(com.google.I r6, com.google.aC r7) {
        /*
        r5_this = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.libaxolotl.a6.B;
        r5.<init>();
        r5.g = r0;
        r5.m = r0;
        r5.d();
        r3 = com.google.eS.b();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x005d;
    L_0x0015:
        r4 = r6.o();	 Catch:{ gc -> 0x006d, IOException -> 0x0086 }
        switch(r4) {
            case 0: goto L_0x0067;
            case 8: goto L_0x0025;
            case 18: goto L_0x0033;
            case 26: goto L_0x0041;
            case 34: goto L_0x004f;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ gc -> 0x006b, IOException -> 0x0086 }
        if (r4 != 0) goto L_0x005b;
    L_0x0022:
        if (r2 == 0) goto L_0x0095;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.k;	 Catch:{ gc -> 0x007e, IOException -> 0x0086 }
        r4 = r4 | 1;
        r5.k = r4;	 Catch:{ gc -> 0x007e, IOException -> 0x0086 }
        r4 = r6.e();	 Catch:{ gc -> 0x007e, IOException -> 0x0086 }
        r5.j = r4;	 Catch:{ gc -> 0x007e, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x0033:
        r4 = r5.k;	 Catch:{ gc -> 0x0080, IOException -> 0x0086 }
        r4 = r4 | 2;
        r5.k = r4;	 Catch:{ gc -> 0x0080, IOException -> 0x0086 }
        r4 = r6.z();	 Catch:{ gc -> 0x0080, IOException -> 0x0086 }
        r5.l = r4;	 Catch:{ gc -> 0x0080, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x0041:
        r4 = r5.k;	 Catch:{ gc -> 0x0082, IOException -> 0x0086 }
        r4 = r4 | 4;
        r5.k = r4;	 Catch:{ gc -> 0x0082, IOException -> 0x0086 }
        r4 = r6.z();	 Catch:{ gc -> 0x0082, IOException -> 0x0086 }
        r5.h = r4;	 Catch:{ gc -> 0x0082, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x004f:
        r4 = r5.k;	 Catch:{ gc -> 0x0084, IOException -> 0x0086 }
        r4 = r4 | 8;
        r5.k = r4;	 Catch:{ gc -> 0x0084, IOException -> 0x0086 }
        r4 = r6.z();	 Catch:{ gc -> 0x0084, IOException -> 0x0086 }
        r5.e = r4;	 Catch:{ gc -> 0x0084, IOException -> 0x0086 }
    L_0x005b:
        if (r2 == 0) goto L_0x0013;
    L_0x005d:
        r0 = r3.c();
        r5.i = r0;
        r5.c();
        return;
    L_0x0067:
        if (r2 == 0) goto L_0x0095;
    L_0x0069:
        r0 = r1;
        goto L_0x001c;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x006d, IOException -> 0x0086 }
    L_0x006d:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x0073 }
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        r1 = r3.c();
        r5.i = r1;
        r5.c();
        throw r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0080, IOException -> 0x0086 }
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0082, IOException -> 0x0086 }
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0084, IOException -> 0x0086 }
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x006d, IOException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        r1 = new com.google.gc;	 Catch:{ all -> 0x0073 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0073 }
        r1.<init>(r0);	 Catch:{ all -> 0x0073 }
        r0 = r1.a(r5);	 Catch:{ all -> 0x0073 }
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x0095:
        r0 = r1;
        goto L_0x005b;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.a5.<init>(com.google.I, com.google.aC):void");
    }

    public aJ a() {
        return f();
    }

    public a1 c() {
        return o();
    }

    static int b(a5 a5Var, int i) {
        a5Var.k = i;
        return i;
    }

    public static a5 a(byte[] bArr) {
        return (a5) PARSER.a(bArr);
    }

    static g2 b(a5 a5Var, g2 g2Var) {
        a5Var.h = g2Var;
        return g2Var;
    }

    public boolean b() {
        return (this.k & 2) == CIPHERKEY_FIELD_NUMBER;
    }
}
