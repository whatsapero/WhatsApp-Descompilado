package com.whatsapp.gallerypicker;

import android.view.View;
import android.view.View.OnClickListener;

class br implements OnClickListener {
    final View a;
    final View b;
    final GalleryPicker c;

    br(GalleryPicker galleryPicker, View view, View view2) {
        this.c = galleryPicker;
        this.b = view;
        this.a = view2;
    }

    public void onClick(View view) {
        this.b.setSelected(false);
        this.a.setSelected(true);
        if (GalleryPicker.f(this.c) != 4) {
            GalleryPicker.b(this.c, 4);
            GalleryPicker.a(this.c, GalleryPicker.e(this.c), GalleryPicker.a(this.c), true);
            this.c.invalidateOptionsMenu();
        }
    }
}
