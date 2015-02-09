package com.whatsapp;

class yh implements Runnable {
    final m8 a;
    final int b;
    final jg c;

    public void run() {
        int i = 0;
        int i2 = this.a.M != this.b ? 0 : this.a.M;
        if (this.a.A == this.b) {
            i = this.a.A;
        }
        this.a.a(i2, i);
        App.D.a(this.a.e);
        App.N.a(this.a.e);
        App.p.U().post(new afa(this));
    }

    yh(jg jgVar, m8 m8Var, int i) {
        this.c = jgVar;
        this.a = m8Var;
        this.b = i;
    }
}
