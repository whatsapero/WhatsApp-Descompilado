package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class km implements OnClickListener {
    final GroupChatLiveLocationsActivity2 a;

    km(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.a = groupChatLiveLocationsActivity2;
    }

    public void onClick(View view) {
        GroupChatLiveLocationsActivity2.a(this.a, null);
        GroupChatLiveLocationsActivity2.a(this.a).h();
        GroupChatLiveLocationsActivity2.g(this.a);
        GroupChatLiveLocationsActivity2.b(this.a).a();
    }
}
