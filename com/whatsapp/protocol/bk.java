package com.whatsapp.protocol;

class bk extends w {
    final Runnable a;
    final j b;
    final cd c;

    bk(j jVar, Runnable runnable, cd cdVar) {
        this.b = jVar;
        this.a = runnable;
        this.c = cdVar;
    }

    public void a(bi biVar, String str) {
        if (this.a != null) {
            this.a.run();
        }
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
        this.b.n.f(i);
    }
}
