package com.whatsapp.protocol;

class y extends w {
    final cd a;
    final j b;
    final Runnable c;

    y(j jVar, Runnable runnable, cd cdVar) {
        this.b = jVar;
        this.c = runnable;
        this.a = cdVar;
    }

    public void a(bi biVar, String str) {
        if (this.c != null) {
            this.c.run();
        }
    }

    public void a(int i) {
        if (this.a != null) {
            this.a.a(i);
        }
    }
}
