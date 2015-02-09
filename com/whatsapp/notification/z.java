package com.whatsapp.notification;

import android.support.v4.app.NotificationManagerCompat;
import com.whatsapp.App;

class z implements Runnable {
    final q a;

    z(q qVar) {
        this.a = qVar;
    }

    public void run() {
        NotificationManagerCompat.from(App.p).cancel(1);
    }
}
