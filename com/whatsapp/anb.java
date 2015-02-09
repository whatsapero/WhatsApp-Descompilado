package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class anb implements OnClickListener {
    final EULA a;

    anb(EULA eula) {
        this.a = eula;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(6);
        if (a54.z() != null) {
            this.a.showDialog(8);
            if (App.az == 0) {
                return;
            }
        }
        EULA.a(this.a, n3.AGREE_NONE);
    }
}
