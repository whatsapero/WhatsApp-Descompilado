package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class avo implements OnClickListener {
    final LocationPicker a;

    public void onClick(View view) {
        LocationPicker.l(this.a).runOnFirstFix(new bv(this));
    }

    avo(LocationPicker locationPicker) {
        this.a = locationPicker;
    }
}
