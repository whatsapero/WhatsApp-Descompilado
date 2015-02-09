package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class af4 implements OnClickListener {
    final WebImagePicker a;

    af4(WebImagePicker webImagePicker) {
        this.a = webImagePicker;
    }

    public void onClick(View view) {
        WebImagePicker.l(this.a);
    }
}
