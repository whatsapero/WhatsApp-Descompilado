package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.br;

class nb implements OnClickListener {
    final boolean a;
    final SettingsChat b;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(5);
        this.b.showDialog(6);
        br.a(new zk(this));
    }

    nb(SettingsChat settingsChat, boolean z) {
        this.b = settingsChat;
        this.a = z;
    }
}
