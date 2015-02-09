package com.whatsapp.notification;

import com.whatsapp.App;
import com.whatsapp.m8;

class k implements Runnable {
    final String a;
    final m8 b;
    final AndroidWear c;

    k(AndroidWear androidWear, m8 m8Var, String str) {
        this.c = androidWear;
        this.b = m8Var;
        this.a = str;
    }

    public void run() {
        App.a(this.b, this.a);
        App.a(this.b, false, true);
        App.a(false, true, true, true);
    }
}
