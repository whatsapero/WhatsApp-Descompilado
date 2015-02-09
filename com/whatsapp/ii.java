package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ii implements OnClickListener {
    final GroupChatRecentLocationsActivity a;

    public void onClick(View view) {
        GroupChatRecentLocationsActivity.a(this.a);
        if (GroupChatRecentLocationsActivity.k(this.a) < -1) {
            GroupChatRecentLocationsActivity.a(this.a, GroupChatRecentLocationsActivity.d(this.a).size() - 1);
        }
        GroupChatRecentLocationsActivity.h(this.a);
    }

    ii(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }
}
