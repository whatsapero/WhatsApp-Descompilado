package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class yq implements OnClickListener {
    final int a;
    final AccountInfoActivity b;

    yq(AccountInfoActivity accountInfoActivity, int i) {
        this.b = accountInfoActivity;
        this.a = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(this.a);
    }
}
