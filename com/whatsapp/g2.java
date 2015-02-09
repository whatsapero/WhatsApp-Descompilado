package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class g2 implements OnItemClickListener {
    final SetStatus a;

    g2(SetStatus setStatus) {
        this.a = setStatus;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.e((String) SetStatus.q.get(i));
    }
}
