package com.whatsapp;

class afw implements Runnable {
    final m8 a;
    final jg b;

    afw(jg jgVar, m8 m8Var) {
        this.b = jgVar;
        this.a = m8Var;
    }

    public void run() {
        this.a.r = 0;
        App.P.a(this.a);
        App.D.a(this.a.e);
        App.N.a(this.a.e);
        App.p.U().post(new a1h(this));
    }
}
