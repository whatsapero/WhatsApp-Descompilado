package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class a1o implements OnClickListener {
    final RegisterName a;

    a1o(RegisterName registerName) {
        this.a = registerName;
    }

    public void onClick(View view) {
        zv.a(RegisterName.c(this.a), this.a, 12);
    }
}
