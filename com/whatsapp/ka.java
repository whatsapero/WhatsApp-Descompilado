package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ka implements OnClickListener {
    final DeleteAccountConfirmation a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(2);
    }

    ka(DeleteAccountConfirmation deleteAccountConfirmation) {
        this.a = deleteAccountConfirmation;
    }
}
