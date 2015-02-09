package com.google;

public final class aH extends ax implements ei {
    private Object e;
    private b6 f;
    private eJ g;
    private fH h;
    private Object i;
    private bt j;
    private int k;
    private Object l;
    private int m;
    private Object n;

    static aH k() {
        return a();
    }

    public aH d() {
        return a().a(j());
    }

    public a1 a() {
        return j();
    }

    public ah a() {
        return d();
    }

    private fH i() {
        try {
            if (this.h == null) {
                this.h = new fH(this.g, h(), f());
                this.g = null;
            }
            return this.h;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public d6 h() {
        Object j = j();
        try {
            if (j.a()) {
                return j;
            }
            throw b(j);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void c() {
        try {
            if (d0.d) {
                i();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public a1 c() {
        return f();
    }

    private static aH a() {
        return new aH();
    }

    public final boolean a() {
        try {
            if (g()) {
                if (!e().a()) {
                    return false;
                }
            }
            try {
                return true;
            }
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    private aH() {
        this.n = "";
        this.j = bt.LABEL_OPTIONAL;
        this.f = b6.TYPE_DOUBLE;
        this.e = "";
        this.i = "";
        this.l = "";
        this.g = eJ.d();
        c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.aH a(com.google.eJ r4) {
        /*
        r3_this = this;
        r0 = com.google.dy.b;
        r1 = r3.h;	 Catch:{ NullPointerException -> 0x003b }
        if (r1 != 0) goto L_0x002f;
    L_0x0006:
        r1 = r3.k;	 Catch:{ NullPointerException -> 0x003d }
        r1 = r1 & 128;
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 != r2) goto L_0x0028;
    L_0x000e:
        r1 = r3.g;	 Catch:{ NullPointerException -> 0x003f }
        r2 = com.google.eJ.d();	 Catch:{ NullPointerException -> 0x003f }
        if (r1 == r2) goto L_0x0028;
    L_0x0016:
        r1 = r3.g;	 Catch:{ NullPointerException -> 0x0041 }
        r1 = com.google.eJ.b(r1);	 Catch:{ NullPointerException -> 0x0041 }
        r1 = r1.a(r4);	 Catch:{ NullPointerException -> 0x0041 }
        r1 = r1.k();	 Catch:{ NullPointerException -> 0x0041 }
        r3.g = r1;	 Catch:{ NullPointerException -> 0x0041 }
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r3.g = r4;	 Catch:{ NullPointerException -> 0x0041 }
    L_0x002a:
        r3.e();	 Catch:{ NullPointerException -> 0x0043 }
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r3.h;	 Catch:{ NullPointerException -> 0x0043 }
        r0.a(r4);	 Catch:{ NullPointerException -> 0x0043 }
    L_0x0034:
        r0 = r3.k;
        r0 = r0 | 128;
        r3.k = r0;
        return r3;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aH.a(com.google.eJ):com.google.aH");
    }

    public eb c() {
        return f();
    }

    public M c() {
        return cN.y();
    }

    public ah a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    aH(b1 b1Var, gY gYVar) {
        this(b1Var);
    }

    public eb a() {
        return j();
    }

    public aJ a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public aH a(eb ebVar) {
        try {
            if (ebVar instanceof d6) {
                this = a((d6) ebVar);
            } else {
                super.a(ebVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public aI a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public aH a(int i) {
        this.k |= 2;
        this.m = i;
        e();
        return this;
    }

    private aH(b1 b1Var) {
        super(b1Var);
        this.n = "";
        this.j = bt.LABEL_OPTIONAL;
        this.f = b6.TYPE_DOUBLE;
        this.e = "";
        this.i = "";
        this.l = "";
        this.g = eJ.d();
        c();
    }

    public boolean g() {
        try {
            return (this.k & 128) == 128;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public cj a(eb ebVar) {
        return a(ebVar);
    }

    public d6 f() {
        return d6.n();
    }

    public a1 b() {
        return h();
    }

    public aH a(d6 d6Var) {
        try {
            if (d6Var != d6.n()) {
                try {
                    if (d6Var.q()) {
                        this.k |= 1;
                        this.n = d6.b(d6Var);
                        e();
                    }
                    try {
                        if (d6Var.r()) {
                            a(d6Var.g());
                        }
                        try {
                            if (d6Var.C()) {
                                a(d6Var.h());
                            }
                            try {
                                if (d6Var.e()) {
                                    a(d6Var.j());
                                }
                                try {
                                    if (d6Var.t()) {
                                        this.k |= 16;
                                        this.e = d6.a(d6Var);
                                        e();
                                    }
                                    try {
                                        if (d6Var.f()) {
                                            this.k |= 32;
                                            this.i = d6.c(d6Var);
                                            e();
                                        }
                                        try {
                                            if (d6Var.p()) {
                                                this.k |= 64;
                                                this.l = d6.d(d6Var);
                                                e();
                                            }
                                            try {
                                                if (d6Var.v()) {
                                                    a(d6Var.A());
                                                }
                                                a(d6Var.b());
                                            } catch (NullPointerException e) {
                                                throw e;
                                            }
                                        } catch (NullPointerException e2) {
                                            throw e2;
                                        }
                                    } catch (NullPointerException e22) {
                                        throw e22;
                                    }
                                } catch (NullPointerException e222) {
                                    throw e222;
                                }
                            } catch (NullPointerException e2222) {
                                throw e2222;
                            }
                        } catch (NullPointerException e22222) {
                            throw e22222;
                        }
                    } catch (NullPointerException e222222) {
                        throw e222222;
                    }
                } catch (NullPointerException e2222222) {
                    throw e2222222;
                }
            }
            return this;
        } catch (NullPointerException e22222222) {
            throw e22222222;
        }
    }

    public aH a(bt btVar) {
        if (btVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.k |= 4;
        this.j = btVar;
        e();
        return this;
    }

    public eJ e() {
        try {
            return this.h == null ? this.g : (eJ) this.h.a();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public eb b() {
        return h();
    }

    protected er g() {
        return cN.f().a(d6.class, aH.class);
    }

    public aI a() {
        return d();
    }

    public aI a(eb ebVar) {
        return a(ebVar);
    }

    public aH a(b6 b6Var) {
        if (b6Var == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.k |= 8;
        this.f = b6Var;
        e();
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.d6 j() {
        /*
        r5_this = this;
        r0 = 1;
        r2 = new com.google.d6;
        r1 = 0;
        r2.<init>(r5, r1);
        r3 = r5.k;
        r1 = 0;
        r4 = r3 & 1;
        if (r4 != r0) goto L_0x008d;
    L_0x000e:
        r1 = r5.n;
        com.google.d6.a(r2, r1);
        r1 = r3 & 2;
        r4 = 2;
        if (r1 != r4) goto L_0x001a;
    L_0x0018:
        r0 = r0 | 2;
    L_0x001a:
        r1 = r5.m;
        com.google.d6.b(r2, r1);
        r1 = r3 & 4;
        r4 = 4;
        if (r1 != r4) goto L_0x0026;
    L_0x0024:
        r0 = r0 | 4;
    L_0x0026:
        r1 = r5.j;
        com.google.d6.a(r2, r1);
        r1 = r3 & 8;
        r4 = 8;
        if (r1 != r4) goto L_0x0033;
    L_0x0031:
        r0 = r0 | 8;
    L_0x0033:
        r1 = r5.f;
        com.google.d6.a(r2, r1);
        r1 = r3 & 16;
        r4 = 16;
        if (r1 != r4) goto L_0x0040;
    L_0x003e:
        r0 = r0 | 16;
    L_0x0040:
        r1 = r5.e;
        com.google.d6.c(r2, r1);
        r1 = r3 & 32;
        r4 = 32;
        if (r1 != r4) goto L_0x004d;
    L_0x004b:
        r0 = r0 | 32;
    L_0x004d:
        r1 = r5.i;
        com.google.d6.b(r2, r1);
        r1 = r3 & 64;
        r4 = 64;
        if (r1 != r4) goto L_0x005a;
    L_0x0058:
        r0 = r0 | 64;
    L_0x005a:
        r1 = r5.l;
        com.google.d6.d(r2, r1);
        r1 = r3 & 128;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 != r3) goto L_0x008b;
    L_0x0065:
        r0 = r0 | 128;
        r1 = r0;
    L_0x0068:
        r0 = r5.h;	 Catch:{ NullPointerException -> 0x0087 }
        if (r0 != 0) goto L_0x0075;
    L_0x006c:
        r0 = r5.g;	 Catch:{ NullPointerException -> 0x0089 }
        com.google.d6.a(r2, r0);	 Catch:{ NullPointerException -> 0x0089 }
        r0 = com.google.dy.b;	 Catch:{ NullPointerException -> 0x0089 }
        if (r0 == 0) goto L_0x0080;
    L_0x0075:
        r0 = r5.h;	 Catch:{ NullPointerException -> 0x0089 }
        r0 = r0.c();	 Catch:{ NullPointerException -> 0x0089 }
        r0 = (com.google.eJ) r0;	 Catch:{ NullPointerException -> 0x0089 }
        com.google.d6.a(r2, r0);	 Catch:{ NullPointerException -> 0x0089 }
    L_0x0080:
        com.google.d6.a(r2, r1);
        r5.b();
        return r2;
    L_0x0087:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0089 }
    L_0x0089:
        r0 = move-exception;
        throw r0;
    L_0x008b:
        r1 = r0;
        goto L_0x0068;
    L_0x008d:
        r0 = r1;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aH.j():com.google.d6");
    }

    public Object clone() {
        return d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.aH a(com.google.I r5, com.google.aC r6) {
        /*
        r4_this = this;
        r2 = 0;
        r0 = com.google.d6.j;	 Catch:{ gc -> 0x000f }
        r0 = r0.a(r5, r6);	 Catch:{ gc -> 0x000f }
        r0 = (com.google.d6) r0;	 Catch:{ gc -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ gc -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.c();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.d6) r0;	 Catch:{ all -> 0x0026 }
        throw r1;	 Catch:{ all -> 0x0018 }
    L_0x0018:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001c:
        if (r1 == 0) goto L_0x0021;
    L_0x001e:
        r4.a(r1);	 Catch:{ gc -> 0x0022 }
    L_0x0021:
        throw r0;
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aH.a(com.google.I, com.google.aC):com.google.aH");
    }

    public ax a() {
        return d();
    }
}
