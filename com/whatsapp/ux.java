package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ux implements OnClickListener {
    final Conversation a;

    public void onClick(View view) {
        this.a.bd.onWindowFocusChanged(false);
        Conversation.J(this.a);
        Conversation.M(this.a).setVisibility(8);
        Conversation.Q(this.a).setVisibility(8);
    }

    ux(Conversation conversation) {
        this.a = conversation;
    }
}
