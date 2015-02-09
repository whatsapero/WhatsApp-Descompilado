package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class rf implements OnCancelListener {
    final SmsDefaultAppWarning a;

    public void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }

    rf(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.a = smsDefaultAppWarning;
    }
}
