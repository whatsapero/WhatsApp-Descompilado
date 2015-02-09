package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class zc implements OnCancelListener {
    final tp a;

    public void onCancel(DialogInterface dialogInterface) {
        if (tp.a(this.a) != null) {
            tp.a(this.a).dismiss();
        }
        tp.a(this.a, null);
        this.a.cancel(true);
        if (WebImagePicker.i(this.a.b) == this.a) {
            WebImagePicker.a(this.a.b, null);
        }
    }

    zc(tp tpVar) {
        this.a = tpVar;
    }
}
