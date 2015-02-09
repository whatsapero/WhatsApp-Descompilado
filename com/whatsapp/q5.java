package com.whatsapp;

import android.view.View;
import android.view.View.OnLongClickListener;

class q5 implements OnLongClickListener {
    final Conversation a;

    public boolean onLongClick(View view) {
        Conversation.ad(this.a);
        return true;
    }

    q5(Conversation conversation) {
        this.a = conversation;
    }
}
