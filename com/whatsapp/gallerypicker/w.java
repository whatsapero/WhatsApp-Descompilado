package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.widget.ImageView;

class w implements y {
    final aw a;
    final an b;
    final ImageView c;

    public Bitmap a() {
        if (this.c.getTag() != this) {
            return null;
        }
        Bitmap a = this.a.a(ImageGallery.j(this.b.a));
        return a == null ? ImageGallery.a(this.a, this.b.a.getBaseContext()) : a;
    }

    w(an anVar, ImageView imageView, aw awVar) {
        this.b = anVar;
        this.c = imageView;
        this.a = awVar;
    }

    public String b() {
        return this.a.b();
    }
}
