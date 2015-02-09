package com.whatsapp.notification;

import com.whatsapp.App;

final class as implements Runnable {
    final String a;

    public void run() {
        App.p(this.a);
    }

    as(String str) {
        this.a = str;
    }
}
