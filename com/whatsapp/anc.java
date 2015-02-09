package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import java.util.Iterator;

class anc implements OnClickListener {
    final GroupChatLiveLocationsActivity a;

    anc(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.a = groupChatLiveLocationsActivity;
    }

    public void onClick(View view) {
        int i = App.az;
        GroupChatLiveLocationsActivity.a(this.a, null);
        GroupChatLiveLocationsActivity.g(this.a).h();
        Iterator it = GroupChatLiveLocationsActivity.f(this.a).iterator();
        while (it.hasNext()) {
            ((ViewGroup) ((View) it.next())).getChildAt(0).setSelected(false);
            if (i != 0) {
                break;
            }
        }
        GroupChatLiveLocationsActivity.b(this.a).runOnFirstFix(new tw(this));
    }
}
