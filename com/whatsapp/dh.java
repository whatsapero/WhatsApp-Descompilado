package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;

class dh implements TextWatcher {
    final MultipleContactPicker a;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    dh(MultipleContactPicker multipleContactPicker) {
        this.a = multipleContactPicker;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        b7.a(MultipleContactPicker.c(this.a), charSequence);
        if (charSequence.length() > 0) {
            MultipleContactPicker.a(this.a, charSequence.toString());
            MultipleContactPicker.b(this.a).setVisibility(0);
            MultipleContactPicker.a(this.a, true);
            if (App.az == 0) {
                return;
            }
        }
        MultipleContactPicker.b(this.a).setVisibility(8);
        MultipleContactPicker.h(this.a);
        MultipleContactPicker.a(this.a, false);
    }
}
