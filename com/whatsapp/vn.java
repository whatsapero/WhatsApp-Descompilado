package com.whatsapp;

import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.y;

class vn implements Runnable {
    final Conversation a;

    vn(Conversation conversation) {
        this.a = conversation;
    }

    public void run() {
        if (a54.g()) {
            al.a(App.p, y.IS_MONKEYRUNNER_RUNNING, Boolean.valueOf(true));
        }
    }
}
