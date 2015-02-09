package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class tn implements OnClickListener {
    final ViewSharedContactActivity a;

    public void onClick(View view) {
        ViewSharedContactActivity.c(this.a);
    }

    tn(ViewSharedContactActivity viewSharedContactActivity) {
        this.a = viewSharedContactActivity;
    }
}
