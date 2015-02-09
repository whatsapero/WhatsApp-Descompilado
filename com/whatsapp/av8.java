package com.whatsapp;

import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.b;
import java.util.Vector;

class av8 implements Runnable {
    final NewGroup a;
    final Vector b;
    final String c;
    final String d;

    av8(NewGroup newGroup, String str, String str2, Vector vector) {
        this.a = newGroup;
        this.c = str;
        this.d = str2;
        this.b = vector;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.d(new m7(this, this.c, this.d, this.b, 12));
            al.a(App.p, b.GROUP_CREATE_C, Integer.valueOf(1));
        } catch (InterruptedException e) {
        }
    }
}
