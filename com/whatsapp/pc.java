package com.whatsapp;

class pc implements Runnable {
    final dz a;
    final int b;

    public void run() {
        if (!dz.d(this.a).isFinishing()) {
            dz.d(this.a).showDialog(this.b);
        }
    }

    pc(dz dzVar, int i) {
        this.a = dzVar;
        this.b = i;
    }
}
