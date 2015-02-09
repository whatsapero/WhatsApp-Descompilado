package com.google;

final class c4 {
    private bm a;
    private int b;
    private int c;
    private bm d;
    private bm e;
    private C f;
    private bm g;
    private int h;
    private int i;

    int b() {
        return this.h;
    }

    int e() {
        return this.c;
    }

    c4 a(int i, int i2, boolean z) {
        bm bmVar;
        int b;
        bm bmVar2;
        int i3 = fZ.a;
        bm bmVar3 = this.e;
        bm bmVar4 = this.g;
        bm bmVar5 = this.d;
        bm bmVar6 = this.a;
        if (i > 0) {
            if (z) {
                bmVar = this.e;
            } else {
                bmVar = this.d;
            }
            b = ((int) bmVar.b()) - i;
            if (b < 0) {
                b = 0;
            }
            bmVar2 = new bm(bmVar.a(), (float) b);
            if (!z) {
                bmVar = bmVar3;
            } else if (i3 != 0) {
                bmVar = bmVar2;
            }
            bmVar5 = bmVar2;
            bmVar2 = bmVar;
        } else {
            bmVar2 = bmVar3;
        }
        if (i2 > 0) {
            bmVar = z ? this.g : this.a;
            b = ((int) bmVar.b()) + i2;
            if (b >= this.f.f()) {
                b = this.f.f() - 1;
            }
            bmVar3 = new bm(bmVar.a(), (float) b);
            if (!z) {
                bmVar = bmVar4;
            } else if (i3 != 0) {
                bmVar = bmVar3;
            } else {
                bmVar4 = bmVar6;
            }
            bmVar4 = bmVar3;
            bmVar3 = bmVar;
        } else {
            bmVar3 = bmVar4;
            bmVar4 = bmVar6;
        }
        f();
        return new c4(this.f, bmVar2, bmVar3, bmVar5, bmVar4);
    }

    c4(c4 c4Var) {
        a(c4Var.f, c4Var.e, c4Var.g, c4Var.d, c4Var.a);
    }

    int d() {
        return this.i;
    }

    bm h() {
        return this.e;
    }

    bm a() {
        return this.a;
    }

    int g() {
        return this.b;
    }

    c4(C c, bm bmVar, bm bmVar2, bm bmVar3, bm bmVar4) {
        if (!(bmVar == null && bmVar3 == null) && (!(bmVar2 == null && bmVar4 == null) && ((bmVar == null || bmVar2 != null) && (bmVar3 == null || bmVar4 != null)))) {
            a(c, bmVar, bmVar2, bmVar3, bmVar4);
            return;
        }
        throw gv.a();
    }

    private void a(C c, bm bmVar, bm bmVar2, bm bmVar3, bm bmVar4) {
        this.f = c;
        this.e = bmVar;
        this.g = bmVar2;
        this.d = bmVar3;
        this.a = bmVar4;
        f();
    }

    static c4 a(c4 c4Var, c4 c4Var2) {
        if (c4Var == null) {
            return c4Var2;
        }
        return c4Var2 == null ? c4Var : new c4(c4Var.f, c4Var.e, c4Var.g, c4Var2.d, c4Var2.a);
    }

    bm i() {
        return this.g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
        r3_this = this;
        r2 = 0;
        r0 = r3.e;
        if (r0 != 0) goto L_0x0023;
    L_0x0005:
        r0 = new com.google.bm;
        r1 = r3.d;
        r1 = r1.b();
        r0.<init>(r2, r1);
        r3.e = r0;
        r0 = new com.google.bm;
        r1 = r3.a;
        r1 = r1.b();
        r0.<init>(r2, r1);
        r3.g = r0;
        r0 = com.google.fZ.a;
        if (r0 == 0) goto L_0x0053;
    L_0x0023:
        r0 = r3.d;
        if (r0 != 0) goto L_0x0053;
    L_0x0027:
        r0 = new com.google.bm;
        r1 = r3.f;
        r1 = r1.b();
        r1 = r1 + -1;
        r1 = (float) r1;
        r2 = r3.e;
        r2 = r2.b();
        r0.<init>(r1, r2);
        r3.d = r0;
        r0 = new com.google.bm;
        r1 = r3.f;
        r1 = r1.b();
        r1 = r1 + -1;
        r1 = (float) r1;
        r2 = r3.g;
        r2 = r2.b();
        r0.<init>(r1, r2);
        r3.a = r0;
    L_0x0053:
        r0 = r3.e;
        r0 = r0.a();
        r1 = r3.g;
        r1 = r1.a();
        r0 = java.lang.Math.min(r0, r1);
        r0 = (int) r0;
        r3.b = r0;
        r0 = r3.d;
        r0 = r0.a();
        r1 = r3.a;
        r1 = r1.a();
        r0 = java.lang.Math.max(r0, r1);
        r0 = (int) r0;
        r3.i = r0;
        r0 = r3.e;
        r0 = r0.b();
        r1 = r3.d;
        r1 = r1.b();
        r0 = java.lang.Math.min(r0, r1);
        r0 = (int) r0;
        r3.c = r0;
        r0 = r3.g;
        r0 = r0.b();
        r1 = r3.a;
        r1 = r1.b();
        r0 = java.lang.Math.max(r0, r1);
        r0 = (int) r0;
        r3.h = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c4.f():void");
    }

    bm c() {
        return this.d;
    }
}
