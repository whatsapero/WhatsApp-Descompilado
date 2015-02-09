package com.whatsapp;

import com.whatsapp.contact.c;
import com.whatsapp.contact.i;

class a4 implements Runnable {
    final ViewSharedContactActivity a;

    public void run() {
        i.d(this.a.getApplicationContext(), c.INTERACTIVE_DELTA);
    }

    a4(ViewSharedContactActivity viewSharedContactActivity) {
        this.a = viewSharedContactActivity;
    }
}
