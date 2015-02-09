package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class alw implements OnItemClickListener {
    final CallsFragment a;

    alw(CallsFragment callsFragment) {
        this.a = callsFragment;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0 && i < CallsFragment.c(this.a).getCount()) {
            App.b(CallsFragment.c(this.a).a(i).d(), this.a.getActivity());
        }
    }
}
