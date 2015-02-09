package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ang implements OnClickListener {
    final DialogToastPreferenceActivity a;

    ang(DialogToastPreferenceActivity dialogToastPreferenceActivity) {
        this.a = dialogToastPreferenceActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(500);
        if (DialogToastPreferenceActivity.a(this.a) != null) {
            DialogToastPreferenceActivity.a(this.a).a();
        }
    }
}
