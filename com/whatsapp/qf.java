package com.whatsapp;

import android.view.View;
import com.whatsapp.fieldstats.a7;
import com.whatsapp.fieldstats.au;
import com.whatsapp.util.ar;

class qf extends ar {
    final CallsFragment b;

    public void a(View view) {
        ak4.a(au.TELL_A_FRIEND, a7.EMPTY_CALLS);
        App.c(this.b.getActivity());
    }

    qf(CallsFragment callsFragment) {
        this.b = callsFragment;
    }
}
