package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class a1k implements OnClickListener {
    final Conversation a;

    a1k(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        Conversation.Z(this.a);
    }
}
