package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class fu implements OnClickListener {
    final GroupChatInfo a;

    fu(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(3);
    }
}
