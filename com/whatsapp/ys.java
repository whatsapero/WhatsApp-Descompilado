package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ys implements OnClickListener {
    final EnterPhoneNumber a;
    final String b;

    ys(EnterPhoneNumber enterPhoneNumber, String str) {
        this.a = enterPhoneNumber;
        this.b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(22);
        this.a.c(this.b);
    }
}
