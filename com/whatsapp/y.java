package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class y implements OnClickListener {
    final VerifySms a;
    final int b;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(this.b);
        VerifySms.v(this.a);
    }

    y(VerifySms verifySms, int i) {
        this.a = verifySms;
        this.b = i;
    }
}
