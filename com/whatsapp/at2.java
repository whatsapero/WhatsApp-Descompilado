package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class at2 implements OnClickListener {
    final DeleteAccount a;

    public void onClick(View view) {
        Intent intent = new Intent(this.a, CountryPicker.class);
        intent.putExtra(CountryPicker.f, this.a.r.getText().toString());
        this.a.startActivityForResult(intent, 0);
        this.a.j.removeTextChangedListener(DeleteAccount.c(this.a));
    }

    at2(DeleteAccount deleteAccount) {
        this.a = deleteAccount;
    }
}
