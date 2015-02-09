package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class q8 implements OnClickListener {
    final LocationPicker2 a;

    public void onClick(View view) {
        LocationPicker2.l(this.a).a();
    }

    q8(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
