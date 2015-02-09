package com.whatsapp;

class amv implements Runnable {
    final int a;
    final Conversation b;

    amv(Conversation conversation, int i) {
        this.b = conversation;
        this.a = i;
    }

    public void run() {
        this.b.bd.setTranscriptMode(0);
        int a = a35.a(this.b.aS);
        if (Conversation.S(this.b) != null) {
            a++;
        }
        this.b.bd.setSelectionFromTop(a, this.a);
        Conversation.j(this.b, false);
        Conversation.k(this.b, false);
    }
}
