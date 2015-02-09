package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class wp implements OnItemClickListener {
    final ListChatInfo a;

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        m8 m8Var = (m8) view.getTag();
        if (m8Var != null) {
            ListChatInfo.a(this.a, m8Var);
            view.showContextMenu();
        }
    }

    wp(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
