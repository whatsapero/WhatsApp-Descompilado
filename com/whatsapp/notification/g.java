package com.whatsapp.notification;

import android.support.v4.app.NotificationManagerCompat;
import com.whatsapp.App;

class g implements Runnable {
    final String a;
    final q b;

    public void run() {
        NotificationManagerCompat.from(App.p).cancel(this.a, 1);
    }

    g(q qVar, String str) {
        this.b = qVar;
        this.a = str;
    }
}
