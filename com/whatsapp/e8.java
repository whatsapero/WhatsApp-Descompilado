package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class e8 implements OnClickListener {
    final Conversation a;

    public void onClick(View view) {
        if (!App.c(this.a.r.e)) {
            this.a.showDialog(1);
            if (App.az == 0) {
                return;
            }
        }
        Conversation.ac(this.a);
    }

    e8(Conversation conversation) {
        this.a = conversation;
    }
}
