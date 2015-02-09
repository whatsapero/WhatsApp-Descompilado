package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class als implements OnClickListener {
    final SystemStatusActivity a;

    als(SystemStatusActivity systemStatusActivity) {
        this.a = systemStatusActivity;
    }

    public void onClick(View view) {
        this.a.finish();
    }
}
