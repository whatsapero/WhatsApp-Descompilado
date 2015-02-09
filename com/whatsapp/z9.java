package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class z9 implements OnItemClickListener {
    final GroupChatInfo a;

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        m8 m8Var = (m8) view.getTag();
        if (m8Var != null && GroupChatInfo.p(this.a).containsKey(m8Var.e)) {
            GroupChatInfo.c(this.a, m8Var.e);
            if (App.az == 0) {
                return;
            }
        }
        if (m8Var != null) {
            GroupChatInfo.a(this.a, m8Var);
            view.showContextMenu();
        }
    }

    z9(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
