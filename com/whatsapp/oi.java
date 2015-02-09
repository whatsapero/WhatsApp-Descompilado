package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class oi implements OnClickListener {
    final MultipleContactPicker a;

    public void onClick(View view) {
        MultipleContactPicker.b(this.a).setVisibility(8);
        MultipleContactPicker.c(this.a).setText("");
    }

    oi(MultipleContactPicker multipleContactPicker) {
        this.a = multipleContactPicker;
    }
}
