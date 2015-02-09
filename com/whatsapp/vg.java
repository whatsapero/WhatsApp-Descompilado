package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class vg implements OnScrollListener {
    final ListChatInfo a;

    vg(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ListChatInfo.f(this.a);
    }
}
