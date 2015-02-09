package com.whatsapp;

import android.widget.SearchView.OnQueryTextListener;

final class sn implements OnQueryTextListener {
    final aq a;

    public boolean onQueryTextChange(String str) {
        return this.a.a(str);
    }

    sn(aq aqVar) {
        this.a = aqVar;
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }
}
