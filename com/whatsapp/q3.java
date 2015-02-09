package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class q3 implements OnCancelListener {
    final SmsDefaultAppWarning a;

    public void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }

    q3(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.a = smsDefaultAppWarning;
    }
}
