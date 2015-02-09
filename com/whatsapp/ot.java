package com.whatsapp;

import com.whatsapp.protocol.b;

class ot implements Runnable {
    final b a;
    final fj b;

    ot(fj fjVar, b bVar) {
        this.b = fjVar;
        this.a = bVar;
    }

    public void run() {
        App.e(this.a);
    }
}
