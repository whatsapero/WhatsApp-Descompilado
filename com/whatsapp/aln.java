package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aln implements OnClickListener {
    final SettingsHelp a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(102);
    }

    aln(SettingsHelp settingsHelp) {
        this.a = settingsHelp;
    }
}
