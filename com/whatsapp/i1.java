package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.DeleteAllMessagesDialogFragment;
import com.whatsapp.DialogToastFragmentActivity.ProgressDialogFragment;
import com.whatsapp.util.br;

class i1 implements OnClickListener {
    final DeleteAllMessagesDialogFragment a;

    i1(DeleteAllMessagesDialogFragment deleteAllMessagesDialogFragment) {
        this.a = deleteAllMessagesDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        progressDialogFragment.show(this.a.getFragmentManager(), null);
        br.a(new amj(this, progressDialogFragment));
    }
}
