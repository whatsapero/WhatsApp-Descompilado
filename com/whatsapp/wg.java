package com.whatsapp;

import android.os.Handler;
import android.os.Message;

class wg extends Handler {
    final cb a;

    wg(cb cbVar) {
        this.a = cbVar;
    }

    public void handleMessage(Message message) {
        if (cb.a(this.a) != null) {
            if (cb.a(this.a).c()) {
                cb.a(this.a, this.a.c());
                sendEmptyMessageDelayed(0, 50);
            } else if (!cb.b(this.a)) {
                this.a.o();
            }
        }
    }
}
