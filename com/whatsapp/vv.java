package com.whatsapp;

class vv implements Runnable {
    final Conversations a;
    final String b;

    vv(Conversations conversations, String str) {
        this.a = conversations;
        this.b = str;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.a(this.b, null);
        } catch (InterruptedException e) {
        }
    }
}
