package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class ze implements OnCancelListener {
    final ContactPicker a;

    ze(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(2);
    }
}
