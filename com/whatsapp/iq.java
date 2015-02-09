package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class iq implements OnCancelListener {
    final EULA a;

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(7);
        this.a.showDialog(8);
    }

    iq(EULA eula) {
        this.a = eula;
    }
}
