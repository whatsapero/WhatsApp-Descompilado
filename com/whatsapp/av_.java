package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class av_ implements OnClickListener {
    final int a;
    final VerifySms b;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(this.a);
        VerifySms.v(this.b);
    }

    av_(VerifySms verifySms, int i) {
        this.b = verifySms;
        this.a = i;
    }
}
