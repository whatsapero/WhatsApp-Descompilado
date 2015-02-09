package com.google;

public final class bv implements dh, bZ {
    private final int a;
    private final cn b;
    private final aa c;
    private dr d;
    private final String e;

    public eb d() {
        return b();
    }

    bv(dr drVar, cn cnVar, aa aaVar, int i, bA bAVar) {
        this(drVar, cnVar, aaVar, i);
    }

    public int c() {
        return this.a;
    }

    public int getNumber() {
        return this.d.m();
    }

    static void a(bv bvVar, dr drVar) {
        bvVar.a(drVar);
    }

    private void a(dr drVar) {
        this.d = drVar;
    }

    private bv(dr drVar, cn cnVar, aa aaVar, int i) {
        this.a = i;
        this.d = drVar;
        this.b = cnVar;
        this.c = aaVar;
        this.e = aaVar.b() + '.' + drVar.b();
        cn.a(cnVar).d(this);
        cn.a(cnVar).a(this);
    }

    public String b() {
        return this.e;
    }

    public dr b() {
        return this.d;
    }

    public cn a() {
        return this.b;
    }

    public aa a() {
        return this.c;
    }

    public String c() {
        return this.d.b();
    }
}
