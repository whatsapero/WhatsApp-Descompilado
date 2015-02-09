package com.whatsapp;

import com.actionbarsherlock.widget.SearchView.OnQueryTextListener;

final class ry implements OnQueryTextListener {
    final aq a;

    public boolean onQueryTextChange(String str) {
        return this.a.a(str);
    }

    ry(aq aqVar) {
        this.a = aqVar;
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }
}
