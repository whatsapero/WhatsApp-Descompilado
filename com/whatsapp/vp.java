package com.whatsapp;

import android.os.Handler;
import android.os.Message;

class vp extends Handler {
    final tv a;

    vp(tv tvVar) {
        this.a = tvVar;
    }

    public void handleMessage(Message message) {
        sendMessage(obtainMessage());
    }
}
