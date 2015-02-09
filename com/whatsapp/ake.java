package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

class ake implements OnDismissListener {
    final RegisterPhone a;

    ake(RegisterPhone registerPhone) {
        this.a = registerPhone;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        RegisterPhone.a(this.a, null);
    }
}
