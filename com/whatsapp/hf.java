package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class hf implements OnClickListener {
    final MediaView a;

    public void onClick(View view) {
        MediaView.b(this.a, !MediaView.c(this.a));
    }

    hf(MediaView mediaView) {
        this.a = mediaView;
    }
}
