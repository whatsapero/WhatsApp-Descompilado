package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class nj implements OnClickListener {
    final DeleteAccount a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(109);
    }

    nj(DeleteAccount deleteAccount) {
        this.a = deleteAccount;
    }
}
