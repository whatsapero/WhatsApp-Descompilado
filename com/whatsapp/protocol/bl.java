package com.whatsapp.protocol;

class bl extends w {
    final j a;
    final cd b;
    final Runnable c;

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

    bl(j jVar, Runnable runnable, cd cdVar) {
        this.a = jVar;
        this.c = runnable;
        this.b = cdVar;
    }
}
