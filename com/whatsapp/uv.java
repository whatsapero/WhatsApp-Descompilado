package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout.LayoutParams;
import com.actionbarsherlock.R;

class uv implements OnGlobalLayoutListener {
    final GroupChatInfo a;
    final View b;

    uv(GroupChatInfo groupChatInfo, View view) {
        this.a = groupChatInfo;
        this.b = view;
    }

    public void onGlobalLayout() {
        this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.a.findViewById(R.id.header_placeholder).setLayoutParams(new LayoutParams(-1, this.b.getMeasuredHeight()));
    }
}
