package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class an2 implements OnClickListener {
    final Advanced a;

    public void onClick(View view) {
        this.a.showDialog(2);
    }

    an2(Advanced advanced) {
        this.a = advanced;
    }
}
