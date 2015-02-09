package com.whatsapp;

import android.view.View;
import android.view.View.OnLongClickListener;

class d_ implements OnLongClickListener {
    final ConversationRow a;

    public boolean onLongClick(View view) {
        this.a.h();
        return true;
    }

    d_(ConversationRow conversationRow) {
        this.a = conversationRow;
    }
}
