package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class rr implements OnClickListener {
    final VoipActivity a;

    public void onClick(View view) {
        this.a.startActivity(Conversation.a(App.P.a(VoipActivity.c(this.a))));
    }

    rr(VoipActivity voipActivity) {
        this.a = voipActivity;
    }
}
