package com.whatsapp.protocol;

class a2 extends w {
    final Runnable a;
    final cd b;
    final j c;

    a2(j jVar, Runnable runnable, cd cdVar) {
        this.c = jVar;
        this.a = runnable;
        this.b = cdVar;
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public void a(bi biVar, String str) {
        if (this.a != null) {
            this.a.run();
        }
    }
}
