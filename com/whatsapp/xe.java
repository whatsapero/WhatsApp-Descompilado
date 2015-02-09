package com.whatsapp;

import android.widget.TextView;
import com.actionbarsherlock.R;

class xe implements Runnable {
    final int a;
    final ji b;

    xe(ji jiVar, int i) {
        this.b = jiVar;
        this.a = i;
    }

    public void run() {
        if (!this.b.isCancelled()) {
            ((TextView) this.b.a.findViewById(R.id.media_info)).setText(Integer.toString(this.a));
        }
    }
}
