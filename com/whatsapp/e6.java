package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class e6 implements OnClickListener {
    final GroupChatInfo a;

    e6(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(1);
    }
}
