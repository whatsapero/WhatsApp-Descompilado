package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class _6 implements OnClickListener {
    final GroupChatRecentLocationsActivity a;

    public void onClick(View view) {
        GroupChatRecentLocationsActivity.c(this.a);
        if (GroupChatRecentLocationsActivity.k(this.a) >= GroupChatRecentLocationsActivity.d(this.a).size()) {
            GroupChatRecentLocationsActivity.a(this.a, -1);
        }
        GroupChatRecentLocationsActivity.h(this.a);
    }

    _6(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }
}
