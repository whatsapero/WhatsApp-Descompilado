package com.whatsapp.protocol;

class bq extends w {
    final t a;
    final cd b;
    final Runnable c;
    final j d;

    public void a(Exception exception) {
        if (this.a != null) {
            this.a.a(exception);
        }
    }

    bq(j jVar, Runnable runnable, cd cdVar, t tVar) {
        this.d = jVar;
        this.c = runnable;
        this.b = cdVar;
        this.a = tVar;
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public void a(bi biVar, String str) {
        if (this.c != null) {
            this.c.run();
        }
    }
}
