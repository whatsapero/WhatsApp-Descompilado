package com.whatsapp;

import com.actionbarsherlock.R;

class anw implements Runnable {
    final fj a;

    public void run() {
        App app = App.p;
        App.a(App.p, (int) R.string.error_no_disc_space, 1);
    }

    anw(fj fjVar) {
        this.a = fjVar;
    }
}
