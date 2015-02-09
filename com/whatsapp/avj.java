package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class avj implements OnClickListener {
    final Conversation a;

    avj(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(11);
        Conversation.b(this.a, this.a.r.a(this.a), true);
        Conversation.c(this.a, false);
    }
}
