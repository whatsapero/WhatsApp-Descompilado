package com.google;

final class e0 implements eY {
    private final gJ a;
    private final boolean b;
    private final int c;
    private final boolean d;
    private final bJ e;

    public gJ a() {
        return this.a;
    }

    public int e() {
        return this.c;
    }

    private e0(gJ gJVar, int i, bJ bJVar, boolean z, boolean z2) {
        this.a = gJVar;
        this.c = i;
        this.e = bJVar;
        this.d = z;
        this.b = z2;
    }

    public cc c() {
        return this.e.getJavaType();
    }

    public boolean b() {
        return this.b;
    }

    public int b(e0 e0Var) {
        return this.c - e0Var.c;
    }

    public int compareTo(Object obj) {
        return b((e0) obj);
    }

    public bJ d() {
        return this.e;
    }

    e0(gJ gJVar, int i, bJ bJVar, boolean z, boolean z2, gh ghVar) {
        this(gJVar, i, bJVar, z, z2);
    }

    public aJ a(aJ aJVar, a1 a1Var) {
        return ((bD) aJVar).a((em) a1Var);
    }

    static bJ c(e0 e0Var) {
        return e0Var.e;
    }

    static boolean a(e0 e0Var) {
        return e0Var.d;
    }

    public boolean a() {
        return this.d;
    }
}
