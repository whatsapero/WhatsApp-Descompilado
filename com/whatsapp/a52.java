package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class a52 implements OnScrollListener {
    final GroupChatInfo a;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        GroupChatInfo.o(this.a);
    }

    a52(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
