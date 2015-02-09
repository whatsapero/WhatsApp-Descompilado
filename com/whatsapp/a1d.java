package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.HorizontalScrollView;

class a1d implements OnGlobalLayoutListener {
    final GroupChatInfo a;
    final HorizontalScrollView b;

    a1d(GroupChatInfo groupChatInfo, HorizontalScrollView horizontalScrollView) {
        this.a = groupChatInfo;
        this.b = horizontalScrollView;
    }

    public void onGlobalLayout() {
        this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.b.fullScroll(66);
    }
}
