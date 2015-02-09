package com.whatsapp;

class qv implements Runnable {
    final Conversations a;
    final String b;

    qv(Conversations conversations, String str) {
        this.a = conversations;
        this.b = str;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.i(this.b);
        } catch (InterruptedException e) {
        }
    }
}
