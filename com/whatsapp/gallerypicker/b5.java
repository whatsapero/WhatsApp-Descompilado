package com.whatsapp.gallerypicker;

class b5 {
    private int a;
    aw b;
    private final v c;
    int d;
    long e;

    public boolean a() {
        if (this.a >= this.c.b() - 1) {
            return false;
        }
        v vVar = this.c;
        int i = this.a + 1;
        this.a = i;
        this.b = vVar.a(i);
        this.e = this.b.c();
        return true;
    }

    public b5(v vVar, int i) {
        this.a = -1;
        this.c = vVar;
        this.d = i;
    }
}
