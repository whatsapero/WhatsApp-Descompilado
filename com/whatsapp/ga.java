package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ga implements OnClickListener {
    final ms a;

    ga(ms msVar) {
        this.a = msVar;
    }

    public void onClick(View view) {
        Conversation.a(this.a.a, false);
    }
}
