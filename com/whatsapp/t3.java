package com.whatsapp;

import android.widget.PopupWindow.OnDismissListener;

class t3 implements OnDismissListener {
    final Conversation a;

    t3(Conversation conversation) {
        this.a = conversation;
    }

    public void onDismiss() {
        Conversation.I(this.a).setVisibility(8);
    }
}
