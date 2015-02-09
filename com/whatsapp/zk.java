package com.whatsapp;

class zk implements Runnable {
    final nb a;

    zk(nb nbVar) {
        this.a = nbVar;
    }

    public void run() {
        App.c(this.a.a);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
        }
        SettingsChat.a(this.a.b).post(new mt(this));
    }
}
