package com.whatsapp;

import java.util.List;

class iy implements Runnable {
    final a5 a;
    final List b;

    public void run() {
        if (!this.a.isCancelled()) {
            ContactInfo.a(this.a.a, this.b);
        }
    }

    iy(a5 a5Var, List list) {
        this.a = a5Var;
        this.b = list;
    }
}
