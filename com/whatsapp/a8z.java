package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a8z implements OnClickListener {
    final Conversation a;

    a8z(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(7);
    }
}
