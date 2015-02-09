package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class f0 implements OnClickListener {
    final Conversation a;
    final int[] b;

    f0(Conversation conversation, int[] iArr) {
        this.a = conversation;
        this.b = iArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b[0] = i;
    }
}
