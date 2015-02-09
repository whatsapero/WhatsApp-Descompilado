package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.maps.model.Marker;

class a8 implements OnClickListener {
    final LocationPicker2 a;

    a8(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }

    public void onClick(View view) {
        LocationPicker2.d(this.a).setVisibility(0);
        if (LocationPicker2.i(this.a) != null && LocationPicker2.i(this.a).tag != null) {
            ((Marker) LocationPicker2.i(this.a).tag).hideInfoWindow();
        }
    }
}
