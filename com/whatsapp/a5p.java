package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a5p implements OnClickListener {
    final m8 a;
    final SettingsChat b;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(19);
        Conversation.a(this.b, this.b, this.a, true);
    }

    a5p(SettingsChat settingsChat, m8 m8Var) {
        this.b = settingsChat;
        this.a = m8Var;
    }
}
