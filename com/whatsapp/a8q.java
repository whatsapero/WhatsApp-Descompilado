package com.whatsapp;

import android.os.Handler;
import android.os.Message;

class a8q extends Handler {
    final c_ a;

    public void handleMessage(Message message) {
        if (c_.g(this.a) != null) {
            c_.g(this.a).a();
            sendEmptyMessageDelayed(0, (long) c_.a());
        }
    }

    a8q(c_ c_Var) {
        this.a = c_Var;
    }
}
