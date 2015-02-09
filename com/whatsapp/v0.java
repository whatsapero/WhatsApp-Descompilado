package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.fieldstats.a7;
import com.whatsapp.fieldstats.au;

class v0 implements OnClickListener {
    final MultipleContactPicker a;

    public void onClick(View view) {
        ak4.a(au.TELL_A_FRIEND, a7.EMPTY_CONTACTS);
        App.c(this.a);
    }

    v0(MultipleContactPicker multipleContactPicker) {
        this.a = multipleContactPicker;
    }
}
