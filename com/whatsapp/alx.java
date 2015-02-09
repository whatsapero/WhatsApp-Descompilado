package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class alx implements OnClickListener {
    final Activity a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(115);
    }

    alx(Activity activity) {
        this.a = activity;
    }
}
