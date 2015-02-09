package com.whatsapp;

import com.actionbarsherlock.R;

class wm implements Runnable {
    final hm a;

    wm(hm hmVar) {
        this.a = hmVar;
    }

    public void run() {
        this.a.b.removeDialog(107);
        if (!this.a.b.isFinishing()) {
            App.a(null, App.p.getString(this.a.d ? R.string.block_timeout : R.string.unblock_timeout));
        }
    }
}
