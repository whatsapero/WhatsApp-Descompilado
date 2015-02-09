package com.whatsapp;

import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

class azs implements OnMapClickListener {
    final LocationPicker2 a;

    public void onMapClick(LatLng latLng) {
        if (LocationPicker2.i(this.a) != null) {
            if (LocationPicker2.i(this.a).tag != null) {
                ((Marker) LocationPicker2.i(this.a).tag).setIcon(LocationPicker2.b(this.a));
            }
            LocationPicker2.a(this.a, null);
            LocationPicker2.r(this.a).notifyDataSetChanged();
        }
        LocationPicker2.d(this.a).setVisibility(8);
    }

    azs(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
