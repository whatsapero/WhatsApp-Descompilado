package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class hl implements OnClickListener {
    final DeleteAccountConfirmation a;

    hl(DeleteAccountConfirmation deleteAccountConfirmation) {
        this.a = deleteAccountConfirmation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(3);
    }
}
