package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ah implements OnClickListener {
    final ConversationRowVoiceNote a;

    public void onClick(View view) {
        App.e(this.a.w);
    }

    ah(ConversationRowVoiceNote conversationRowVoiceNote) {
        this.a = conversationRowVoiceNote;
    }
}
