package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class g4 implements OnClickListener {
    final ContactPickerHelp a;

    public void onClick(View view) {
        this.a.l.setChecked(!this.a.l.isChecked());
    }

    g4(ContactPickerHelp contactPickerHelp) {
        this.a = contactPickerHelp;
    }
}
