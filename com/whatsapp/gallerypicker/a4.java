package com.whatsapp.gallerypicker;

class a4 implements Runnable {
    final boolean a;
    final GalleryPicker b;

    a4(GalleryPicker galleryPicker, boolean z) {
        this.b = galleryPicker;
        this.a = z;
    }

    public void run() {
        GalleryPicker.a(this.b, this.a);
        this.b.a(this.a);
    }
}
