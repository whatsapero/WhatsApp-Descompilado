package com.whatsapp;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

class ek implements LocationListener {
    final us a;

    ek(us usVar) {
        this.a = usVar;
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public void onLocationChanged(Location location) {
        this.a.e = location;
    }

    public void onProviderDisabled(String str) {
    }
}
