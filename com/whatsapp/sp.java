package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class sp implements OnClickListener {
    final VoipActivity a;

    public void onClick(View view) {
        if (VoipActivity.a(this.a) != null) {
            VoipActivity.a(this.a).n();
        }
    }

    sp(VoipActivity voipActivity) {
        this.a = voipActivity;
    }
}
