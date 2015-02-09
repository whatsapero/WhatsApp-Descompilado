package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class afe implements OnClickListener {
    final Conversation a;

    afe(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        this.a.showDialog(11);
    }
}
