package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class za implements OnClickListener {
    final ContactPicker a;

    za(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(2);
    }
}
