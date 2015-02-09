package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.widget.ImageView;

class aa implements y {
    final b_ a;
    final aw b;
    final at c;
    final ImageView d;

    public String b() {
        return this.c.d();
    }

    public Bitmap a() {
        if (this.d.getTag() != this) {
            return null;
        }
        Bitmap a = this.b.a(GalleryPicker.d(this.a.b));
        return a == null ? ImageGallery.a(this.b, this.a.b.getBaseContext()) : a;
    }

    aa(b_ b_Var, ImageView imageView, aw awVar, at atVar) {
        this.a = b_Var;
        this.d = imageView;
        this.b = awVar;
        this.c = atVar;
    }
}
