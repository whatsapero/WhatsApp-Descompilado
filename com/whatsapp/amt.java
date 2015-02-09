package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class amt implements OnClickListener {
    final ContactPicker a;

    amt(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.setResult(-1, ContactPicker.g(this.a));
        this.a.removeDialog(2);
        this.a.finish();
    }
}
