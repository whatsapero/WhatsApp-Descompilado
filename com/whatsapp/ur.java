package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ur implements OnClickListener {
    final String a;
    final RegisterPhone b;

    ur(RegisterPhone registerPhone, String str) {
        this.b = registerPhone;
        this.a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(22);
        this.b.c(this.a);
    }
}
