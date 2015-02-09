package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class tu implements OnClickListener {
    final EULA a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(2);
    }

    tu(EULA eula) {
        this.a = eula;
    }
}
