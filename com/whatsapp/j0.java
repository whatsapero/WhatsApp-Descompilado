package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class j0 implements OnGlobalLayoutListener {
    final GroupChatLiveLocationsActivity2 a;

    j0(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.a = groupChatLiveLocationsActivity2;
    }

    public void onGlobalLayout() {
        GroupChatLiveLocationsActivity2.b(this.a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (GroupChatLiveLocationsActivity2.b(this.a).getWidth() > 0 && GroupChatLiveLocationsActivity2.b(this.a).getHeight() > 0) {
            GroupChatLiveLocationsActivity2.a(this.a, false);
        }
    }
}
