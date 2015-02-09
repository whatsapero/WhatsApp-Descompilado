package com.whatsapp;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;

@SuppressLint({"HandlerLeak"})
final class a10 extends Thread {
    final l7 a;
    public Handler b;

    public a10(l7 l7Var, String str) {
        this.a = l7Var;
        super(str);
    }

    public void run() {
        Looper.prepare();
        this.b = new lc(this);
        Looper.loop();
    }
}
