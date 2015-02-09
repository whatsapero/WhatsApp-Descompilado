package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.DeleteContactDialogFragment;

class ba implements OnClickListener {
    final DeleteContactDialogFragment a;

    ba(DeleteContactDialogFragment deleteContactDialogFragment) {
        this.a = deleteContactDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }
}
