package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class af_ implements OnClickListener {
    final ContactPicker a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(0);
    }

    af_(ContactPicker contactPicker) {
        this.a = contactPicker;
    }
}
