package com.google;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class cn {
    private static final String[] z;
    private final ad a;
    private final bR[] b;
    private final dW[] c;
    private dj d;
    private final cn[] e;
    private final M[] f;
    private final aa[] g;
    private final cn[] h;

    static {
        int i;
        int i2;
        String[] strArr = new String[9];
        char[] toCharArray = "LV\u0006sflV\u0018uam@Vfi{@\u0013r(|\\VPadV2s{kA\u001ff|gAXt}a_\u0012Pzg^^?(l\\\u00181|(^\u0017bk`\u0013\u0002~g{VVza{G\u0013r(a]Vb`m\u00130\u007fdmw\u0013ekzZ\u0006bgzc\u0004y|g\u001d".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 8;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "LV\u0006sflV\u0018uam@Vfi{@\u0013r(|\\VPadV2s{kA\u001ff|gAXt}a_\u0012Pzg^^?(l\\\u00181|(^\u0017bk`\u0013\u0002~g{VVza{G\u0013r(a]Vb`m\u00130\u007fdmw\u0013ekzZ\u0006bgzc\u0004y|g\u001d".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 8;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "A]\u0000wdaWVf}j_\u001fu(lV\u0006sflV\u0018uq(Z\u0018rmp\u001d".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 8;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "NR\u001fzml\u0013\u0002y(xR\u0004em(C\u0004y|gP\u0019z(jF\u0010pmz\u0013\u0012s{kA\u001ff|gAVpgz\u0013\u0011sfmA\u0017bml\u0013\u0015ylm\u001d".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 8;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "*\u001d".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 8;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "NR\u001fzml\u0013\u0002y(xR\u0004em(C\u0004y|gP\u0019z(jF\u0010pmz\u0013\u0012s{kA\u001ff|gAVpgz\u0013\u0011sfmA\u0017bml\u0013\u0015ylm\u001d".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 8;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "A]\u0000wdaWVsejV\u0012rml\u0013\u0012s{kA\u001ff|gAVpgz\u0013T".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 8;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "A`9;00\u0006O;9".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 8;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "[G\u0017xliA\u00126mfP\u0019rafTV_[G\u001eN.=1\u001eG6fgGVe}xC\u0019d|mWVtq(y [&".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            char c3 = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 8;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[length] = (char) (i2 ^ c3);
        }
        strArr[8] = new String(cArr).intern();
        z = strArr;
    }

    static ad a(cn cnVar) {
        return cnVar.a;
    }

    private void f() {
        int i = 0;
        for (M m : this.f) {
            M.a(m);
        }
        for (bR bRVar : this.b) {
            bR.a(bRVar);
        }
        dW[] dWVarArr = this.c;
        int length = dWVarArr.length;
        while (i < length) {
            dW.b(dWVarArr[i]);
            i++;
        }
    }

    public static void a(String[] strArr, cn[] cnVarArr, gI gIVar) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strArr) {
            stringBuilder.append(str);
        }
        try {
            byte[] bytes = stringBuilder.toString().getBytes(z[7]);
            try {
                dj a = dj.a(bytes);
                try {
                    cn a2 = a(a, cnVarArr);
                    aC a3 = gIVar.a(a2);
                    if (a3 != null) {
                        try {
                            a2.a(dj.a(bytes, a3));
                        } catch (Throwable e) {
                            throw new IllegalArgumentException(z[3], e);
                        }
                    }
                } catch (Throwable e2) {
                    throw new IllegalArgumentException(z[6] + a.f() + z[4], e2);
                }
            } catch (Throwable e22) {
                throw new IllegalArgumentException(z[5], e22);
            }
        } catch (Throwable e222) {
            throw new RuntimeException(z[8], e222);
        }
    }

    private cn(dj djVar, cn[] cnVarArr, ad adVar) {
        this.a = adVar;
        this.d = djVar;
        this.e = (cn[]) cnVarArr.clone();
        this.h = new cn[djVar.n()];
        int i = 0;
        while (i < djVar.n()) {
            int l = djVar.l(i);
            try {
                if (l >= 0) {
                    if (l < this.e.length) {
                        this.h[i] = this.e[djVar.l(i)];
                        i++;
                    }
                }
                throw new fc(this, z[2], null);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        adVar.a(e(), this);
        this.f = new M[djVar.h()];
        int i2 = 0;
        while (i2 < djVar.h()) {
            try {
                this.f[i2] = new M(djVar.g(i2), this, null, i2, null);
                i2++;
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        this.g = new aa[djVar.g()];
        i2 = 0;
        while (i2 < djVar.g()) {
            try {
                this.g[i2] = new aa(djVar.k(i2), this, null, i2, null);
                i2++;
            } catch (RuntimeException e22) {
                throw e22;
            }
        }
        this.b = new bR[djVar.b()];
        i = 0;
        while (i < djVar.b()) {
            try {
                this.b[i] = new bR(djVar.d(i), this, i, null);
                i++;
            } catch (RuntimeException e222) {
                throw e222;
            }
        }
        this.c = new dW[djVar.u()];
        i2 = 0;
        while (i2 < djVar.u()) {
            try {
                this.c[i2] = new dW(djVar.i(i2), this, null, i2, true, null);
                i2++;
            } catch (RuntimeException e2222) {
                throw e2222;
            }
        }
    }

    public dj d() {
        return this.d;
    }

    private void a(dj djVar) {
        int i = 0;
        this.d = djVar;
        int i2 = 0;
        while (i2 < this.f.length) {
            try {
                M.a(this.f[i2], djVar.g(i2));
                i2++;
            } catch (RuntimeException e) {
                throw e;
            }
        }
        i2 = 0;
        while (i2 < this.g.length) {
            try {
                aa.a(this.g[i2], djVar.k(i2));
                i2++;
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        i2 = 0;
        while (i2 < this.b.length) {
            try {
                bR.a(this.b[i2], djVar.d(i2));
                i2++;
            } catch (RuntimeException e22) {
                throw e22;
            }
        }
        while (i < this.c.length) {
            try {
                dW.a(this.c[i], djVar.i(i));
                i++;
            } catch (RuntimeException e222) {
                throw e222;
            }
        }
    }

    public String a() {
        return this.d.f();
    }

    public String e() {
        return this.d.l();
    }

    public List b() {
        return Collections.unmodifiableList(Arrays.asList(this.h));
    }

    public static cn a(dj djVar, cn[] cnVarArr) {
        int i = 0;
        cn cnVar = new cn(djVar, cnVarArr, new ad(cnVarArr));
        try {
            if (cnVarArr.length != djVar.e()) {
                throw new fc(cnVar, z[1], null);
            }
            while (i < djVar.e()) {
                try {
                    if (cnVarArr[i].a().equals(djVar.f(i))) {
                        i++;
                    } else {
                        throw new fc(cnVar, z[0], null);
                    }
                } catch (RuntimeException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
            cnVar.f();
            return cnVar;
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    public List c() {
        return Collections.unmodifiableList(Arrays.asList(this.f));
    }
}
