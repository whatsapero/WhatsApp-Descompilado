package com.whatsapp;

import android.location.LocationListener;

final class sl implements Runnable {
    final b8 a;
    final LocationListener b;

    sl(b8 b8Var, LocationListener locationListener) {
        this.a = b8Var;
        this.b = locationListener;
    }

    public void run() {
        this.a.a(this.b);
    }
}
