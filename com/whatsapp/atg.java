package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class atg implements OnClickListener {
    final Conversation a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(106);
    }

    atg(Conversation conversation) {
        this.a = conversation;
    }
}
