package com.whatsapp;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

class zz implements LocationListener {
    final us a;

    public void onProviderEnabled(String str) {
    }

    public void onProviderDisabled(String str) {
    }

    public void onLocationChanged(Location location) {
        us usVar = this.a;
        usVar.i++;
        this.a.d = location;
        if (this.a.i >= 2 || location.getAccuracy() < 200.0f) {
            this.a.j = true;
            this.a.i = 0;
        }
    }

    zz(us usVar) {
        this.a = usVar;
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
