package com.google;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class aa implements dh, gJ {
    private static final String z;
    private final M a;
    private bv[] b;
    private d4 c;
    private final int d;
    private final cn e;
    private final String f;

    static {
        char[] toCharArray = "m\u0013]\u0015_\b\u0010]\u000bX\b\u001eG\u0016XI\u0014FXM\\]D\u001dM[\t\b\u0017BM]^\u0019@]\u0018\u0006".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 40;
                    break;
                case ay.f /*1*/:
                    i2 = 125;
                    break;
                case ay.n /*2*/:
                    i2 = 40;
                    break;
                case ay.p /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    static void a(aa aaVar, d4 d4Var) {
        aaVar.a(d4Var);
    }

    public eb d() {
        return b();
    }

    public List a() {
        return Collections.unmodifiableList(Arrays.asList(this.b));
    }

    public bv a(String str) {
        dh a = cn.a(this.e).a(this.f + '.' + str);
        return (a == null || !(a instanceof bv)) ? null : (bv) a;
    }

    public bZ a(int i) {
        return a(i);
    }

    aa(d4 d4Var, cn cnVar, M m, int i, bA bAVar) {
        this(d4Var, cnVar, m, i);
    }

    public String b() {
        return this.f;
    }

    public cn a() {
        return this.e;
    }

    private aa(d4 d4Var, cn cnVar, M m, int i) {
        this.d = i;
        this.c = d4Var;
        this.f = bP.b(cnVar, m, d4Var.b());
        this.e = cnVar;
        this.a = m;
        if (d4Var.e() == 0) {
            throw new fc((dh) this, z, null);
        }
        this.b = new bv[d4Var.e()];
        for (int i2 = 0; i2 < d4Var.e(); i2++) {
            this.b[i2] = new bv(d4Var.b(i2), cnVar, this, i2, null);
        }
        cn.a(cnVar).d(this);
    }

    private void a(d4 d4Var) {
        this.c = d4Var;
        for (int i = 0; i < this.b.length; i++) {
            bv.a(this.b[i], d4Var.b(i));
        }
    }

    public d4 b() {
        return this.c;
    }

    public String c() {
        return this.c.b();
    }

    public bv a(int i) {
        return (bv) ad.b(cn.a(this.e)).get(new d3(this, i));
    }
}
