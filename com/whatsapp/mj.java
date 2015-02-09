package com.whatsapp;

class mj implements Runnable {
    final App a;

    mj(App app) {
        this.a = app;
    }

    public void run() {
        App.aO();
    }
}
