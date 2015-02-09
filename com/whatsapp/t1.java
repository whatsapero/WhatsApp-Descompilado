package com.whatsapp;

import com.whatsapp.contact.c;
import com.whatsapp.contact.i;

class t1 implements Runnable {
    final c a;
    final App b;

    public void run() {
        i.d(App.p, this.a);
    }

    t1(App app, c cVar) {
        this.b = app;
        this.a = cVar;
    }
}
