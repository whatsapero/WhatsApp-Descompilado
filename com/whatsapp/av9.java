package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class av9 implements OnClickListener {
    final Runnable a;
    final AccountInfoActivity b;
    final int c;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(this.c);
        if (this.a != null) {
            this.a.run();
        }
    }

    av9(AccountInfoActivity accountInfoActivity, int i, Runnable runnable) {
        this.b = accountInfoActivity;
        this.c = i;
        this.a = runnable;
    }
}
