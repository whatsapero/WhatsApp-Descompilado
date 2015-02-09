package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class wy implements OnClickListener {
    final VerifySms a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(33);
    }

    wy(VerifySms verifySms) {
        this.a = verifySms;
    }
}
