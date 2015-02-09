package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class f4 implements OnCancelListener {
    final EULA a;

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(5);
        this.a.showDialog(6);
    }

    f4(EULA eula) {
        this.a = eula;
    }
}
