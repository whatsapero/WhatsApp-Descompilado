package org.whispersystems.libaxolotl;

import com.google.I;
import com.google.M;
import com.google.a1;
import com.google.aC;
import com.google.aI;
import com.google.aJ;
import com.google.ah;
import com.google.ax;
import com.google.b1;
import com.google.cj;
import com.google.eb;
import com.google.er;
import com.google.g2;

public final class U extends ax implements aC {
    private int e;
    private int f;
    private int g;
    private g2 h;

    protected er g() {
        return bD.m().a(at.class, U.class);
    }

    U(b1 b1Var, bb bbVar) {
        this(b1Var);
    }

    private U(b1 b1Var) {
        super(b1Var);
        this.h = g2.a;
        g();
    }

    public eb c() {
        return a();
    }

    public U a(g2 g2Var) {
        if (g2Var == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.g |= 4;
        this.h = g2Var;
        e();
        return this;
    }

    public ax a() {
        return c();
    }

    public aI a(eb ebVar) {
        return a(ebVar);
    }

    public aJ a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public eb b() {
        return e();
    }

    public aI a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    private void g() {
        if (!at.k()) {
        }
    }

    public a1 a() {
        return b();
    }

    public aI a() {
        return c();
    }

    private U() {
        this.h = g2.a;
        g();
    }

    public cj a(eb ebVar) {
        return a(ebVar);
    }

    public U a(int i) {
        this.g |= 1;
        this.f = i;
        e();
        return this;
    }

    public final boolean a() {
        return true;
    }

    public at e() {
        Object b = b();
        try {
            if (b.a()) {
                return b;
            }
            throw b(b);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.libaxolotl.U a(com.google.I r5, com.google.aC r6) {
        /*
        r4_this = this;
        r2 = 0;
        r0 = org.whispersystems.libaxolotl.at.PARSER;	 Catch:{ gc -> 0x0011 }
        r0 = r0.a(r5, r6);	 Catch:{ gc -> 0x0011 }
        r0 = (org.whispersystems.libaxolotl.at) r0;	 Catch:{ gc -> 0x0011 }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ gc -> 0x000f }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.c();	 Catch:{ all -> 0x0026 }
        r0 = (org.whispersystems.libaxolotl.at) r0;	 Catch:{ all -> 0x0026 }
        throw r1;	 Catch:{ all -> 0x001a }
    L_0x001a:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001e:
        if (r1 == 0) goto L_0x0023;
    L_0x0020:
        r4.a(r1);	 Catch:{ gc -> 0x0024 }
    L_0x0023:
        throw r0;
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.U.a(com.google.I, com.google.aC):org.whispersystems.libaxolotl.U");
    }

    public U a(at atVar) {
        try {
            if (atVar != at.m()) {
                try {
                    if (atVar.j()) {
                        a(atVar.i());
                    }
                    try {
                        if (atVar.h()) {
                            b(atVar.e());
                        }
                        try {
                            if (atVar.l()) {
                                a(atVar.c());
                            }
                            a(atVar.b());
                        } catch (NullPointerException e) {
                            throw e;
                        }
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                } catch (NullPointerException e22) {
                    throw e22;
                }
            }
            return this;
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    public a1 b() {
        return e();
    }

    public ah a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public U b(int i) {
        this.g |= 2;
        this.e = i;
        e();
        return this;
    }

    public ah a() {
        return c();
    }

    public U a(eb ebVar) {
        try {
            if (ebVar instanceof at) {
                this = a((at) ebVar);
            } else {
                super.a(ebVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static U f() {
        return d();
    }

    public U c() {
        return d().a(b());
    }

    public a1 c() {
        return a();
    }

    private static U d() {
        return new U();
    }

    public Object clone() {
        return c();
    }

    public at b() {
        int i = 1;
        at atVar = new at((ax) this, null);
        int i2 = this.g;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        at.a(atVar, this.f);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        at.c(atVar, this.e);
        if ((i2 & 4) == 4) {
            i |= 4;
        }
        at.a(atVar, this.h);
        at.b(atVar, i);
        b();
        return atVar;
    }

    public at a() {
        return at.m();
    }

    public eb a() {
        return b();
    }

    public M c() {
        return bD.w();
    }
}
