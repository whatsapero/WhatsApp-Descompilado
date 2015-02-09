package com.whatsapp.messaging;

import android.view.View;
import android.view.View.OnClickListener;

class aj implements OnClickListener {
    final CaptivePortalActivity a;

    aj(CaptivePortalActivity captivePortalActivity) {
        this.a = captivePortalActivity;
    }

    public void onClick(View view) {
        this.a.finish();
    }
}
