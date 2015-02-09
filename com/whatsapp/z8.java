package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class z8 implements OnClickListener {
    final Conversation a;

    z8(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        Conversation.ad(this.a);
    }
}
