package com.whatsapp;

import com.actionbarsherlock.R;
import java.util.ArrayList;
import java.util.Collection;

class ph implements Runnable {
    final hm a;

    public void run() {
        this.a.b.removeDialog(107);
        if (this.a.f) {
            Collection arrayList = new ArrayList();
            arrayList.add(this.a.g);
            App.a(arrayList);
            if (App.az == 0) {
                return;
            }
        }
        App.a(null, App.p.getString(this.a.d ? R.string.block_timeout : R.string.unblock_timeout));
    }

    ph(hm hmVar) {
        this.a = hmVar;
    }
}
