package com.whatsapp;

class pe implements Runnable {
    final Conversation a;

    public void run() {
        Conversation.c(this.a, null);
    }

    pe(Conversation conversation) {
        this.a = conversation;
    }
}
