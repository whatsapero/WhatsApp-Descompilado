package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class cd implements OnClickListener {
    final ContactPicker a;

    cd(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(3);
    }
}
