package com.whatsapp;

class akf implements Runnable {
    final b6 a;

    akf(b6 b6Var) {
        this.a = b6Var;
    }

    public void run() {
        if (!this.a.c.isCancelled()) {
            a5w.a(this.a.c, new Void[0]);
            if (App.az == 0) {
                return;
            }
        }
        this.a.c.a(rk.CANCEL);
    }
}
