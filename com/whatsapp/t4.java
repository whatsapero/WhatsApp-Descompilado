package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class t4 implements OnClickListener {
    final Conversation a;

    t4(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(9);
        Conversation.a(this.a, v.b(this.a.u).a());
    }
}
