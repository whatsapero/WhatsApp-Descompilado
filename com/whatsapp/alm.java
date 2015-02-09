package com.whatsapp;

import android.os.Handler;
import android.os.Message;

class alm extends Handler {
    final Conversation a;

    alm(Conversation conversation) {
        this.a = conversation;
    }

    public void handleMessage(Message message) {
        if (message.what == 0) {
            Conversation.B(this.a);
            if (App.az == 0) {
                return;
            }
        }
        Conversation.ae(this.a);
    }
}
