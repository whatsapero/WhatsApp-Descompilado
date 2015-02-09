package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class n8 implements OnClickListener {
    final Conversation a;

    n8(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(101);
    }
}
