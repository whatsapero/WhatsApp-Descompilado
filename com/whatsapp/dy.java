package com.whatsapp;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;

class dy implements Runnable {
    final boolean a;
    final LocationPicker2 b;

    public void run() {
        if (LocationPicker2.s(this.b) == null || this.a) {
            LocationPicker2.a(this.b).animateCamera(CameraUpdateFactory.newLatLng(new LatLng(LocationPicker2.x(this.b).getLatitude(), LocationPicker2.x(this.b).getLongitude())));
            LocationPicker2.a(this.b, LocationPicker2.x(this.b), Math.max((int) LocationPicker2.x(this.b).getAccuracy(), 100), null, true);
        }
    }

    dy(LocationPicker2 locationPicker2, boolean z) {
        this.b = locationPicker2;
        this.a = z;
    }
}
