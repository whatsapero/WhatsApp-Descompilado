package com.whatsapp;

import android.widget.ScrollView;
import com.actionbarsherlock.R;

class r_ implements Runnable {
    final gr a;

    r_(gr grVar) {
        this.a = grVar;
    }

    public void run() {
        ((ScrollView) this.a.a.findViewById(R.id.scroll_view)).smoothScrollTo(0, this.a.a.findViewById(R.id.diagnostics_button_description).getTop());
    }
}
