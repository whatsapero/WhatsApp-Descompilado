package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ku implements OnClickListener {
    final ata a;

    ku(ata com_whatsapp_ata) {
        this.a = com_whatsapp_ata;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ata.b(this.a).removeDialog(105);
        ata.b(this.a).showDialog(106);
    }
}
