package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class qk implements OnClickListener {
    final Main a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(3);
        this.a.finish();
    }

    qk(Main main) {
        this.a = main;
    }
}
