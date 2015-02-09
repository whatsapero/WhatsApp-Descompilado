package com.whatsapp;

class sx implements Runnable {
    final Conversation a;

    sx(Conversation conversation) {
        this.a = conversation;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.a(this.a, Conversation.t(this.a), this.a.r.e);
        } catch (InterruptedException e) {
        }
    }
}
