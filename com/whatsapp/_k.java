package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class _k implements OnClickListener {
    final CountryPicker a;

    _k(CountryPicker countryPicker) {
        this.a = countryPicker;
    }

    public void onClick(View view) {
        CountryPicker.b(this.a).setText("");
    }
}
