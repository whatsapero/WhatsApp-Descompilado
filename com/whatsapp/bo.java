package com.whatsapp;

import com.whatsapp.contact.c;
import com.whatsapp.contact.i;
import com.whatsapp.contact.k;

class bo implements Runnable {
    final boolean a;
    final ContactPicker b;

    bo(ContactPicker contactPicker, boolean z) {
        this.b = contactPicker;
        this.a = z;
    }

    public void run() {
        if (App.aa >= 1) {
            ContactPicker.d(this.b);
        }
        k d = i.d(this.b.getApplicationContext(), this.a ? c.INTERACTIVE_FULL : c.INTERACTIVE_DELTA);
        if (App.aa >= 1) {
            ContactPicker.d(this.b);
        }
        ContactPicker.s(this.b).post(new bi(this, d));
    }
}
