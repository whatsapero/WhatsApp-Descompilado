package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class gp implements OnClickListener {
    final kl a;
    final MediaView b;

    public void onClick(View view) {
        view.setOnClickListener(this.a);
        MediaView.b(this.b, !MediaView.c(this.b));
    }

    gp(MediaView mediaView, kl klVar) {
        this.b = mediaView;
        this.a = klVar;
    }
}
