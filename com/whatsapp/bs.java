package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.whatsapp.protocol.cn;

class bs implements OnItemClickListener {
    final am a;

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z = true;
        cn cnVar = (cn) this.a.i.get(i);
        if (!(this.a.f.size() == 1 && this.a.f.get(0) == cnVar)) {
            z = false;
        }
        this.a.f.clear();
        this.a.f.add(this.a.i.get(i));
        am.f(this.a).notifyDataSetChanged();
        this.a.a(cnVar, z);
    }

    bs(am amVar) {
        this.a = amVar;
    }
}
