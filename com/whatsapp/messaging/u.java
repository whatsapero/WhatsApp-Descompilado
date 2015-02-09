package com.whatsapp.messaging;

import android.os.Handler.Callback;
import android.os.Message;

class u implements Callback {
    final MessageService a;

    u(MessageService messageService) {
        this.a = messageService;
    }

    public boolean handleMessage(Message message) {
        MessageService.a(this.a, message.arg1);
        MessageService.a(this.a, message.arg2 != 0);
        return true;
    }
}
