package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;

class a5d implements TextWatcher {
    final MultipleContactsSelector a;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        b7.a(this.a.r, charSequence);
    }

    public void afterTextChanged(Editable editable) {
    }

    a5d(MultipleContactsSelector multipleContactsSelector) {
        this.a = multipleContactsSelector;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
