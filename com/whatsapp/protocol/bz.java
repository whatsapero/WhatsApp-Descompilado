package com.whatsapp.protocol;

class bz extends w {
    final t a;
    final Runnable b;
    final j c;
    final cd d;

    bz(j jVar, Runnable runnable, cd cdVar, t tVar) {
        this.c = jVar;
        this.b = runnable;
        this.d = cdVar;
        this.a = tVar;
    }

    public void a(Exception exception) {
        if (this.a != null) {
            this.a.a(exception);
        }
    }

    public void a(int i) {
        if (this.d != null) {
            this.d.a(i);
        }
    }

    public void a(bi biVar, String str) {
        if (this.b != null) {
            this.b.run();
        }
    }
}
