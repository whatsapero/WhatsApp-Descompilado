package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class a50 implements OnCancelListener {
    final ContactPicker a;

    a50(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(1);
    }
}
