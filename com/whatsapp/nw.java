package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class nw implements OnClickListener {
    final String a;
    final int b;
    final int[] c;
    final Conversation d;

    nw(Conversation conversation, int[] iArr, String str, int i) {
        this.d = conversation;
        this.c = iArr;
        this.a = str;
        this.b = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Conversation.a(this.d, this.c[i], this.a, this.b);
    }
}
