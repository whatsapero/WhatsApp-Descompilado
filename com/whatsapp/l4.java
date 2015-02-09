package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class l4 implements OnClickListener {
    final Conversation a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(102);
    }

    l4(Conversation conversation) {
        this.a = conversation;
    }
}
