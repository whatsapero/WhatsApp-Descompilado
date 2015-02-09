package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class x4 implements OnClickListener {
    final RegisterPhone a;

    x4(RegisterPhone registerPhone) {
        this.a = registerPhone;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        EnterPhoneNumber.w = 0;
        this.a.removeDialog(21);
    }
}
