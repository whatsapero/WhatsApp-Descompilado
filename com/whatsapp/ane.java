package com.whatsapp;

class ane implements Runnable {
    final cl a;

    ane(cl clVar) {
        this.a = clVar;
    }

    public void run() {
        if (ConversationRowVideo.b(this.a.a) == this.a) {
            ConversationRowVideo.a(this.a.a, null);
        }
    }
}
