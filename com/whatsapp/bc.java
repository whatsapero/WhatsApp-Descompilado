package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bc implements OnClickListener {
    final EnterPhoneNumber a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(22);
    }

    bc(EnterPhoneNumber enterPhoneNumber) {
        this.a = enterPhoneNumber;
    }
}
