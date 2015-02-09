package com.whatsapp.util;

import android.os.Process;

class m implements Runnable {
    final b5 a;
    final Runnable b;

    m(b5 b5Var, Runnable runnable) {
        this.a = b5Var;
        this.b = runnable;
    }

    public void run() {
        Process.setThreadPriority(10);
        this.b.run();
    }
}
