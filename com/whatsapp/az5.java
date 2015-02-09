package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class az5 implements OnClickListener {
    final GroupChatRecentLocationsActivity a;

    public void onClick(View view) {
        GroupChatRecentLocationsActivity.a(this.a, -1);
        GroupChatRecentLocationsActivity.i(this.a).runOnFirstFix(new tj(this));
    }

    az5(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }
}
