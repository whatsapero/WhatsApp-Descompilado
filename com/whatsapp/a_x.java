package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.messaging.CaptivePortalActivity;

class a_x implements OnClickListener {
    final Advanced a;

    public void onClick(View view) {
        CaptivePortalActivity.a(this.a.getApplicationContext());
    }

    a_x(Advanced advanced) {
        this.a = advanced;
    }
}
