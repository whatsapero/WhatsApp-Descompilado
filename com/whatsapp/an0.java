package com.whatsapp;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.actionbarsherlock.R;

class an0 implements OnCheckedChangeListener {
    final GroupChatInfo a;

    an0(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.findViewById(R.id.show_friends_btn).setEnabled(false);
        GroupChatInfo.r(this.a).setVisibility(4);
        this.a.findViewById(R.id.show_friends_switch_progress).setVisibility(0);
        if (z) {
            App.a(new hh(this, GroupChatInfo.b(this.a), 0));
            if (App.az == 0) {
                return;
            }
        }
        App.a(new hi(this, GroupChatInfo.b(this.a)));
    }
}
