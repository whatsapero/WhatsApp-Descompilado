package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class az implements OnClickListener {
    final EULA a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(8);
        EULA.a(this.a, n3.AGREE_NONE);
    }

    az(EULA eula) {
        this.a = eula;
    }
}
