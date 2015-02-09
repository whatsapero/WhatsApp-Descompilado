package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class lf implements OnClickListener {
    final ListChatInfo a;

    lf(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(4);
    }
}
