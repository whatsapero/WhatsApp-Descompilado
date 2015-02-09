package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class nm implements OnClickListener {
    final ChangeNumber a;

    nm(ChangeNumber changeNumber) {
        this.a = changeNumber;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ChangeNumber.e(this.a);
    }
}
