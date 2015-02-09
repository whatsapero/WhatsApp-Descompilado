package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class _b implements OnClickListener {
    final VerifySms a;

    _b(VerifySms verifySms) {
        this.a = verifySms;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(32);
    }
}
