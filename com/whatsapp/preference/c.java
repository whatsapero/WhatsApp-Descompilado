package com.whatsapp.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class c implements OnMultiChoiceClickListener {
    final WaMultiSelectListPreference a;

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        WaMultiSelectListPreference.a(this.a)[i] = z;
    }

    c(WaMultiSelectListPreference waMultiSelectListPreference) {
        this.a = waMultiSelectListPreference;
    }
}
