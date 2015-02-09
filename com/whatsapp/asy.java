package com.whatsapp;

import android.location.Location;

class asy implements Runnable {
    final Location a;
    final boolean b;
    final ev c;

    asy(ev evVar, boolean z, Location location) {
        this.c = evVar;
        this.b = z;
        this.a = location;
    }

    public void run() {
        if (LocationPicker.p(this.c.h) == null || this.b) {
            LocationPicker.e(this.c.h).a(LocationPicker.l(this.c.h).getMyLocation());
            LocationPicker.a(this.c.h, this.a, Math.max((int) this.a.getAccuracy(), 100), null, true);
        }
    }
}
