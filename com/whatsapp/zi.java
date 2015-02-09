package com.whatsapp;

import android.widget.TextView;
import com.actionbarsherlock.R;

class zi implements Runnable {
    final amd a;
    final int b;

    zi(amd com_whatsapp_amd, int i) {
        this.a = com_whatsapp_amd;
        this.b = i;
    }

    public void run() {
        if (!this.a.isCancelled()) {
            ((TextView) this.a.a.findViewById(R.id.media_info)).setText(Integer.toString(this.b));
        }
    }
}
