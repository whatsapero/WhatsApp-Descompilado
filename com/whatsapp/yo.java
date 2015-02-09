package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class yo implements OnScrollListener {
    final CallLogActivity a;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        CallLogActivity.b(this.a);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    yo(CallLogActivity callLogActivity) {
        this.a = callLogActivity;
    }
}
