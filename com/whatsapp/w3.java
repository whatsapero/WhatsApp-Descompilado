package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class w3 implements OnClickListener {
    final OverlayAlert a;

    public void onClick(View view) {
        this.a.finish();
    }

    w3(OverlayAlert overlayAlert) {
        this.a = overlayAlert;
    }
}
