package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ati implements OnClickListener {
    final EULA a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(9);
    }

    ati(EULA eula) {
        this.a = eula;
    }
}
