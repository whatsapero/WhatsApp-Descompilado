package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;

class _w implements TextWatcher {
    final anu a;

    _w(anu com_whatsapp_anu) {
        this.a = com_whatsapp_anu;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        b7.a(this.a.b, charSequence);
    }
}
