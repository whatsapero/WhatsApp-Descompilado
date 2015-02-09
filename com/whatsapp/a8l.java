package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.WebSessionsActivity.LogoutAllConfirmationDialogFragment;

class a8l implements OnClickListener {
    final LogoutAllConfirmationDialogFragment a;

    a8l(LogoutAllConfirmationDialogFragment logoutAllConfirmationDialogFragment) {
        this.a = logoutAllConfirmationDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        App.a(true);
        a12.q();
        this.a.getActivity().finish();
    }
}
