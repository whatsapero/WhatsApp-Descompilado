package com.whatsapp.protocol;

class bn extends w {
    final cd a;
    final j b;
    final t c;
    final String d;
    final Runnable e;

    public void a(bi biVar, String str) {
        if (this.e != null) {
            this.e.run();
        }
    }

    bn(j jVar, Runnable runnable, cd cdVar, String str, t tVar) {
        this.b = jVar;
        this.e = runnable;
        this.a = cdVar;
        this.d = str;
        this.c = tVar;
    }

    public void a(int i) {
        if (this.a != null) {
            this.a.a(i);
        }
        this.b.n.a(i, this.d);
    }

    public void a(Exception exception) {
        if (this.c != null) {
            this.c.a(exception);
        }
    }
}
