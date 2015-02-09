package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class alu implements OnClickListener {
    final Conversations a;

    alu(Conversations conversations) {
        this.a = conversations;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Conversations.a(this.a);
    }
}
