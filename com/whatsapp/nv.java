package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class nv implements OnClickListener {
    final ListChatInfo a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(6);
        ListChatInfo.b(this.a, ListChatInfo.c(this.a));
    }

    nv(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
