package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class zj implements OnClickListener {
    final m8 a;
    final SettingsChat b;

    zj(SettingsChat settingsChat, m8 m8Var) {
        this.b = settingsChat;
        this.a = m8Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(19);
        Conversation.a(this.b, this.b, this.a, false);
    }
}
