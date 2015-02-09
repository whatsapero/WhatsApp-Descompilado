package com.whatsapp;

import android.os.Handler;
import android.os.Message;

class a_d extends Handler {
    final RegisterName a;

    public void handleMessage(Message message) {
        RegisterName.f(this.a);
    }

    a_d(RegisterName registerName) {
        this.a = registerName;
    }
}
