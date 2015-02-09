package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.protocol.b;

class akd implements OnClickListener {
    final b a;
    final MediaView b;

    public void onClick(View view) {
        MediaView.a(this.b, this.a, 0);
    }

    akd(MediaView mediaView, b bVar) {
        this.b = mediaView;
        this.a = bVar;
    }
}
