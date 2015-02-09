package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class m1 implements OnClickListener {
    final SettingsHelp a;

    m1(SettingsHelp settingsHelp) {
        this.a = settingsHelp;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(123);
    }
}
