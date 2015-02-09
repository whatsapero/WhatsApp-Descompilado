package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class e7 implements OnClickListener {
    final ListChatInfo a;

    e7(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(2);
    }
}
