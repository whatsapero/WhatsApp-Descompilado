package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class u8 implements OnGlobalLayoutListener {
    final ListChatInfo a;

    u8(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }

    public void onGlobalLayout() {
        ListChatInfo.f(this.a);
    }
}
