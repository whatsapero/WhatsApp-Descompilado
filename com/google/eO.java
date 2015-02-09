package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class eo extends em implements gx {
    private static final String z;
    private final co b;

    static {
        char[] toCharArray = "j\u0019w'g[\tj1)M\u0018q:gW\u0002>2(LQ\u007ft#W\u0017x15[\u001fjt*[\u0002m5 [Qj-7[_>t\u0017R\u0014\u007f'\"\u001e\u001c\u007f?\"\u001e\u0002k&\"\u001e\u0005v53\u001e\bq!g_\u0003{t)Q\u0005>'2N\u0001l14M\u0018p3g_\u001fgt [\u001f{&.]\u0002> >N\u0014>#&L\u001fw: M_".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 62;
                    break;
                case ay.f /*1*/:
                    i2 = 113;
                    break;
                case ay.n /*2*/:
                    i2 = 30;
                    break;
                case ay.p /*3*/:
                    i2 = 84;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void a() {
        this.b.h();
    }

    protected bC d() {
        return new bC(this, false, null);
    }

    protected boolean a(I i, aC aCVar, int i2) {
        return em.a(this.b, c(), i, aCVar, i2);
    }

    public final Object a(aq aqVar, int i) {
        a(aqVar);
        return this.b.a(aq.a(aqVar), i);
    }

    public final int c(aq aqVar) {
        a(aqVar);
        return this.b.a(aq.a(aqVar));
    }

    protected int e() {
        return this.b.b();
    }

    protected int a() {
        return this.b.j();
    }

    private void a(aq aqVar) {
        try {
            if (aqVar.a() != c()) {
                throw new IllegalArgumentException(z);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public final Object d(aq aqVar) {
        a(aqVar);
        Object b = this.b.b(aq.a(aqVar));
        if (b == null) {
            try {
                b = aq.c(aqVar);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return b;
    }

    protected bC b() {
        return new bC(this, true, null);
    }

    protected boolean c() {
        return this.b.c();
    }

    static co a(eo eoVar) {
        return eoVar.b;
    }

    protected eo() {
        this.b = co.i();
    }

    protected eo(b9 b9Var) {
        this.b = b9.a(b9Var);
    }

    public final boolean b(aq aqVar) {
        a(aqVar);
        return this.b.c(aq.a(aqVar));
    }
}
