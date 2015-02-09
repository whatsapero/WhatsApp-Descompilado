package com.whatsapp;

import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.model.CameraPosition;

class a3_ implements OnCameraChangeListener {
    final LocationPicker2 a;

    a3_(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }

    public void onCameraChange(CameraPosition cameraPosition) {
        LocationPicker2.w(this.a).lat = cameraPosition.target.latitude;
        LocationPicker2.w(this.a).lat = cameraPosition.target.longitude;
        LocationPicker2.w(this.a).name = null;
        LocationPicker2.w(this.a).address = null;
        if (LocationPicker2.t(this.a).getVisibility() == 8) {
            LocationPicker2.g(this.a).removeCallbacks(LocationPicker2.k(this.a));
            LocationPicker2.a(this.a, new cm(this.a, cameraPosition.target.latitude, cameraPosition.target.longitude));
            LocationPicker2.g(this.a).post(LocationPicker2.k(this.a));
        }
    }
}
