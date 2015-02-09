package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class vb implements OnClickListener {
    final Conversation a;

    public void onClick(View view) {
        if (Conversation.U(this.a)) {
            Conversation.b(this.a);
            if (App.az == 0) {
                return;
            }
        }
        Conversation.r(this.a);
    }

    vb(Conversation conversation) {
        this.a = conversation;
    }
}
