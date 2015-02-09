package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class rx implements OnClickListener {
    final VoipActivity a;

    rx(VoipActivity voipActivity) {
        this.a = voipActivity;
    }

    public void onClick(View view) {
        if (VoipActivity.a(this.a) != null) {
            VoipActivity.a(this.a).j();
        }
    }
}
