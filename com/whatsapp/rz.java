package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class rz implements OnClickListener {
    final ConversationRowAudio a;

    rz(ConversationRowAudio conversationRowAudio) {
        this.a = conversationRowAudio;
    }

    public void onClick(View view) {
        this.a.b(this.a.w);
    }
}
