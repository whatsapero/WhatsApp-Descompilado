package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class b_ implements OnCancelListener {
    final ContactPicker a;

    b_(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(3);
    }
}
