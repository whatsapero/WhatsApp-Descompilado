package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class m9 implements OnClickListener {
    final Conversation a;

    m9(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(11);
        Conversation.a(this.a, this.a.r.a(), true);
        Conversation.c(this.a, false);
    }
}
