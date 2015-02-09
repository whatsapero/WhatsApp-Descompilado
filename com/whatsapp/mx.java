package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class mx implements OnClickListener {
    final ViewSharedContactActivity a;

    public void onClick(View view) {
        ViewSharedContactActivity.a(this.a);
    }

    mx(ViewSharedContactActivity viewSharedContactActivity) {
        this.a = viewSharedContactActivity;
    }
}
