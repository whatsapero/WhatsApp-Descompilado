package com.whatsapp;

class bu implements Runnable {
    final rb a;

    bu(rb rbVar) {
        this.a = rbVar;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.a(this.a.b.e, null);
        } catch (InterruptedException e) {
        }
    }
}
