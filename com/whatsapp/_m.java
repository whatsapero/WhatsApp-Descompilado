package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.br;

class _m implements OnClickListener {
    final SettingsChat a;

    _m(SettingsChat settingsChat) {
        this.a = settingsChat;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.showDialog(6);
        br.a(new k8(this));
    }
}
