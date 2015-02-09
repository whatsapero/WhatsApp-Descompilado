package com.whatsapp;

import android.widget.CompoundButton;
import android.widget.TextView;
import com.actionbarsherlock.R;

class c0 implements Runnable {
    final GroupChatInfo a;

    public void run() {
        TextView textView = (TextView) this.a.findViewById(R.id.show_friends_btn);
        this.a.findViewById(R.id.show_friends_switch_progress).setVisibility(4);
        GroupChatInfo.r(this.a).setVisibility(0);
        if (lh.b.a(GroupChatInfo.b(this.a))) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            textView.setEnabled(true);
            ((CompoundButton) GroupChatInfo.r(this.a)).setOnCheckedChangeListener(null);
            ((CompoundButton) GroupChatInfo.r(this.a)).setChecked(true);
            ((CompoundButton) GroupChatInfo.r(this.a)).setOnCheckedChangeListener(this.a.z);
            if (App.az == 0) {
                return;
            }
        }
        textView.setPaintFlags(textView.getPaintFlags() & -9);
        textView.setEnabled(false);
        ((CompoundButton) GroupChatInfo.r(this.a)).setOnCheckedChangeListener(null);
        ((CompoundButton) GroupChatInfo.r(this.a)).setChecked(false);
        ((CompoundButton) GroupChatInfo.r(this.a)).setOnCheckedChangeListener(this.a.z);
    }

    c0(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
