package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.DeleteBroadcastListDialogFragment;

class a59 implements OnClickListener {
    final DeleteBroadcastListDialogFragment a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }

    a59(DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment) {
        this.a = deleteBroadcastListDialogFragment;
    }
}
