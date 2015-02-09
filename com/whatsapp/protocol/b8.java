package com.whatsapp.protocol;

class b8 extends w {
    final Runnable a;
    final t b;
    final j c;
    final cd d;

    public void a(int i) {
        if (this.d != null) {
            this.d.a(i);
        }
    }

    b8(j jVar, Runnable runnable, cd cdVar, t tVar) {
        this.c = jVar;
        this.a = runnable;
        this.d = cdVar;
        this.b = tVar;
    }

    public void a(Exception exception) {
        if (this.b != null) {
            this.b.a(exception);
        }
    }

    public void a(bi biVar, String str) {
        if (this.a != null) {
            this.a.run();
        }
    }
}
