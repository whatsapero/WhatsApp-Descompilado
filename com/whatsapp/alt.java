package com.whatsapp;

import android.view.ViewTreeObserver.OnPreDrawListener;

class alt implements OnPreDrawListener {
    final GroupChatLiveLocationsActivity a;

    alt(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.a = groupChatLiveLocationsActivity;
    }

    public boolean onPreDraw() {
        GroupChatLiveLocationsActivity.c(this.a).getViewTreeObserver().removeOnPreDrawListener(this);
        GroupChatLiveLocationsActivity.e(this.a);
        return true;
    }
}
