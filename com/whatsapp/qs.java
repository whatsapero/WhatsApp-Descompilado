package com.whatsapp;

import android.widget.ScrollView;
import com.actionbarsherlock.R;

class qs implements Runnable {
    final ContactPickerHelp a;

    qs(ContactPickerHelp contactPickerHelp) {
        this.a = contactPickerHelp;
    }

    public void run() {
        ((ScrollView) this.a.findViewById(R.id.scroll_view)).fullScroll(130);
    }
}
