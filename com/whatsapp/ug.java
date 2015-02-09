package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ug implements OnClickListener {
    final VerifySms a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(21);
        VerifySms.v(this.a);
    }

    ug(VerifySms verifySms) {
        this.a = verifySms;
    }
}
