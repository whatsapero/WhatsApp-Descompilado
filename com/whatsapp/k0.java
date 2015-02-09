package com.whatsapp;

import android.os.Handler;
import android.os.Message;

class k0 extends Handler {
    final Conversation a;

    public void handleMessage(Message message) {
        if (message.what == 1) {
            Conversation.J(this.a);
        }
        this.a.bd.setTranscriptMode(0);
    }

    k0(Conversation conversation) {
        this.a = conversation;
    }
}
