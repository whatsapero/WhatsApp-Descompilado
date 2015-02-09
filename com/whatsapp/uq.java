package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class uq implements OnClickListener {
    final ata a;

    uq(ata com_whatsapp_ata) {
        this.a = com_whatsapp_ata;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ata.b(this.a).removeDialog(103);
        ata.b(this.a).showDialog(106);
    }
}
