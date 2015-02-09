package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class zx implements OnClickListener {
    final GroupChatInfo a;

    public void onClick(View view) {
        this.a.showDialog(3);
    }

    zx(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
