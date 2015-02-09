package com.whatsapp;

import com.whatsapp.protocol.b9;
import com.whatsapp.protocol.r;

class le implements Runnable {
    final r a;
    final String b;
    final ale c;
    final b9 d;

    public void run() {
        try {
            Thread.sleep(300);
            App.d(new mw(this, this.b, this.a.c, this.a.e, 12, this.d));
        } catch (InterruptedException e) {
        }
    }

    le(ale com_whatsapp_ale, String str, r rVar, b9 b9Var) {
        this.c = com_whatsapp_ale;
        this.b = str;
        this.a = rVar;
        this.d = b9Var;
    }
}
