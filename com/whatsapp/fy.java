package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import java.util.HashMap;

class fy implements OnItemLongClickListener {
    final iv a;
    final ListView b;

    fy(iv ivVar, ListView listView) {
        this.a = ivVar;
        this.b = listView;
    }

    public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        ts tsVar = (ts) this.b.getAdapter();
        if (!(ts.c(tsVar, i) || ts.a(tsVar, i) || ts.b(tsVar, i))) {
            m8 c = tsVar.c(i);
            if (App.c(c.e)) {
                return false;
            }
            ContactPicker.a(this.a.a, new HashMap());
            ContactPicker.e(this.a.a).put(c.e, c);
            this.a.a.m();
            ContactPicker.b(this.a.a);
        }
        return true;
    }
}
