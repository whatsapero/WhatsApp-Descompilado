package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class a2 implements OnCancelListener {
    final kc a;

    a2(kc kcVar) {
        this.a = kcVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        kc.a(this.a, false);
        kc.a(this.a, null);
        kc.d(this.a).removeDialog(50);
    }
}
