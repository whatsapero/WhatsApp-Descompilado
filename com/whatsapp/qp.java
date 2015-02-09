package com.whatsapp;

import android.view.View;
import com.whatsapp.fieldstats.a7;
import com.whatsapp.fieldstats.au;
import com.whatsapp.util.ar;

class qp extends ar {
    final ConversationsFragment b;

    public void a(View view) {
        ak4.a(au.TELL_A_FRIEND, a7.EMPTY_CONVERSATIONS);
        App.c(this.b.getActivity());
    }

    qp(ConversationsFragment conversationsFragment) {
        this.b = conversationsFragment;
    }
}
