package com.whatsapp.protocol;

class ar extends w {
    final j a;
    final Runnable b;
    final cd c;

    public void a(bi biVar, String str) {
        if (this.b != null) {
            this.b.run();
        }
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }

    ar(j jVar, Runnable runnable, cd cdVar) {
        this.a = jVar;
        this.b = runnable;
        this.c = cdVar;
    }
}
