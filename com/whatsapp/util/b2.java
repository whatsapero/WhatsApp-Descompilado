package com.whatsapp.util;

import android.view.ViewGroup;

class b2 implements Runnable {
    final ViewGroup a;
    final bk b;

    b2(bk bkVar, ViewGroup viewGroup) {
        this.b = bkVar;
        this.a = viewGroup;
    }

    public void run() {
        try {
            g.a(this.b.a, this.a);
        } catch (Exception e) {
        }
    }
}
