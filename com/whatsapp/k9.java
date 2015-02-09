package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class k9 implements OnClickListener {
    final Conversation a;

    k9(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(104);
    }
}
