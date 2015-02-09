package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class a5f implements OnClickListener {
    final Conversation a;

    a5f(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        int i = App.az;
        Conversation.I(this.a).setVisibility(8);
        if (Conversation.H(this.a)) {
            GroupChatInfo.a(this.a.r, this.a);
            if (i == 0) {
                return;
            }
        }
        if (Conversation.m(this.a)) {
            ListChatInfo.a(this.a.r, this.a);
            if (i == 0) {
                return;
            }
        }
        ContactInfo.a(this.a.r, this.a);
    }
}
