package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class yg implements OnClickListener {
    final EULA a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.showDialog(5);
    }

    yg(EULA eula) {
        this.a = eula;
    }
}
