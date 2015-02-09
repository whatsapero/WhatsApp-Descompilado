package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class k6 implements OnClickListener {
    final Advanced a;

    k6(Advanced advanced) {
        this.a = advanced;
    }

    public void onClick(View view) {
        this.a.showDialog(1);
    }
}
