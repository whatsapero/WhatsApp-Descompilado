package com.whatsapp;

import android.location.Location;
import java.util.Collections;

class po implements Runnable {
    final am a;

    po(am amVar) {
        this.a = amVar;
    }

    public void run() {
        this.a.i = lh.b.c(am.g(this.a));
        am.b(this.a);
        am.f(this.a).notifyDataSetChanged();
        Location f = this.a.f();
        if (f != null) {
            Collections.sort(this.a.i, new alz(this, f.getLatitude(), f.getLongitude()));
        }
        this.a.d();
    }
}
