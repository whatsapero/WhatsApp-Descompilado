package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class alb implements OnClickListener {
    final Conversation a;

    alb(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        Conversation.I(this.a).setVisibility(8);
        this.a.onBackPressed();
    }
}
