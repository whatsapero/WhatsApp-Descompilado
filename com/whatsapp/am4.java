package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class am4 implements OnClickListener {
    final VerifyNumber a;

    am4(VerifyNumber verifyNumber) {
        this.a = verifyNumber;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(109);
    }
}
