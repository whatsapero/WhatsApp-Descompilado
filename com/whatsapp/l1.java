package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class l1 implements OnCancelListener {
    final ContactPicker a;

    l1(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(0);
    }
}
