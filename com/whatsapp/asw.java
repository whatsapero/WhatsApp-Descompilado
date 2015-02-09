package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.DialogToastFragmentActivity.MessageDialogFragment;

class asw implements OnClickListener {
    final MessageDialogFragment a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }

    asw(MessageDialogFragment messageDialogFragment) {
        this.a = messageDialogFragment;
    }
}
