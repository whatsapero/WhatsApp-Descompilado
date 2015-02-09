package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class as6 implements OnClickListener {
    final SmsDefaultAppWarning a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(0);
        SmsDefaultAppWarning.b(this.a);
        this.a.finish();
    }

    as6(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.a = smsDefaultAppWarning;
    }
}
