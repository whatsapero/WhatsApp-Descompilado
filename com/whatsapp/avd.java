package com.whatsapp;

import com.actionbarsherlock.R;

class avd implements Runnable {
    final tj a;

    public void run() {
        GroupChatRecentLocationsActivity.j(this.a.a.a).setText(this.a.a.a.getString(R.string.my_location));
    }

    avd(tj tjVar) {
        this.a = tjVar;
    }
}
