package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class a1_ implements OnClickListener {
    final ListChatInfo a;

    public void onClick(View view) {
        this.a.showDialog(50);
    }

    a1_(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
