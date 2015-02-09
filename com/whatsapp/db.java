package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class db implements OnClickListener {
    final RegisterPhone a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(23);
    }

    db(RegisterPhone registerPhone) {
        this.a = registerPhone;
    }
}
