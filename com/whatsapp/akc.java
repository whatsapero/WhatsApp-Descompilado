package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class akc implements OnClickListener {
    final ChangeNumber a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(109);
    }

    akc(ChangeNumber changeNumber) {
        this.a = changeNumber;
    }
}
