package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.actionbarsherlock.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Marker;

class f7 implements OnClickListener {
    final LocationPicker2 a;
    final ImageView b;

    public void onClick(View view) {
        if (LocationPicker2.t(this.a).getVisibility() == 0) {
            ViewGroup viewGroup = (ViewGroup) this.a.findViewById(R.id.map_frame);
            if (viewGroup != null) {
                LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
                layoutParams.weight = 0.4f;
                viewGroup.setLayoutParams(layoutParams);
            }
            LocationPicker2.t(this.a).setVisibility(8);
            this.b.setImageResource(R.drawable.btn_map_fullscreen_off);
            if (LocationPicker2.a(this.a) != null) {
                LocationPicker2.a(this.a).animateCamera(CameraUpdateFactory.zoomBy(0.5f));
                if (!(LocationPicker2.i(this.a) == null || LocationPicker2.i(this.a).tag == null)) {
                    ((Marker) LocationPicker2.i(this.a).tag).showInfoWindow();
                }
            }
            LocationPicker2.d(this.a).setVisibility(8);
            LocationPicker2.o(this.a).setVisibility(0);
            if (App.az == 0) {
                return;
            }
        }
        LocationPicker2.t(this.a).setVisibility(0);
        this.b.setImageResource(R.drawable.btn_map_fullscreen_on);
        if (LocationPicker2.a(this.a) != null) {
            CameraPosition cameraPosition = LocationPicker2.a(this.a).getCameraPosition();
            LocationPicker2.a(this.a).animateCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(cameraPosition.target).zoom(cameraPosition.zoom - 0.5f).tilt(0.0f).bearing(0.0f).build()));
            if (!(LocationPicker2.i(this.a) == null || LocationPicker2.i(this.a).tag == null)) {
                ((Marker) LocationPicker2.i(this.a).tag).hideInfoWindow();
            }
        }
        LocationPicker2.o(this.a).setVisibility(8);
    }

    f7(LocationPicker2 locationPicker2, ImageView imageView) {
        this.a = locationPicker2;
        this.b = imageView;
    }
}
