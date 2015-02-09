package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class oo implements OnClickListener {
    final ContactPickerHelp a;

    oo(ContactPickerHelp contactPickerHelp) {
        this.a = contactPickerHelp;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(3);
    }
}
