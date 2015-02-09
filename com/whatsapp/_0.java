package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.fieldstats.a6;

class _0 implements OnClickListener {
    final LocationPicker2 a;

    public void onClick(View view) {
        App.a(this.a, LocationPicker2.j(this.a), LocationPicker2.w(this.a));
        LocationPicker2.a(this.a, a6.CUSTOM_LOCATION);
        this.a.finish();
    }

    _0(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
