package com.whatsapp.gallerypicker;

import android.view.View;
import android.view.View.OnClickListener;

class c implements OnClickListener {
    final GalleryPicker a;
    final View b;
    final View c;

    c(GalleryPicker galleryPicker, View view, View view2) {
        this.a = galleryPicker;
        this.b = view;
        this.c = view2;
    }

    public void onClick(View view) {
        this.b.setSelected(true);
        this.c.setSelected(false);
        if (GalleryPicker.f(this.a) != 1) {
            GalleryPicker.b(this.a, 1);
            GalleryPicker.a(this.a, GalleryPicker.e(this.a), GalleryPicker.a(this.a), true);
            this.a.invalidateOptionsMenu();
        }
    }
}
