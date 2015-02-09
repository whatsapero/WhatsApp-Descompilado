package org.whispersystems.libaxolotl;

import android.util.Log;
import com.google.g2;
import java.util.Iterator;
import java.util.LinkedList;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ecc.a;
import org.whispersystems.libaxolotl.ecc.d;
import org.whispersystems.libaxolotl.ecc.f;

public class bn {
    private static final String[] z;
    private a6 a;

    static {
        String[] strArr = new String[4];
        String str = "LoQ>Updp(_pxF\u001b\u000e";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 31;
                        break;
                    case ay.f /*1*/:
                        i3 = 10;
                        break;
                    case ay.n /*2*/:
                        i3 = 34;
                        break;
                    case ay.p /*3*/:
                        i3 = 77;
                        break;
                    default:
                        i3 = 60;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "^Oq";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "WgC.oWK\u0010x\n";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "LoQ>Updp(_pxF\u001b\u000e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public bn(a6 a6Var) {
        this.a = a6Var;
    }

    public void a(f fVar, aY aYVar) {
        am c = c(fVar);
        aj ajVar = (aj) c.a();
        this.a = this.a.w().a(((Integer) c.b()).intValue(), ajVar.q().a(a5.k().a(g2.a(aYVar.b().getEncoded())).b(g2.a(aYVar.a().getEncoded())).a(aYVar.c()).c(g2.a(aYVar.d().getIV())).g()).d()).h();
    }

    public void j() {
        this.a = this.a.w().m().h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.libaxolotl.aL n() {
        /*
        r5_this = this;
        r0 = r5.a;	 Catch:{ Z -> 0x0049 }
        r0 = r0.y();	 Catch:{ Z -> 0x0049 }
        r0 = r0.j();	 Catch:{ Z -> 0x0049 }
        if (r0 == 0) goto L_0x0022;
    L_0x000c:
        r0 = r5.a;	 Catch:{ Z -> 0x0049 }
        r0 = r0.y();	 Catch:{ Z -> 0x0049 }
        r0 = r0.i();	 Catch:{ Z -> 0x0049 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Z -> 0x0049 }
        r0 = org.whispersystems.libaxolotl.aK.a(r0);	 Catch:{ Z -> 0x0049 }
        r1 = org.whispersystems.libaxolotl.a6.B;	 Catch:{ Z -> 0x0049 }
        if (r1 == 0) goto L_0x0026;
    L_0x0022:
        r0 = org.whispersystems.libaxolotl.aK.d();	 Catch:{ Z -> 0x0049 }
    L_0x0026:
        r1 = new org.whispersystems.libaxolotl.aL;	 Catch:{ Z -> 0x0049 }
        r2 = r5.a;	 Catch:{ Z -> 0x0049 }
        r2 = r2.y();	 Catch:{ Z -> 0x0049 }
        r2 = r2.e();	 Catch:{ Z -> 0x0049 }
        r3 = r5.a;	 Catch:{ Z -> 0x0049 }
        r3 = r3.y();	 Catch:{ Z -> 0x0049 }
        r3 = r3.c();	 Catch:{ Z -> 0x0049 }
        r3 = r3.b();	 Catch:{ Z -> 0x0049 }
        r4 = 0;
        r3 = org.whispersystems.libaxolotl.ecc.d.a(r3, r4);	 Catch:{ Z -> 0x0049 }
        r1.<init>(r0, r2, r3);	 Catch:{ Z -> 0x0049 }
        return r1;
    L_0x0049:
        r0 = move-exception;
        r1 = new java.lang.AssertionError;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.bn.n():org.whispersystems.libaxolotl.aL");
    }

    public void d(int i) {
        this.a = this.a.w().e(i).h();
    }

    public boolean a(f fVar, int i) {
        boolean z = a6.B;
        aj ajVar = (aj) c(fVar).a();
        if (ajVar == null) {
            return false;
        }
        for (a5 a5Var : ajVar.l()) {
            if (a5Var.h() != i) {
                if (z) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public void a(f fVar, z zVar) {
        this.a = this.a.w().c(aj.e().b(aS.l().a(g2.a(zVar.a())).a(zVar.b()).e()).a(g2.a(fVar.b())).d()).h();
        if (this.a.I().size() > 5) {
            this.a = this.a.w().a(0).h();
        }
    }

    public void a(aK aKVar, int i, f fVar) {
        U a = at.o().b(i).a(g2.a(fVar.b()));
        if (aKVar.b()) {
            a.a(((Integer) aKVar.c()).intValue());
        }
        this.a = this.a.w().a(a.e()).h();
    }

    private am c(f fVar) {
        boolean z = a6.B;
        int i = 0;
        for (aj ajVar : this.a.I()) {
            try {
                if (d.a(ajVar.d().b(), 0).equals(fVar)) {
                    return new am(ajVar, Integer.valueOf(i));
                }
            } catch (Throwable e) {
                Log.w(z[1], e);
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return null;
    }

    public b2 i() {
        try {
            return new b2(this.a.E().b(), 0);
        } catch (Z e) {
            throw new AssertionError(e);
        }
    }

    public void b(int i) {
        this.a = this.a.w().d(i).h();
    }

    public void b(f fVar, z zVar) {
        am c = c(fVar);
        aj ajVar = (aj) c.a();
        this.a = this.a.w().a(((Integer) c.b()).intValue(), ajVar.q().b(aS.l().a(g2.a(zVar.a())).a(zVar.b()).e()).d()).h();
    }

    public void a(a aVar, z zVar) {
        this.a = this.a.w().b(aj.e().a(g2.a(aVar.b().b())).b(g2.a(aVar.a().b())).b(aS.l().a(g2.a(zVar.a())).a(zVar.b()).e()).d()).h();
    }

    public void a(byte[] bArr) {
        this.a = this.a.w().b(g2.a(bArr)).h();
    }

    public byte[] k() {
        return this.a.u().b();
    }

    public void a(aX aXVar) {
        this.a = this.a.w().d(g2.a(aXVar.a())).h();
    }

    public aY b(f fVar, int i) {
        am c = c(fVar);
        aj ajVar = (aj) c.a();
        if (ajVar == null) {
            return null;
        }
        aY aYVar;
        Iterable linkedList = new LinkedList(ajVar.l());
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            a5 a5Var = (a5) it.next();
            if (a5Var.h() == i) {
                aY aYVar2 = new aY(new SecretKeySpec(a5Var.q().b(), z[2]), new SecretKeySpec(a5Var.n().b(), z[3]), new IvParameterSpec(a5Var.g().b()), a5Var.h());
                it.remove();
                aYVar = aYVar2;
                break;
            }
        }
        aYVar = null;
        this.a = this.a.w().a(((Integer) c.b()).intValue(), ajVar.q().g().a(linkedList).d()).h();
        return aYVar;
    }

    public boolean l() {
        return this.a.K();
    }

    public z o() {
        aS m = this.a.D().m();
        return new z(aZ.a(b()), m.g().b(), m.e());
    }

    public int p() {
        return this.a.r();
    }

    public boolean b(f fVar) {
        return c(fVar) != null;
    }

    public bn() {
        this.a = a6.k().h();
    }

    public void a(int i) {
        this.a = this.a.w().c(i).h();
    }

    public boolean c() {
        return this.a.e();
    }

    public b2 d() {
        try {
            return !this.a.v() ? null : new b2(this.a.J().b(), 0);
        } catch (Throwable e) {
            Log.w(z[0], e);
            return null;
        }
    }

    public void b(b2 b2Var) {
        this.a = this.a.w().c(g2.a(b2Var.b())).h();
    }

    public void a(b2 b2Var) {
        this.a = this.a.w().a(g2.a(b2Var.b())).h();
    }

    public z a(f fVar) {
        aj ajVar = (aj) c(fVar).a();
        return ajVar == null ? null : new z(aZ.a(b()), ajVar.m().g().b(), ajVar.m().e());
    }

    public a6 e() {
        return this.a;
    }

    public a f() {
        return new a(g(), d.a(this.a.D().a().b()));
    }

    public void a(z zVar) {
        this.a = this.a.w().b(this.a.D().q().b(aS.l().a(g2.a(zVar.a())).a(zVar.b()).e()).d()).h();
    }

    public aX m() {
        return new aX(aZ.a(b()), this.a.o().b());
    }

    public bn(bn bnVar) {
        this.a = bnVar.a.w().h();
    }

    public int a() {
        return this.a.H();
    }

    public void c(int i) {
        this.a = this.a.w().b(i).h();
    }

    public f g() {
        try {
            return d.a(this.a.D().d().b(), 0);
        } catch (Z e) {
            throw new AssertionError(e);
        }
    }

    public int b() {
        int F = this.a.F();
        return F == 0 ? 2 : F;
    }

    public int h() {
        return this.a.h();
    }
}
