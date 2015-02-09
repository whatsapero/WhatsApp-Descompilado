package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class av5 implements OnClickListener {
    final EULA a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.showDialog(7);
    }

    av5(EULA eula) {
        this.a = eula;
    }
}
