package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class as5 implements OnClickListener {
    final ContactPicker a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(1);
    }

    as5(ContactPicker contactPicker) {
        this.a = contactPicker;
    }
}
