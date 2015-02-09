package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class vy implements OnClickListener {
    final ConversationRowDivider a;

    public void onClick(View view) {
        this.a.c();
    }

    vy(ConversationRowDivider conversationRowDivider) {
        this.a = conversationRowDivider;
    }
}
