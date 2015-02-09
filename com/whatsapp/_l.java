package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;

class _l implements OnClickListener {
    final GroupChatInfo a;

    _l(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(View view) {
        if (bd.f(GroupChatInfo.b(this.a))) {
            this.a.showDialog(50);
            if (App.az == 0) {
                return;
            }
        }
        this.a.f(this.a.getString(R.string.subject_change_not_authorized));
    }
}
