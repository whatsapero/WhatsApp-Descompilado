package com.whatsapp.protocol;

class am extends w {
    final j a;
    final Runnable b;
    final t c;
    final cd d;

    public void a(int i) {
        if (this.d != null) {
            this.d.a(i);
        }
    }

    public void a(Exception exception) {
        if (this.c != null) {
            this.c.a(exception);
        }
    }

    am(j jVar, Runnable runnable, cd cdVar, t tVar) {
        this.a = jVar;
        this.b = runnable;
        this.d = cdVar;
        this.c = tVar;
    }

    public void a(bi biVar, String str) {
        if (this.b != null) {
            this.b.run();
        }
    }
}
