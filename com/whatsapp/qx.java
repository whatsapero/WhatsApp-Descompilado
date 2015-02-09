package com.whatsapp;

import android.view.View;
import com.whatsapp.WebSessionsActivity.LogoutAllConfirmationDialogFragment;
import com.whatsapp.util.ar;

class qx extends ar {
    final WebSessionsActivity b;

    public void a(View view) {
        new LogoutAllConfirmationDialogFragment().show(this.b.getSupportFragmentManager(), null);
    }

    qx(WebSessionsActivity webSessionsActivity) {
        this.b = webSessionsActivity;
    }
}
