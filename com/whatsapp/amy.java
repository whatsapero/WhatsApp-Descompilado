package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class amy implements OnClickListener {
    final ConversationRowVoiceNote a;

    amy(ConversationRowVoiceNote conversationRowVoiceNote) {
        this.a = conversationRowVoiceNote;
    }

    public void onClick(View view) {
        ConversationRowVoiceNote.a(this.a, this.a.w);
    }
}
