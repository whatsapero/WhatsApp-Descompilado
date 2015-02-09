package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class y9 implements OnClickListener {
    final ListChatInfo a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(6);
    }

    y9(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
