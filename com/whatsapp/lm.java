package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class lm implements OnClickListener {
    final ContactPicker a;

    public void onClick(DialogInterface dialogInterface, int i) {
        Conversation.ah = true;
        this.a.startActivity(ContactPicker.g(this.a));
        this.a.removeDialog(1);
        this.a.finish();
    }

    lm(ContactPicker contactPicker) {
        this.a = contactPicker;
    }
}
