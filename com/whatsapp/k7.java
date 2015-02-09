package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.notification.q;
import de.greenrobot.event.g;

class k7 extends Handler {
    final Conversation a;

    private k7(Conversation conversation) {
        this.a = conversation;
    }

    k7(Conversation conversation, ak0 com_whatsapp_ak0) {
        this(conversation);
    }

    public void handleMessage(Message message) {
        if (!((bz) g.b().b(bz.class)).a()) {
            App.a(false, false);
            if (Conversation.g(this.a)) {
                q.c().a();
            }
            Conversation.l(this.a, false);
            Conversation.i(this.a, true);
        }
    }
}
