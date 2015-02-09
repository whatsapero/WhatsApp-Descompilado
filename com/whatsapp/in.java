package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class in implements OnClickListener {
    final RegisterName a;

    public void onClick(DialogInterface dialogInterface, int i) {
        RegisterName.k(this.a);
        this.a.removeDialog(1);
    }

    in(RegisterName registerName) {
        this.a = registerName;
    }
}
