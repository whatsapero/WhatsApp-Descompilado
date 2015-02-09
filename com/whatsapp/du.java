package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class du implements OnClickListener {
    final Conversation a;

    du(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(10);
        Conversation.a(this.a, this.a, this.a.r, false);
    }
}
