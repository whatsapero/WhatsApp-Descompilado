package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ar;

class qu extends ar {
    final ConversationRowLocation b;

    public void a(View view) {
        App.a(this.b.getContext(), this.b.w);
    }

    qu(ConversationRowLocation conversationRowLocation, q0 q0Var) {
        this(conversationRowLocation);
    }

    private qu(ConversationRowLocation conversationRowLocation) {
        this.b = conversationRowLocation;
    }
}
