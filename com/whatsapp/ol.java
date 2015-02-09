package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.ViewContactsNotSupportedDialogFragment;

class ol implements OnClickListener {
    final ViewContactsNotSupportedDialogFragment a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }

    ol(ViewContactsNotSupportedDialogFragment viewContactsNotSupportedDialogFragment) {
        this.a = viewContactsNotSupportedDialogFragment;
    }
}
