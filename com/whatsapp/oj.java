package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class oj implements OnClickListener {
    final SmsDefaultAppWarning a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(0);
        SmsDefaultAppWarning.a(this.a);
        this.a.finish();
    }

    oj(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.a = smsDefaultAppWarning;
    }
}
