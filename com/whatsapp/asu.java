package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

class asu implements OnDismissListener {
    final VerifySms a;

    public void onDismiss(DialogInterface dialogInterface) {
        VerifySms.v(this.a);
    }

    asu(VerifySms verifySms) {
        this.a = verifySms;
    }
}
