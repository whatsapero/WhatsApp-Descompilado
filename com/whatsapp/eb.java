package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class eb implements OnClickListener {
    final Conversation a;

    public void onClick(DialogInterface dialogInterface, int i) {
        Conversation.c(this.a, 0);
        App.aJ.u(this.a.r.e);
        this.a.removeDialog(0);
    }

    eb(Conversation conversation) {
        this.a = conversation;
    }
}
