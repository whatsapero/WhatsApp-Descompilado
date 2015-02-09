package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class pg implements OnClickListener {
    final Advanced a;

    public void onClick(DialogInterface dialogInterface, int i) {
        App.v(String.valueOf(i));
    }

    pg(Advanced advanced) {
        this.a = advanced;
    }
}
