package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class av1 implements OnClickListener {
    final EULA a;

    av1(EULA eula) {
        this.a = eula;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(1);
    }
}
