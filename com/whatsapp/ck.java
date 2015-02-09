package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ck implements OnClickListener {
    final VoipActivity a;

    public void onClick(View view) {
        if (VoipActivity.a(this.a) != null) {
            VoipActivity.a(this.a).y();
        }
    }

    ck(VoipActivity voipActivity) {
        this.a = voipActivity;
    }
}
