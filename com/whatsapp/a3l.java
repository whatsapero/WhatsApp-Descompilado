package com.whatsapp;

final class a3l implements Runnable {
    final m8 a;

    a3l(m8 m8Var) {
        this.a = m8Var;
    }

    public void run() {
        boolean z;
        boolean z2 = true;
        if (this.a.M == -1 && this.a.A == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!(this.a.M == 0 && this.a.A == 0)) {
            z2 = false;
        }
        this.a.v();
        this.a.a(-1, -1);
        App.D.a(this.a.e);
        App.N.a(this.a.e);
        if (!z) {
            App.p.U().post(new i_(this, z2));
        }
    }
}
