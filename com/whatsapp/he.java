package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.ExitGroupDialogFragment;

class he implements OnClickListener {
    final ExitGroupDialogFragment a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }

    he(ExitGroupDialogFragment exitGroupDialogFragment) {
        this.a = exitGroupDialogFragment;
    }
}
