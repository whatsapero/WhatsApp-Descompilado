package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class k1 implements OnClickListener {
    final UserFeedbackActivity a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(123);
    }

    k1(UserFeedbackActivity userFeedbackActivity) {
        this.a = userFeedbackActivity;
    }
}
