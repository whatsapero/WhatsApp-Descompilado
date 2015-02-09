package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

class o5 implements Runnable {
    final Bitmap a;
    final ue b;

    o5(ue ueVar, Bitmap bitmap) {
        this.b = ueVar;
        this.a = bitmap;
    }

    public void run() {
        if (!VideoPreviewActivity.h(this.b.c).isPlaying()) {
            VideoPreviewActivity.h(this.b.c).setBackgroundDrawable(new BitmapDrawable(this.b.c.getResources(), this.a));
        }
    }
}
