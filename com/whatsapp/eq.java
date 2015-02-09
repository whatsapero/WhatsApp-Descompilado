package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class eq implements OnClickListener {
    final WebImagePicker a;

    public void onClick(View view) {
        WebImagePicker.l(this.a);
    }

    eq(WebImagePicker webImagePicker) {
        this.a = webImagePicker;
    }
}
