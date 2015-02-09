package com.whatsapp;

import android.location.Location;
import com.google.android.gms.location.LocationListener;

class xq implements LocationListener {
    private android.location.LocationListener a;
    private boolean b;
    private long c;
    private float d;

    static float b(xq xqVar) {
        return xqVar.d;
    }

    public void onLocationChanged(Location location) {
        this.a.onLocationChanged(location);
    }

    public xq(long j, float f, boolean z, android.location.LocationListener locationListener) {
        this.a = locationListener;
        this.c = j;
        this.d = f;
        this.b = z;
    }

    static boolean c(xq xqVar) {
        return xqVar.b;
    }

    static long a(xq xqVar) {
        return xqVar.c;
    }
}
