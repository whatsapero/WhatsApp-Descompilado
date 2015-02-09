package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class w8 implements OnClickListener {
    final GroupChatInfo a;

    w8(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(View view) {
        if (bd.f(GroupChatInfo.b(this.a))) {
            this.a.showDialog(2);
            if (App.az == 0) {
                return;
            }
        }
        this.a.showDialog(1);
    }
}
