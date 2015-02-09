package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a_o implements OnClickListener {
    final Conversation a;

    a_o(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Conversation.ac(this.a);
        this.a.removeDialog(106);
    }
}
