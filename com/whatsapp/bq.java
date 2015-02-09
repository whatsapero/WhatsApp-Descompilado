package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bq implements OnClickListener {
    final DialogToastActivity a;

    bq(DialogToastActivity dialogToastActivity) {
        this.a = dialogToastActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(500);
        if (DialogToastActivity.a(this.a) != null) {
            DialogToastActivity.a(this.a).a();
        }
    }
}
