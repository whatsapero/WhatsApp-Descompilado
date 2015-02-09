package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ld implements OnClickListener {
    final VerifySms a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(4);
        VerifySms.v(this.a);
    }

    ld(VerifySms verifySms) {
        this.a = verifySms;
    }
}
