package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class b implements OnClickListener {
    final GroupChatInfo a;

    public void onClick(View view) {
        GroupChatInfo.k(this.a);
    }

    b(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
