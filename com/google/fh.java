package com.google;

public class fH implements b1 {
    private boolean a;
    private d0 b;
    private b1 c;
    private ax d;

    public ax e() {
        try {
            if (this.d == null) {
                this.d = (ax) this.b.a((b1) this);
                this.d.a(this.b);
                this.d.d();
            }
            return this.d;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public d0 c() {
        this.a = true;
        return a();
    }

    private void g() {
        try {
            if (this.d != null) {
                this.b = null;
            }
            try {
                if (!this.a) {
                    return;
                }
                if (this.c != null) {
                    this.c.a();
                    this.a = false;
                }
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            }
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    public eE f() {
        try {
            return this.d != null ? this.d : this.b;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.fH a(com.google.d0 r3) {
        /*
        r2_this = this;
        r0 = r2.d;	 Catch:{ NullPointerException -> 0x001f }
        if (r0 != 0) goto L_0x0014;
    L_0x0004:
        r0 = r2.b;	 Catch:{ NullPointerException -> 0x0021 }
        r1 = r2.b;	 Catch:{ NullPointerException -> 0x0021 }
        r1 = r1.c();	 Catch:{ NullPointerException -> 0x0021 }
        if (r0 != r1) goto L_0x0014;
    L_0x000e:
        r2.b = r3;	 Catch:{ NullPointerException -> 0x0023 }
        r0 = com.google.dy.b;	 Catch:{ NullPointerException -> 0x0023 }
        if (r0 == 0) goto L_0x001b;
    L_0x0014:
        r0 = r2.e();	 Catch:{ NullPointerException -> 0x0023 }
        r0.a(r3);	 Catch:{ NullPointerException -> 0x0023 }
    L_0x001b:
        r2.g();
        return r2;
    L_0x001f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fH.a(com.google.d0):com.google.fH");
    }

    public fH(d0 d0Var, b1 b1Var, boolean z) {
        if (d0Var == null) {
            throw new NullPointerException();
        }
        this.b = d0Var;
        this.c = b1Var;
        this.a = z;
    }

    public void a() {
        g();
    }

    public fH b() {
        try {
            eb c;
            if (this.b != null) {
                c = this.b.c();
            } else {
                c = this.d.c();
            }
            try {
                this.b = (d0) c;
                if (this.d != null) {
                    this.d.i();
                    this.d = null;
                }
                g();
                return this;
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public d0 a() {
        try {
            if (this.b == null) {
                this.b = (d0) this.d.a();
            }
            return this.b;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void d() {
        this.c = null;
    }

    public fH b(d0 d0Var) {
        if (d0Var == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        try {
            this.b = d0Var;
            if (this.d != null) {
                this.d.i();
                this.d = null;
            }
            g();
            return this;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }
}
