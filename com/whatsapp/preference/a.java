package com.whatsapp.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a implements OnClickListener {
    final WaFontListPreference a;

    a(WaFontListPreference waFontListPreference) {
        this.a = waFontListPreference;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        WaFontListPreference.a(this.a, i);
        this.a.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
