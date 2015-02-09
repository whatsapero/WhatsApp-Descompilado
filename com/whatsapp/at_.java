package com.whatsapp;

class at_ implements Runnable {
    final Conversation a;

    public void run() {
        this.a.bd.setFastScrollEnabled(false);
        this.a.bd.setTranscriptMode(2);
        this.a.aS.notifyDataSetChanged();
    }

    at_(Conversation conversation) {
        this.a = conversation;
    }
}
