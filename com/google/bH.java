package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class bh implements dh {
    private static final String[] z;
    private final String a;
    private M b;
    private final int c;
    private final bR d;
    private dG e;
    private M f;
    private final cn g;

    static {
        int i;
        String[] strArr = new String[2];
        char[] toCharArray = "23*\u000f\t~|7\\H0~&\u000fZqt&\\]ic&R".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i2 = 0; length > i2; i2++) {
            char c = cArr[i2];
            switch (i2 % 5) {
                case PBE.MD5 /*0*/:
                    i = 16;
                    break;
                case ay.f /*1*/:
                    i = 19;
                    break;
                case ay.n /*2*/:
                    i = 67;
                    break;
                case ay.p /*3*/:
                    i = 124;
                    break;
                default:
                    i = 41;
                    break;
            }
            cArr[i2] = (char) (i ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "23*\u000f\t~|7\\H0~&\u000fZqt&\\]ic&R".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i = 16;
                    break;
                case ay.f /*1*/:
                    i = 19;
                    break;
                case ay.n /*2*/:
                    i = 67;
                    break;
                case ay.p /*3*/:
                    i = 124;
                    break;
                default:
                    i = 41;
                    break;
            }
            cArr[length] = (char) (i ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    static void a(bh bhVar, dG dGVar) {
        bhVar.a(dGVar);
    }

    private void a(dG dGVar) {
        this.e = dGVar;
    }

    private void a() {
        dh a = cn.a(this.g).a(this.e.h(), this, fo.TYPES_ONLY);
        if (a instanceof M) {
            this.f = (M) a;
            a = cn.a(this.g).a(this.e.n(), this, fo.TYPES_ONLY);
            if (a instanceof M) {
                this.b = (M) a;
                return;
            }
            throw new fc((dh) this, '\"' + this.e.n() + z[1], null);
        }
        throw new fc((dh) this, '\"' + this.e.h() + z[0], null);
    }

    bh(dG dGVar, cn cnVar, bR bRVar, int i, bA bAVar) {
        this(dGVar, cnVar, bRVar, i);
    }

    private bh(dG dGVar, cn cnVar, bR bRVar, int i) {
        this.c = i;
        this.e = dGVar;
        this.g = cnVar;
        this.d = bRVar;
        this.a = bRVar.b() + '.' + dGVar.a();
        cn.a(cnVar).d(this);
    }

    static void a(bh bhVar) {
        bhVar.a();
    }

    public cn a() {
        return this.g;
    }

    public dG b() {
        return this.e;
    }

    public String c() {
        return this.e.a();
    }

    public String b() {
        return this.a;
    }

    public eb d() {
        return b();
    }
}
