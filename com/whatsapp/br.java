package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class br implements OnGlobalLayoutListener {
    final GroupChatInfo a;

    br(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onGlobalLayout() {
        GroupChatInfo.o(this.a);
    }
}
