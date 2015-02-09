package com.whatsapp;

class zh implements Runnable {
    final lh a;
    final String b;

    zh(lh lhVar, String str) {
        this.a = lhVar;
        this.b = str;
    }

    public void run() {
        App.p(this.b);
    }
}
