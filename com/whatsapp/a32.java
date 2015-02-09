package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a32 implements OnClickListener {
    final SmsDefaultAppWarning a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(1);
        SmsDefaultAppWarning.b(this.a);
        this.a.finish();
    }

    a32(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.a = smsDefaultAppWarning;
    }
}
