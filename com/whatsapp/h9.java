package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class h9 implements OnClickListener {
    final ListChatInfo a;

    public void onClick(View view) {
        this.a.showDialog(2);
    }

    h9(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
