package com.whatsapp;

import com.whatsapp.protocol.b;

class akn implements ams {
    final boolean a;
    final b b;
    final MediaView c;

    public void a() {
        int i = App.az;
        MediaView.d(this.c);
        MediaView.u(this.c).remove(this.b);
        MediaView.h(this.c).notifyDataSetChanged();
        if (MediaView.u(this.c).isEmpty()) {
            this.c.finish();
            if (i == 0) {
                return;
            }
        }
        if (MediaView.e(this.c).getCurrentItem() == 0) {
            MediaView.d(this.c, MediaView.e(this.c).getCurrentItem());
            if (i == 0) {
                return;
            }
        }
        if (!this.a) {
            MediaView.c(this.c, 1);
        }
    }

    akn(MediaView mediaView, b bVar, boolean z) {
        this.c = mediaView;
        this.b = bVar;
        this.a = z;
    }
}
