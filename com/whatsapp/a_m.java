package com.whatsapp;

import android.os.Handler;
import android.os.Message;

class a_m extends Handler {
    final TouchImageView a;

    public void handleMessage(Message message) {
        if (System.currentTimeMillis() - 45 >= TouchImageView.a(this.a)) {
            TouchImageView.s = 2;
            TouchImageView.u = -1.0f;
        }
    }

    a_m(TouchImageView touchImageView) {
        this.a = touchImageView;
    }
}
