package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bg implements OnClickListener {
    final EULA a;

    bg(EULA eula) {
        this.a = eula;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(3);
        EULA.a(this.a);
    }
}
