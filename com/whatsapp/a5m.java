package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.DeleteGroupDialogFragment;

class a5m implements OnClickListener {
    final DeleteGroupDialogFragment a;

    a5m(DeleteGroupDialogFragment deleteGroupDialogFragment) {
        this.a = deleteGroupDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }
}
