package com.whatsapp;

import com.whatsapp.contact.c;
import com.whatsapp.contact.i;
import com.whatsapp.contact.k;

class a87 implements Runnable {
    final ContactsFragment a;
    final boolean b;

    a87(ContactsFragment contactsFragment, boolean z) {
        this.a = contactsFragment;
        this.b = z;
    }

    public void run() {
        if (App.aa >= 1) {
            ContactsFragment.h(this.a);
        }
        k d = i.d(this.a.getActivity().getApplicationContext(), this.b ? c.INTERACTIVE_FULL : c.INTERACTIVE_DELTA);
        if (App.aa >= 1) {
            ContactsFragment.h(this.a);
        }
        ContactsFragment.a(this.a).post(new vz(this, d));
    }
}
