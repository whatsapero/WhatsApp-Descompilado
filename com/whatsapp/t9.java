package com.whatsapp;

class t9 implements Runnable {
    final String a;
    final lh b;

    t9(lh lhVar, String str) {
        this.b = lhVar;
        this.a = str;
    }

    public void run() {
        App.p(this.a);
    }
}
