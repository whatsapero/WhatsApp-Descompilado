package com.whatsapp;

import android.os.Handler;
import android.os.Message;

final class a1u extends Handler {
    public void handleMessage(Message message) {
        App.V.stop();
    }

    a1u() {
    }
}
