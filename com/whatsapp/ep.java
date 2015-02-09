package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.ClearAllMessagesDialogFragment;
import com.whatsapp.DialogToastFragmentActivity.ProgressDialogFragment;
import com.whatsapp.util.br;

class ep implements OnClickListener {
    final ClearAllMessagesDialogFragment a;

    ep(ClearAllMessagesDialogFragment clearAllMessagesDialogFragment) {
        this.a = clearAllMessagesDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        progressDialogFragment.show(this.a.getFragmentManager(), null);
        br.a(new af8(this, progressDialogFragment));
    }
}
