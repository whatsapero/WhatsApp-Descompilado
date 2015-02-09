package com.whatsapp;

import com.whatsapp.messaging.au;
import java.util.List;

final class ez implements Runnable {
    final List a;

    ez(List list) {
        this.a = list;
    }

    public void run() {
        List b = App.b(this.a);
        if (b.size() > 0) {
            App.Q().b(au.a(b, new a15(new au(this.a))));
        }
    }
}
