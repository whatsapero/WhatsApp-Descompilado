package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class lx implements OnClickListener {
    final int a;
    final VerifySms b;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(this.a);
        VerifySms.m(this.b);
    }

    lx(VerifySms verifySms, int i) {
        this.b = verifySms;
        this.a = i;
    }
}
