package com.whatsapp.protocol;

class bt extends w {
    final cd a;
    final Runnable b;
    final j c;

    public void a(int i) {
        if (this.a != null) {
            this.a.a(i);
        }
    }

    bt(j jVar, Runnable runnable, cd cdVar) {
        this.c = jVar;
        this.b = runnable;
        this.a = cdVar;
    }

    public void a(bi biVar, String str) {
        if (this.b != null) {
            this.b.run();
        }
    }
}
