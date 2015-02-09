package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.VoipActivity.ReplyWithMessageDialogFragment;

class u_ implements OnClickListener {
    final VoipActivity a;

    u_(VoipActivity voipActivity) {
        this.a = voipActivity;
    }

    public void onClick(View view) {
        new ReplyWithMessageDialogFragment().show(this.a.getSupportFragmentManager(), null);
    }
}
