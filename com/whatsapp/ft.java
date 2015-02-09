package com.whatsapp;

import android.graphics.Bitmap;
import com.whatsapp.wallpaper.a;

class ft implements a {
    final TouchImageView a;

    ft(TouchImageView touchImageView) {
        this.a = touchImageView;
    }

    public void a(Bitmap bitmap) {
        if (this.a.z) {
            bitmap.recycle();
        }
    }
}
