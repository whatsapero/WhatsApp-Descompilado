package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class kt implements OnClickListener {
    final GroupChatInfo a;

    kt(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(4);
    }
}
