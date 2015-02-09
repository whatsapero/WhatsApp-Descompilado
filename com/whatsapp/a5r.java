package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a5r implements OnClickListener {
    final RecordAudio a;

    a5r(RecordAudio recordAudio) {
        this.a = recordAudio;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(0);
        this.a.finish();
    }
}
