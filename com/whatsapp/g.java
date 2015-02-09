package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class g implements OnClickListener {
    final Activity a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(119);
        this.a.finish();
    }

    g(Activity activity) {
        this.a = activity;
    }
}
