package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class pp implements OnClickListener {
    final GroupChatInfo a;

    pp(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(2);
    }
}
