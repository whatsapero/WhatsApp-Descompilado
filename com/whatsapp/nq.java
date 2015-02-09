package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class nq implements OnClickListener {
    final Conversations a;

    nq(Conversations conversations) {
        this.a = conversations;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(11);
    }
}
