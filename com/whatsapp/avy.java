package com.whatsapp;

import android.graphics.Bitmap;
import com.whatsapp.wallpaper.a;

class avy implements a {
    final TouchImageView a;

    public void a(Bitmap bitmap) {
        if (this.a.z) {
            bitmap.recycle();
        }
    }

    avy(TouchImageView touchImageView) {
        this.a = touchImageView;
    }
}
