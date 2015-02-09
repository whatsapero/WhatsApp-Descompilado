package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class y1 implements OnClickListener {
    final Conversation a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(9);
    }

    y1(Conversation conversation) {
        this.a = conversation;
    }
}
