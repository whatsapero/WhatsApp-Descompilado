package com.whatsapp;

class ath implements Runnable {
    final Conversation a;

    ath(Conversation conversation) {
        this.a = conversation;
    }

    public void run() {
        Conversation.c(this.a, Conversation.l(this.a));
    }
}
