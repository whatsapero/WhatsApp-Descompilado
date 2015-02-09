package com.whatsapp;

import com.whatsapp.protocol.b;

class nl implements Runnable {
    final gm a;
    final b b;

    nl(gm gmVar, b bVar) {
        this.a = gmVar;
        this.b = bVar;
    }

    public void run() {
        if (this.b != null && this.b.e.a.equals(MessageDetailsActivity.d(this.a.a).e.a) && this.b.e.b) {
            MessageDetailsActivity.c(this.a.a);
            MessageDetailsActivity.f(this.a.a).g();
        }
    }
}
