package com.whatsapp;

import android.view.View;
import com.whatsapp.fieldstats.a7;
import com.whatsapp.fieldstats.au;
import com.whatsapp.util.ar;

class qq extends ar {
    final ContactsFragment b;

    public void a(View view) {
        ak4.a(au.TELL_A_FRIEND, a7.EMPTY_CONTACTS);
        App.c(this.b.getActivity());
    }

    qq(ContactsFragment contactsFragment) {
        this.b = contactsFragment;
    }
}
