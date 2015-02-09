package com.whatsapp.protocol;

class bu extends w {
    final Runnable a;
    final j b;

    public void a(bi biVar) {
        j.a(this.b).e();
    }

    bu(j jVar, Runnable runnable) {
        this.b = jVar;
        this.a = runnable;
    }

    public void a(bi biVar, String str) {
        j.a(this.b).e();
        if (this.a != null) {
            this.a.run();
        }
    }
}
