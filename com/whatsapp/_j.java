package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class _j implements OnClickListener {
    final Main a;

    public void onClick(DialogInterface dialogInterface, int i) {
        OverlayAlert.a(this.a);
        this.a.removeDialog(1);
        this.a.finish();
    }

    _j(Main main) {
        this.a = main;
    }
}
