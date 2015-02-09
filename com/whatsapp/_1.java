package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class _1 implements OnClickListener {
    final Main a;

    _1(Main main) {
        this.a = main;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(2);
        this.a.finish();
    }
}
