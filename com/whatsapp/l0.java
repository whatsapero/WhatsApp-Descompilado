package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class l0 implements OnCancelListener {
    final Activity a;
    final int b;

    l0(Activity activity, int i) {
        this.a = activity;
        this.b = i;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(this.b);
    }
}
