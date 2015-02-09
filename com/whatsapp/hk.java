package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class hk implements OnClickListener {
    final Conversation a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(12);
    }

    hk(Conversation conversation) {
        this.a = conversation;
    }
}
