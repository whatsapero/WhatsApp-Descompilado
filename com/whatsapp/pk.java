package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class pk implements OnClickListener {
    final Conversation a;

    pk(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        this.a.bd.onWindowFocusChanged(false);
        this.a.bd.post(new af9(this));
        Conversation.M(this.a).setVisibility(8);
        Conversation.Q(this.a).setVisibility(8);
    }
}
