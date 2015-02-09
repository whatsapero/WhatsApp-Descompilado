package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class o1 implements OnClickListener {
    final Conversation a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(111);
    }

    o1(Conversation conversation) {
        this.a = conversation;
    }
}
