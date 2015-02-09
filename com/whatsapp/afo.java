package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.VoipNotAllowedActivity.VoipNotAllowedDialogFragment;

class afo implements OnClickListener {
    final VoipNotAllowedDialogFragment a;

    afo(VoipNotAllowedDialogFragment voipNotAllowedDialogFragment) {
        this.a = voipNotAllowedDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }
}
