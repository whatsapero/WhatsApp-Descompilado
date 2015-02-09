package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class oq implements OnClickListener {
    final ContactPicker a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(4);
        this.a.startActivity(new Intent(this.a, AccountInfoActivity.class));
    }

    oq(ContactPicker contactPicker) {
        this.a = contactPicker;
    }
}
