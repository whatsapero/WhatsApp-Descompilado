package com.whatsapp;

import android.os.Handler.Callback;
import android.os.Message;
import com.whatsapp.contact.c;
import com.whatsapp.contact.i;

final class ast implements Callback {
    ast() {
    }

    public boolean handleMessage(Message message) {
        i.b(App.p);
        App.a(c.BACKGROUND_FULL);
        return true;
    }
}
