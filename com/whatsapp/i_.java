package com.whatsapp;

class i_ implements Runnable {
    final a3l a;
    final boolean b;

    i_(a3l com_whatsapp_a3l, boolean z) {
        this.a = com_whatsapp_a3l;
        this.b = z;
    }

    public void run() {
        if (!this.b) {
            this.a.a.c();
        }
        App.j(this.a.a.e);
    }
}
