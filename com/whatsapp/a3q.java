package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a3q implements OnClickListener {
    final GroupChatInfo a;

    a3q(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(6);
        GroupChatInfo.b(this.a, GroupChatInfo.n(this.a).e);
    }
}
