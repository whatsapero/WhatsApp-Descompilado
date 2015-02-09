package com.whatsapp;

class e_ implements Runnable {
    final String a;
    final lh b;

    e_(lh lhVar, String str) {
        this.b = lhVar;
        this.a = str;
    }

    public void run() {
        App.p(this.a);
    }
}
