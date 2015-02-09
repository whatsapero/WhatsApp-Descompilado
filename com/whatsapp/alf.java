package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class alf implements OnClickListener {
    final DialogToastListActivity a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(500);
        if (DialogToastListActivity.a(this.a) != null) {
            DialogToastListActivity.a(this.a).a();
        }
    }

    alf(DialogToastListActivity dialogToastListActivity) {
        this.a = dialogToastListActivity;
    }
}
