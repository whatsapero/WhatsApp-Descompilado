package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class w2 implements OnClickListener {
    final SmsDefaultAppWarning a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(1);
        SmsDefaultAppWarning.a(this.a);
        this.a.finish();
    }

    w2(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.a = smsDefaultAppWarning;
    }
}
