package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class s5 implements OnClickListener {
    final Conversation a;

    s5(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(8);
    }
}
