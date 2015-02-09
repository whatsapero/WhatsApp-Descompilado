package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ako implements OnClickListener {
    final SetStatus a;

    public void onClick(View view) {
        this.a.showDialog(50);
    }

    ako(SetStatus setStatus) {
        this.a = setStatus;
    }
}
