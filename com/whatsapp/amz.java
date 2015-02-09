package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class amz implements OnClickListener {
    final ContactPicker a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.setResult(-1, ContactPicker.g(this.a));
        this.a.removeDialog(3);
        this.a.finish();
    }

    amz(ContactPicker contactPicker) {
        this.a = contactPicker;
    }
}
