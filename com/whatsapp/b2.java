package com.whatsapp;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

class b2 implements TextWatcher {
    final CountryPicker a;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        b7.a(CountryPicker.b(this.a), charSequence);
        CountryPicker.a(this.a).setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        CountryPicker.c(this.a).getFilter().filter(charSequence);
    }

    b2(CountryPicker countryPicker) {
        this.a = countryPicker;
    }

    public void afterTextChanged(Editable editable) {
    }
}
