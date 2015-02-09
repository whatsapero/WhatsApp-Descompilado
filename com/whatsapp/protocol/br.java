package com.whatsapp.protocol;

class br extends w {
    final Runnable a;
    final t b;
    final cd c;
    final j d;

    br(j jVar, Runnable runnable, cd cdVar, t tVar) {
        this.d = jVar;
        this.a = runnable;
        this.c = cdVar;
        this.b = tVar;
    }

    public void a(Exception exception) {
        if (this.b != null) {
            this.b.a(exception);
        }
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }

    public void a(bi biVar, String str) {
        if (this.a != null) {
            this.a.run();
        }
    }
}
