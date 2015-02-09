package com.whatsapp;

class uz implements Runnable {
    final ff a;

    uz(ff ffVar) {
        this.a = ffVar;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.a(this.a.a, Conversation.t(this.a.a), this.a.a.r.e);
        } catch (InterruptedException e) {
        }
    }
}
