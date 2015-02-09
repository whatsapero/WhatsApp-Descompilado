package com.whatsapp;

class k8 implements Runnable {
    final _m a;

    k8(_m _mVar) {
        this.a = _mVar;
    }

    public void run() {
        App.b(this.a.a);
        SettingsChat.a(this.a.a).post(new afl(this));
    }
}
