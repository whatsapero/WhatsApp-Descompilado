package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class ala implements OnItemClickListener {
    final BroadcastDetails a;

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        m8 m8Var = (m8) view.getTag();
        if (m8Var != null) {
            BroadcastDetails.a(this.a, m8Var);
            this.a.showDialog(3);
        }
    }

    ala(BroadcastDetails broadcastDetails) {
        this.a = broadcastDetails;
    }
}
