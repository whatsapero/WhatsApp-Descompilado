package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class a8r implements OnClickListener {
    final ViewSharedContactActivity a;

    a8r(ViewSharedContactActivity viewSharedContactActivity) {
        this.a = viewSharedContactActivity;
    }

    public void onClick(View view) {
        this.a.finish();
    }
}
