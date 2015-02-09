package com.whatsapp.protocol;

import java.util.Vector;

class b5 extends w {
    final j a;
    final cd b;
    final Runnable c;

    b5(j jVar, Runnable runnable, cd cdVar) {
        this.a = jVar;
        this.c = runnable;
        this.b = cdVar;
    }

    public void a(bi biVar, String str) {
        j.a(this.a, biVar, new Vector());
        j.c(this.a).a();
        if (this.c != null) {
            this.c.run();
        }
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }
}
