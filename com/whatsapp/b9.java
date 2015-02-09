package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import de.greenrobot.event.g;

class b9 extends Handler {
    b9() {
    }

    public void handleMessage(Message message) {
        if (!((bz) g.b().b(bz.class)).a()) {
            App.T();
        }
    }
}
