package com.whatsapp;

import com.whatsapp.protocol.b;
import java.util.concurrent.CountDownLatch;

class jy implements Runnable {
    final CountDownLatch a;
    final b b;
    final l7 c;

    jy(l7 l7Var, b bVar, CountDownLatch countDownLatch) {
        this.c = l7Var;
        this.b = bVar;
        this.a = countDownLatch;
    }

    public void run() {
        l7.g(this.c).a(this.b);
        this.a.countDown();
    }
}
