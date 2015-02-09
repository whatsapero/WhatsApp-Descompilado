package com.whatsapp.protocol;

class b6 extends w {
    final j a;
    final Runnable b;
    final cd c;
    final t d;

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

    public void a(Exception exception) {
        if (this.d != null) {
            this.d.a(exception);
        }
    }

    b6(j jVar, Runnable runnable, cd cdVar, t tVar) {
        this.a = jVar;
        this.b = runnable;
        this.c = cdVar;
        this.d = tVar;
    }
}
