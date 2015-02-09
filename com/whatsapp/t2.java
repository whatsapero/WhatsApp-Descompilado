package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class t2 implements OnClickListener {
    final Main a;

    public void onClick(DialogInterface dialogInterface, int i) {
        st.d();
        this.a.removeDialog(0);
        Main.c(this.a);
    }

    t2(Main main) {
        this.a = main;
    }
}
