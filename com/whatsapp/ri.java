package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class ri implements OnCancelListener {
    final Activity a;

    ri(Activity activity) {
        this.a = activity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
