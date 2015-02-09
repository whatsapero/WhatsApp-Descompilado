package com.whatsapp;

import android.widget.TextView;
import com.actionbarsherlock.R;

class anr implements Runnable {
    final int a;
    final a5 b;

    public void run() {
        if (!this.b.isCancelled()) {
            ((TextView) this.b.a.findViewById(R.id.media_info)).setText(Integer.toString(this.a));
        }
    }

    anr(a5 a5Var, int i) {
        this.b = a5Var;
        this.a = i;
    }
}
