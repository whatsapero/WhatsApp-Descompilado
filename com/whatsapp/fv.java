package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class fv implements OnCancelListener {
    final BroadcastDetails a;

    fv(BroadcastDetails broadcastDetails) {
        this.a = broadcastDetails;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(3);
    }
}
