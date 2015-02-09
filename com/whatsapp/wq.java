package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class wq implements OnClickListener {
    final Conversation a;

    wq(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        Conversation.I(this.a).setVisibility(8);
        if (this.a.bd.getLastVisiblePosition() >= this.a.bd.getCount() - 1) {
            this.a.bd.setTranscriptMode(2);
            Conversation.J(this.a);
        }
        this.a.bd.setFastScrollEnabled(false);
        if (Conversation.L(this.a).c()) {
            Conversation.I(this.a).setVisibility(8);
        }
    }
}
