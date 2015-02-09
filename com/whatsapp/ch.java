package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ch implements OnClickListener {
    final RegisterPhone a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(22);
    }

    ch(RegisterPhone registerPhone) {
        this.a = registerPhone;
    }
}
