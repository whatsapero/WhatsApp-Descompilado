package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class rv implements OnClickListener {
    final EnterPhoneNumber a;

    rv(EnterPhoneNumber enterPhoneNumber) {
        this.a = enterPhoneNumber;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(23);
    }
}
