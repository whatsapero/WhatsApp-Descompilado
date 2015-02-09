package com.whatsapp.messaging;

import android.os.Binder;

public final class c extends Binder {
    final MessageService a;

    public final MessageService a() {
        return this.a;
    }

    public c(MessageService messageService) {
        this.a = messageService;
    }
}
