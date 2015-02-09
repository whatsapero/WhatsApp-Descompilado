package com.whatsapp;

import com.whatsapp.protocol.b;

class f3 implements Runnable {
    final long a;
    final l7 b;
    final b c;

    f3(l7 l7Var, b bVar, long j) {
        this.b = l7Var;
        this.c = bVar;
        this.a = j;
    }

    public void run() {
        l7.a(this.b, this.c, this.a);
    }
}
