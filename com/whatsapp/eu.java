package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class eu implements OnClickListener {
    final VerifySms a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(7);
        VerifySms.v(this.a);
    }

    eu(VerifySms verifySms) {
        this.a = verifySms;
    }
}
