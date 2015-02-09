package com.whatsapp.protocol;

class b_ extends w {
    final j a;
    final cd b;
    final t c;
    final Runnable d;

    public void a(Exception exception) {
        if (this.c != null) {
            this.c.a(exception);
        }
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public void a(bi biVar, String str) {
        if (this.d != null) {
            this.d.run();
        }
    }

    b_(j jVar, Runnable runnable, cd cdVar, t tVar) {
        this.a = jVar;
        this.d = runnable;
        this.b = cdVar;
        this.c = tVar;
    }
}
