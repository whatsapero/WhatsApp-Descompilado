package org.whispersystems.libaxolotl;

import android.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ecc.a;
import org.whispersystems.libaxolotl.ecc.d;
import org.whispersystems.libaxolotl.ecc.f;

public class an {
    private static final String f;
    private static final String[] z;
    private final long a;
    private final int b;
    private final u c;
    private final bk d;
    private final bs e;
    private final aB g;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.whispersystems.libaxolotl.aK b(org.whispersystems.libaxolotl.ag r5, org.whispersystems.libaxolotl.av r6) {
        /*
        r4_this = this;
        r0 = r6.a();
        r1 = r6.f();
        r1 = r1.b();
        r0 = r5.a(r0, r1);
        if (r0 == 0) goto L_0x0021;
    L_0x0012:
        r0 = f;
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        android.util.Log.w(r0, r1);
        r0 = org.whispersystems.libaxolotl.aK.d();
    L_0x0020:
        return r0;
    L_0x0021:
        r0 = r4.c;
        r1 = r6.e();
        r0 = r0.a(r1);
        r0 = r0.b();
        r1 = org.whispersystems.libaxolotl.ac.f();
        r2 = r6.f();
        r2 = r1.a(r2);
        r3 = r6.g();
        r2 = r2.a(r3);
        r3 = r4.g;
        r3 = r3.a();
        r2 = r2.a(r3);
        r2 = r2.b(r0);
        r2.a(r0);
        r0 = r6.c();
        r0 = r0.b();
        if (r0 == 0) goto L_0x0081;
    L_0x005e:
        r2 = r4.d;
        r0 = r6.c();
        r0 = r0.c();
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r0 = r2.c(r0);
        r0 = r0.b();
        r0 = org.whispersystems.libaxolotl.aK.a(r0);
        r1.a(r0);
        r0 = org.whispersystems.libaxolotl.Z.a;
        if (r0 == 0) goto L_0x0088;
    L_0x0081:
        r0 = org.whispersystems.libaxolotl.aK.d();
        r1.a(r0);
    L_0x0088:
        r0 = r5.b();
        if (r0 != 0) goto L_0x0091;
    L_0x008e:
        r5.c();
    L_0x0091:
        r0 = r5.a();
        r2 = r6.a();
        r1 = r1.a();
        org.whispersystems.libaxolotl.ak.a(r0, r2, r1);
        r0 = r5.a();
        r1 = r4.g;
        r1 = r1.b();
        r0.a(r1);
        r0 = r5.a();
        r1 = r6.d();
        r0.c(r1);
        r0 = r5.a();
        r1 = r6.f();
        r1 = r1.b();
        r0.a(r1);
        r0 = r6.c();
        r0 = r0.b();
        if (r0 == 0) goto L_0x00e9;
    L_0x00d1:
        r0 = r6.c();
        r0 = r0.c();
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r1 = org.whispersystems.libaxolotl.a9.a;
        if (r0 == r1) goto L_0x00e9;
    L_0x00e3:
        r0 = r6.c();
        goto L_0x0020;
    L_0x00e9:
        r0 = org.whispersystems.libaxolotl.aK.d();
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.an.b(org.whispersystems.libaxolotl.ag, org.whispersystems.libaxolotl.av):org.whispersystems.libaxolotl.aK");
    }

    static {
        String[] strArr = new String[6];
        String str = "YRNM].V\u0005I]oS\u0010\u001bKkC\u001cK\u0018o\u0017\u001a^K}^\u0006U\u0018hX\u001b\u001bLf^\u001a\u001bn=\u0017\u0004^K}V\u000e^\u0014.[\fOLgY\u000e\u001bZ{Y\rW]j\u0017\u0004^K}V\u000e^\u0018hV\u0005W\u0018z_\u001bTMi_G\u0015\u0016";
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
                        i3 = 14;
                        break;
                    case ay.f /*1*/:
                        i3 = 55;
                        break;
                    case ay.n /*2*/:
                        i3 = 105;
                        break;
                    case ay.p /*3*/:
                        i3 = 59;
                        break;
                    default:
                        i3 = 56;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "X\u0005IV]}D\b\\].E\fJMgE\fH\u0018aY\f\u001bLgZ\f\u001bH|R\u0002^A.^\r\u001a";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "[Y\u0002UWyYIM]|D\u0000TV4\u0017";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "GY\u001fZTgSIHQiY\bOM|RITV.S\fMQmRIP]w\u0016";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "LX\u001dS\u0018}^\u000eU]j\u0017\bU\\.B\u0007HQiY\f_\u0018~E\fP]wDIZJk\u0017\bYKkY\u001d\u001a";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    f = an.class.getSimpleName();
                default:
                    strArr2[i] = str;
                    str = "YRNM].V\u0005I]oS\u0010\u001bH|X\n^K}R\r\u001bLfRIKJk\\\fB\u0018~V\u001bO\u0018aQIOPgDIm\n.D\fHKgX\u0007\u0017\u0018bR\u001dOQ`PIYM`S\u0005^\\.Z\fHKoP\f\u001b^o[\u0005\u001bLfE\u0006N_f\u0019G\u0015";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    org.whispersystems.libaxolotl.aK c(org.whispersystems.libaxolotl.ag r7, org.whispersystems.libaxolotl.av r8) {
        /*
        r6_this = this;
        r1 = org.whispersystems.libaxolotl.Z.a;
        r2 = r8.a();
        r3 = r8.g();
        r0 = r6.g;
        r4 = r6.a;
        r0 = r0.b(r4, r3);
        if (r0 != 0) goto L_0x001a;
    L_0x0014:
        r0 = new org.whispersystems.libaxolotl.bA;
        r0.<init>();
        throw r0;
    L_0x001a:
        switch(r2) {
            case 2: goto L_0x0039;
            case 3: goto L_0x003f;
            default: goto L_0x001d;
        };
    L_0x001d:
        r0 = new java.lang.AssertionError;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0039:
        r0 = r6.a(r7, r8);
        if (r1 == 0) goto L_0x0045;
    L_0x003f:
        r0 = r6.b(r7, r8);
        if (r1 != 0) goto L_0x001d;
    L_0x0045:
        r1 = r6.g;
        r4 = r6.a;
        r1.a(r4, r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.an.c(org.whispersystems.libaxolotl.ag, org.whispersystems.libaxolotl.av):org.whispersystems.libaxolotl.aK");
    }

    public void a(bO bOVar) {
        boolean z = false;
        int i = Z.a;
        synchronized (a1.b) {
            if (!this.g.b(this.a, bOVar.f())) {
                throw new bA();
            } else if (bOVar.g() != null && !d.a(bOVar.f().a(), bOVar.g().b(), bOVar.e())) {
                throw new Z(z[4]);
            } else if (bOVar.g() == null && bOVar.c() == null) {
                throw new Z(z[5]);
            } else {
                boolean z2;
                f g;
                aK a;
                int i2;
                if (bOVar.g() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ag a2 = this.e.a(this.a, this.b);
                a a3 = d.a();
                if (z2) {
                    g = bOVar.g();
                } else {
                    g = bOVar.c();
                }
                aK b = aK.b(bOVar.c());
                if (b.b()) {
                    a = aK.a(Integer.valueOf(bOVar.a()));
                } else {
                    a = aK.d();
                }
                ao g2 = bN.g();
                ao a4 = g2.a(a3).a(this.g.a()).a(bOVar.f()).b(g).a(g);
                if (!z2) {
                    b = aK.d();
                }
                a4.a(b);
                if (!a2.b()) {
                    a2.c();
                }
                bn a5 = a2.a();
                if (z2) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                ak.a(a5, i2, g2.a());
                a2.a().a(a, bOVar.d(), a3.b());
                a2.a().a(this.g.b());
                a2.a().c(bOVar.b());
                a2.a().a(a3.b().b());
                this.e.a(this.a, this.b, a2);
                this.g.a(this.a, bOVar.f());
            }
        }
        if (i != 0) {
            if (!bD.m) {
                z = true;
            }
            bD.m = z;
        }
    }

    private aK a(ag agVar, av avVar) {
        if (!avVar.c().b()) {
            throw new a7(z[2]);
        } else if (this.d.a(((Integer) avVar.c().c()).intValue()) || !this.e.b(this.a, this.b)) {
            a b = this.d.c(((Integer) avVar.c().c()).intValue()).b();
            ab f = ac.f();
            f.a(this.g.a()).b(b).a(b).a(aK.d()).a(avVar.g()).a(avVar.f());
            if (!agVar.b()) {
                agVar.c();
            }
            ak.a(agVar.a(), avVar.a(), f.a());
            agVar.a().a(this.g.b());
            agVar.a().c(avVar.d());
            agVar.a().a(avVar.f().b());
            return ((Integer) avVar.c().c()).intValue() != a9.a ? avVar.c() : aK.d();
        } else {
            Log.w(f, z[1]);
            return aK.d();
        }
    }

    public an(bs bsVar, bk bkVar, u uVar, aB aBVar, long j, int i) {
        this.e = bsVar;
        this.d = bkVar;
        this.c = uVar;
        this.g = aBVar;
        this.a = j;
        this.b = i;
    }
}
