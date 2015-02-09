package com.whatsapp;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.whatsapp.protocol.b;

class avi implements OnLongClickListener {
    final GroupChatRecentLocationsActivity a;

    public boolean onLongClick(View view) {
        GroupChatRecentLocationsActivity.a(this.a, null);
        Object tag = view.getTag();
        if (tag != null) {
            b a = GroupChatRecentLocationsActivity.a(this.a, tag.toString());
            if (a != null) {
                GroupChatRecentLocationsActivity.a(this.a, App.P.a(a.F));
                this.a.removeDialog(0);
                this.a.showDialog(0);
            }
        }
        return true;
    }

    avi(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }
}
