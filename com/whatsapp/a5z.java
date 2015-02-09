package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a5z implements OnClickListener {
    final VerifySms a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(34);
        VerifySms.v(this.a);
    }

    a5z(VerifySms verifySms) {
        this.a = verifySms;
    }
}
