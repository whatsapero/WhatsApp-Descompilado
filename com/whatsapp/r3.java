package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class r3 implements OnClickListener {
    final ListChatInfo a;

    public void onClick(View view) {
        ListChatInfo.b(this.a);
    }

    r3(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
