package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class a1z implements OnClickListener {
    final int a;
    final Activity b;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(this.a);
    }

    a1z(Activity activity, int i) {
        this.b = activity;
        this.a = i;
    }
}
